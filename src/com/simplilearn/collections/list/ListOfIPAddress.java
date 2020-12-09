package com.simplilearn.collections.list;

import java.util.LinkedList;
import java.util.List;

public class ListOfIPAddress {

	public static void main(String[] args) {
		// WAP for creating and iterating list of IP address
		// "192.168.13.4" , "192.168.13.4" 
		// -> find a Ip address -> "192.168.13.104" replace with ""192.168.13.105"
		List<String> ips=new LinkedList<>();
		ips.add("0.0.0.1");
		ips.add("1.1.1.1");
		ips.add("192.168.12.1");
		ips.add("192.168.13.104");
		System.out.println("List of Ip's:");
		for(String ip:ips)
		{
			System.out.print(" ,  ");
			System.out.print(ip);
		}
		System.out.println();
		System.out.println();
		System.out.println("After replacing 192.168.13.105");
		for(int i=0;i<ips.size();i++)
		{
			if(ips.get(i).equals("192.168.13.104"))
			{
				ips.set(i, "192.168.13.105");
			}
		}
		System.out.println();
		for(String ip:ips)
		{
			System.out.print(" , ");
			System.out.print(ip);
		}
		
	}

}
