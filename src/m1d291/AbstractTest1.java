package m1d291;

/**
 * 
 * 抽象类
 *  定义：是类与类之间的共同特征，将这些具有共同特征的类再进一步抽象形成，由于类是抽象的，
 * 故抽象类无法创建对象。抽象类是用来被子类继承的
 * 
 * 类到对象是实例化，对象到类是抽象化。
 * 抽象类也属于引用数据类型
 * 
 * final 与abstract 是对立的，不能同时出现
 * 语法：
 * 		[修饰符列表] abstract class 类名{
 * 				类体;
 * 		}
 * 
 * 抽象类虽然无法实例化，但抽象类有构造方法，这个方法可以供子类使用
 * 
 * 抽象方法表示没有实现的方法，没有方法体的方法。抽象类中不一定有抽象方法,但抽象方法必须出现在抽象类中
 * 例如 public abstract void dosome();
 * 		特点：没有方法体，以;结尾
 * 			  修饰符列表有abstract
 * 
 * 【结论】一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现（覆盖/重写）
 * 
 * java语言中没有方法体的方法就是抽象方法？（×）objact类中就有很多方法没有方法体，但他们不是抽象方法
 * 
 * @author hht_s
 *
 */
public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Account;编译错误
		
	}

}

abstract class Account{
	
	public abstract void dosome();
	public Account() {
		
	}
	public Account(String s) {
		
	}
}

//抽象类的子类可以继承抽象类
//abstract class CreditAccount extends Account{}
//class CreditAccount extends Account{
	//public CreditAccount() {
		//super();
	//}
//}

