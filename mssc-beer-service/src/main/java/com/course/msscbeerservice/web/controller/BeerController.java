package com.course.msscbeerservice.web.controller;

import com.course.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {
        // todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> saveNewBeer(@RequestBody BeerDto beerDto) {
        // todo impl
        return new ResponseEntity<>("", HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<String> updateBeerById(@PathVariable UUID beerId) {
        // todo impl
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
