
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		//added some datas
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(20);
		a.add(40);
		a.add(44);
		a.add(54);
		a.add(77);
		
		//inserted data to index of 3
		a.insert(3, 100);
		
		//removed 7
		a.remove(7);
		
		System.out.println("Count : " + a.count());
		
		System.out.println("indexOf(100) : " + a.indexOf(100));
		
		System.out.println("get(5) : " + a.get(5));
		
		System.out.println("contains(7) : " + a.contains(7));

	}

}
