package com.ags.jaimin.FileIO;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileReader;

public class StartPage_EndPage {
	public static void main(String args[]) throws Exception {
		
			BufferedReader br = new BufferedReader(new FileReader("/home/jaiminrana/Downloads/1needbeposted07222022.txt"));
			String str;
			int count = 0;
			ArrayList <Integer> startpage = new ArrayList<Integer>(count);
			
			while((str = br.readLine()) != null) {
				if(str.matches("=+")) {
					count++;
				}
				
				if(str.contains("Code for Dr.'s")) {
					startpage.add(count);
				}	
			}
			
			System.out.println("SP:   EP:");
			
			for(int i=0;i<startpage.size()-1;i++) {
				System.out.println(startpage.get(i) + "    " + (startpage.get(i+1)-1));
			}
			
			System.out.println(startpage.get(startpage.size()-1) + "    " + count);
	}
		
}

