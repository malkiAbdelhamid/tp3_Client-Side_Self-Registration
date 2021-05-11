package com.esi.webclient.controller;

import com.esi.webclient.proxy.EtudiantProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class WebController {

    @Autowired
    EtudiantProxy etudiantProxy;

    @RequestMapping("/etudiant")
    public String ShowEtudiant(Model model)
    {
        model.addAttribute("etudiants",etudiantProxy.getEtudiantswithFortmation());
        return "EtudiantView";
    }
}
