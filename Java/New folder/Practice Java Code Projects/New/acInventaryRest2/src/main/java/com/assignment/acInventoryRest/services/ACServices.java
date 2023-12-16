package com.assignment.acInventoryRest.services;

import com.assignment.acInventoryRest.DAO.ACDAO;
import com.assignment.acInventoryRest.entity.embeddableClasses.ACDetails;
import com.assignment.acInventoryRest.entity.AvailableACDetails;
import com.assignment.acInventoryRest.entity.ACSellDetails;
import com.assignment.acInventoryRest.entity.embeddableClasses.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ACServices {

    @Autowired
    private ACDAO acdao;

    public ACServices(ACDAO acdao) {
        this.acdao = acdao;
    }

    public List<AvailableACDetails> getAllAC(){
        return acdao.getAllAC();
    }

    public AvailableACDetails getACbyID(Long id){

        return acdao.getACbyID(id);
    }

    public void saveAC(ACDetails acDetails){
        acdao.saveAC(acDetails);
    }

    public void updateAC(Long id,ACDetails acDetails){
        acdao.getACbyID(id);
        acdao.updateAC(id,acDetails);
    }


    public void patchAC(Long id, ACDetails acDetails){
        acdao.patchAC(id, acDetails);
    }


    public void deleteACbyID(Long id){

        acdao.deleteACbyID(id);
    }

    public List<AvailableACDetails> getAllAvailableACs() {
        return acdao.getAllAvailableACs();
    }

    public void saveACSell(Long id, CustomerDetails customerDetails) {
        acdao.saveACSell(id, customerDetails);
    }

    public List<ACSellDetails> getAllACSell() {
        return acdao.getAllACSell();
    }



}
