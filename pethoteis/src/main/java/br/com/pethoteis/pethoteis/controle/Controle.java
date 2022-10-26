package br.com.pethoteis.pethoteis.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//classe responsavel pela rota

import br.com.pethoteis.modelo.DonoPet;
@RestController
public class Controle {
    //criar metodo
    @GetMapping("")
    public String mensagem(){
        return "Hello World";
    }
    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja Bem-Vindo " + nome ;
    }
    //não pode utilizar getmapping
    @PostMapping("/donoPet")
    public DonoPet donoPet(@RequestBody DonoPet dp){
        return dp;
    }
}
