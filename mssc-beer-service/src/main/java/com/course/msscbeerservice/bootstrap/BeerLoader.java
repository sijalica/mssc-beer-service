package com.course.msscbeerservice.bootstrap;

import com.course.msscbeerservice.domain.Beer;
import com.course.msscbeerservice.repositories.BeerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                            .beerName("Mango Bobs")
                            .beerStyle("IPA")
                            .minOnHand(12)
                            .quantityToBrew(200)
                            .upc(337010000001L)
                            .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .upc(337010000002L)
                    .price(new BigDecimal("11.95"))
                    .build());
        }

        log.info("Loaded beers: " + beerRepository.count());
    }
}
