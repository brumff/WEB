package br.com.pethoteis.demo.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        mv.setViewName("redirect:/DonoPet/listDonoPet");
        donopetrepositorio.save(donoPet);
        return mv;
    }
}
