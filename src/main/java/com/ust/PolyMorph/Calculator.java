package com.ust.PolyMorph;

import java.util.logging.Logger;

import com.ust.HelloLoop;

public class Calculator {

public int add(int i1,int i2) {
	return i1+i2;
	
}
public double add(int d1,int d2) {
	return d1+d2;	
	
}
public String add(String s1,String s2) {
	return s1+s2;
	
}
public int add(int i1,int i2,int i3) {
	return i1+i2+i3;

}

public double add(double d1,double d2,double d3) {
	return d1+d2+d3;
}
public String add(String s1,String s2,String s3,String s4) {
	return s1+s2+s3+s4;
}
public double add(double d1,int i1) {
	return d1+i1;
}
public double add(int i1,double d1) {
return i1+d1;
}


public static void main(String[] args) {
	Logger logger=Logger.getLogger(Calculator.class.getName());
	Calculator c = new Calculator();
	System.out.println(c.add("a","b","c","d"));
	System.out.println(c.add(4, 7));
	System.out.println(c.add(78.98,90));

}
}
