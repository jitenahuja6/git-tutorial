package com.collection.practice;

import java.util.ArrayList;
import java.util.List;

public class InternalWorkingHashmap 
{
	
	class Container{
		//creating an reference of Object.
		Object key;
		Object value;
		
		
		//Creating a method insert with parameter key and value.
		public void insert(Object key, Object value){
			this.key=key;
			this.value=value;
		}
	}
	
	//Creating a reference of Container i.e c
	//private Container c;
	
	//creating a List i.e recordlist.In recordlist the value will be in the form of list so we are defining it with list.
	private List<Container> recordList= new ArrayList<Container>();
	
	//creating Constructor MyHashMap.
	//public MyHashMap(){
		
		//As list(interface) is implemented by any class , so here in this case its implemented by class i.e ArrayList.
		//this.recordList=new ArrayList<Container>();
		
		
		
	//}
	
	//Defining put method here.
	public void put(Object key, Object value){
		
		Container c = new Container();
		//this.c=new Container();
		c.insert(key, value);
		//check for the same key before adding
		//Running loop and checking i value with recordList size.
		for(int i=0; i<recordList.size(); i++){
			Container c1=recordList.get(i);
			//check for the same key before adding
			if(c1.key.equals(key)){
				//remove the existing object
				recordList.remove(i);
				break;
			}
		}
		recordList.add(c);
	}
	
	public Object get(Object k){
		for(int i=0; i<this.recordList.size(); i++){
			Container con = recordList.get(i);
			//System.out.println("k.toString():"+k.toString()+"con.key.toString()"+con.key.toString());
			if (k.toString()==con.key.toString()) {
				
				return con.value;
			}
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		InternalWorkingHashmap hm = new InternalWorkingHashmap();
		hm.put("1", "1");
		hm.put("2", "2");
		hm.put("3", "3");
		System.out.println(hm.get("3"));
		hm.put("3", "4");
		
		System.out.println(hm.get("1"));
		System.out.println(hm.get("3"));
		System.out.println(hm.get("8"));
	}

}


