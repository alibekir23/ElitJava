/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elit.tests;
import Elit.entities.Classe;
import Elit.entities.complaints;
import Elit.services.complaintsServices;
import Elit.services.ClassServices;
import Elit.utils.DbConnection;

/**
 *
 * @author kinga
 */
public class ElitMain {
    public static void main(String[] args) {
        DbConnection mc = DbConnection.getInstance();
        ClassServices ps = new ClassServices();
        complaintsServices pjs = new complaintsServices();
        Classe c = new Classe(03, "j15", "3éme");
        complaints comp = new complaints( "3émjvhjve" , "3éme","title","12/01/2012","kgkg");
        
        
//        ps.addClass(c);
        pjs.addComplaint(comp); 
        
    }
  
}
