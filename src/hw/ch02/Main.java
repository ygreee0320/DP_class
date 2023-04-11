package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210811 양규리");
        
        FileIO f = new FileProperties(); // 어댑터 생성

        try {
            f.readFromFile("file.txt");
            
            f.setValue("Year", "2023");
            f.setValue("bornYear", "2000");
            f.setValue("StudentId", "20210811");
            f.setValue("Name", "YangGyuri");
            f.setValue("Location", "Seoul");

            f.writeToFile("YangGyuRi.txt");
            System.out.println("YangGyuRi.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
