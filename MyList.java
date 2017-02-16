package weeklyCodingTest;

import java.util.Arrays;

public class MyList<E> {
	
	 private Object[] capacity;
	    private int size = 0;
	     
	    public MyList(){
	    	capacity = new Object[10];
	    }
	     
	    public Object get(int index){
	        if(index < size){
	            return capacity[index];
	        } else {
	            throw new ArrayIndexOutOfBoundsException();
	        }
	    }
	     
	    public void add(Object obj){
	        if(capacity.length-size <= 5){
	            increaseSize();
	        }
	        capacity[size++] = obj;
	    }
	     
	    public Object remove(int index){
	        if(index < size){
	            Object obj = capacity[index];
	            capacity[index] = null;
	            int tmp = index;
	            while(tmp < size){
	            	capacity[tmp] =capacity[tmp+1];
	            	capacity[tmp+1] = null;
	                tmp++;
	            }
	            size--;
	            return obj;
	        } else {
	            throw new ArrayIndexOutOfBoundsException();
	        }
	         
	    }
	     
	    public int size(){
	        return size;
	    }
	    private void increaseSize(){
	    	capacity= Arrays.copyOf(capacity, capacity.length*2);
	        System.out.println("\nNew length: "+capacity.length);
	    }
	    
	    
	     
	    public static void main(String a[]){
	        MyList<String> mylist = new MyList<String>();
	        mylist.add("Hello");
	        mylist.add("Aloha");
	        mylist.add("Bonjour");
	        mylist.add("Namaste");
	        mylist.add("Hola");
	        for(int i=0;i<mylist.size();i++){
	            System.out.print(mylist.get(i)+" ");
	        }
	        mylist.add("Ciao");
	        System.out.println("Element at Index 5:"+mylist.get(5));
	        System.out.println("List size: "+mylist.size());
	        System.out.println("Removing element at index 2: "+mylist.remove(2));
	        for(int i=0;i<mylist.size();i++){
	            System.out.print(mylist.get(i)+" ");
	        }
	    }
	}
	