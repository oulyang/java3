package m1d291;

/**
 * 
 * ������
 *  ���壺��������֮��Ĺ�ͬ����������Щ���й�ͬ���������ٽ�һ�������γɣ��������ǳ���ģ�
 * �ʳ������޷��������󡣳�����������������̳е�
 * 
 * �ൽ������ʵ�������������ǳ��󻯡�
 * ������Ҳ����������������
 * 
 * final ��abstract �Ƕ����ģ�����ͬʱ����
 * �﷨��
 * 		[���η��б�] abstract class ����{
 * 				����;
 * 		}
 * 
 * ��������Ȼ�޷�ʵ���������������й��췽��������������Թ�����ʹ��
 * 
 * ���󷽷���ʾû��ʵ�ֵķ�����û�з�����ķ������������в�һ���г��󷽷�,�����󷽷���������ڳ�������
 * ���� public abstract void dosome();
 * 		�ص㣺û�з����壬��;��β
 * 			  ���η��б���abstract
 * 
 * �����ۡ�һ���ǳ������̳г����࣬���뽫�������еĳ��󷽷�ʵ�֣�����/��д��
 * 
 * java������û�з�����ķ������ǳ��󷽷���������objact���о��кܶ෽��û�з����壬�����ǲ��ǳ��󷽷�
 * 
 * @author hht_s
 *
 */
public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Account;�������
		
	}

}

abstract class Account{
	
	public abstract void dosome();
	public Account() {
		
	}
	public Account(String s) {
		
	}
}

//�������������Լ̳г�����
//abstract class CreditAccount extends Account{}
//class CreditAccount extends Account{
	//public CreditAccount() {
		//super();
	//}
//}

