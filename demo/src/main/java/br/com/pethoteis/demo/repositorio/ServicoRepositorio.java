package br.com.pethoteis.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pethoteis.demo.modelo.Servicos;



@Repository
public interface ServicoRepositorio extends JpaRepository<Servicos, Integer>{
    
}
