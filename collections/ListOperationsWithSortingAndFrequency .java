Create a Java application where we have to create List object with respect to any implementation class using 
  generic type Integer then we have to add 7 values into the list object then display all those values in both 
  ascending and descending order, max value, min value and frequency of a particular value.

class Asc implements Comparator<Integer>{
	public int compare(Integer i,Integer j){
		int x = i;
		int y = j;
		return i-j;
	}	
}

class Dsc implements Comparator<Integer>{
	public int compare(Integer i,Integer j){
		int x = i;
		int y = j;
		return j-i;
	}	
}

class Main{
	static Scanner sc = new Scanner(System.in);
	static int freq(int a,ArrayList<Integer> al){
		int fc =0;
		for(int i=0;i<al.size();i++){
			if(al.get(i).equals(a)) fc++;
		}
		return fc;
	}
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		Collections.sort(al,new Asc());
		System.out.println(al);
		System.out.println("min- "+al.get(0));
		Collections.sort(al,new Dsc());
		System.out.println("min- "+al.get(0));
		System.out.println(al);
		int n = sc.nextInt();
		System.out.println(freq(n,al));

	}
	
}
