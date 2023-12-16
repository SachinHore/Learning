package com.assignment.acInventaryRest.controller;

import com.assignment.acInventaryRest.entity.AC;
import com.assignment.acInventaryRest.entity.ACSell;
import com.assignment.acInventaryRest.services.ACServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiOperation(value = "acSell", tags = "AC Sell controller")
@RestController
@RequestMapping("/sells")
public class ACSellController {

    @Autowired
    private ACServices acServices;

    public ACSellController(ACServices acServices) {
        this.acServices = acServices;
    }

    @ApiOperation(value = "get all ACSells")
    @GetMapping()
    public List<ACSell> getAllACSell(){
        return acServices.getAllACSell();
    }

    @ApiOperation(value = "Sell AC")
    @PostMapping("/{id}")
    public String postACSell(@RequestBody ACSell acSell, @PathVariable("id")  Long id){
        acServices.saveACSell(id,acSell);
        return "saved successfully and delete";
    }

}
