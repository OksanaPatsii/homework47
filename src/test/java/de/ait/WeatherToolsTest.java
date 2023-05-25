package de.ait;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class WeatherToolsTest {
@ParameterizedTest
    @CsvSource({
            "4, true, 'Gusty Light Air with speed of 4 km'",
            "4, false, 'Light Air with speed of 4 km'",
            "11, true, 'Gusty Light Breeze with speed of 11 km'",
            "11, false, 'Light Breeze with speed of 11 km'",
            "19, true, 'Gusty Gentle Breeze with speed of 19 km'",
            "19, false, 'Gentle Breeze with speed of 19 km'",
            "28, true, 'Gusty Moderate Breeze with speed of 28 km'",
            "28, false, 'Moderate Breeze with speed of 28 km'",
            "29, true, 'Gusty Fresh Breeze with speed of 29 km'",
            "29, false, 'Fresh Breeze with speed of 29 km'"
    })
    public void getWindDescription_test1(int speed, boolean isGusty, String message){
    assertEquals(message,
            WeatherTools.getWindDescription(speed, isGusty));
    }
    @ParameterizedTest
    @CsvSource({"0,true, 'Gusty Calm with speed of 0 km'",
            "0, false,'Calm with speed of 0 km' "})
    public void getWindDescription_Calm_test2(int speed, boolean isGusty, String message){
    assertEquals(message,
            WeatherTools.getWindDescription(speed,isGusty));
    }
}