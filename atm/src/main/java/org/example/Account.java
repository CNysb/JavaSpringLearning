package org.example;

import java.util.Objects;

public class Account {
    private String cardId;
    private String userName;
    private char gender;
    private String passWord;
    private double balance;
    private double limit;


    public Account() {
    }

    public Account(String cardId, String userName, char gender, String passWord, double balance, double limit) {
        this.cardId = cardId;
        this.userName = userName;
        this.gender = gender;
        this.passWord = passWord;
        this.balance = balance;
        this.limit = limit;
    }

    /**
     * 获取
     * @return cardId
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置
     * @param cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 获取
     * @return limit
     */
    public double getLimit() {
        return limit;
    }

    /**
     * 设置
     * @param limit
     */
    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String toString() {
        return "Account{cardId = " + cardId + ", userName = " + userName + ", gender = " + gender + ", passWord = " + passWord + ", balance = " + balance + ", limit = " + limit + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return gender == account.gender && Double.compare(balance, account.balance) == 0 && Double.compare(limit, account.limit) == 0 && Objects.equals(cardId, account.cardId) && Objects.equals(userName, account.userName) && Objects.equals(passWord, account.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, userName, gender, passWord, balance, limit);
    }
}
