package local.youngw417.countrysearch;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:2019/population/total
//http://localhost:2019/population/min
//http://localhost:2019/population/max
@RestController
@RequestMapping("/population")
public class PopulationController {

    @GetMapping(value="/total", produces ="application/json")
    public ResponseEntity<?> getTotalPopulation(){
        long total = CountrysearchApplication.ourCountry.getTotalPop();
        System.out.println("The total population is " + total);
        String output = "Status OK";
        return new ResponseEntity<>(output, HttpStatus.OK);
    }

    @GetMapping(value="/min", produces={"application/json"})
    public ResponseEntity<?> getMinPopulation(){
        Country minCountry = CountrysearchApplication.ourCountry.getMinMaxPop("min");
        return new ResponseEntity<>(minCountry, HttpStatus.OK);
    }

    @GetMapping(value="/max", produces={"application/json"})
    public ResponseEntity<?> getMaxPopulation(){
        Country maxCountry = CountrysearchApplication.ourCountry.getMinMaxPop("max");
        return new ResponseEntity<>(maxCountry, HttpStatus.OK);
    }
}
