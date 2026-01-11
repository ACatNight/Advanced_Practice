package javaApi.day11;


public class App {
	public static void main(String[] args) {
		School school = new School();
		Classroom class1 = new Classroom("一班");
		school.addClassroom(class1);
		while (true){
			System.out.println("1. 添加学生\n" +
					"2. 删除学生\n" +
					"3. 按学号查询学生\n" +
					"4. 查看班级总分 / 平均分\n" +
					"5. 总分排行榜\n" +
					"6. 单科排行榜\n" +
					"7. 不及格单科排行榜\n" +
					"8. 查看班级报告");
			int tChoose = Util.inputInt();
			switch (tChoose){
				case 1:
					class1.addStudent();
					break;
				case 2:
					class1.removeStudent();
					break;
				case 3:
					class1.queryStudent();
					break;
				case 4:
					System.out.println("总分:" +
							class1.getClassTotalScore() + "\n" +
							"平均分:" + class1.getClassAveAgeScore());
					break;
				case 5:
					class1.printTotalScoreRank();
					break;
				case 6:
					class1.printSubjectScoreRank();
					break;
				case 7:
					class1.printSubjectScoreFailRanK();
					break;
				case 8:
					break;
			}
		}
	}
}
