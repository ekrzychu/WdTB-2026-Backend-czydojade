package pl.wsb.czydojade.transport.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "line")
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number", nullable = false, unique = true, length = 10)
    private String number;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "transport_mode", nullable = false, length = 10)
    private TransportMode transportMode;

    @Column(name = "active", nullable = false)
    private Boolean active;

    protected Line() {
    }

    public Line(String number, String description,
                TransportMode transportMode, Boolean active) {
        this.number = number;
        this.description = description;
        this.transportMode = transportMode;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public TransportMode getTransportMode() {
        return transportMode;
    }

    public Boolean getActive() {
        return active;
    }
}
