package practice;
import java.util.*;
public class Exam42 {

	public static void main(String[] args) {
		System.out.println("������������ڼ�");
		Scanner input = new Scanner(System.in);
		int week = input.nextInt();
		switch(week){
			case 1:
			case 3:
			case 5:
				System.out.println("ѧϰ���");
			break;
			case 2:
			case 4:
			case 6:
				System.out.println("ѧϰӢ��");
			break;
			case 7:
				System.out.println("��Ϣ");
			break;
			default:
				System.out.println("��������ȷ����");
		}
	}

}
