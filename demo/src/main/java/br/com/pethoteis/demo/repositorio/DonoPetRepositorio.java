package br.com.pethoteis.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pethoteis.demo.modelo.DonoPet;
@Repository
public interface DonoPetRepositorio extends JpaRepository<DonoPet, Integer>{
   
}
