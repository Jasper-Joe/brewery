package com.jasper.brewery.web.mapper;

import com.jasper.brewery.domain.Beer;
import com.jasper.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
