package Association_task1;
import java.util.ArrayList;
import java.util.List;

public class Continent {

    private String name;
    private List<Country> countries;

    public Continent(String name) {
        this.name = name;
        this.countries = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }
}

    

