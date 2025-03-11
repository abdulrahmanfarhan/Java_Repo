package extraProblemsAndCode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abdulrahman
 */
import java.io.IOException;

public class GitAutomation {
    public static void main(String[] args) {
        // المسار إلى المجلد الذي يحتوي على ملفات المشروع
        String directoryPath = "G:\\My Drive\\Java-OOP_A.Farhan"; // تم تعديل المسار

        // الأوامر التي ترغب في تنفيذها
        String[] command = {
            "cmd.exe", "/c", "git add . && git commit -m \"Updated project files\" && git push"
        };

        // إنشاء عملية لتنفيذ الأوامر داخل المجلد المحدد
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        processBuilder.directory(new java.io.File(directoryPath));

        try {
            // تنفيذ الأوامر
            Process process = processBuilder.start();
            process.waitFor(); // الانتظار حتى اكتمال الأوامر
            System.out.println("Git commands executed successfully!");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

