
public class Puppy {
		int puppyAge;  //Instance Variable
		public Puppy(String name) {
			System.out.println("The Passed name: "+name);
		}
		public void setAge(int age) {
			puppyAge=age;
		}
		public int getAge() {
			System.out.println("Puppy Age is: "+puppyAge);
			return puppyAge;
		}
	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("Johny");
		myPuppy.setAge(3);
		myPuppy.getAge();
		System.out.println("Variable Value: "+ myPuppy.puppyAge);
	}

}
