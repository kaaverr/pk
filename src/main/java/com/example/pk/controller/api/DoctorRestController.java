package com.example.pk.controller.api;

import com.example.pk.model.Doctor;
import com.example.pk.model.Spec;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/doctors")


public class DoctorRestController<doctor> {

    Doctor doctor = new Doctor("1" , "GIO" , Spec.GIGAPEVT , 26 , "funny" , null , null );
    @RequestMapping("/hello")
    String sayHello(){
    return "<h1>hello</h1>";
    }

    @RequestMapping("/get/one")
            Doctor getOne(){
        return doctor;
        }

}
