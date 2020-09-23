package git_ex;

import java.util.Scanner;

/* <���� ���ͺб���>
�������ڴ� ��Ʈ���� �����ϰ� �Ǹ��ϴ� ȸ���̴�. ��Ʈ�� �Ǹ� ����� ������� �ų� �Ӵ��, ��꼼, �����, �޿� �� A������ ���� ����� ���, 
�� ���� ��Ʈ���� �����ϴ� ������ ����� �ΰǺ� �� �� B������ ���� ����� ��ٰ� �Ѵ�.

���� ��� A=1,000, B=70�̶�� ����. �� ��� ��Ʈ���� �� �� �����ϴ� ���� �� 1,070������ ���, �� �� �����ϴ� ���� �� 1,700������ ���.

��Ʈ�� ������ C�������� å���Ǿ��ٰ� �Ѵ�. 
�Ϲ������� ���� ����� �÷� ���� ���� ��� ���� �� ����(�Ǹź��)�� �� ���(=�������+�������)���� �������� �ȴ�. 
���ʷ� �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������ ���ͺб���(BREAK-EVEN POINT)�̶�� �Ѵ�.

A, B, C�� �־����� ��, ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 

A,B,C �� �ܼ�â���� �Է¹޴´�~
 */

public class Jiyeon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// a = �������, b=�������, c=��Ʈ�� ����
		// �Ѵ�� ++totalSales 
		// �Ѽ���(�ǸŴ��*��Ʈ�ϰ���) >= �Ѻ��(����+����*���) == break-even point
		System.out.println("FIXED COST/VARIABLE EXPENSES/LAPTOP PRICE");
		String str = sc.nextLine();
		String[] values = str.split("/");

		int a = Integer.parseInt(values[0]);
		int b = Integer.parseInt(values[1]);
		int c = Integer.parseInt(values[2]);

		int numberOfSales = 0;

		if (c > b) { //��������� ��Ʈ�� ���ݺ��� ũ�� ���ʿ� ���� �б��� ���� ���� 
			do {//�ϴ� �Ǹ� 
				++numberOfSales;
			} while ((numberOfSales * c) <= (a + (b* numberOfSales))); //�Ѻ���� �Ѽ��Ժ��� ���ų� ���� �� ���� 
			System.out.println("BREAK-EVEN-POINT>>\nWHEN NUMBER OF SALES IS "+numberOfSales);
			}
		else {
			System.out.println("-1");
		}
	}
}