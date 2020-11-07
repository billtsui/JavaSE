package person.billtsui.javaoo.exercise.two;

import java.util.Scanner;

/**
 * @author billtsui
 * @date 2020/10/28
 */
public class Five {
    //（1）绘制棋盘 - 写一个成员方法实现
    private String[][] checkerboard;
    //定义白棋黑棋
    private char black_mole;
    private char white_mole;
    // 棋盘大小
    private int rows;
    private int cols;

    public Five() {
    }

    public Five( char black_mole, char white_mole, int rows, int cols) {
        setCheckerboardint(rows,cols);
        setBlack_mole(black_mole);
        setWhite_mole(white_mole );
        setCols(cols);
        setRows(cols);
    }


    public void setCheckerboardint(int rows, int cols) {
        checkerboard = new String[rows][cols];
    }

    public char getBlack_mole() {
        return black_mole;
    }

    public void setBlack_mole(char black_mole) {
        this.black_mole = black_mole;
    }

    public char getWhite_mole() {
        return white_mole;
    }

    public void setWhite_mole(char white_mole) {
        this.white_mole = white_mole;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
    //绘制棋盘
    public void getCheckerboard(){
        for (int i = 0; i < checkerboard.length; i++) {
            for (int j = 0; j < checkerboard[i].length; j++) {
                checkerboard[0][0]=" ";
                if (0==i) {checkerboard[i][j]=String.format("%x",j-1);}
                else if (0==j) {checkerboard[i][j]=String.format("%x",i-1);}
                else {checkerboard[i][j]="+";}
            }
        }

    }
    //打印棋盘
    public void showcheckerboard() {
        for (String[] str : checkerboard) {
            for (int j = 0; j < checkerboard[0].length; j++) {
                if ("白".equals(str[j])) {
                    System.out.print(white_mole + " ");
                } else if ("黑".equals(str[j])) {
                    System.out.print(black_mole + " ");
                } else {
                    System.out.print(str[j] + " ");

                }
            }
            System.out.println();
        }
    }
    //判断
    private Boolean isWin(int x, int y, String chess, int rows, int cols) {
        int countCol = -1;
        int countRow = -1;
        int countDiagonalLeft = -1;
        int countDiagonalRight = -1;
        int a;
        int b;
        // 行：向左数相同的棋子
        a = x;
        b = y;
        while (true){
            if (chess.equals(checkerboard[a][b])) {
                countRow++;
                if (b == 0) {
                    break;
                }
                b--;
            }else {
                break;
            }
        }
        // 行：向右数相同的棋子
        a = x;//行
        b = y;//列
        while (true) {
            if (chess.equals(checkerboard[a][b])) {
                countRow++;
                // 防止数组下标越界
                if (b == (cols - 1)) {
                    break;
                }
                b++;
            } else {
                break;
            }
        }

        // 列：向下数相同的棋子
        a = x;//行
        b = y;//列
        while (true) {
            if (chess.equals(checkerboard[a][b])) {
                countCol++;
                // 防止数组下标越界
                if (a == 0) {
                    break;
                }
                a--;
            } else {
                break;
            }
        }
        // 列：向上数相同的棋子
        a = x;
        b = y;
        while (true) {
            if (chess.equals(checkerboard[a][b])) {
                countCol++;
                // 防止数组下标越界
                if (a == (rows - 1)) {
                    break;
                }
                a++;
            } else {
                break;
            }
        }
        // 左对角：左上数相同的棋子
        a = x;
        b = y;
        while (true) {
            if (chess.equals(checkerboard[a][b])) {
                countDiagonalLeft++;
                // 防止数组下标越界
                if (a == 0 || b == 0) {
                    break;
                }
                a--;
                b--;
            } else {
                break;
            }
        }
        // 左对角：右下数相同的棋子
        a = x;
        b = y;
        while (true) {
            if (chess.equals(checkerboard[a][b])) {
                countDiagonalLeft++;
                // 防止数组下标越界
                if (a == (rows - 1) || b == (cols - 1)) {
                    break;
                }
                a++;
                b++;
            } else {
                break;
            }
        }

        // 右对角：右上数相同的棋子
        a = x;
        b = y;
        while (true) {
            if (chess.equals(checkerboard[a][b])) {
                countDiagonalRight++;
                // 防止数组下标越界
                if (a == 0 || b == (cols - 1)) {
                    break;
                }
                a--;
                b++;
            } else {
                break;
            }
        }
        // 右对角：左下数相同的棋子
        a = x;
        b = y;
        while (true) {
            if (chess.equals(checkerboard[a][b])) {
                countDiagonalRight++;
                // 防止数组下标越界
                if (a == (rows - 1) || b == 0) {
                    break;
                }
                a++;
                b--;
            } else {
                break;
            }
        }


        return (countRow >= 5 || countCol >= 5 || countDiagonalLeft >= 5 || countDiagonalRight >= 5);
    }

    //游戏入口
    public void startGame() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int x;
        int y;
        String chess;
        while (true) {
            if (flag) {
                System.out.println("请白方落子（空格隔开）：");
                chess = "白";
            } else {
                System.out.println("请黑方落子（空格隔开）：");
                chess = "黑";
            }
            x = sc.nextInt() + 1;
            y = sc.nextInt() + 1;
            if (x < 0 || y < 0 || x > 16 || y > 16) {
                System.out.println("落子超出棋盘范围，请重新落子。");
                continue;
            }
            if ("+".equals(checkerboard[x][y])) {
                checkerboard[x][y] = chess;
            } else {
                System.out.println("当前坐标不可落子，请重新落子。");
                continue;
            }
            showcheckerboard();
            flag = !flag;
            boolean isWin = isWin(x, y, chess, getRows(), getCols());
            if (isWin) {
                System.out.printf("恭喜%s方获胜！", chess);
                break;
            }
        }
    }
}
