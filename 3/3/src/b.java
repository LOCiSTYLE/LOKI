
public class b {
	
	public static int rand(int lower, int higher) {
	  return lower + (int)(Math.random() * (higher - lower + 1));
	}

	
	public static int[] pickMRandomly(int[] original, int m) {
	  int[] subset = new int[m];
	  int[] array = original.clone();
	  for(int j = 0; j < m; j++) {
	    int index = rand(j, array.length - 1);
	    subset[j] = array[index];
	    array[index] = array[j]; 
	  }
	  return subset;
	}
}
