package com.assignment.acInventaryRest.controller;

import com.assignment.acInventaryRest.entity.AC;
import com.assignment.acInventaryRest.services.ACServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@ApiOperation(value = "acInventry", tags = "ACInventry MS controller")
@RestController
@RequestMapping("/acs")
public class ACInventaryController {

    @Autowired
    private ACServices acServices;

    public ACInventaryController(ACServices acServices) {
        this.acServices = acServices;
    }

    @ApiOperation(value = "get all ACs")
    @GetMapping()
    public List<AC> getAllAC(){
    return acServices.getAllAC();
    }

    @ApiOperation(value = "get AC by id")
    @GetMapping("/{id}")
    public  AC getACbyID(@PathVariable("id") Long id){
        return acServices.getACbyID(id);
    }

    @ApiOperation(value = "save AC")
    @PostMapping()
    public String postAC(@RequestBody AC ac){
        acServices.saveAC(ac);
        return "saved successfully";
    }

    @ApiOperation(value = "update AC")
    @PutMapping()
    public void putAC(@RequestBody AC ac){
        acServices.updateAC(ac);
    }

    @ApiOperation(value = "update AC by id")
    @PatchMapping("/{id}")
    public AC patchAC(@PathVariable("id") Long id,@RequestBody AC ac){
        acServices.patchAC(id,ac);
        return ac;
    }


    @ApiOperation(value = "delete AC by id")
    @DeleteMapping("/{id}")
    public void deleteACbyID(@PathVariable("id") Long id){
        acServices.deleteACbyID(id);
    }

}
