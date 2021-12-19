import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vedantgrover
 */
public class Connect {    
    private static Connection cin;
    
    public static Connection ConnecrDB(){  
        
        if (cin==null){
        try{ 
            Class.forName("org.sqlite.JDBC"); 
            cin = DriverManager.getConnection("jdbc:sqlite:/Users/vedantgrover/Desktop/internalassessment.db"); 
            cin.setAutoCommit(false); 
            
            return cin; 
       
        } catch( HeadlessException | ClassNotFoundException | SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);  
            JOptionPane.showMessageDialog(null, e); 
            
        } 
        }
        else {
            return cin;
        }
        System.out.println("Connections created successfully");
        
        return null;
        
    }
  
}

