package pu.plovdiv.fmi.ShipPort.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class TypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column
    private String type;


    @ManyToMany
    @JoinTable(
            name = "type_name",
            joinColumns = @JoinColumn(
                    name = "type_id"),
            inverseJoinColumns = @JoinColumn(
                    name = "type_id")
    )
    @JsonIgnore
    private Set<TypeEntity> types = new HashSet<>();
}


