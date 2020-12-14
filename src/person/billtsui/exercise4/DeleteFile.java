package person.billtsui.exercise4;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author billtsui
 * @date 2020/12/14
 */
public class DeleteFile {
    public static void main(String[] args) {
        System.out.println("请输入待删除的目录:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        DeleteFile deleteFile = new DeleteFile();
        deleteFile.delFile(path);
    }

    private void delFile(String path) {
        if (path == null || path.length() == 0) {
            System.out.println("目录不能为空");
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            for (File listFile : Objects.requireNonNull(file.listFiles())) {
                if (listFile.isDirectory()) {
                    delFile(listFile.getAbsolutePath());
                } else {
                    listFile.delete();
                }
            }
            file.delete();
        } else {
            System.out.println("目录不存在");
        }

    }
}
