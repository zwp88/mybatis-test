package homework2;

import java.time.LocalDate;

public class Game {
    public int buy(LocalDate onLineDate,LocalDate buyDate) {
        LocalDate week1 = onLineDate.plusWeeks(1);
        LocalDate week2 = onLineDate.plusWeeks(2);
        LocalDate week4 = onLineDate.plusWeeks(4);
        int i = buyDate.compareTo(week1);
        int j = buyDate.compareTo(week2);
        int k = buyDate.compareTo(week4);
        if(i<=0){
            return 8;
        }else{
            if(j<=0){
                return 9;
            }else{
                if(k<=0){
                    return 10;
                }else{
                    return -1;//无法购买
                }
            }
        }
    }
}
