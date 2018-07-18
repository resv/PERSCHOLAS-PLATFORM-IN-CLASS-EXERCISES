package inClassExercises;
import java.util.Arrays;

public class DayThreeSlidePage27 {

		public static void main(String[] args) {
			
			// DAY 3 SLIDE 27 SORT EVEN NUMBERS FROM ARRAYS 
			
			int[] listA = {5,10,15,20,25,30,35};
			int[] listB = {4,5,1,10,22,20,30};
			int[] listC = new int[8];
			int n = 0;
			Arrays.fill(listC, 0);
			
			for (int i = 0; i < listA.length; i++) {
				if ((listA[i] % 2) == 0) {
					
					listC[n] = listA[i];
					n++;	
				}
			}
			
			for (int u = 0; u < listB.length; u++) {
				if ((listB[u] % 2) == 0) {
					listC[n] = listB[u];
					n++;
				}
			}
			
			System.out.println("NEW ARRAY listC in sequential order by index position from listA and listB");
			System.out.println("listC = " + Arrays.toString(listC));
		}

	}		
