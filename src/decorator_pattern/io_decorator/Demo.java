package decorator_pattern.io_decorator;

import java.io.*;

public class Demo {
    public static void main(String agrs[]){
        int c;
        try {
            InputStream in =
                    new LowerCaseInputSream(
                            new BufferedInputStream(
                                    new FileInputStream("/Users/yinfengma/AndroidStudioProjects" +
                                            "/DesignPattern/src/decorator_pattern/text.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
