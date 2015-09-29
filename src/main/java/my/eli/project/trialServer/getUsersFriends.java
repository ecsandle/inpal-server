package my.eli.project.trialServer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.omg.CORBA_2_3.portable.OutputStream;

import com.google.gson.Gson;


@Path("/friends/{VarUser}")
public class getUsersFriends {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getFriends(@PathParam("VarUser") String user ){
		
		//ArrayList<String> friendsList = new ArrayList<String>();
		//friendsList.add("sam");
		/*
		//DatabaseConnection db = new DatabaseConnection();
		//Connection conn = db.getConnection();
		//String sqlquery = "SELECT * From Friends Where (fromUserId = varUserID Or ToUserId = VarUserID) and (Status = 2) ";//I need to include parameters to avoid problems, also need more logic
		//start to a possible select statment
		//Select Username from Users where (User_id = (Select toUserId From Friends Where (toUserId=@personSearching)) or User_id = (Select fromUserId From Friends Where (fromUserId=@personSearching)) )  ;
		ResultSet rs = null;
		Statement st= null;
		
		
		
		friendsList.add("Sam");
		friendsList.add("Frodo");
		friendsList.add("Gandalf");
		friendsList.add("Legolos");
		friendsList.add("Aragorn");
		
		
		
		Friend myFriend = new Friend();
		myFriend.setFriend("Gandolf");
		
		*/
		Friend ken = new Friend();
		ken.setFriend("dude");
		ken.addFriend("jsoh");
		ken.addFriend("vivek");
		ken.addFriend("myself");
		//ObjectMapper map = new ObjectMapper();
		
		//JsonNode jsonNode = map.convertValue(ken, JsonNode.class);
		
		Gson g = new Gson();
		
		return g.toJson(ken);
		
		//return jsonNode;
		 
		 
		
		//Friend ken = new Friend();
		
		
		
		/*
		return new StreamingOutput(){
			
			@Override
			public void write(java.io.OutputStream output) throws IOException,
					WebApplicationException {
				ArrayList<String> friendsList = new ArrayList<String>();
				friendsList.add("sam");
				output.write(friendsList.get(0).getBytes());

				
			}
		};
		
		*/
		
	}

}
