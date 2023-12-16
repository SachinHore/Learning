package com.assignment.acInventaryRest.services;

import com.assignment.acInventaryRest.DAO.ACDAO;
import com.assignment.acInventaryRest.DAO.ACDAO1;
import com.assignment.acInventaryRest.entity.AC;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ACServices {

    @Autowired
    private ACDAO1 acdao;

    public ACServices(ACDAO1 acdao) {
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

    }


    public void patchAC(Long id,AC ac){

    }


    public void deleteACbyID(Long id){

    }


}
