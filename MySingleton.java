class MySingleton { 

	private int subs;

	private MySingleton() { 
		this.subs = 10;
	}

	public void incrementSubs() { 
		subs++;
	}

	public int getSubs() { 
		return subs;
	}
}