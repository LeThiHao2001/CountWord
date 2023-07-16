import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class CountVietnameseChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi chữ cái Latin: ");
        String input = scanner.nextLine();

        // Tạo biểu thức chính quy
        String regex = "([aeiouy]?[aeiouy]?[bdghklmnpqrstvx]?[aeiouy]?[bfjprtv]?)+";
        Pattern pattern = Pattern.compile(regex);

        // Tìm kiếm các chuỗi tương ứng với các chữ cái Tiếng Việt
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        // In kết quả
        System.out.println("Số lượng các chữ cái Tiếng Việt trong chuỗi là: " + count);
    }
}