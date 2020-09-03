package date_time;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class LocalDateTimeTest {

    @Test
    public void convertLocalToDate() {
        Assert.assertEquals(
                new Date(2020, Calendar.SEPTEMBER, 3),
                new Main().convert(LocalDate.of(2020, 9, 3))
        );
    }

    @Test
    public void convertDateToLocal() {
        Assert.assertEquals(
                LocalDateTime.of(2020, 9, 3, 0, 0, 0),
                new Main().convert(new Date(2020, Calendar.SEPTEMBER, 3, 0, 0, 0))
        );
    }

    @Test
    public void daysBetween() {
        Assert.assertEquals(1, Main.daysBetween("2020/09/03&18:20", "2020/09/02&18:20"));
    }
}