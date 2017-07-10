package practice;
import java.util.Scanner;
public class Exam43 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = input.nextInt();
		switch(score/10){
		case 10:
			System.out.println("父亲给他买一辆车");
			break;
		case 9:
			System.out.println("母亲给她买一部笔记本电脑");
			break;
		case 8:
		case 7:
		case 6:
			System.out.println("母亲给他买一部手机");
			break;
		default:
			System.out.println("没有礼物");
		}
	}
}
