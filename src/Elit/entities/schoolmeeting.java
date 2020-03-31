/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elit.entities;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/**
 *
 * @author IBM
 */
public class schoolmeeting {
    private int id ; 
    private String subject ; 
    private String concerned ;
    private String type ;
    private String startsDate ; 
    private String Date ; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getConcerned() {
        return concerned;
    }

    public void setConcerned(String concerned) {
        this.concerned = concerned;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartsDate() {
        return startsDate;
    }

    public void setStartsDate(String startsDate) {
        this.startsDate = startsDate;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "schoolmeeting{" + ", subject=" + subject + ", concerned=" + concerned + ", type=" + type + ", startsDate=" + startsDate + ", Date=" + Date + '}';
    }
     
}


