package com.example.challengeoneforoalura.services;

import com.example.challengeoneforoalura.dto.TopicoDto;
import com.example.challengeoneforoalura.entities.Topico;
import com.example.challengeoneforoalura.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicoService {

    @Autowired private TopicoRepository topicoRepository;

    public TopicoDto guardarTopico(TopicoDto topicoDto){
        return toDto(topicoRepository.save(toEntity(topicoDto)));
    }

    public List<TopicoDto> obtenerTopicos(){
        return topicoRepository.findAll(Pageable.ofSize(10))
                .stream().map(topico -> toDto(topico)).collect(Collectors.toList());
    }

    public TopicoDto obtenerTopico(long id){
        return toDto( topicoRepository.findById(id).get() );
    }







    private Topico toEntity(TopicoDto topicoDto){
        return new Topico(
                topicoDto.getTitulo(),
                topicoDto.getMensaje(),
                topicoDto.getEstatus(),
                topicoDto.getAutor(),
                topicoDto.getCurso()
        );
    }

    private TopicoDto toDto(Topico topico){
        return new TopicoDto(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFecha_creacion(),
                topico.getEstatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
