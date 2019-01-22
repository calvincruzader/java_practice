import java.util.*;

class TwoMatrixNuances { 

	public static void main(String[] args) { 

		Comparator<Integer> myRevCompare = new Comparator<Integer>() { 

			// checking how the compare() functionality can be updated 
			// this is a compare() for a max priority queue
			@Override
			public int compare(Integer p1, Integer p2) {
				if(p1 > p2) return -1;
				else if(p1 == p2) return 0;
				else return 1;
			}

		};




		Queue<Integer> myQ = new PriorityQueue<Integer>(5, myRevCompare);


		myQ.add(3);
		myQ.add(1);
		myQ.add(9);
		myQ.add(3);
		myQ.add(1);
		myQ.add(9);

		while(!myQ.isEmpty()) {
			System.out.println(myQ.poll());
		}


	}
}