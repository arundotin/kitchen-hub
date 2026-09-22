package com.arun.kitchenhub.kitchen.internal;

import com.arun.kitchenhub.kitchen.KitchenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/{version}/kitchens")
public class KitchenController {

    private final KitchenService kitchenService;

    public KitchenController(KitchenService kitchenService) {
        this.kitchenService = kitchenService;
    }

    @GetMapping(version = "v1")
    public List<KitchenResponse> getKitchens() {
        return kitchenService.getKitchens();
    }

    @GetMapping(version = "v2")
    public ApiResponse<List<KitchenResponse>> getKitchensV2() {

        List<KitchenResponse> kitchenResponses = kitchenService.getKitchens();

        return new ApiResponse<>(kitchenResponses) ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<KitchenResponse> getKitchen(@PathVariable String id) {
        Optional<KitchenResponse> response = kitchenService.getKitchen(id) ;

        return ResponseEntity.of(response) ;
    }


    @PostMapping
    public KitchenResponse createKitchen(@RequestBody CreateKitchenRequest request) {
        return kitchenService.createKitchen(request);
    }
}
