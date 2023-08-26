package com.narcis.spring6restmvc.service;

import com.narcis.spring6restmvc.model.Beer;
import com.narcis.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    private Map<UUID, Beer> beerMap;

    public BeerServiceImpl() {
        this.beerMap = new HashMap<>();

    Beer beer1 = Beer.builder()
            .id(UUID.randomUUID())
            .version(1)
            .beerName("Arraaagh 1")
            .beerStyle(BeerStyle.YOUNG)
            .upc("34234")
            .price(new BigDecimal(3.33))
            .quantityOnHand(33)
            .updateDate(LocalDateTime.now())
            .createdDate(LocalDateTime.now())
            .build();

    Beer beer2 = Beer.builder()
            .id(UUID.randomUUID())
            .version(1)
            .beerName("Arraaagh 1")
            .beerStyle(BeerStyle.YOUNG)
            .upc("34234")
            .price(new BigDecimal(3.33))
            .quantityOnHand(33)
            .updateDate(LocalDateTime.now())
            .createdDate(LocalDateTime.now())
            .build();
    Beer beer3 = Beer.builder()
            .id(UUID.randomUUID())
            .version(1)
            .beerName("Arraaagh 1")
            .beerStyle(BeerStyle.YOUNG)
            .upc("34234")
            .price(new BigDecimal(3.33))
            .quantityOnHand(33)
            .updateDate(LocalDateTime.now())
            .createdDate(LocalDateTime.now())
            .build();
    Beer beer4 = Beer.builder()
            .id(UUID.randomUUID())
            .version(1)
            .beerName("Arraaagh 1")
            .beerStyle(BeerStyle.YOUNG)
            .upc("34234")
            .price(new BigDecimal(3.33))
            .quantityOnHand(33)
            .updateDate(LocalDateTime.now())
            .createdDate(LocalDateTime.now())
            .build();

    Beer beer5 = Beer.builder()
            .id(UUID.randomUUID())
            .version(1)
            .beerName("Arraaagh 1")
            .beerStyle(BeerStyle.YOUNG)
            .upc("34234")
            .price(new BigDecimal(3.33))
            .quantityOnHand(33)
            .updateDate(LocalDateTime.now())
            .createdDate(LocalDateTime.now())
            .build();
    beerMap.put(beer1.getId(), beer1);
    beerMap.put(beer2.getId(), beer2);
    beerMap.put(beer3.getId(), beer3);
    beerMap.put(beer4.getId(), beer4);
    beerMap.put(beer5.getId(), beer4);
}

@Override
public List<Beer> listBeers() {
        return new ArrayList<>(beerMap.values());
}

    @Override
    public Beer getBeerById(UUID id) {
        log.debug("first debug ");
        return beerMap.get(id);
    }
}
