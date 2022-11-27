package br.com.pethoteis.demo.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pethoteis.demo.modelo.Servicos;

@Controller
public class PaginaInicialControle {
    
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/paginainicial");
        mv.addObject("servicos", new Servicos());
        return mv;
    }
}
