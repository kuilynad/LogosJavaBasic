package core.less14h;


import core.less14h.Collection.First;
import core.less14h.Collection.Second;
import core.less14h.Collection.Second.local;
import core.less14h.Collection.OneOfTwo;

	public class Main { 
	public static void main(String[] args) { 
		
		Collection a = new Collection(new Object[10]);
		
		OneOfTwo oneOfTwo = new OneOfTwo(a);
		System.out.println(oneOfTwo);
	
		Collection c = new Collection(new Object[10]);
		
		for (int i = 0; i < c.getArr().length; i++) { 
		c.getArr()[i] = i+1; 
	} 
	
	Collection.First cs = c. new First(); 
	
	cs.next(); 
	
	Collection c1 = new Collection(new Object[10]);
	
	for (int i = 0; i < c1.getArr().length; i++) { 
	c1.getArr()[i] = i+1; 
	} 
	
	Collection.Second sc = c1. new Second(); 
	
	sc.next(); 
	
		 new Collection(new Object[10]) {
			 private void doso() {
				for(int i = 10; i>0; i--){
					if(((i-3)%2)==1){
						System.out.println(i);
					}
				}
			
			}
		};
		
		
	}
} 