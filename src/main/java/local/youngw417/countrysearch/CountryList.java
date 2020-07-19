package local.youngw417.countrysearch;

import java.util.ArrayList;
import java.util.List;

public class CountryList {

    public List<Country> myCountry = new ArrayList<>();

    public CountryList() {
        myCountry.add(new Country("China", 1420062022, 9388211, 39));
        myCountry.add(new Country("India", 1368737513, 2973190, 28));
        myCountry.add(new Country("U.S.",329093110,9147420,38));
        myCountry.add(new Country("Indonesia",269536482,1811570,29));
        myCountry.add(new Country("Brazil",212392717,8358140,33));
        myCountry.add(new Country("Pakistan",204596442,770880,23));
        myCountry.add(new Country("Nigeria",200962417,910770,18));
        myCountry.add(new Country("Bangladesh",168065920,130170,27));
        myCountry.add(new Country("Russia",143895551,16376870,40));
        myCountry.add(new Country("Mexico",132328035,1943950,29));


    }

    public List<Country> findCountries(CheckCountry tester){
        List<Country> tempContainer = new ArrayList<>();

        for (Country e: myCountry){
            if (tester.test(e)){
                tempContainer.add(e);
            }
        }

        return tempContainer;
    }

    public long getTotalPop(){
        long count = 0;
        for (Country e: myCountry){
            count += e.getPopulation();
        }

        return count;
    }

    public Country getMinMaxPop(String type){
       int ind = 0;
       long pop = myCountry.get(0).getPopulation();
       int i = 0;
       for (Country e: myCountry){
           if (e.getPopulation() < pop && type == "min"){
               ind = i;
               pop =  e.getPopulation();
           } else if (e.getPopulation() > pop && type == "max"){
               ind = i;
               pop =  e.getPopulation();
           }
           i++;
       }

       return myCountry.get(ind);
    }

}
