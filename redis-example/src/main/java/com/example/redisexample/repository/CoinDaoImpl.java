package com.example.redisexample.repository;

import com.example.redisexample.entity.Coin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoinDaoImpl implements CoinDao {

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String HASH_KEY = "Coin";

    @Override
    public boolean saveCoin(Coin coin) {
        try {
            redisTemplate.opsForHash().put(HASH_KEY, coin.getId(),coin);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Coin> getAllCoin() {
        List<Coin> products;
        products = redisTemplate.opsForHash().values(HASH_KEY);
        return products;
    }

    public Coin findCoinById(int id) {
        Coin product;
        product = (Coin) redisTemplate.opsForHash().get(HASH_KEY,id);
        return product;
    }

    public Boolean deleteCoin(int id) {
        try {
            redisTemplate.opsForHash().delete(HASH_KEY,id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
