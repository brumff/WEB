package br.com.pethoteis.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pethoteis.demo.modelo.Parceiro;

@Repository
public interface ParceiroRepositorio extends JpaRepository<Parceiro, Integer>{

    
}
