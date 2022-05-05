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
    private Connection conn;
    private ResultSet rs;
    
    public void connectDatabase() throws SQLException{
        conn = DriverManager.getConnection("jdbc:sharepoint://RecipeAppDB.accdb");
        try{
            conn = DriverManager.getConnection("jdbc:ucanaccess://RecipeAppDB.accdb");
            System.out.println("Connection success");
        }catch (SQLException ex){
            System.out.println("Connection failed");
        }
    }
    
    public void updateUsers (String a, String b, int num, String c)throws SQLException{
//        state = conn.prepareStatement("INSERT INTO tblUsers (Username, UserTeamName, LeagueCode, Password) VALUES ('"+ a +"', '"+ b +"', "+ num + ", '"+ c +"');");
//        state.executeUpdate();
    }  
    
    public void updateLeague (String lg, int max)throws SQLException{
//        state = conn.prepareStatement("INSERT INTO tblLeague (LeagueName, Max) VALUES ('"+ lg +"', "+ max +" );");
//        state.executeUpdate();
    } 
    
    public void updateTeam (int pID, String uID)throws SQLException{
        System.out.println(pID);
        System.out.println(uID);
//        state = conn.prepareStatement("INSERT INTO tblUserTeam (Username, PlayerID) VALUES ('"+ uID +"', "+ pID +");");
//        state.executeUpdate();
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
    
    /*public Player getPlayer(ResultSet inRes){
        Player pl = new Player(0, "", "", "", 0);
        String temp = "";
        
        try{
            while (inRes.next()){
                for (int i = 1; i <= 4; i++) {
                    temp = temp + inRes.getString(i) + ",";
                }
                Scanner scan = new Scanner(temp).useDelimiter(",");
                pl.setName(scan.next());
                pl.setSquad(scan.next());
                pl.setPos(scan.next());
                pl.setCost(Double.parseDouble(scan.next()));
                temp = pl.toString() + "\n";
            }
        }catch(SQLException ex){
            System.out.println("Failed to read RS");
        }
        return pl;
    }*/
    
    public String getPlayer(ResultSet inRes){
        String temp = "";
                
        try{
            while (inRes.next()){
                temp = temp + inRes.getString(1) + ",";
            }
        }catch(SQLException ex){
            System.out.println("Failed to read RS");
        }
        return temp;
    }
    
    public void close() {
        try{
            try{
                rs.close();
//                state.close();
                conn.close();
            }
            catch(NullPointerException ex){
//                state.close();
                conn.close();
            }
        }
        catch(SQLException ex){
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}