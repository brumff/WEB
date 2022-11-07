package br.com.pethoteis.demo.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pethoteis.demo.modelo.Pet;
import br.com.pethoteis.demo.repositorio.PetRepositorio;

@Controller
public class PetControle {
    @Autowired
    private PetRepositorio petrepositorio;

    @GetMapping("/inserirPet")
    public ModelAndView InsertPet(Pet pet){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/cadastrodopet");
        mv.addObject("Pet", new Pet());
        return mv;
    }
    @PostMapping("InsertPet")
    public ModelAndView inserirPet(Pet pet){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/Pet/listPet");
        petrepositorio.save(pet);
        return mv;
    }
    
}
