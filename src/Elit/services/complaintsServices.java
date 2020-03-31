/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elit.services;
import Elit.entities.Classe;
import Elit.entities.complaints;
import Elit.utils.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/**
 *
 * @author IBM
 */
public class complaintsServices {
    Connection c;

    public complaintsServices() {
        c = DbConnection.getInstance().getCnx();
    }

    /**
     *
     * @param co
     */
    public void addComplaint(complaints co) {
        try {
            String requete = "insert into complaints (content,title,email,file,date) values(?,?,?,?,?)";
            PreparedStatement pst = c.prepareStatement(requete);
            pst.setString(1, co.getContent());
            pst.setString(2, co.getTitle());
            pst.setString(3, co.getEmail());
            pst.setString(4, co.getFile());
            pst.setString(5,co.getDate()) ;
            pst.executeUpdate();
            System.out.println("Complaint sent successfully! Thanks for your feedback❤");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<complaints> ListComplaints() {
        List<complaints> Mylist = new ArrayList<>();
        try {
            String requete = "select * from complaints";
            PreparedStatement pst = c.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                complaints t = new complaints();
                t.setTitle(rs.getString("Title"));
                t.setContent(rs.getString("Content"));
                t.setEmail(rs.getString("email"));
                t.setFile(rs.getString("file"));
                t.setDate(rs.getString("date"));
                t.setId(rs.getInt("id"));
                Mylist.add(t);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return Mylist;
    }

    public void UpdateComplaint(complaints co) {
        try {
            String requete = "update complaints (content,title,email,file,date) values(?,?,?,?,?) where ? = id";
            PreparedStatement pst = c.prepareStatement(requete);
            pst.setString(1, co.getContent());
            pst.setString(2, co.getTitle());
            pst.setString(3, co.getEmail());
            pst.setString(4, co.getFile());
            pst.setString(5,co.getDate()) ;
            pst.setInt(6, co.getId());
            pst.executeUpdate();
            System.out.println("complaint Modified !!!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void DeleteComplaint(complaints co) {
        try {
            String requete = "delete from complaints where ? = id";
            PreparedStatement pst = c.prepareStatement(requete);
            pst.setInt(1, co.getId());
            pst.executeUpdate();
            System.out.println("Complaint Deleted w rta7na !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}


