public class thread extends Thread {
 thread() {
 start();
 }
 public void run() {
 for (int i = 2; i <= 2; i++) {
 System.out.println("Table of " + i);
 for (int j = 1; j <= 10; j++) {
 System.out.println(i + "*" + j + "=" + i * j);
 }
 System.out.println("--------------");
 }
 }
 public static void main(String[] args) {
 thread t = new thread();
 for (char i = 'a'; i <= 'z'; i++) {
 System.out.println(i + " ");
 }
 }
}
