package practice;
import java.util.*;
public class Exam45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ����������");
		if(input.hasNextInt()==true){
		int first = input.nextInt();
		System.out.println("������ڶ�����������");
		int second = input.nextInt();
		System.out.println("�����������ϵ(+,-,*,/)��");
		char count = input.next().charAt(0);
		switch(count){
		case '+':
			System.out.println(first+second);
			break;
		case '-':
			System.out.println(first-second);
			break;
		case '*':
			System.out.println(first*second);
			break;
		case '/':
			System.out.println(first/second);
			break;
		default:
			System.out.println("��������ȷ�����");
			break;
			}	
			}else{
				System.out.println("��������ȷ����");	
		}
	}
}
