package playersignup;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author knufle
 */
public class ConexaoBD {
    
    public static Connection getConnection(){
        
        Connection con = null;
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/PlayerSignUp", "root", "");
            
        } catch (Exception ex) {
            
        System.out.println(ex.getMessage());
        
        }
        
        return con;
        
    }
    
}
