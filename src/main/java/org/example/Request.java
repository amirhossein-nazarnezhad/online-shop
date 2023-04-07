package org.example;

public class Request {
    User user;
    double money;
    boolean isConfirm = false;

    public Request(User user, double money) {
        this.user = user;
        this.money = money;
    }

    public void confirm1()
    {
        if(isConfirm == true)
        {
            double money1 =user.getWallet();
            user.setWallet(money1 + money);
        }

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isConfirm() {
        return isConfirm;
    }

    public void setConfirm(boolean confirm) {
        isConfirm = confirm;
    }

    @Override
    public String toString() {
        return "Request{" +
                "user=" + user +
                ", money=" + money +
                ", isConfirm=" + isConfirm +
                '}';
    }
}
