/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elit.entities;
import java.sql.PreparedStatement;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/**
 *
 * @author IBM
 */
public class complaints {
    private int id ; 
    private String content ;
    private String title ; 
    private String email ;
    private String date ;
    private String file ; 

    

    public complaints(int id, String content, String title, String email, String date) {
        this.id = id;
        this.content = content;
        this.title = title;
        this.email = email;
        this.date = date;
    }

    public complaints() {
    }

    public complaints(String content, String title, String email, String date, String file) {
        this.content = content;
        this.title = title;
        this.email = email;
        this.date = date;
        this.file = file;
    }
    
    
    
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "complaints{" + ", content=" + content + ", title=" + title + ", email=" + email + ", date=" + date + ", file❤💕=" + file + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final complaints other = (complaints) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    

}
