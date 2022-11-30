package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Metais;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/metais")
public class MetaisController {

    private static final List<Metais> metais = new ArrayList<Metais>();

    public MetaisController() {
        metais.add(new Metais("Ferro","Comum","Kg",471.55));
        metais.add(new Metais("Estanho","Comum","Kg",250.00));
        metais.add(new Metais("Ouro","Raro","g",303.78));
    }

    @GetMapping
    public String getMetais(Model model)
    {
        model.addAttribute("metais", metais);
        return "metais";

    }
}