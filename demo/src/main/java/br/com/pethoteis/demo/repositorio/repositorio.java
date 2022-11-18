package br.com.pethoteis.demo.repositorio;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pethoteis.demo.modelo.DonoPet;

@Repository
public interface repositorio extends CrudRepository<DonoPet, Integer>{
    
    List<DonoPet> findAll();
    //apenas uma pessoas
    DonoPet findByCodigo(int codigo);

    //variaas pessoas
   // List<DonoPet> findByCodigo(int codigo);
    //Ordernar
    List<DonoPet> findByOrderByNome();

    // List<DonoPet> findByNomeOrderByIdadeDesc(String nome);
}
