package pl.coderslab.advanced.dateapi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Comparator;

public class Main2 {

    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds()
                .stream()
                .filter(str -> str.contains("Europe"))
                .map(ZoneId::of)
                .map(LocalTime::now)
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
