
public class Overriding {
	
		
		public void task() {
			System.out.println("I am a task from parent class");
			
		}
		
		public void task2() {
			System.out.println("I am a task from parent2 class");
			
		}


	  
		public static void main(String[] args) {
			
			
			OverridinChild a=new OverridinChild();
			a.task();
			a.task2();
	
}
	

}
