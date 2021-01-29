package m1d292;

public class AbstractTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//可以使用多态
		//父类型引用指向子类型对象
		//面向抽象编程
		Animal a1=new Cat();
		a1.move();
	}

}

abstract class Animal{
	public abstract void move();
}

class Cat extends Animal{
	//继承了抽象方法，要么重新，要么覆盖去“实现”该方法
	public void move() {
		System.out.println("跑");
	}
}
