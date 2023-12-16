package OnetoManyMapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Alien {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int alienId;
    private String alienName;
    @OneToMany
    @JoinTable(name = "ALIEN_VEHICLE", joinColumns =@JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"))
    private Collection<Vehicle> vehicles =new ArrayList<>();

    public Alien() {

    }

    public Alien(String alienName, Collection<Vehicle> vehicles) {
        this.alienName = alienName;
        this.vehicles = vehicles;
    }

    public int getAlienId() {
        return alienId;
    }

    public void setAlienId(int alienId) {
        this.alienId = alienId;
    }

    public String getAlienName() {
        return alienName;
    }

    public void setAlienName(String alienName) {
        this.alienName = alienName;
    }

    public Collection<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "alienId=" + alienId +
                ", alienName='" + alienName + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }
}
