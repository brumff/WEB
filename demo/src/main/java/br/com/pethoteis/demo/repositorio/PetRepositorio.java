package br.com.pethoteis.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pethoteis.demo.modelo.Pet;

public interface PetRepositorio extends JpaRepository<Pet, Integer>{
    
}
