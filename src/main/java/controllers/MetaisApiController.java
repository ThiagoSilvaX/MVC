package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Metais;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/metais")
public class MetaisApiController {


    private static final List<Metais> metais = new ArrayList<Metais>();

    public MetaisApiController() {

        metais.add(new Metais("Ferro", "Comum", "Kg", 471.55));
        metais.add(new Metais("Estanho", "Comum", "Kg", 250.00));
        metais.add(new Metais("Ouro", "Raro", "g", 303.78));
    }

    @GetMapping
    public List<Metais> getMetais(){
        return metais;
    }

}
