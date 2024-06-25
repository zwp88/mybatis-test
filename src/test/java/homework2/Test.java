package homework2;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Players player1 = new Players("李白", LocalDate.of(2022,9,5));
        Players player2 = new Players("李信", LocalDate.of(2022,9,10));
        Players player3 = new Players("白起", LocalDate.of(2022,9,28));
        Players player4 = new Players("李元芳", LocalDate.of(2022,10,10));
        Players[] playersArray = {player1, player2, player3, player4};
        doBuySkin(playersArray);
    }
    public static void doBuySkin(Players[] players) {
        int d = 1788;
        LocalDate onlineDate = LocalDate.of(2022,9,2);
        Game game = new Game();
        for(Players player:players){
            int z = game.buy(onlineDate,player.getBuyDate());
            if(z == -1){
                System.out.println("皮肤已经下线，" + player.getName() + "在" + player.getBuyDate() + "无法购买");
            }else {
                System.out.println(player.getName() + "在" + player.getBuyDate() + "购买 ， 花费了"
                        + z * 0.1 * d + "点券");
            }
        }
    }
}
