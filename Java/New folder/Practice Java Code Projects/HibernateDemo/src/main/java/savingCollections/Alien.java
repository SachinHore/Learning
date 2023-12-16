package savingCollections;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Alien {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int aid;
    private String aname;
    private String acolour;
    @ElementCollection()
    @JoinTable(name="Alien_Address",joinColumns = @JoinColumn(name="Alien_aID"))
    private Collection<Address> address = new ArrayList<Address>();

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAcolour() {
        return acolour;
    }

    public void setAcolour(String acolour) {
        this.acolour = acolour;
    }

    public List<Address> getAddress() {
        return (List<Address>) address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", acolour='" + acolour + '\'' +
                ", address=" + address +
                '}';
    }
}
