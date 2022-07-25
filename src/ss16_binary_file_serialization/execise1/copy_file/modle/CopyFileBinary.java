package ss16_binary_file_serialization.execise1.copy_file.modle;

import ss16_binary_file_serialization.execise1.copy_file.exception.FileExistsException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFileBinary {


    public static void copyFileBinary(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        int count = 0;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
                count += length;
            }
            System.out.println("số byte có trong tệp " + count);
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/ss16_binary_file_serialization/execise1/copy_file/data/source.csv";
        String targetPath = "src/ss16_binary_file_serialization/execise1/copy_file/data/target.csv";
        try {
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);
            if (targetFile.exists()) {
                throw new FileExistsException("File đích đã tồn tại, vui lòng kiểm tra lại!");
            }
            copyFileBinary(sourceFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileExistsException e) {
            System.out.println(e.getMessage());
        }
    }

}

