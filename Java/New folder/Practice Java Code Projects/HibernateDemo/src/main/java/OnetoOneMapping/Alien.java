package OnetoOneMapping;

import javax.persistence.*;

@Entity
public class Alien {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int alienId;
    private String alienName;
    @OneToOne
    //@JoinColumn(name = "VEHICLE_ID")
    private Vehicle vehicle;


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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + alienId +
                ", aname='" + alienName + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
