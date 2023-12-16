package com.assignment.acInventaryRest.controller;

import com.assignment.acInventaryRest.DAO.ACDAO;
import com.assignment.acInventaryRest.entity.AC;
import com.assignment.acInventaryRest.services.ACServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ac")
public class ACInventaryController {

    @Autowired
    private ACServices acServices;

    public ACInventaryController(ACServices acServices) {
        this.acServices = acServices;
    }

    @GetMapping()
    public List<AC> getAllAC(){
    return acServices.getAllAC();
    }

    @GetMapping("/{id}")
    public  AC getACbyID(@PathVariable("id")Long id){
        return acServices.getACbyID(id);
    }

    @PostMapping()
    public String postAC(@RequestBody AC ac){
        acServices.saveAC(ac);
        return "saved successfully";
    }

    @PutMapping()
    public void putAC(AC ac){

    }

    @PatchMapping()
    public void patchAC(Long id,AC ac){

    }

    @DeleteMapping()
    public void deleteACbyID(Long id){

    }

}
