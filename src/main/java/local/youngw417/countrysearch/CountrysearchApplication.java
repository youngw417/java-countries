package local.youngw417.countrysearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountrysearchApplication {

    public static CountryList ourCountry;

    public static void main(String[] args) {

        ourCountry = new CountryList();
        SpringApplication.run(CountrysearchApplication.class, args);
    }

}
