package rwc.csci4710.recipeapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {
//    private PreparedStatement state;
    private Connection connection = null;
    private ResultSet rs = null;
    
    public void connectDatabase() throws SQLException{
        String databaseURL = "";
        
        try {
            connection = DriverManager.getConnection(databaseURL);
            
            System.out.println("Connection success.");
        } catch (SQLException exception){
            System.out.println("Connection failed.");
        }
    }
    
    public ResultSet query(String query)throws SQLException{
//        state = conn.prepareStatement(query);
//        rs = state.executeQuery();
        return rs;
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
    }
}