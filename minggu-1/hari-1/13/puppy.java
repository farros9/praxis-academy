public class puppy {
    public void pupAge() {
       int age = 0;
       age = age + 7;
       System.out.println("Puppy age is : " + age);
    }
 
    public static void main(String args[]) {
       puppy test = new puppy();
       test.pupAge();
    }
 }