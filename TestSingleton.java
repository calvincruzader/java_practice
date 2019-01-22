class TestSingleton { 

	public static void main(String[] args) { 
		MySingleton ms = new MySingleton(); 
		ms.incrementSubs();
		MySingleton ms2 = new MySingleton();

		System.out.println(ms2.getSubs());
	}
}