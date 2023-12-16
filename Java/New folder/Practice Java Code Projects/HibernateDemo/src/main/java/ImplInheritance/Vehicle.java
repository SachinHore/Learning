package ImplInheritance;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
/*@DiscriminatorColumn(
        name="VEHICLE_TYPE",
       discriminatorType = DiscriminatorType.STRING
)*/
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;
    private String vehicleName;


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



    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
