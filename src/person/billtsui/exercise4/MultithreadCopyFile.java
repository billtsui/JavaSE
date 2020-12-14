package person.billtsui.exercise4;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author billtsui
 * @date 2020/12/14
 */
public class MultithreadCopyFile {
    public static void main(String[] args) {
        System.out.println("请输入源目录路径:");
        Scanner scanner = new Scanner(System.in);
        String sourcePath = scanner.next();

        System.out.println("请输入目标路径");
        String destPath = scanner.next();

        MultithreadCopyFile multithreadCopyFile = new MultithreadCopyFile();
        multithreadCopyFile.copyFolders(sourcePath, destPath);
    }

    private void copyFolders(String sourcePath, String destPath) {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        if (!sourceFile.exists()) {
            System.out.println("源目录不存在");
            return;
        }

        if (!destFile.exists()) {
            destFile.mkdirs();
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (File file : Objects.requireNonNull(sourceFile.listFiles())) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    if (file.isFile()) {
                        copyFile(file.getAbsolutePath(), destFile.getAbsolutePath() + "/" + file.getName());
                    } else {
                        copyFolders(file.getAbsolutePath(), destFile.getAbsolutePath() + "/" + file.getName());
                    }
                }
            };
            executorService.execute(r);
        }
        executorService.shutdown();
    }

    private void copyFile(String sourcePath, String targetPath) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(sourcePath));
            bw = new BufferedWriter(new FileWriter(targetPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = null;
        try {
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bw) {
                    bw.close();
                }
                if (null != br) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
