package Probability;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StatsCalculatorFile {
    public static void main(String[] args) throws IOException {

        readFromFile();
        StatsCalculatorFile fileWritermain = new StatsCalculatorFile();
        fileWritermain.appendData("");
    }

    public static void appendData(String data) throws IOException {

        File myFile = new File("CalculatorRecord.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(myFile, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(new Date());
        String line = dateTime + " - " + data;
        printWriter.println(line);
        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void readFromFile() {
        File myFile = new File("student_grades.txt");

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException var3) {
            System.out.println("File does not exist");
        } catch (IOException var4) {
            System.out.println("Error occurred while reading the file");
        }
    }
}
