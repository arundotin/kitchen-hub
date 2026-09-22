package com.arun.kitchenhub.kitchen;

import com.arun.kitchenhub.kitchen.internal.*;
import com.github.f4b6a3.ulid.UlidCreator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KitchenService {

    private KitchenDao kitchenDao ;

    public KitchenService(KitchenDao kitchenDao) {
        this.kitchenDao = kitchenDao ;
    }


    public KitchenResponse createKitchen (CreateKitchenRequest createKitchenRequest) {
        String kitchenId = UlidCreator.getUlid().toString();

        var kitchen = new Kitchen(
                kitchenId,
                createKitchenRequest.name(),
                createKitchenRequest.city(),
                createKitchenRequest.cuisine(),
                KitchenStatus.OPEN
        ) ;

        var savedKitchen = kitchenDao.save(kitchen);

        return toKitchenResponse(savedKitchen) ;

    }

    public List<KitchenResponse> getKitchens() {
        List<Kitchen> kitchens = kitchenDao.findAll() ;

        return kitchens.stream()
                .map(this::toKitchenResponse)
                .toList();
    }

    public Optional<KitchenResponse> getKitchen(String id) {
        Optional<Kitchen> kitchen = kitchenDao.findById(id) ;

        return kitchen.map(this::toKitchenResponse);

    }

    public Optional<KitchenInfo> getKitchenInfo(String id) {
        return kitchenDao.findById(id)
                .map(kitchen -> new KitchenInfo(
                        kitchen.id(),
                        kitchen.name(),
                        kitchen.city(),
                        kitchen.cuisine()
                ));
    }

    private KitchenResponse toKitchenResponse(Kitchen savedKitchen) {

        return new KitchenResponse(
                savedKitchen.id(),
                savedKitchen.name(),
                savedKitchen.city(),
                savedKitchen.cuisine(),
                savedKitchen.status()
        ) ;
    }


}
