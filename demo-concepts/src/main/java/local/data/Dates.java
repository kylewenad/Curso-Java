package local.data;

import java.time.LocalDateTime;

public class Dates {

    void useLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current LocalDateTime " + localDateTime);
        System.out.println("Year " + localDateTime.getYear());
        System.out.println("Month: " + localDateTime.getMonth());
        System.out.println("Day: " + localDateTime.getDayOfMonth());
        System.out.println();
    }

    public static void main(String[] args) {
        Dates dates = new Dates();
        dates.useLocalDateTime();
    }
}
