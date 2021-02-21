public class UsingArray {

	public static void main(String[] args) {
		Array numbers = new Array(3);
		numbers.print();
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(100);
		numbers.insert(200);
		System.out.println("After insert :");
		numbers.print();
		
		System.out.println("Index :"+numbers.indexOf(100));
		numbers.print();
		
		numbers.removeAt(3);
		System.out.println("After removing:");
		numbers.print();

	}

}
