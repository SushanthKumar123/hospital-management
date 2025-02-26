package com.sampleproject.hospital_management.controller;

import com.sampleproject.hospital_management.model.Doctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.HashMap;
@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {
    HashMap<Integer, Doctor> doctorHashMap = new HashMap<>();


    @PostMapping("/save")
    public String saveDoctor(Doctor doctor){
        doctorHashMap.put(doctor.getId(),doctor);
        return "Doctor save succesfully";
    }



}


