package rwc.csci4710.recipeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *@author gibbons_jared
 */

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
        ArrayList<String> ingredients = new ArrayList<String>();
        ArrayList<String> instructions = new ArrayList<String>();
        ArrayList<Recipe> manyRecipes = new ArrayList<Recipe>();
        int count = 0;
                
        while(scRecipes.hasNextLine()){
            line = scRecipes.nextLine();
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
                Scanner scInstructions = new Scanner(allInstructions).useDelimiter(",");
                int numIns = 0;
                
                while(scInstructions.hasNext()){
                    instructions.add(scInstructions.next());
                    numIns++;
                }
                
                Recipe temp = new Recipe(name, category, ingredients, instructions);
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
        FileWriter fwU = new FileWriter(userFile, true);
        fwU.write("\n" + newUser.getEmail() + "\n");
        fwU.write(newUser.getUsername()+ "\n");
        fwU.write(newUser.getPassword()+ "\n");
        fwU.close();
        System.out.println("New User Added To Database.");
    }
    
    public void writeRecipes(String inFile, Recipe newRecipe) throws IOException{
        
        File userFile = new File(inFile);
        FileWriter fwR = new FileWriter(userFile, true);
        fwR.write("\n" + newRecipe.getName() + "\n");
        fwR.write(newRecipe.getCategory()+ "\n");
        
        for(String var:newRecipe.getIngredients()){
            fwR.write(var +", ");
        }
        fwR.write("\n");
        
        for(String var:newRecipe.getInstructions()){
            fwR.write(var +", ");
        }
        fwR.write("\n");
        
        fwR.close();
        System.out.println("New Recipe Added To Database.");
    }
}