package com.example.redisexample.controller;

import com.example.redisexample.entity.Coin;
//import com.example.redisexample.service.CoinService;
import com.example.redisexample.service.XrpService;
import com.example.redisexample.service.impl.CoinServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoinController {

    @Autowired
    private CoinServiceImpl coinService;

    @Autowired
    private XrpService xrpService;

    @PostMapping("/coin")
    public ResponseEntity<String> saveCoin(@RequestBody Coin coin) {
        boolean result = coinService.saveCoin(coin);
        if(result)
            return ResponseEntity.ok("Save successfully.");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @DeleteMapping("/coin/{id}")
    public ResponseEntity<String> deleteCoinById(@PathVariable int id) {
        boolean result = coinService.deleteCoinById(id);
        if(result)
            return ResponseEntity.ok("Delete successfully.");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/coin")
    public ResponseEntity<List<Coin>> getAllProduct() {
        List<Coin> products;
        products = coinService.getAllCoin();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/coin/{id}")
    public ResponseEntity<Coin> findProductById(@PathVariable int id) {
        Coin products;
        products = coinService.findCoinById(id);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/test")
    public ResponseEntity<Long> test() {
        return ResponseEntity.ok(1L);
    }
}
