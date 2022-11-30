package com.example.redisexample.repository;

import com.example.redisexample.entity.Coin;

import java.util.List;

public interface CoinDao {
    boolean saveCoin(Coin coin);
    List<Coin> getAllCoin();
    Coin findCoinById(int id);
    Boolean deleteCoin(int id);
}
