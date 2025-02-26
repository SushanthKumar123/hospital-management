package com.sampleproject.hospital_management.controller;

import com.sampleproject.hospital_management.model.Doctor;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.HashMap;
@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {
    HashMap<Integer, Doctor> doctorHashMap = new HashMap<>();



    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor doctor){
        doctorHashMap.put(doctor.getId(),doctor);
        System.out.println(doctorHashMap);
        return "Doctor save succesfully";
    }

    @GetMapping("/findAll")
    public HashMap<Integer,Doctor> getData(){
        return doctorHashMap;
    }

    @GetMapping("/find/{id}")
    public Doctor getData(@PathVariable int id){
        return doctorHashMap.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public String getDelete(@PathVariable int id){
        doctorHashMap.remove(id);
        return "Doctor removed succesfully";
    }



}


