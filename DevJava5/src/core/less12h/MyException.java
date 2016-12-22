package core.less12h;

public class MyException extends RuntimeException {

	private static final long serialVersionUID = -6482749748091743517L;
	
	@Override
	public void printStackTrace() {
		System.err.println("Bla-bla-bla!Find it!");
	}

	
}
