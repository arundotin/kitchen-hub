package com.arun.kitchenhub;

import com.github.f4b6a3.ulid.UlidCreator;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class KitchenDao {
    private final Map<String, Kitchen> kitchens;

    public KitchenDao() {
        kitchens = new ConcurrentHashMap<>();
    }

    public Kitchen save(Kitchen kitchen) {
        kitchens.put(kitchen.id(), kitchen);
        return kitchen ;
    }

    public List<Kitchen> findAll() {
        return new ArrayList<>(kitchens.values());
    }

    public Optional<Kitchen> findById(String id) {
        return Optional.ofNullable(kitchens.get(id));
    }


}
