import java.util.*; 
class prior 
{ 	public static void main(String[] args) 
    { 		PriorityQueue <Integer> pq=new PriorityQueue<Integer>(); 		
        pq.add(15); 		
        pq.add(5); 		
        pq.add(100); 		
        pq.add(3); 		
        pq.add(2300); 		
        pq.add(7); 		
        System.out.println("ELEMENTS ARE: "+pq); 		
        System.out.println("First element is "+pq.peek()); 		
        pq.remove(15); 		
        System.out.println("Removing 15 from queue "+pq); 		
        System.out.println("Removing top element is "+pq.poll()); 		
        System.out.println(pq); 		
        Object[] arr=pq.toArray(); 		
        System.out.println("PriorityQueue TO Array is "); 		
        for(int i=0;i<arr.length;i++) 			
        System.out.println(arr[i]);  	
    } 
}