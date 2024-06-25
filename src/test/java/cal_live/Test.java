package cal_live;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2003, 9, 21);
        LocalDate date2 = LocalDate.of(2024, 6, 18);
        long days = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("从出生到现在，一共生活了" + days + "天");
    }
}
