package core;

import javax.swing.*;

public class model{
    private String number1,number2;

    public model(String nb1, String nb2) {
        this.number1 = nb1;
        this.number2 = nb2;
    }

    public String getNumber1() {
        return number1;
    }
    public void setNumber1(String number1) {
        this.number1 = number1;
    }
    public String getNumber2() {
        return number2;
    }
    public void setNumber2(String number2) {
        this.number2 = number2;
    }
}
