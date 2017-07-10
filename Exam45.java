package practice;
import java.util.*;
public class Exam45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个操作数：");
		if(input.hasNextInt()==true){
		int first = input.nextInt();
		System.out.println("请输入第二个操作数：");
		int second = input.nextInt();
		System.out.println("请输入运算关系(+,-,*,/)：");
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
			System.out.println("请输入正确运算符");
			break;
			}	
			}else{
				System.out.println("请输入正确数字");	
		}
	}
}
