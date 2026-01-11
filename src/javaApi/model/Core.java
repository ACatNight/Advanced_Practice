package javaApi.model;

import java.util.Scanner;

public class Core {
	public static void main(String[] args) {
		boolean start = true;
		Scanner sc = new Scanner(System.in);

		int[] id = new int[5];
		String[] name = new String[5];
		double[] shouldPay = new double[5];
		double[] deduct = new double[5];
		double[] realPay = new double[5];

		int count = 0;

		while (start) {
			System.out.println("=======海慎公司管理系统========\n" +
					"1·新员工工资录入\t2·输出员工工资表\n" +
					"3·修改员工工资信息\t4·删除员工信息\n" +
					"0·退出工资系统");
			int tChoose = sc.nextInt();
			switch (tChoose) {
				case 0:
					start = false;
					break;
				case 1:
					if (count < 5) {
						System.out.print("输入员工ID: ");
						id[count] = sc.nextInt();
						System.out.print("输入员工姓名: ");
						name[count] = sc.next();
						System.out.print("输入应发工资: ");
						shouldPay[count] = sc.nextDouble();
						System.out.print("输入扣款: ");
						deduct[count] = sc.nextDouble();
						realPay[count] = shouldPay[count] - deduct[count];
						count++;
					} else {
						System.out.println("员工已满，无法录入更多。");
					}
					break;
				case 2:
					System.out.println("ID\t姓名\t应发\t扣款\t实发");
					for (int i = 0; i < count; i++) {
						System.out.println(id[i] + "\t" + name[i] + "\t" + shouldPay[i] + "\t" + deduct[i] + "\t" + realPay[i]);
					}
					break;
				case 3:
					System.out.print("输入要修改的员工ID: ");
					int modId = sc.nextInt();
					boolean found = false;
					for (int i = 0; i < count; i++) {
						if (id[i] == modId) {
							System.out.print("修改应发工资: ");
							shouldPay[i] = sc.nextDouble();
							System.out.print("修改扣款: ");
							deduct[i] = sc.nextDouble();
							realPay[i] = shouldPay[i] - deduct[i];
							found = true;
							System.out.println("修改成功！");
							break;
						}
					}
					if (!found) System.out.println("未找到该员工ID");
					break;
				case 4:
					System.out.print("输入要删除的员工ID: ");
					int delId = sc.nextInt();
					found = false;
					for (int i = 0; i < count; i++) {
						if (id[i] == delId) {
							for (int j = i; j < count - 1; j++) {
								id[j] = id[j + 1];
								name[j] = name[j + 1];
								shouldPay[j] = shouldPay[j + 1];
								deduct[j] = deduct[j + 1];
								realPay[j] = realPay[j + 1];
							}
							count--;
							found = true;
							System.out.println("删除成功！");
							break;
						}
					}
					if (!found) System.out.println("未找到该员工ID");
					break;
			}
		}

		sc.close();
	}
}
