package ch9_interfaces.nestedInterfaces;

class B implements A.NestedIF {
	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}
}
