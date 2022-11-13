package br.com.pethoteis.demo.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pethoteis.demo.modelo.DonoPet;
import br.com.pethoteis.demo.repositorio.DonoPetRepositorio;



@Controller
public class DonoPetControle {
    @Autowired
    private DonoPetRepositorio donopetrepositorio;
    
    @GetMapping("/inserirDonoPet")
    public ModelAndView InsertDonoPet(DonoPet donoPet){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/cadastrodonopet");
        mv.addObject("DonoPet", new DonoPet());
        return mv;
    }
    @PostMapping("InsertDonoPet")
    public ModelAndView inserirDonoPet(DonoPet donoPet){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/perfil-donopet/{codigo}");
        donopetrepositorio.save(donoPet);
        return mv;
    }    
    @GetMapping("/perfil-donopet/{codigo}")
    public ModelAndView perfilDonoPet(@PathVariable("codigo") Integer codigo){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/perfildonopet");
        DonoPet donoPet = donopetrepositorio.getOne(codigo);
        mv.addObject("donoPet", donoPet);
        return mv;
    }
    @PostMapping("/perfil-donopet")
    public ModelAndView alterar(DonoPet donopet){
        ModelAndView mv = new ModelAndView();
        donopetrepositorio.save(donopet);
        mv.setViewName("redirect:/perfil-donopet");
        return mv;
}
    @GetMapping("/alterardonopet/{codigo}")
    public ModelAndView alterar(@PathVariable("codigo") Integer codigo){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/alterardonopet");
        DonoPet donoPet = donopetrepositorio.getOne(codigo);
        mv.addObject("donopet", donoPet);
        return mv;
    }
    @PostMapping("alterardonopet")
    public ModelAndView alterarDonoPet(DonoPet donoPet){
        ModelAndView mv = new ModelAndView();
        donopetrepositorio.save(donoPet);
        mv.setViewName("redirect:/perfil-donopet");
        return mv;
    }
}
