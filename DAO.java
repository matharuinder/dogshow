package ca.sheridancollege.dao;

import java.sql.*;
import java.util.ArrayList;

import ca.sheridancollege.Beans.Dog;
import ca.sheridancollege.Beans.ShowList;
import ca.sheridancollege.Logic.MyLogic;

public class DAO {
	
	public static void main(String[] args) {
		
		//ArrayList<Dog> list = getDogs();
		
		//System.out.println(list.get(0));
		
//		ArrayList<ShowList> list = viewHoundList();
//		
//		for(int i =0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//System.out.println(searchByGroup("Hounds"));
		
		System.out.println(goingFri(1013));
		
		
	}
	
	public static void addDog(Dog d){
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "Insert into myDogs (name, ownerName, breed, dogGroup, gender, type) Values('"+d.getName()+"','"+d.getOwnerName()+"','"+d.getBreed()+"','"+d.getGroup()+"','"+d.getGender()+"','"+d.getType()+"')";
            
            Statement st = conn.createStatement();
            
            st.executeUpdate(q);
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
	}
	
	public static ArrayList<Dog> getDogs(){
    	ArrayList<Dog> dogs = new ArrayList<Dog>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from mydogs " + 
            		"where id not in" + 
            		"(select id from mydogs d " + 
            		"natural join dhandlers dh " + 
            		"where user is not null)";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String ownerName = rs.getString(3);
            	String breed = rs.getString(4);
            	String group = rs.getString(5);
            	String gender = rs.getString(6);
            	String type = rs.getString(7);
            	Dog d = new Dog(name,ownerName,breed,group,gender,type);
            	d.setId(id);
            	System.out.println(d);
            	dogs.add(d);
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	
    	return dogs;
    }
	
	public static ArrayList<Dog> searchById(String arg){
    	ArrayList<Dog> dogs = new ArrayList<Dog>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from myDogs where ID="+Integer.parseInt(arg);
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String ownerName = rs.getString(3);
            	String breed = rs.getString(4);
            	String group = rs.getString(5);
            	String gender = rs.getString(6);
            	String type = rs.getString(7);
            	Dog d = new Dog(name,ownerName,breed,group,gender,type);
            	d.setId(id);
            	System.out.println(d);
            	dogs.add(d);
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	
    	return dogs;
    }
	
	public static ArrayList<Dog> searchByName(String arg){
    	ArrayList<Dog> dogs = new ArrayList<Dog>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from myDogs where name='"+arg+"'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String ownerName = rs.getString(3);
            	String breed = rs.getString(4);
            	String group = rs.getString(5);
            	String gender = rs.getString(6);
            	String type = rs.getString(7);
            	Dog d = new Dog(name,ownerName,breed,group,gender,type);
            	d.setId(id);
            	System.out.println(d);
            	dogs.add(d);
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	
    	return dogs;
    }
	
	public static ArrayList<Dog> searchByOwner(String arg){
    	ArrayList<Dog> dogs = new ArrayList<Dog>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from myDogs where ownerName='"+arg+"'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String ownerName = rs.getString(3);
            	String breed = rs.getString(4);
            	String group = rs.getString(5);
            	String gender = rs.getString(6);
            	String type = rs.getString(7);
            	Dog d = new Dog(name,ownerName,breed,group,gender,type);
            	d.setId(id);
            	System.out.println(d);
            	dogs.add(d);
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	
    	return dogs;
    }
	
	public static ArrayList<Dog> searchByBreed(String arg){
    	ArrayList<Dog> dogs = new ArrayList<Dog>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from myDogs where breed='"+arg+"'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String ownerName = rs.getString(3);
            	String breed = rs.getString(4);
            	String group = rs.getString(5);
            	String gender = rs.getString(6);
            	String type = rs.getString(7);
            	Dog d = new Dog(name,ownerName,breed,group,gender,type);
            	d.setId(id);
            	System.out.println(d);
            	dogs.add(d);
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	
    	return dogs;
    }
	
	public static ArrayList<Dog> searchByGroup(String arg){
    	ArrayList<Dog> dogs = new ArrayList<Dog>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from myDogs where dogGroup='"+arg+"'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String ownerName = rs.getString(3);
            	String breed = rs.getString(4);
            	String group = rs.getString(5);
            	String gender = rs.getString(6);
            	String type = rs.getString(7);
            	Dog d = new Dog(name,ownerName,breed,group,gender,type);
            	d.setId(id);
            	System.out.println(d);
            	dogs.add(d);
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	
    	return dogs;
    }
	
	public static int maleAndClass(String breed,String group) {
		int i=0;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select count(id) from myDogs where gender='male' && type='class' && breed='"+breed+"' && doggroup='"+group+"'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	i = rs.getInt(1);
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
		
		return i;
		
	}
	
	public static int femaleAndClass(String breed,String group) {
		int i=0;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select count(id) from myDogs where gender='female' && type='class' && breed='"+breed+"' && doggroup ='"+group+"'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	i = rs.getInt(1);
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
		
		return i;
		
	}
	
	public static int maleAndSpecialty(String breed,String group) {
		int i=0;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select count(id) from myDogs where gender='male' && type='specialty' && breed='"+breed+"' && doggroup='"+group+"'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	i = rs.getInt(1);
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
		
		return i;
		
	}
	
	public static int femaleAndSpecialty(String breed,String group) {
		int i=0;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select count(id) from myDogs where gender='female' && type='specialty' && breed='"+breed+"' && doggroup='"+group+"'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	i = rs.getInt(1);
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
		
		return i;
		
	}
	
	
	
	public static void addDummyRecords() {
		ArrayList<Dog> myList = MyLogic.createMyDogs();
		
		for(int i = 0;i<100;i++) {
			addDog(myList.get(i));
		}
		
	}
	
//	public static ArrayList<ShowList> viewHoundList(){
//    	ArrayList<ShowList> sl = new ArrayList<ShowList>();
//    	
//    	try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = null;
//        
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
//            
//            String g="hounds";
//            
//            String b="";
//            
//            String q = "select count(ID), breed from myDogs where doggroup='hounds' group by breed";
//            
//            Statement st = conn.createStatement();
//            
//            ResultSet rs = st.executeQuery(q);
//            
//            ResultSetMetaData rsmd = rs.getMetaData();
//            
//            int numColumns = rsmd.getColumnCount();
//            
//            while(rs.next()) {
//            	int i = rs.getInt(1);
//            	b = rs.getString(2);
//            	
//            	int mc = maleAndClass(b,g); 
//            	int fc = femaleAndClass(b,g); 
//            	int ms = maleAndSpecialty(b,g); 
//            	int fs = femaleAndSpecialty(b,g); 
//            	
//            	ShowList s = new ShowList(i,b,mc,fc,ms,fs);
//            	
//            	System.out.println(s);
//            	sl.add(s);
//            	
//            }
//            
//            System.out.println("Connection Success");
//            conn.close();
//        } catch (Exception e) {
//            System.out.println("Connection Failed");
//            System.out.println(e);
//        }
//    	
//    	
//    	return sl;
//    }
//	
//	public static ArrayList<ShowList> viewSdList(){
//    	ArrayList<ShowList> sl = new ArrayList<ShowList>();
//    	
//    	try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = null;
//        
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
//            
//            String g="hounds";
//            
//            String b="";
//            
//            String q = "select count(ID), breed from myDogs where doggroup='Sporting Dogs' group by breed";
//            
//            Statement st = conn.createStatement();
//            
//            ResultSet rs = st.executeQuery(q);
//            
//            ResultSetMetaData rsmd = rs.getMetaData();
//            
//            int numColumns = rsmd.getColumnCount();
//            
//            while(rs.next()) {
//            	int i = rs.getInt(1);
//            	b = rs.getString(2);
//            	
//            	int mc = maleAndClass(b,g); 
//            	int fc = femaleAndClass(b,g); 
//            	int ms = maleAndSpecialty(b,g); 
//            	int fs = femaleAndSpecialty(b,g); 
//            	
//            	ShowList s = new ShowList(i,b,mc,fc,ms,fs);
//            	
//            	System.out.println(s);
//            	sl.add(s);
//            	
//            }
//            
//            System.out.println("Connection Success");
//            conn.close();
//        } catch (Exception e) {
//            System.out.println("Connection Failed");
//            System.out.println(e);
//        }
//    	
//    	
//    	return sl;
//    }
	
	public static ArrayList<ShowList> viewList(String grp){
    	ArrayList<ShowList> sl = new ArrayList<ShowList>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String g=grp;
            
            String b="";
            
            String q = "select count(ID), breed from myDogs where doggroup='"+grp+"' group by breed";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int i = rs.getInt(1);
            	b = rs.getString(2);
            	
            	int mc = maleAndClass(b,g); 
            	int fc = femaleAndClass(b,g); 
            	int ms = maleAndSpecialty(b,g); 
            	int fs = femaleAndSpecialty(b,g); 
            	
            	ShowList s = new ShowList(i,b,mc,fc,ms,fs);
            	
            	System.out.println(s);
            	sl.add(s);
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	
    	return sl;
    }
	
	public static void deleteDog(int id){
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "delete from myDogs where id="+id;
            
            Statement st = conn.createStatement();
            
            st.executeUpdate(q);
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
	}
	
	public static void registerDogHandler(String user, String pass) {
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tomcat_realm", "root", "Lucifer1");
            
            String q1 = "Insert into tomcat_users (user_name, password) VALUES('"+user+"','"+pass+"')";
            
            String q2 = "Insert into tomcat_users_roles (user_name, role_name) VALUES('"+user+"','DogHandler')";
            
            Statement st = conn.createStatement();
            
            st.executeUpdate(q1);
            st.executeUpdate(q2);
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
	}
	
	public static void selectFriday(int f){
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "Insert into friday (id) values("+f+")";
            
            Statement st = conn.createStatement();
            
            st.executeUpdate(q);
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
	}
	public static void selectSaturday(int s){
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "Insert into saturday (id) values("+s+")";
            
            Statement st = conn.createStatement();
            
            st.executeUpdate(q);
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
	}
	public static void selectSunday(int s){
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "Insert into sunday (id) values("+s+")";
            
            Statement st = conn.createStatement();
            
            st.executeUpdate(q);
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
	}
	
	public static Dog getLastDog() {
		
		Dog dog = new Dog();
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from myDogs order by id desc limit 1";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String ownerName = rs.getString(3);
            	String breed = rs.getString(4);
            	String group = rs.getString(5);
            	String gender = rs.getString(6);
            	String type = rs.getString(7);
            	Dog d = new Dog(name,ownerName,breed,group,gender,type);
            	d.setId(id);
            	System.out.println(d);


            	dog = d;
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
		
		return dog;
		
	}
	
	public static void addDogToHList(Dog d, String userRole){
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "Insert into dhandlers (id, user) Values('"+DAO.getLastDog().getId()+"','"+userRole+"')";
            
            Statement st = conn.createStatement();
            
            st.executeUpdate(q);
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
	}
	
	public static boolean goingFri(int id) {
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from friday where id="+id;
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int i = rs.getInt(1);
            	if(i!=0) {
            		return true;
            	}else return false;
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
		return false;
	}
	
	public static boolean goingSat(int id) {
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from saturday where id="+id;
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int i = rs.getInt(1);
            	if(i!=0) {
            		return true;
            	}else return false;
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
		return false;
	}
	
	public static boolean goingSun(int id) {
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from sunday where id="+id;
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int i = rs.getInt(1);
            	if(i!=0) {
            		return true;
            	}else return false;
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
		return false;
	}
	
	public static ArrayList<Dog> getHDogs(String arg){
    	ArrayList<Dog> dogs = new ArrayList<Dog>();
    	
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dogs", "root", "Lucifer1");
            
            String q = "select * from myDogs natural join dhandlers dh where dh.user='"+arg+"'";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int numColumns = rsmd.getColumnCount();
            
            while(rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String ownerName = rs.getString(3);
            	String breed = rs.getString(4);
            	String group = rs.getString(5);
            	String gender = rs.getString(6);
            	String type = rs.getString(7);
            	Dog d = new Dog(name,ownerName,breed,group,gender,type);
            	d.setId(id);
            	System.out.println(d);
            	dogs.add(d);
            	
            }
            
            System.out.println("Connection Success");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed");
            System.out.println(e);
        }
    	
    	return dogs;
	
	}
}
