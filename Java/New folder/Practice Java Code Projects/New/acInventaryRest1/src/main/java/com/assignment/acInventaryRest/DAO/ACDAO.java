package com.assignment.acInventaryRest.DAO;
import com.assignment.acInventaryRest.entity.AC;
import com.assignment.acInventaryRest.entity.ACSell;
import com.assignment.acInventaryRest.entity.AvailableAC;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLIntegrityConstraintViolationException;
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

    public List<AC> getAllAC(){
        return getSession().createQuery("From AC",AC.class).getResultList();
    }

    public  AC getACbyID(Long id){
        return getSession().get(AC.class,id);
    }

    public void saveAC(AC ac){
        getSession().save(ac);
    }

    public void updateAC(AC ac){
        getSession().contains(ac);
        getSession().update(ac);
    }

    public void patchAC(Long id,AC ac){
        AC ac1 = getACbyID(id);
        //if(ac.getAcId()!=null){ac1.setAcId(ac.getAcId());}
        if(ac.getAcColour() !=null){ac1.setAcColour(ac.getAcColour());}
        if(ac.getAcCompanyName() !=null){ac1.setAcCompanyName(ac.getAcCompanyName());};
        if(ac.getAcSerialNo() !=null){ac1.setAcSerialNo(ac.getAcSerialNo());};
        getSession().update(ac1);
    }

    public void deleteACbyID(Long id){
        getSession().remove(getACbyID(id));
    }

    public void saveACSell(Long acId,ACSell acSell1){
        AC ac = new AC();
        ac = getACbyID(acId);
        ACSell acSell = new ACSell();
        acSell.setId(ac.getAcId());
        acSell.setCustName(acSell1.getCustName());
        acSell.setPhone(acSell1.getPhone());
        acSell.setAc(ac);
        getSession().save(acSell);
        deleteAvailableACbyacID(acId);

    }

    public List<ACSell> getAllACSell(){
        return getSession().createQuery("From ACSell",ACSell.class).getResultList();
        //return null;
    }



    public void addtoAvailableAC(Long acId) {
        AC ac = new AC();
        ac = getACbyID(acId);
        AvailableAC availableAC = new AvailableAC();
        availableAC.setId(ac.getAcId());
        availableAC.setAc(ac);
        getSession().save(availableAC);
    }

    public List<AvailableAC> getAllAvailableACs() {
        return getSession().createQuery("From AvailableAC",AvailableAC.class).getResultList();
    }

    public  AvailableAC getAvailableACbyID(Long id){
        return getSession().get(AvailableAC.class,id);
    }

    public void deleteAvailableACbyacID(Long acId){
        getSession().remove(getAvailableACbyID(acId));
    }
}
