package my.eli.project.trialServer;

import java.util.ArrayList;

public class Friend {
	
	String friend;
	ArrayList<String> allMyFriends = new ArrayList();
	
	public void setFriend(String name){
		this.friend = name;
	}
	public String getFriend(){
		return friend;
	}
	
	public void addFriend(String x){
		allMyFriends.add(x);
	}
	public ArrayList<String> getAllFriends(){
		return allMyFriends;
	}

}
