package org.example.app.dto;

public class CreditCardDto {

    private Integer firstFour;
    private Integer secondFour;
    private Integer thirdFour;
    private Integer lastFour;

    public Integer getFirstFour() {
        return firstFour;
    }

    public void setFirstFour(Integer firstFour) {
        this.firstFour = firstFour;
    }

    public Integer getSecondFour() {
        return secondFour;
    }

    public void setSecondFour(Integer secondFour) {
        this.secondFour = secondFour;
    }

    public Integer getThirdFour() {
        return thirdFour;
    }

    public void setThirdFour(Integer thirdFour) {
        this.thirdFour = thirdFour;
    }

    public Integer getLastFour() {
        return lastFour;
    }

    public void setLastFour(Integer lastFour) {
        this.lastFour = lastFour;
    }

    public String toString() {
        return getFirstFour()+"-"+getSecondFour()+"-"+getThirdFour()+"-"+getLastFour();
    }
}
