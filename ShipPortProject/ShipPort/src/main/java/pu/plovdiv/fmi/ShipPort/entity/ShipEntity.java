package pu.plovdiv.fmi.ShipPort.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Entity
@Getter
@Setter

public class ShipEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "id", nullable = false)
        private Long id;


        @Column
        private String name;


        @ManyToMany
        @JoinTable(
                name = "ship_name",
                joinColumns = @JoinColumn(
                        name = "ship_id"),
                inverseJoinColumns = @JoinColumn(
                        name = "ship_id")
        )
        @JsonIgnore
        private Set<ShipEntity> ships = new HashSet<>();
    }
