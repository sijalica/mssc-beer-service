package com.course.msscbeerservice.web.mappers;

import com.course.msscbeerservice.domain.Beer;
import com.course.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = DateMapper.class)
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDto beerDto);

    BeerDto beerToBeerDto(Beer beer);
}
