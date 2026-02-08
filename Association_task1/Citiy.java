package Association_task1;

import java.util.ArrayList;
import java.util.List;

class City {
    private String name;
    private List<Resident> residents;

    public City(String name) {
        this.name = name;
        this.residents = new ArrayList<>();
    }

    public void addResident(Resident resident) {
        residents.add(resident);
    }
}
