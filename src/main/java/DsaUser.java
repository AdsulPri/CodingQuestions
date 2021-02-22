import java.util.Arrays;

public class DsaUser {

	public void checkArray() {
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
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.addLast(0);
		
		linkedList.addLast(2);
		linkedList.addLast(3);
		linkedList.addLast(4);
		
		System.out.println("Add Last :");
		linkedList.print(linkedList);
		
		linkedList.addFirst(400);
		System.out.println("Add first :");
		
		linkedList.print(linkedList);
		
		System.out.println("index of 3:" + linkedList.indexOf(3));
		
		
		System.out.println("contains 4:" + linkedList.contains(4));
		
		linkedList.removeFirst();
		System.out.println("Remove First:");
		linkedList.print(linkedList);
		
		linkedList.removeLast();
		System.out.println("Remove Last:");
		linkedList.print(linkedList);
		
		System.out.println("Size of linkedList:" +linkedList.size());
		linkedList.addFirst(400);
		System.out.println("Size of linkedList:" +linkedList.size());
		linkedList.removeLast();
		System.out.println("Size of linkedList:" +linkedList.size());
		
		int[] arr=linkedList.toArray();
		System.out.println("linkedList to Array:" +Arrays.toString(arr));
		
		System.out.println("Original :");
		linkedList.print(linkedList);
		
		linkedList.reverse(linkedList);
		System.out.println("Reversed :");
		linkedList.print(linkedList);
		
		

	}

}
