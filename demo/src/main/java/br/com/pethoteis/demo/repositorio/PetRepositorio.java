package br.com.pethoteis.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pethoteis.demo.modelo.Pet;
@Repository
public interface PetRepositorio extends JpaRepository<Pet, Integer>{
    
}
