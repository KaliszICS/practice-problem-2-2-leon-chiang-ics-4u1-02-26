public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static int[] compareSearch(int [] array, int number) {
		int loop1=0;
		int loop2=0;
		for (int i=0;i<array.length;i++) {
			if (array[i]==number) {
				i=array.length+1;
			}
			loop1++;
		}
		int x=0;
		int y=array.length-1;
		int z;
		while (x<=y) {
			z=(x+y)/2;
			if (number==array[z]) {
				x=y+1;
			}
			else if (number>array[z]) {
				x=z+1;
			}
			else {
				y=z-1;
			}
			loop2++;
		}
		int [] a= new int[2];
		a [0]=loop1;
		a[1]=loop2;
		return a;
	}

	public static int[] compareStringSearch(String [] array, String word) {
		int loop1=0;
		int loop2=0;
		for (int i=0;i<array.length;i++) {
			if (array[i].equals(word)) {
				i=array.length+1;
			}
			loop1++;
		}
		int x=0;
		int y=array.length-1;
		int z;
		while (x<=y) {
			z=(x+y)/2;
			if (word.equals(array[z])) {
				x=y+1;
			}
			else if (word.compareTo(array[z])>0) {
				x=z+1;
			}
			else {
				y=z-1;
			}
			loop2++;
		}
		int [] a= new int[2];
		a[0]=loop1;
		a[1]=loop2;
		return a;
		
	}
	
}
