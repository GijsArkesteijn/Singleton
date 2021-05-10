import java.util.ArrayList;

public class VATReverseCharging {

    private static VATReverseCharging singleton;

    private class Country {

        private String name;
        private String countryCode;

        public Country (String name, String countryCode) {
            this.name = name;
            this.countryCode = countryCode;
        }

        public String getCountryCode () {
            return countryCode;
        }
    }



    private String name;
    private ArrayList<Country> countries;
    private static Country country;

    private VATReverseCharging(String name) {
        this.name = name;
        countries = new ArrayList<>();
        countries.add(new Country("Duitsland", "DE"));
        countries.add(new Country("Frankrijk", "FR"));
        countries.add(new Country("Belgie", "BE"));
        countries.add(new Country("Italie", "IT"));
        countries.add(new Country("Spanje", "E"));
        countries.add(new Country("Polen", "PL"));
    }

    public static VATReverseCharging getInstance(){
        if(singleton == null){
            singleton = new VATReverseCharging("Europa");
        }
        return singleton;
    }

    public String getName() {
        return name;
    }

    private Country getCountry(String countryCode) {

        for (Country country : countries) {

            if (country.getCountryCode().equals(countryCode)) {
                return country;
            }
        }

        return null;
    }

    public boolean isReverseChargeApplicable(String countryCode) {

        if (this.getCountry(countryCode) != null) {
            return true;
        }

        return false;
    }
}