package com.example.challengeoneforoalura.repositories;

import com.example.challengeoneforoalura.entities.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
