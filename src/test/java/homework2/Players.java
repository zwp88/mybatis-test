package homework2;

import java.time.LocalDate;

public class Players {
    private String name;
    private LocalDate buyDate;

    public Players() {
    }

    public Players(String name, LocalDate buyDate) {
        this.name = name;
        this.buyDate = buyDate;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return buyDate
     */
    public LocalDate getBuyDate() {
        return buyDate;
    }

    /**
     * 设置
     * @param buyDate
     */
    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public String toString() {
        return "Players{name = " + name + ", buyDate = " + buyDate + "}";
    }
}
