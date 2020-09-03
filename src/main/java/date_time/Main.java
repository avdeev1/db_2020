package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public Date convert(LocalDate localDate) {
        Date date = new Date(
                localDate.getYear(),
                localDate.getMonth().getValue() - 1,
                localDate.getDayOfMonth()
        );


        return date;
    }

    public LocalDateTime convert(Date date) {
        int year = date.getYear();
        int month = date.getMonth() + 1;
        int day = date.getDate();
        int hours = date.getHours();
        int minutes = date.getMinutes();
        int seconds = date.getSeconds();

        return LocalDateTime.of(year, month, day, hours, minutes, seconds);
    }

    // 1981/02/30&18:20
    public static long daysBetween(String firstDate, String lastDate) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for (String s : firstDate.split("[/&:]")) {
            first.add(Integer.parseInt(s));
        }

        for (String s : lastDate.split("[/&:]")) {
            second.add(Integer.parseInt(s));
        }


        LocalDateTime firstLocalDate = LocalDateTime
                .of(first.get(0), first.get(1), first.get(2), first.get(3), first.get(4));
        LocalDateTime secondLocalDate = LocalDateTime
                .of(second.get(0), second.get(1), second.get(2), second.get(3), second.get(4));


        return Math.abs(ChronoUnit.DAYS.between(firstLocalDate, secondLocalDate));
    }



    public static void main(String[] args) {

    }
}
