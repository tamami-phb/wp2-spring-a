package lab.phb.mahasiswaapp.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import lab.phb.mahasiswaapp.repo.*;

@Controller
public class WebController {

    @Autowired
    private MahasiswaRepo repo;

    @RequestMapping("/")
    public String root(Model model) {
        model.addAttribute("mhs", repo.findAll());
        return "index";
    }

}