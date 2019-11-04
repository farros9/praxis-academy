public class UnaryDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
 
        int result = +x;
 
        System.out.println("+x = " + result);
 
        result = -y;
 
        System.out.println("-y = " + result);
 
        result = ++x;
 
        System.out.println("++x = " + result);
 
        result = --y;
 
        System.out.println("--y = " + result);
 
        boolean ok = false;
 
        System.out.println(ok);
 
        System.out.println(!ok);
    }
}