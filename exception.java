import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class exception {
    public static void main(String[] args){
        String configFile = "ConfigFile";
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(configFile));
            String className = br.readLine();

            if (className == null || className.equals("")) {
                System.out.println(configFile + " is empty");
                return;
            }

            className = className.substring(className.lastIndexOf(".") + 1);
            System.out.println(className);

            Class<?> reportClass = null;
            try {
                reportClass = Class.forName(className);
                System.out.println("Loaded class: " + reportClass.getName());
            } catch (ClassNotFoundException e) {
                System.out.println(configFile + " not found");
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
