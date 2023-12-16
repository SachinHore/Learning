package com.assignment.acInventaryRest.controller;

import com.assignment.acInventaryRest.entity.ACSell;
import com.assignment.acInventaryRest.entity.AvailableAC;
import com.assignment.acInventaryRest.services.ACServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiOperation(value = "acSell", tags = "AC Sell controller")
@RestController
@RequestMapping("/availables")
public class AvailableACController {
    @Autowired
    private ACServices acServices;

    public AvailableACController(ACServices acServices) {
        this.acServices = acServices;
    }

    @ApiOperation(value = "get all available ACs")
    @GetMapping()
    public List<AvailableAC> getAllAvailableACs(){
        return acServices.getAllAvailableACs();
    }

    @ApiOperation(value = "Add AC available list")
    @PostMapping("/{id}")
    public String postAvailableAC(@PathVariable("id")  Long id){
        acServices.addtoAvailableAC(id);
        return "saved successfully and delete";
    }
}
