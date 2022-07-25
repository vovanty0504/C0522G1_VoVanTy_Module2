package ss16_binary_file_serialization.execise1.copy_file.controller;

import ss16_binary_file_serialization.execise1.copy_file.exception.FileExistsException;
import ss16_binary_file_serialization.execise1.copy_file.modle.CopyFileBinary;

import java.io.File;
import java.io.IOException;

public class ControllerFileBinary {
    public static void display() {
        String sourcePath = "src/ss16_binary_file_serialization/execise1/copy_file/data/source.csv";
        String targetPath = "src/ss16_binary_file_serialization/execise1/copy_file/data/target.csv";
        try {
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);
            if (targetFile.exists()) {
                throw new FileExistsException("File đích đã tồn tại, vui lòng kiểm tra lại!");
            }
            CopyFileBinary.copyFileBinary(sourceFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}
