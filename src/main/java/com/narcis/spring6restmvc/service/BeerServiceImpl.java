package com.narcis.spring6restmvc.service;

import com.narcis.spring6restmvc.model.Beer;
import com.narcis.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        log.debug("first debug ");
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Aragh Sagi")
                .upc("123456")
                .price(new BigDecimal(32.99))
                .quantityOnHand(2)
                .beerStyle(BeerStyle.PRICEY)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}