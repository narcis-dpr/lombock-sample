package com.narcis.spring6restmvc.controller;

import com.narcis.spring6restmvc.model.Beer;
import com.narcis.spring6restmvc.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;
    public Beer getBeerById(UUID uuid) {
        log.debug("the id is " + uuid);
        return beerService.getBeerById(uuid);
    }

}
