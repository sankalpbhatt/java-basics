package sankalp.tutorials.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String [] ar){

        City ghazipur = new City("Chazipur", 1000000l);
        City varanasi = new City("Varanasi", 20000000l);
        City kanpur = new City("Kanpur", 15000000l);
        Region uttarPradesh = new Region("Uttar Pradesh", Set.of(ghazipur, varanasi, kanpur));

        City singrauli = new City("Singrauli", 2000000l);
        City indore = new City("Indore", 21000000l);
        City bhopal = new City("Bhopal", 15000000l);
        Region madhyaPradesh = new Region("Madhya Pradesh", Set.of(singrauli, indore, bhopal));

        Country india = new Country("India", Set.of(uttarPradesh, madhyaPradesh), 6.0);


        City london = new City("London", 100000l);
        City leicester = new City("Leicester", 2000000l);
        Region region1 = new Region("Region1", Set.of(london, leicester));

        Country uk = new Country("UK", Set.of(region1), 6.8);


        TreeMap<Country, String > countries = new TreeMap<>((o1, o2) -> {
            if(o1.getGdp() > o2.getGdp()){
                return 1;
            } else if (o1.getGdp() == o2.getGdp()) {
                return 0;
            } else {
                return -1;
            }
        });
        countries.put(india, "India");
        countries.put(uk, "United Kingdom");

        for(Map.Entry<Country, String> c: countries.entrySet()){
            System.out.println(c.getKey());
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
        }
    }
}

class Country {
    private String name;
    private Set<Region> regions;
    private Double gdp;
    private Long population = 0l;

    public Country(String name, Set<Region> regions, Double gdp) {
        this.name = name;
        this.regions = regions;
        this.gdp = gdp;
        for(Region region: regions){
            this.population += region.getPopulation();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Region> getRegions() {
        return regions;
    }

    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

    public Double getGdp() {
        return gdp;
    }

    public void setGdp(Double gdp) {
        this.gdp = gdp;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "{" +"\n"+
                "\tname='" + name + '\'' +",\n"+
                "\tregions=" + regions +",\n"+
                "\tgdp=" + gdp +",\n"+
                "\tpopulation=" + population +"\n"+
                '}';
    }
}

class Region{
    private String name;
    private Set<City> cities;
    private Long population = 0l;

    public Region(String name, Set<City> cities) {
        this.name = name;
        this.cities = cities;
        for(City city: cities){
            this.population+=city.getPopulation();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\tname='" + name + '\'' +",\n"+
                "\t\tcities=" + cities +",\n"+
                "\t\tpopulation=" + population +"\n"+
                '}';
    }
}

class City{
    private String name;
    private Long population = 0l;

    public City(String name, Long population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "{" +"\n"+
                "\t\t\tname='" + name + '\'' +",\n"+
                "\t\t\tpopulation=" + population +"\n"+
                '}';
    }
}