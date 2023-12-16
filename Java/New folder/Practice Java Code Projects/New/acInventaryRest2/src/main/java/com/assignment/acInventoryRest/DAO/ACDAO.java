package com.assignment.acInventoryRest.DAO;
import com.assignment.acInventoryRest.entity.embeddableClasses.ACDetails;
import com.assignment.acInventoryRest.entity.AvailableACDetails;
import com.assignment.acInventoryRest.entity.ACSellDetails;
import com.assignment.acInventoryRest.entity.embeddableClasses.CustomerDetails;
import com.assignment.acInventoryRest.exceptions.ResourceAlreadyExist;
import com.assignment.acInventoryRest.exceptions.ResourceNotAvailable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ACDAO {

    @Autowired
    private SessionFactory factory;

    public Session getSession() {
        Session session = factory.getCurrentSession();
        if (session == null) {
            session = factory.openSession();
        }
        return session;
    }

    public ACDAO() {}

    public List<AvailableACDetails> getAllAC(){
        return getSession().createQuery("From AvailableACDetails", AvailableACDetails.class).getResultList();
    }

    public AvailableACDetails getACbyID(Long id) {
        AvailableACDetails availableAcDetails = getSession().get(AvailableACDetails.class,id);
        if(availableAcDetails ==null){
            throw new ResourceNotAvailable("ACDetails with id = "+id +" not available in the table AvailableACDetails");
        }
        return availableAcDetails;
    }

    public void saveAC(ACDetails acDetails){

        AvailableACDetails availableAcDetails = new AvailableACDetails();
        availableAcDetails.setAcDetails(acDetails);
        getSession().save(availableAcDetails);
    }

    public void updateAC(Long id,ACDetails acDetails){

        getSession().update(new AvailableACDetails(id,acDetails));
    }

    public void patchAC(Long id, ACDetails acDetails){
        AvailableACDetails availableAcDetails1 = getACbyID(id);
        if(acDetails.getAcColour() !=null){
            availableAcDetails1.getAcDetails().setAcColour(acDetails.getAcColour());
        }
        if(acDetails.getAcCompanyName() !=null){
            availableAcDetails1.getAcDetails().setAcCompanyName(acDetails.getAcCompanyName());
        };
        if(acDetails.getAcSerialNo() !=null){
            availableAcDetails1.getAcDetails().setAcSerialNo(acDetails.getAcSerialNo());
        };
        getSession().update(availableAcDetails1);
    }

    public void deleteACbyID(Long id){
        getSession().remove(getACbyID(id));
    }

    public List<AvailableACDetails> getAllAvailableACs() {
        /*List<AvailableACDetails> availableACDetailsList = getAllAC();
        List<AvailableACDetails> acsSell = getSession().createQuery("select availableAcDetails From ACSellDetails", AvailableACDetails.class).getResultList();
        availableACDetailsList.removeAll(acsSell);
        return availableACDetailsList;*/

        return getSession().createQuery("From AvailableACDetails where acId != (select id From ACSellDetails) ", AvailableACDetails.class).getResultList();

    }

    public void saveACSell(Long acId, CustomerDetails customerDetails){
        ACSellDetails acSellDetails = getSession().get(ACSellDetails.class,acId);
        if(acSellDetails !=null){
            throw new ResourceAlreadyExist("ACDetails with id = "+acId +" already sold");
        }
        AvailableACDetails availableAcDetails = getACbyID(acId);
        acSellDetails = new ACSellDetails(acId,availableAcDetails,customerDetails);
        getSession().save(acSellDetails);
    }

    public List<ACSellDetails> getAllACSell(){
        return getSession().createQuery("From ACSellDetails", ACSellDetails.class).getResultList();
    }

}
