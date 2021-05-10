import java.util.ArrayList;

public class VATReverseCharging {

    private String name;
    private ArrayList<Country> countries;
    private static Country country;

    public VATReverseCharging(String name) {
        this.name = name;
        countries = new ArrayList<>();
        countries.add(new Country("Duitsland", "de"));
        countries.add(new Country("Frankrijk", "fr"));
        countries.add(new Country("Belgie", "be"));
        countries.add(new Country("Italie", "it"));
        countries.add(new Country("Spanje", "es"));
        countries.add(new Country("Polen", "pl"));
    }

    public String getName() {
        return name;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public Country getCountry(String countryCode) {

        for (Country country : countries) {

            if (country.getCountryCode().equals(countryCode)) {
                return country;
            }
        }

        return null;
    }

    public boolean isReverseChargeApplicable(String countryCode) {

        if (this.getName().equals("Europe")) {

            if (this.getCountry(countryCode) != null) {
                return true;
            }
        }

        return false;
    }
}