package de.java2enterprise.onlinebanking;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Onlinebanking 
{

	public static void main(String[] args) 
	{
		List<Member> m = Member.getAllMembers();
		
		Map<Integer, List<Member>> grouped = m.stream().collect(
				Collectors.groupingBy(Member::getTeam)
				);
		
		Collection<List<Member>> c = grouped.values();
		for (List<Member> member :c) {
			member.stream().forEach(
					a -> System.out.println(a.getTeam()+": " + a.getName())
					);
		}
	}
} 