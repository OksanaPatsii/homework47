package de.ait;

public class WeatherTools {
    public static String getWindDescription(int speed, boolean isGusty){
        String descr ="";
        if (speed < 1) { descr = "Calm";
        } else if (speed <= 5){ descr = "Light Air";
        } else if (speed <= 11){ descr = "Light Breeze";
        } else if (speed <= 19){ descr = "Gentle Breeze";
        } else if (speed <= 28) { descr = "Moderate Breeze";
        } else if (speed <= 38) { descr = "Fresh Breeze";
        } else { descr = "Stay at home, Strong Breeze";
        } if (isGusty) {
            descr = "Gusty " + descr;
        }
        return descr + " with speed of " + speed + " km";
    }
}
