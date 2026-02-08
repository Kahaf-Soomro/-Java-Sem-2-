package Association_task1;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private List<City> cities;

    public Country(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }
}
