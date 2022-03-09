public class Wrapper{  
    public static void main(String args[]){  
    //Converting int into Integer 
    //Converting primitive to wrapper 
    int a=20;  
    Integer i=new Integer(a);  
    Integer j=a;
    System.out.println(a+" "+i+" "+j);  
    
    //Converting Integer into int
    //Converting wrapper into primitive
       
    
    Integer b=new Integer(3);    
    int k=b.intValue();
    int l=b;
        
    System.out.println(b+" "+k+" "+l);    
    
    
    }}  
    