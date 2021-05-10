import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinentTest {

    Continent europe;

    @BeforeEach
    void init () {
        europe = new Continent ("Europe");
        europe.addCountry (new Country ("België", "BE"));
        europe.addCountry (new Country ("Duitsland", "DE"));
        europe.addCountry (new Country ("Frankrijk", "FR"));
    }

    @Test
    void testBTWPercentages () {
        assertFalse (europe.isReverseChargeApplicable("CA"));
        assertTrue (europe.isReverseChargeApplicable("BE"));
    }
}