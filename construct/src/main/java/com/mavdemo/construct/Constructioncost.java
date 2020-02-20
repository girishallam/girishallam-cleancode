package com.mavdemo.construct;

public class Constructioncost {
	public int estimateConstructioncost(String material,double totalarea,boolean automation)
	{
		int cost=0;
		if(material=="Standard")
			cost=(int)(1200*totalarea);
		else if(material=="Above Standard")
			cost=(int)(1500*totalarea);
		else if(material=="High Standard")
			cost=(int)(1800*totalarea);
		else if(material=="High Standard" && automation==true)
			cost=(int)(2500*totalarea);
		return cost;
	}

}
