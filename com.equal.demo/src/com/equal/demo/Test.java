package com.equal.demo;

public class Test {

	
	
	
	
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
        Employee e2 = new Employee();
 
        e1.setId(0);
        e2.setId(0);
 
        System.out.println(e1.equals(e2));  //false
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        
        
	}

	
	
}
