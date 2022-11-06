package br.com.pethoteis.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pethoteis.demo.modelo.DonoPet;

public interface DonoPetRepositorio extends JpaRepository<DonoPet, Integer>{
    
}
