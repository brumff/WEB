package br.com.pethoteis.demo.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pethoteis.demo.modelo.DonoPet;
import br.com.pethoteis.demo.repositorio.repositorio;

@RestController
public class Controle {

    @Autowired
    private repositorio acao;

    //rota cadastro
    @PostMapping("/demo")
    public DonoPet cadastrar(@RequestBody DonoPet obj){
        return acao.save(obj);
    }
    @GetMapping("/demo")
    public List<DonoPet> selecionar(){
        return acao.findAll();
    }
    @GetMapping("/demo/{codigo}")
    public DonoPet selecionarPeloCodigo(@PathVariable int codigo){
        return acao.findByCodigo(codigo);
    }
    @PutMapping("/demo")
    public DonoPet editar(@RequestBody DonoPet obj){
        return acao.save(obj);
    }
    @DeleteMapping("/demo/{codigo}")
    public void remover(@PathVariable int codigo){
        DonoPet obj = selecionarPeloCodigo(codigo);
        acao.delete(obj);
    }
    @GetMapping("/api/contador")
    public long contador(){
        return acao.count();
    }
    @GetMapping("/api/ordenarNomes")
    public List<DonoPet> ordenarNomes(){
        return acao.findByOrderByNome();
    }
    @GetMapping("/demo/ordenarNomes2")
    public List<DonoPet> ordenarNomes2(){
        return acao.findByNomeOrderByIdadeDesc("null");
    }
    //primeira rota
    @GetMapping("")
    public String mensagem(){
        return "Hellou World";
    }
    //não tem suporte 
    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo(a) " + nome;
    }
    @PostMapping("/donoPet")    
    public DonoPet donoPet(@RequestBody DonoPet dp){
        return dp;

    }
}

