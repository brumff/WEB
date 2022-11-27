package br.com.pethoteis.demo.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import br.com.pethoteis.demo.modelo.Parceiro;
import br.com.pethoteis.demo.repositorio.ParceiroRepositorio;

@Controller
public class ParceiroControle {

    @Autowired
    private ParceiroRepositorio parceirorepositorio;

    @GetMapping("cadastrar-parceiro")
    public ModelAndView CadastrarParceiro(Parceiro parceiro){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/cadastroparceiro");
        mv.addObject("parceiro", new Parceiro());
        return mv;
    }
    @PostMapping("cadastrar-parceiro")
    public ModelAndView cadastrarParceiro(Parceiro parceiro){
        ModelAndView mv = new ModelAndView();
        parceirorepositorio.save(parceiro);
        mv.setViewName("redirect:/perfil-parceiro/" + parceiro.getCodigo());
        return mv;
    }
    @GetMapping("perfil-parceiro/{codigo}")
    public ModelAndView perfilParceiro(@PathVariable("codigo") Integer codigo){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/perfilparceiro");
        Parceiro parceiro = parceirorepositorio.getOne(codigo);
        mv.addObject("parceiro", parceiro);
        return mv;
    }
    @GetMapping("alterar-servico/{codigo}")
    public ModelAndView alterarParceiro(@PathVariable("codigo") Integer codigo){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/alterarparceiro");
        Parceiro parceiro = parceirorepositorio.getById(codigo);
        mv.addObject("parceiro", parceiro);
        return mv;
    }
    @PostMapping("alterar-servico/{codigo}")
    public ModelAndView alterar(Parceiro parceiro){
        ModelAndView mv = new ModelAndView();
        parceirorepositorio.save(parceiro);
        mv.setViewName("redirect:/perfil-parceiro/" + parceiro.getCodigo());
        return mv;
    }

}

