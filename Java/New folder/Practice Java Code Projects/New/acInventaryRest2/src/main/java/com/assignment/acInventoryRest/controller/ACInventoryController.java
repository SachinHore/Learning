package com.assignment.acInventoryRest.controller;

import com.assignment.acInventoryRest.entity.embeddableClasses.ACDetails;
import com.assignment.acInventoryRest.entity.AvailableACDetails;
import com.assignment.acInventoryRest.entity.ACSellDetails;
import com.assignment.acInventoryRest.entity.embeddableClasses.CustomerDetails;
import com.assignment.acInventoryRest.services.ACServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@ApiOperation(value = "acInventory", tags = "ACInventory MS controller")
@RestController
@RequestMapping("/acs")
public class ACInventoryController {

    @Autowired
    private ACServices acServices;

    public ACInventoryController(ACServices acServices) {
        this.acServices = acServices;
    }

    @ApiOperation(value = "Get all ACs")
    @GetMapping()
    public List<AvailableACDetails> getAllAC(){
    return acServices.getAllAC();
    }

    @ApiOperation(value = "Get AvailableACDetails by id")
    @GetMapping("/{id}")
    public AvailableACDetails getACbyID(@PathVariable("id") Long id){
        return acServices.getACbyID(id);
    }

    @ApiOperation(value = "Save AvailableACDetails")
    @PostMapping()
    public String postAC(@RequestBody ACDetails acDetails){
        acServices.saveAC(acDetails);
        return acDetails+" : Saved successfully";
    }

    @ApiOperation(value = "Update AvailableACDetails")
    @PutMapping("/{id}")
    public String putAC(@RequestBody ACDetails acDetails,@PathVariable("id") Long id){
        acServices.updateAC(id,acDetails);
        return acDetails +" : Updated successfully ";
    }

    @ApiOperation(value = "Update AvailableACDetails partially by id")
    @PatchMapping("/{id}")
    public String  patchAC(@PathVariable("id") Long id, @RequestBody ACDetails acDetails){
        acServices.patchAC(id, acDetails);
        return acDetails+" : partially updated";
    }


    @ApiOperation(value = "Delete AvailableACDetails by id")
    @DeleteMapping("/{id}")
    public String deleteACbyID(@PathVariable("id") Long id){
        acServices.deleteACbyID(id);
        return "Deleted AvailableACDetails with id="+id;
    }

    @ApiOperation(value = "Get all available ACs")
    @GetMapping("/available")
    public List<AvailableACDetails> getAllAvailableACs(){
        return acServices.getAllAvailableACs();
    }

    @ApiOperation(value = "Get list of AvailableACDetails Sells")
    @GetMapping("/sells")
    public List<ACSellDetails> getAllACSell(){
        return acServices.getAllACSell();
    }

    @ApiOperation(value = "Sell AvailableACDetails")
    @PostMapping("/sells/{id}")
    public String postACSell(@RequestBody CustomerDetails customerDetails, @PathVariable("id")  Long id){
        acServices.saveACSell(id, customerDetails);
        return "Selling of AvailableACDetails with id = "+id+" completed";
    }

}
