package rwc.csci4710.recipeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
            System.out.println(line);
            if (line.isBlank()){
                continue;
            }
            else{
                
                email = line;
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
    
    public ArrayList<Recipe> readRecipes(String inFileRecipes)throws FileNotFoundException{
        
        File recipeFile = new File(inFileRecipes);
        Scanner scRecipes = new Scanner(recipeFile);
        String line, name, category, allIngredients, allInstructions;
        ArrayList<String> ingredients = null, instructions = null;
        ArrayList<Recipe> manyRecipes = new ArrayList<Recipe>();
        int count = 0;
                
        while(scRecipes.hasNextLine()){
            line = scRecipes.nextLine();
            System.out.println(line);
            if (line.isBlank()){
                continue;
            }
            else{
                
                name = line;
                category = scRecipes.nextLine();
                
                allIngredients = scRecipes.nextLine();
                Scanner scIngredients = new Scanner(allIngredients).useDelimiter(",");
                int numIng = 0;
                
                while(scIngredients.hasNext()){
                    ingredients.add(scIngredients.next());
                    numIng++;
                }
                
                allInstructions = scRecipes.nextLine();
                Scanner scInstructions = new Scanner(allIngredients).useDelimiter(",");
                int numIns = 0;
                
                while(scInstructions.hasNext()){
                    ingredients.add(scIngredients.next());
                    numIng++;
                }
                
                String [] ingr = null;
                for(int i = 0; i < ingredients.size(); i++){
                    ingr[i] = ingredients.get(i);
                }
                
                String [] inst = null;
                for(int i = 0; i < ingredients.size(); i++){
                    inst[i] = ingredients.get(i);
                }
                
                Recipe temp = new Recipe(name, category, ingr, inst);
                manyRecipes.add(temp);
                count++;
            }
        }
        for (int i = 0; i < count; i++){
            System.out.println(manyRecipes.get(i));
        }
        
        scRecipes.close();
        return manyRecipes;
    }
    
    public void writeUsers(String inFile, User newUser) throws IOException{
        
        File userFile = new File(inFile);
        FileWriter fw = new FileWriter(userFile, true);
        fw.write("\n" + newUser.getEmail() + "\n");
        fw.write(newUser.getUsername()+ "\n");
        fw.write(newUser.getPassword()+ "\n");
        fw.close();
        System.out.println("New User Added To Database.");
    }
    
    public void writeRecipes(String inFile, User newRecipe) throws IOException{
        
        File userFile = new File(inFile);
        FileWriter fw = new FileWriter(userFile, true);
        fw.write("\n" + newRecipe.getEmail() + "\n");
        fw.write(newRecipe.getUsername()+ "\n");
        fw.write(newRecipe.getPassword()+ "\n");
        fw.close();
        System.out.println("New User Added To Database.");
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