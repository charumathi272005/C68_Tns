package nonaccess.modifier;

final class FinalDemo {
	
	final int max = 100;
	
	final void display() {
		System.out.println("show the value of max: "+ max);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();

	}

}



