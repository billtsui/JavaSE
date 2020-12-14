package person.billtsui.exercise4.studentmanagement;

import java.util.Scanner;

/**
 * @author billtsui
 * @date 2020/11/16
 */
public class SysTest {
    public static void main(String[] args) {
        Operaion op = new Operaion();
        op.init();
        while (true) {
            System.out.println("**********学生信息管理系统**********");
            System.out.print("\t\t[1] 增加学生数据\n");
            System.out.print("\t\t[2] 删除学生数据\n");
            System.out.print("\t\t[3] 修改学生数据\n");
            System.out.print("\t\t[4] 查找学生信息\n");
            System.out.print("\t\t[5] 打印全体学生数据\n");
            System.out.print("\t\t[0] 退出学生信息管理系统\n");
            System.out.print("**********************************");
            System.out.println();
            System.out.print("请输入对应的编号后进行操作:");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();

            switch (choose) {
                case 0: {
                    op.save();
                    System.out.print("谢谢使用，再见！");
                    return;
                }
                case 1:
                    op.addStudent();
                    break;
                case 2:
                    op.delStudent();
                    break;
                case 3:
                    op.editStudent();
                    break;
                case 4:
                    op.searchStudent();
                    break;
                case 5:
                    op.printAllStudent();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }
    }
}
