package EmpresaControler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

import entities.Empresa;
import repositories.EmpresaRepository;

@Controller
public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping("/empresa/{cif}")
    public String mostrarEmpresa(@PathVariable String cif, Model model) {
        Optional<Empresa> empresaOptional = empresaRepository.findById(cif);
        if (empresaOptional.isPresent()) {
            Empresa empresa = empresaOptional.get();
            model.addAttribute("empresa", empresa);
            return "empresa";
        } else {
            return "error";
        }
    }
    
    @GetMapping("/empreses")
    public String llistarEmpreses(Model model) {
        List<Empresa> empreses = empresaRepository.findAll();
        model.addAttribute("empreses", empreses);
        return "empreses/llistar";
    }
    
}
