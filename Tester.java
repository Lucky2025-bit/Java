package New;

abstract class A {
	abstract void Push();
}
abstract class Second extends A{
	abstract void Pop();
}
class Combined extends Second{
	void Push() {
		System.out.println("Inserted on top");
	}
	void Pop() {
		System.out.println("Deleted from top");
	}
}
class Tester{
	public static void main(String[] args) {
		Combined C = new Combined();
		C.Push();
		C.Pop();
	}
}