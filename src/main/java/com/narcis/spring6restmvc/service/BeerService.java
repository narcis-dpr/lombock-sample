package com.narcis.spring6restmvc.service;

import com.narcis.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
