package by.ekaterina.entity;

import java.sql.Date;
import java.sql.SQLData;


public class Order implements Entity{
    int id;
    String from;
    String to;
    String text;
    int idStatus;
    int idResponsible;
    Date date;

    public Order(int id, String from, String to, String text, int idStatus, int idResponsible, Date date) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.text = text;
        this.idStatus = idStatus;
        this.idResponsible = idResponsible;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public int getIdResponsible() {
        return idResponsible;
    }

    public void setIdResponsible(int idResponsible) {
        this.idResponsible = idResponsible;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
