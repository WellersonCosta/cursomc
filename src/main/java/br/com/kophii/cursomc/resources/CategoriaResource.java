package br.com.kophii.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @RequestMapping(method=RequestMethod.GET)
    public String listar(){
        return "Rest está funcionando!";
    }

}
