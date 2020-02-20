package com.mavdemo.construct;

public class App 
{
    public static void main( String[] args )
    {
        Constructioncost c=new Constructioncost();
        int costestimated=c.estimateConstructioncost("Above Standard",13000,false);
    }
}
