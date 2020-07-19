package local.youngw417.countrysearch;

import java.util.concurrent.atomic.AtomicLong;


public class Country {
    private static final AtomicLong counter = new AtomicLong();

    private long id;
    private String name;
    private long population;
    private long landmasskm2;
    private int medianage;


    public Country(String name, long population, long landmasskm2, int medianage) {

        this.id = counter.incrementAndGet(); //maxId++
        this.name = name;
        this.population = population;
        this.landmasskm2 = landmasskm2;
        this.medianage = medianage;
    }


    public long getId() {
        return id;
    }
    public String getName() {
        return name;

    }
    public long getPopulation() {
        return population;
    }

    public long getLandmasskm2() {
        return landmasskm2;
    }

    public int getMedianage() {
        return medianage;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setLandmasskm2(long landmasskm2) {
        this.landmasskm2 = landmasskm2;
    }

    public void setMedianage(int medianage) {
        this.medianage = medianage;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id  +
                ", name=" + name + + '\'' +
                ", population=" + population +
                ", landmasskm2=" + landmasskm2 +
                ", medianage=" + medianage +
                '}';
    }
}