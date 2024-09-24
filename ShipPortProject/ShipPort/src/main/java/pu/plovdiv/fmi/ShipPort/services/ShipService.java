package pu.plovdiv.fmi.ShipPort.services;


import pu.plovdiv.fmi.ShipPort.entity.ShipEntity;

import java.util.List;

public class ShipService {


    public List<ShipEntity> getAllShips() {
        return null;
    }

    public ShipEntity getShipById(Long id) {
        return null;
    }

    public ShipEntity createShip(ShipEntity shipEntity) {
        return shipEntity;
    }

    public ShipEntity updateShip(Long id, ShipEntity shipEntity) {
        return shipEntity;
    }

    public ShipEntity associateTypewithShip(Long shipId, Long typeId) {
        return null;
    }

    public void deleteShip(Long id) {

    }
}