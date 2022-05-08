package rwc.csci4710.recipeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {
    private PreparedStatement state;
    private Connection connection = null;
    private ResultSet rs = null;
    
    
    public ArrayList<User> readUsers(String inFileUsers) throws FileNotFoundException{
        File userFile = new File(inFileUsers);
        Scanner scUsers = new Scanner(userFile);
        String line, name, email, username, password;
        ArrayList<User> manyUsers = new ArrayList<User>();
        int count = 0;
                
        while(scUsers.hasNextLine()){
            line = scUsers.nextLine();
            
            if (line.isBlank()){
                continue;
            }
            else{
                
                name = line;
                email = scUsers.nextLine();
                
                username = scUsers.nextLine();
                password = scUsers.nextLine();
                
                User temp = new User(username,email,password);
                manyUsers.add(temp);
                count++;
            }
        }
        for (int i = 0; i < count; i++){
            System.out.println(manyUsers.get(i));
        }
        scUsers.close();
        return manyUsers;
    }  
    
    public void readRecipes(String inFileRecipes) throws SQLException{
        Scanner scRecipes = new Scanner(inFileRecipes);
        
        scRecipes.close();
    }  
    
    /*public void connectDatabase() throws SQLException{
        String databaseURL = "jdbc:ucanaccess://RecipeAppDB.accdb";
        try {
            connection = DriverManager.getConnection(databaseURL);
            System.out.println("Connection success.");
        } catch (SQLException exception){
            System.out.println("Connection failed.");
        }
    }
    
    public ResultSet query(String query)throws SQLException{
        state = connection.prepareStatement(query);
        rs = state.executeQuery();
        return rs;
    }
    
    public void updateUsers (String a, String b, int num, String c)throws SQLException{
        state = connection.prepareStatement("SELECT Users.Username FROM Users;");
        state.executeUpdate();
    } 
    
    public boolean check(ResultSet inRs){
        boolean flag = false;
        int temp;
        
        try{
            while (inRs.next()){
                temp = inRs.getInt(1);
                if(temp > 0){
                    flag = true;
                }
            }
        }catch(SQLException ex){
            System.out.println("Failed to read RS");
        }
        return flag;
    }
    
    public int getInt(ResultSet inRS) throws SQLException{
        int num = -1;
        
        try{
            while (inRS.next()){
                num = inRS.getInt(1);
            }
        }catch(SQLException ex){
            System.out.println("Failed to read RS");
        }
        return num;
    }
    
    public void close() {
        try{
            try{
                rs.close();
//                state.close();
                connection.close();
            }
            catch(NullPointerException ex){
//                state.close();
                connection.close();
            }
        }
        catch(SQLException ex){
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}