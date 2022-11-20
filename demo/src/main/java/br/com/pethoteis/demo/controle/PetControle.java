package br.com.pethoteis.demo.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pethoteis.demo.modelo.Pet;
import br.com.pethoteis.demo.repositorio.PetRepositorio;

@Controller
public class PetControle {
    @Autowired
    private PetRepositorio petrepositorio;
    private Pet pet;
    

    @GetMapping("/inserirPet")
    public ModelAndView InsertPet(Pet pet){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/cadastrodopet");
        mv.addObject("Pet", new Pet());
        return mv;
    }
    @PostMapping("/InsertPet")
    public ModelAndView inserirPet(Pet pet){
        ModelAndView mv = new ModelAndView();
        pet = petrepositorio.save(pet);
        mv.setViewName("redirect:/lista-pet");
        return mv;
    }    
    @GetMapping("perfil-donopet/{codigo}/lista-pet")
    public ModelAndView listagemPet(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/listarpet");
        mv.addObject("petList", petrepositorio.findAll());
        return mv;
    }
    @GetMapping("lista-pet/alterarpet/{codigo}")
    public ModelAndView alterar(@PathVariable("codigo") Integer codigo){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/alterarpet");
        Pet pet = petrepositorio.getOne(codigo);
        mv.addObject("pet", pet);
        return mv;
    }
    @PostMapping("/lista-pet/alterarpet/{codigo}")
    public ModelAndView alterar(Pet pet){
        ModelAndView mv = new ModelAndView();
        petrepositorio.save(pet);
        mv.setViewName("redirect:/inserirPet");
        return mv;
    }
    @GetMapping("/excluir/{codigo}")
    public String excluirPet(@PathVariable("codigo") Integer codigo){
        petrepositorio.deleteById(codigo);
        return "redirect:/lista-pet";
    }
    @GetMapping("/")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/telalogin");
        return mv;
    }
}
