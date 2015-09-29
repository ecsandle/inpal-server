package my.eli.project.trialServer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
   /* @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    */
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String connectToDB(){
    	String result = null;
		DatabaseConnection db = new DatabaseConnection();
		Connection conn = db.getConnection();
		String sqlquery = "SELECT * From people";
		ResultSet rs = null;
		Statement st= null;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sqlquery);
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				result = rs.getString(1)+ " , "+ rs.getString(2);
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
    
    
    
}
