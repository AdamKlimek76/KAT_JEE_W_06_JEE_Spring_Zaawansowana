package pl.coderslab.advanced.dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dates {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.of(1918, 11, 11));
    }
}
