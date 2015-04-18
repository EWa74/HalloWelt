package de.java2enterprise.onlinebanking;

import java.util.Arrays;
import java.util.List;

public class Member {
	private int team;
	private String name;
	
	public Member(int team, String name){
		this.team =team;
		this.name = name;
	}
	
	public static List<Member> getAllMembers(){
		return Arrays.asList(
				new Member(4, "Peter"),
				new Member(2, "Tobias"),
				new Member(2, "Alexander"),
				new Member(3, "Sven"),
				new Member(1, "Noel"),
				new Member(1, "Martin"),
				new Member(2, "Michael"),
				new Member(2, "Phillip"),
				new Member(3, "Adam"),
				new Member(3, "Kamil"),
				new Member(4, "Thorsten"),
				new Member(4, "Karsten"),
				new Member(4, "Christof"),
				new Member(4, "Alex"),
				new Member(4, "Mark")
				);
	}
	public int getTeam() {
		return team;
	}
	
	public void setTeam(int team) {
		this.team = team;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
