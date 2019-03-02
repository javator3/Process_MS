package pl.sda.proces_ms;

import org.omg.SendingContext.RunTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Process process;

        final String HOME_DIR = System.getProperty("user.home");

        System.out.println(HOME_DIR);

        try {

            process = Runtime.getRuntime().exec("cmd /c dir " + HOME_DIR);

            process = Runtime.getRuntime().exec("cmd /c notepad " + HOME_DIR + "\\test.txt");

            process = Runtime.getRuntime().exec("explorer d:\\");

            System.out.println(process.getOutputStream());

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            while((line = reader.readLine()) != null){

                System.out.println(line);

            }        } catch (IOException e) {

            e.printStackTrace();

        }


    }
}
