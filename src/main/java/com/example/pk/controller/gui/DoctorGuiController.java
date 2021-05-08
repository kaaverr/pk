package com.example.pk.controller.gui;

import com.example.pk.model.Doctor;
import com.example.pk.model.Spec;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gui/doctors")
public class DoctorGuiController {
    Doctor doctor = new Doctor("1" , "GIO" , Spec.GIGAPEVT , 26 , "funny" , null , null );
    @RequestMapping("/get/loh")
    String getOne(Model model){
        model.addAttribute("doctor" , doctor);
        return "doctors";
    }
}