
public class Array {
	private int[] items;
	private int count;

	public Array(int length) {
		items = new int[length];
	}

	public void insert(int item) {
//step2
		if (items.length == count) {
//step 3 declare new array twice the size
			int[] newArr = new int[count * 2];
			for (int i = 0; i < count; i++) {
//step 4 copy old to new
				newArr[i] = items[i];
			}
//step 5 don't forget to change the reference
			items = newArr;
		}
//step1	
		items[count++] = item;
	}

	public void removeAt(int index) {

		if (index < 0 || index >= count)
			throw new IllegalArgumentException();

		for (int i = index; i < count - 1; i++)
			items[i] = items[i + 1];

		count--;
	}

	public int indexOf(int item) {
		for (int i = 0; i < count; i++) {
			if (items[i] == item)
				return i;
		}
		return -1;
	}

	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println(items[i]);
	}

}
