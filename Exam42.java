package practice;
import java.util.*;
public class Exam42 {

	public static void main(String[] args) {
		System.out.println("请输入今天星期几");
		Scanner input = new Scanner(System.in);
		int week = input.nextInt();
		switch(week){
			case 1:
			case 3:
			case 5:
				System.out.println("学习编程");
			break;
			case 2:
			case 4:
			case 6:
				System.out.println("学习英语");
			break;
			case 7:
				System.out.println("休息");
			break;
			default:
				System.out.println("请输入正确日期");
		}
	}

}
