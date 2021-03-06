package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId)
    {
        //todo: do the impl later. 
        BeerDto dto = BeerDto.builder().build();
        return new ResponseEntity<>(dto, HttpStatus.OK);


    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto)
    {
        return new ResponseEntity(HttpStatus.CREATED);

    }

    @PutMapping("/{beerId")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
