package examen.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import examen.Domain.Conciertos;
import examen.Service.ConciertoService;

@Controller
public class mainController {
    @Autowired 
    private ConciertoService conciertoService;


    @GetMapping("/")
    public String index(Model model) {
        var conciertos = conciertoService.getAllConciertos();
        model.addAttribute("dato", conciertos);
        return "index";
    }

    @GetMapping("/new")
    public String newdata(Model model) {
        model.addAttribute("concierto", new Conciertos());
        return "new";
    }

    @PostMapping("/add")
    public String add(Conciertos concierto) {
        conciertoService.save(concierto);
        return "redirect:/";
    }

  
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
       Conciertos concierto = conciertoService.find(id);
         conciertoService.delete(concierto);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Conciertos concierto = conciertoService.find(id);
        model.addAttribute("concierto", concierto);
        return "edit";
    }
}
