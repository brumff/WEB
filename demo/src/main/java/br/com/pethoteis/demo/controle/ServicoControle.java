package br.com.pethoteis.demo.controle;

import java.io.Serial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pethoteis.demo.modelo.Parceiro;
import br.com.pethoteis.demo.modelo.Servicos;
import br.com.pethoteis.demo.repositorio.ParceiroRepositorio;
import br.com.pethoteis.demo.repositorio.ServicoRepositorio;

@Controller
public class ServicoControle{

    @Autowired
    private ServicoRepositorio servicorepositorio;

    @GetMapping("cadastrar-servico")
    public ModelAndView CadastrarServicos(Servicos servicos){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/cadastroservico");
        mv.addObject("servico", new Servicos());
        return mv;
    }
    @PostMapping("cadastrar-servico")
    public ModelAndView cadastrarServico(Servicos servicos){
        ModelAndView mv = new ModelAndView();
        servicorepositorio.save(servicos);
        mv.setViewName("redirect:/lista-servicos");
        return mv;
    }
    @GetMapping("lista-servicos")
    public ModelAndView listaServicos(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/listaservicos");
        mv.addObject("servicoLista", servicorepositorio.findAll());
        return mv;
    }
    @GetMapping("/alterar/{codigo}")
    public ModelAndView alterarServico(@PathVariable("codigo") Integer codigo){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/alterarservico");
        Servicos servicos = servicorepositorio.getOne(codigo);
        mv.addObject("servicos", servicos);
        return mv;
    }
    @PostMapping("/alterar/{codigo}")
    public ModelAndView alterarServico(Servicos servicos){
        ModelAndView mv = new ModelAndView();
        servicorepositorio.save(servicos);
        mv.setViewName("redirect:/lista-servicos");
        return mv;
    }
    @GetMapping("/excluir/{codigo}")
    public String excluirServico(@PathVariable("codigo") Integer codigo){
        servicorepositorio.deleteById(codigo);
        return "redirect:/lista-servicos";
        
    }
}
