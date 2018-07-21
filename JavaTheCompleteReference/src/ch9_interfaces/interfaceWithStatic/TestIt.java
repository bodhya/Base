package ch9_interfaces.interfaceWithStatic;

public class TestIt implements TestInterfaceWithStatic {
	public int getNumber() {
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(TestInterfaceWithStatic.getDefaultNumber());	//static call to static method of the interface
	}
}
