package br.com.pethoteis.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pethoteis.demo.Exceptions.CriptoExistsException;
import br.com.pethoteis.demo.Exceptions.EmailExistsException;
import br.com.pethoteis.demo.modelo.DonoPet;
import br.com.pethoteis.demo.repositorio.DonoPetRepositorio;
import br.com.pethoteis.demo.util.Util;

@Service
public class ServiceDonoPet {

    @Autowired
    private DonoPetRepositorio donoPetRepositorio; 

    public void salvarDonoPet(DonoPet donoPet) throws Exception{
        try {
            if(donoPetRepositorio.findByEmail() != null){
                throw new EmailExistsException("Já existe um cadastro com e-mail: " + donoPet.getEmail());
            }
            donoPet.setSenha(Util.md5(donoPet.getSenha()));
        } catch (Exception e) {
            throw new CriptoExistsException("Erro na criptografia da senha");
        }

        donoPetRepositorio.save(donoPet);
    }
}
