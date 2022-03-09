interface area{  
    final int length_side=10;
    int rad =2;
    void compute_area();  
    }  
    class A6 implements area{  
    public void compute_area(){
    System.out.println("area of square-->"+ length_side*length_side);
    System.out.println("area of square-->"+ 3.14*rad*rad);}  
      
    public static void main(String args[]){  
    A6 obj = new A6();  
    obj.compute_area();  
     }  
    }  
    