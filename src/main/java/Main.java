import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String cityName = sc.nextLine();
        String cityCode = RequestHandler.detectCity(cityName);
        System.out.println(RequestHandler.detectWheather(cityCode));


    }
}
