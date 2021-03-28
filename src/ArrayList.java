
public class ArrayList<T> {
	private Object[] arr;
	private int last;
	private int capacity;
	
	public ArrayList() {
		capacity = 14;
		last = 0;
		this.arr = new Object[capacity];
	}
	
	public void add(T data) {
		if(last >= arr.length) {
			capacity *= 2;
			newArray(capacity);
		}
		arr[last] = data;
		last++;
	}
	
	private void newArray(int capacity) {
		Object[] result = new Object[capacity];
		for(int i = 0; i<arr.length; i++) {
			result[i] = arr[i];
		}
		arr = result;
	}
	
	@SuppressWarnings("unchecked")
	public void insert(int index, T data) {
		if(index>= arr.length) {
			capacity *= 2;
			newArray(capacity);
		}
		else if(arr[index] != null) {
			T current = (T)arr[index];
			arr[index] = data;
			insert(index+1, current);
		}
		arr[index] = data;
		
	}
	
	public int count() {
		return arr.length;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T)arr[index];
	}
	
	public void set(int index, T data) {
		if(index>= arr.length) {
			capacity *= 2;
			newArray(capacity);
		}
		arr[index] = data;
	}
	
	public void remove(Object data) {
		int i = 0;
		while(!data.equals(arr[i]))
			i++;
		if(i<arr.length)
			arr[i] = null;
	}
	public boolean contains(Object data) {
		return indexOf(data) == -1 ? false : true;
	}
	
	public int indexOf(Object data) {
		int i = 0;
		while(i<arr.length && !data.equals(arr[i]))
			i++;
		if(i<arr.length)
			return i;
		return -1;
	}
}
