interface area{  
    final int length_side=10;
    void compute_area();  
    }  
    class A6 implements area{  
    public void compute_area(){
    System.out.println("area-->"+ length_side*length_side);}  
      
    public static void main(String args[]){  
    A6 obj = new A6();  
    obj.compute_area();  
     }  
    }  
    