//Create a class, make instance variable and local variable with same name print value of both

class Variable {
  int a;
    public static void main(String args[]){
    int a = 100;
    Variable obj = new Variable();
    System.out.println("Value of instance variable a : "+obj.a);
    System.out.println("Value of local variable a: "+a);
  }
}
