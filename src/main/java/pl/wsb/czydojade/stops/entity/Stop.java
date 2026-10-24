package pl.wsb.czydojade.stops.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stop")
public class Stop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code", nullable = false, unique = true, length = 20)
    private String code;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "accessible", nullable = false)
    private Boolean accessible;

    @Embedded
    private StopCoordinates coordinates;

    protected Stop() {
    }

    public Stop(String code, String name, Boolean accessible,
                StopCoordinates coordinates) {
        this.code = code;
        this.name = name;
        this.accessible = accessible;
        this.coordinates = coordinates;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Boolean getAccessible() {
        return accessible;
    }

    public StopCoordinates getCoordinates() {
        return coordinates;
    }
}
