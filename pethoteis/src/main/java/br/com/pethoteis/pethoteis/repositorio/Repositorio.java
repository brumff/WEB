package br.com.pethoteis.pethoteis.repositorio;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface Repositorio extends CrudRepository<DonoPet, Integer>{
     List<DonoPet> findAll();
    //apenas um
    DonoPet findByCodigo(int codigo);
    //conjunto de dados
    //List<DonoPet> findByCodigo(int codigo);
}
