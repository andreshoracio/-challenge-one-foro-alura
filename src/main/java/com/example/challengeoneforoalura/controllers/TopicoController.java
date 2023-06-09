package com.example.challengeoneforoalura.controllers;

import com.example.challengeoneforoalura.dto.TopicoDto;
import com.example.challengeoneforoalura.services.TopicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired private TopicoService topicoService;

    @PostMapping
    public ResponseEntity<TopicoDto> guardarTopico(@Valid @RequestBody TopicoDto topicoDto){
        return new ResponseEntity<>(topicoService.guardarTopico(topicoDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TopicoDto>> listarTopicos(){
        return ResponseEntity.ok(topicoService.obtenerTopicos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TopicoDto> obtenerTopico(@PathVariable("id") long id){
        return ResponseEntity.ok(topicoService.obtenerTopico(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TopicoDto> actualizarTopico(
            @PathVariable("id") long id,
            @RequestBody TopicoDto topicoDto
    ) throws Exception {
        return new ResponseEntity<>(topicoService.actualizarTopico(topicoDto, id), HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarTopico(@PathVariable("id") long id) throws Exception {
        topicoService.eleminarTopico(id);
    }
}
