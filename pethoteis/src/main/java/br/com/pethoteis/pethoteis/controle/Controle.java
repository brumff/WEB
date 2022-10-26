package br.com.pethoteis.pethoteis.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//classe responsavel pela rota

import br.com.pethoteis.pethoteis.modelo.DonoPet;
import br.com.pethoteis.pethoteis.repositorio.Repositorio;
@RestController
public class Controle {
    //criar metodo
    @Autowired
    private Repositorio acao;

    @PostMapping("/DonoPet")
    public DonoPet cadastrar(@RequestBody DonoPet obj){
        return acao.save(obj);
    }
    @GetMapping("/DonoPet")
    public List<DonoPet> selecionar(){
        return acao.findAll();
    }

    @GetMapping("/DonoPet/{id}")
    public DonoPet selecionarPeloId(@PathVariable int codigo){
        return acao.findByCodigo(codigo);
    }
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
