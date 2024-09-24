package pu.plovdiv.fmi.ShipPort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pu.plovdiv.fmi.ShipPort.entity.ShipEntity;
import pu.plovdiv.fmi.ShipPort.services.ShipService;

import java.util.List;

@RestController
@RequestMapping("/ship")
public class Ship {

    private final ShipService shipService;

    @Autowired
    public Ship(ShipService shipService) {
        this.shipService = shipService;
    }


    @GetMapping
    public List<ShipEntity> getAllShips() {
        return shipService.getAllShips();
    }

    @GetMapping("/{id}")
    public ShipEntity getShipById(@PathVariable Long id) {
        return shipService.getShipById(id);
    }


    @PostMapping
    public ShipEntity createShip(@RequestBody ShipEntity shipEntity) {
        return shipService.createShip(shipEntity);
    }


    @PutMapping("/{id}")
    public ShipEntity updateShip(@PathVariable Long id, @RequestBody ShipEntity shipEntity) {
        return shipService.updateShip(id, shipEntity);
    }


    @DeleteMapping("/{id}")
    public void deleteShip(@PathVariable Long id) {
        Ship shipServiceService;
        shipService.deleteShip(id);
    }

    @PostMapping("/{shipId}/addShip/{typeId}")
    public ShipEntity addTypeToShip(@PathVariable Long shipId, @PathVariable Long typeId) {
        return shipService.associateTypewithShip(shipId, typeId);
    }
}

