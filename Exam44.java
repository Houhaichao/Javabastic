package practice;
import java.util.Scanner;
public class Exam44 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����������е��·ݣ�1~12����");
		int month = input.nextInt();
		System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
		int choose = input.nextInt();
		int price = 5000;
		switch(month){
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			if(choose == 1){
				System.out.println("���Ļ�Ʊ�۸�Ϊ"+(price*0.9));
			}else if(choose==2){
				System.out.println("���Ļ�Ʊ�۸�Ϊ"+(price*0.8));
			}else{
				System.out.println("��������ȷ����");
			}break;
		case 11:
		case 12:
		case 1:
		case 2:
		case 3:
			if(choose==1){
				System.out.println("���Ļ�Ʊ�۸�Ϊ"+(price*0.5));
			}else if(choose==2){
				System.out.println("���Ļ�Ʊ�۸�Ϊ"+(price*0.4));
			}else{
				System.out.println("��������ȷ�ĺ���");
			}break;
		default:
			System.out.println("��������ȷ�·�");
		}
	}
}
