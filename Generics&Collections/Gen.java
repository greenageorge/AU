

import java.util.ArrayList;
import java.util.*;

public class Gen<T> implements Comparable<Gen<T>>{

	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public boolean equals(Gen g){
		return getT().equals(g.getT());
	}

	
  @Override 
  public int compareTo(Gen o) { 
	  if(getT()==o.getT())
		  return 0;
		  else
		  return -1; }
	 
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<>();
		g1.setT("GG");
		
		Gen<String> g2 = new Gen<>();
		g2.setT("GG");
		
		System.out.println(g1.equals(g2));
		 System.out.println(g1.compareTo(g2)); 
	}
}

