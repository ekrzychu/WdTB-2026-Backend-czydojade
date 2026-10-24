package pl.wsb.czydojade.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fleet_number", nullable = false, unique = true, length = 20)
    private String fleetNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "transport_mode", nullable = false, length = 10)
    private TransportMode transportMode;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "active", nullable = false)
    private Boolean active;

    protected Vehicle() {
    }

    public Vehicle(String fleetNumber, TransportMode transportMode,
                   Integer capacity, Boolean active) {
        this.fleetNumber = fleetNumber;
        this.transportMode = transportMode;
        this.capacity = capacity;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getFleetNumber() {
        return fleetNumber;
    }

    public TransportMode getTransportMode() {
        return transportMode;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Boolean getActive() {
        return active;
    }
}