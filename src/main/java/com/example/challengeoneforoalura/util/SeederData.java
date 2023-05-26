package com.example.challengeoneforoalura.util;

import com.example.challengeoneforoalura.entities.Topico;
import com.example.challengeoneforoalura.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SeederData {

    @Autowired private TopicoRepository topicoRepository;

    @EventListener
    public void eventListener(ContextRefreshedEvent contextRefreshedEvent){
        if(topicoRepository.findAll().isEmpty()) guardartopicos();
    }

    private void guardartopicos(){
        List<Topico> topicos = new ArrayList<>();
        topicos.add(new Topico(1,"uno","uno","activo","pepe","java",new Date()));
        topicos.add(new Topico(2,"dos","dos","activo","pepe","java",new Date()));
        topicos.add(new Topico(3,"tres","tres","inactivo","juan","java",new Date()));
        topicos.add(new Topico(4,"cuatro","cuatro","inactivo","pepe","javascript",new Date()));
        topicoRepository.saveAll(topicos);
    }
}
