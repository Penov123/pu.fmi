package pu.plovdiv.fmi.ShipPort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pu.plovdiv.fmi.ShipPort.entity.ShipEntity;
import pu.plovdiv.fmi.ShipPort.services.ShipService;

import java.util.List;

public class CountryBase {
    private final CountryBase countryBase;

    @Autowired
    public CountryBase(CountryBase countryBase) {
        this.countryBase = countryBase;
    }


    @GetMapping
    public List<CountryBase> getAllCountry() {
        return countryBase.getAllCountry();
    }

    @GetMapping("/{id}")
    public ShipEntity getCountryById(@PathVariable Long id) {
        return countryBase.getCountryById(id);
    }


    @PostMapping
    public CountryBase countryBase(@RequestBody CountryBase countryBase) {
        return countryBase.createShip(countryBase);
    }

    private CountryBase createShip(CountryBase countryBase) {
    }


    @PutMapping("/{id}")
    public CountryBase updateCountry(@PathVariable Long id, @RequestBody CountryBase countryBase) {
        CountryBase countryBaseService = null;
        return countryBaseService.updateCountry(id, countryBase);
    }


    @DeleteMapping("/{id}")
    public void deleteShip(@PathVariable Long id) {
        ShipService shipService;
        shipService.deleteShip(id);
    }

    @PostMapping("/{shipId}/addShip/{typeId}")
    public ShipEntity addTypeToShip(@PathVariable Long shipId, @PathVariable Long typeId) {
        ShipService shipService;
        return shipService.associateTypewithShip(shipId, typeId);
    }
}
