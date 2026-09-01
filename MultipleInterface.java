interface Printable {
	
	void print();

}

interface Savable {

	void save();

}

class Document implements Printable, Savable {


	@Override
	
	public void print() {

	System.out.println("Printing document");

	}

	@Override

	public void save() {

	System.out.println("Saving document");

	}

}


class MultipleInterface {

	public static void main(String[] args) {

	Document d = new Document();

	d.print();

	d.save();

	}

}