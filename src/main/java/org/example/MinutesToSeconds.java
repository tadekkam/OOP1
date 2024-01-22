package org.example;

public class MinutesToSeconds {

    protected static int convert(int minutes) {
        if (minutes < 0) {
            /*
             throw new IllegalArgumentException ("invalid seconds value");
             TODO: Nie wiem jak napisać testy do obsługi błędu
            */
            return 0;
        } else
        return minutes * 60;
    }


}
