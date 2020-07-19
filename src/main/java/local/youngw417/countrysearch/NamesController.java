package local.youngw417.countrysearch;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//http://localhost:2019/names/all
//http://localhost:2019/names/start/u

@RestController
@RequestMapping("/names")
public class NamesController {

    @GetMapping(value = "/all", produces = {"application/json"})
    public ResponseEntity<?> getAllCountries(){
        CountrysearchApplication.ourCountry.myCountry.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
        return new ResponseEntity<>(CountrysearchApplication.ourCountry.myCountry, HttpStatus.OK);
    }

    @GetMapping(value = "/start/{charac}", produces ="application/json")
    public ResponseEntity<?> getCountriesByLetter(@PathVariable char charac){
        List<Country> retCount = CountrysearchApplication.ourCountry.findCountries(e -> e.getName().toUpperCase().charAt(0) == Character.toUpperCase(charac));
        return new ResponseEntity<>(retCount, HttpStatus.OK);
    }

}
