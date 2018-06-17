package com.Generics.main;

import java.util.ArrayList;
import java.util.List;

public class GenericPrac {
	
	public static void main(String[] args)
	{
		
		Container<Integer> obj=new Container<Integer>();
		obj.setVal(2);
		
		obj.display();
		
		ArrayList<Integer> intobj=new ArrayList<Integer>();
		intobj.add(12);	
		intobj.add(42);	
		intobj.add(52);	
		intobj.add(62);	
		intobj.add(72);	
		intobj.add(82);	
		
		obj.demo(intobj);
		
	}

}

class  Container<T extends Number> // This will accept only number
{
	
	T val;
	
	public T getVal()
	{
		return val;
	}
	
	public void setVal(T val)
	{
		this.val=val;
	}
	
	
	public void display()
	{
		System.out.println("Value of Type val : "+this.val);
	}
	
	
	public void demo(ArrayList<? extends T> obj)
	{
		
		for(T objl:obj)
		{
			System.out.println("value get form list : "+objl);
		}
		
		
	}
	
}