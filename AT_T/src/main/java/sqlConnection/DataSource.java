package sqlConnection;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

//--------public class DataSource {
                //..........  It is working without dataSource class:     public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

                //..........public static List<String> getItemValue() {
                //.............List<String> itemList = new ArrayList<String> ();
//        itemList.add(("Apple Watch"));
//        itemList.add("ipad");
//        itemList.add("iphone case");
                //..........return itemList;
                //.............. }




//      Need to commit and see if it works or not



//    public static List<String> getItemsListFromDB() throws Exception {
//        List<String> list= new ArrayList<>();
//        list = connectToSqlDB.readDataBase("pnt","id");
//                return list;
//    }
//    public static void main (String[]args) throws Exception {
//        List<String> list = new ArrayList<>();
//        list = connectToSqlDB.readDataBase("pnt", "id");
//        System.out.println(list.get(0));
//    }
//------------------------}
import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Apple Watch");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");

        return itemsList;
    }
    //Database

    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("itemlist", "items");
        return list;
    }

    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("itemlist", "items");
        System.out.println(list.get(0));
    }

}