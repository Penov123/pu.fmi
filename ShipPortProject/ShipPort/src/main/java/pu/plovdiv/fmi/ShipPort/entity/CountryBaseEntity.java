package pu.plovdiv.fmi.ShipPort.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class CountryBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column
    private String ncountry;


    @ManyToMany
    @JoinTable(
            name = "country_name",
            joinColumns = @JoinColumn(
                    name = "country_id"),
            inverseJoinColumns = @JoinColumn(
                    name = "country_id")
    )
    @JsonIgnore
    private Set<CountryBaseEntity> countryes = new HashSet<>();
}
