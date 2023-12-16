package ManytoManyMapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;
    private String vehicleName;
    @ManyToMany(mappedBy = "vehicles")
    private Collection<Alien> aliens = new ArrayList<>();

    public Vehicle() {
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Collection<Alien> getAliens() {
        return aliens;
    }

    public void setAliens(Collection<Alien> aliens) {
        this.aliens = aliens;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleName='" + vehicleName + '\'' +
                ", aliens=" + aliens +
                '}';
    }
}
