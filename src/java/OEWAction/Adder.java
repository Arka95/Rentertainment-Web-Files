/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OEWAction;

import OEMEntities.Disk_Master;
import OEMEntities.Login_Master;
import OEMEntities.Member_Detail;
import OEMEntities.Stock_Master;
import OEMEntities.User_Account;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luv
 */
public class Adder
{

    public static void main(String[] args)
    {
	Session s = DAOLayer.HibDAOLayer.getSession();
	Transaction t = s.beginTransaction();
	Stock_Master sm = new Stock_Master();
	Disk_Master dm = new Disk_Master();
	sm.setCast("John Goodman, Mary Elizabeth Winstead");
	sm.setDirector("Dan Trachtenberg");
	sm.setImg("images/tenclov.jpg");
	sm.setPrice(399.0f);
	sm.setQuantity(5);
	sm.setSname("10 Cloverfield Lane");
	sm.setYear("2016");
	sm.setVersion("DVD");
	dm.setDdesc("Walter Sobchak gets Nam flashbacks but there are aliens involved.");
	sm.setDm(dm);
	s.save(dm);
	s.save(sm); 
	sm.setCast("Ben Afflex, Gal Gadot, Henry Cavill");
	sm.setDirector("Zack Snyder");
	sm.setImg("images/bvs.jpg");
	sm.setSname("Batman v. Superman");
	dm.setDdesc("A bunch of dunderheads and mopers fight at night.");
	s.save(dm);
	s.save(sm);
        
	sm.setCast("Ben Afflex, Gal Gadot, Henry Cavill");
	sm.setDirector("Zack Snyder");
	sm.setImg("images/bvs.jpg");
	sm.setSname("Batman v. Superman");
	dm.setDdesc("A bunch of dunderheads and mopers fight at night.");
	s.save(dm);
	s.save(sm);
	sm.setCast("Chris Evans, Hayley Atwell");
	sm.setDirector("Joe Johnston");
	sm.setImg("images/ratatouille.jpg");
	sm.setPrice(399.0f);
	sm.setQuantity(5);
	sm.setSname("Ratatouille");
	sm.setYear("2009");
	sm.setVersion("DVD");
	dm.setDdesc("When size or specie genre doesnt matter!");
	sm.setDm(dm);
	s.save(dm);
	s.save(sm); 
	Login_Master l = new Login_Master();
	l.setPassword("arka123");
	l.setStatus("active");
	l.setRole("admin");
	l.setLid("arka95");
	Member_Detail md = new Member_Detail();
	md.setFname("Arka");
	md.setLname("Bhowmik");
	md.setCountry("India");
	md.setState("West Bengal");
	md.setCity("Kolkata");
	md.setMobile("7278194445");
	md.setOccu("Student");
	md.setEmail("arka.bhowmik95@gmail.com");
	md.setStreet("NN Road");
	l.setMd(md);
	User_Account ua = new User_Account();
	ua.setBalance(0);
	l.setUa(ua);
	s.save(ua);
	s.save(md);
	s.save(l);  
		 t.commit();
                 System.out.println("Transaction Complete");
    }

}