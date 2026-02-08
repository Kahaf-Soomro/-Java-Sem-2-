package Association_task1;

public class Main {
    public static void main(String[] args) {
        Continent asia = new Continent("Asia");
        Continent Europe = new Continent("Europe");
        Country pakistan = new Country("Pakistan");
        Country India = new Country("India");
        Country Germany = new Country("Germany");
        City karachi = new City("Hazrat Karachi ");
        City Bombay = new City("Bombay");
        City Frankfurt  = new City("Frankfurt ");

        asia.addCountry(pakistan);
        asia.addCountry(India);
        Europe.addCountry(Germany);
        pakistan.addCity(karachi);
        India.addCity(Bombay);
        Germany.addCity(Frankfurt);

        Resident ChahatFatehAliKhan = new Resident("Chahat Fateh ALi Kahn", 22);
        karachi.addResident(ChahatFatehAliKhan);
    }
}
