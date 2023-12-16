package com.assignment.acInventaryRest.services;

import com.assignment.acInventaryRest.DAO.ACDAO;
import com.assignment.acInventaryRest.entity.AC;
import com.assignment.acInventaryRest.entity.ACSell;
import com.assignment.acInventaryRest.entity.AvailableAC;
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

    public List<AC> getAllAC(){
        return acdao.getAllAC();
    }

    public  AC getACbyID(Long id){

        return acdao.getACbyID(id);
    }

    public void saveAC(AC ac){
        acdao.saveAC(ac);
    }

    public void updateAC(AC ac){
        acdao.updateAC(ac);
    }


    public void patchAC(Long id,AC ac){
        acdao.patchAC(id,ac);
    }


    public void deleteACbyID(Long id){

        acdao.deleteACbyID(id);
    }


    public void saveACSell(Long id,ACSell acSell) {
        acdao.saveACSell(id,acSell);
    }

    public List<ACSell> getAllACSell() {
        return acdao.getAllACSell();
    }



    public void addtoAvailableAC(Long id) {
        acdao.addtoAvailableAC(id);
    }

    public List<AvailableAC> getAllAvailableACs() {
        return acdao.getAllAvailableACs();
    }
}
