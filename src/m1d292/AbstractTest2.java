package m1d292;

public class AbstractTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//����ʹ�ö�̬
		//����������ָ�������Ͷ���
		//���������
		Animal a1=new Cat();
		a1.move();
	}

}

abstract class Animal{
	public abstract void move();
}

class Cat extends Animal{
	//�̳��˳��󷽷���Ҫô���£�Ҫô����ȥ��ʵ�֡��÷���
	public void move() {
		System.out.println("��");
	}
}
