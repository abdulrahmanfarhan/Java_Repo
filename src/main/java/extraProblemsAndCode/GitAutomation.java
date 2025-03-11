package extraProblemsAndCode;

import java.io.IOException;

public class GitAutomation {
    public static void main(String[] args) {
        String directoryPath = "G:\\My Drive\\Java-OOP_A.Farhan";

        String[] command = {
            "cmd.exe", "/c", "git add . && git commit -m \"Updated project files\" && git push"
        };

        ProcessBuilder processBuilder = new ProcessBuilder(command);
        processBuilder.directory(new java.io.File(directoryPath));

        try {
            Process process = processBuilder.start();
            process.waitFor();
            System.out.println("Git commands executed successfully!");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

