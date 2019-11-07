class ParentClass
{
	public void displayMethod(String msg){
		System.out.println(msg);
	}
}
class SubClass extends ParentClass
{
	@Override
	public void displayMethod(String msg){
		System.out.println("Message is: "+ msg);
	}
	public static void main(String args[]){
		SubClass obj = new SubClass();
		obj.displayMethod("Hey!!");
	}
}