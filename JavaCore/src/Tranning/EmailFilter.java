package Tranning;

import java.util.ArrayList;
import java.util.List;

public class EmailFilter {
    public static void main(String[] args) {
        ArrayList<String> listemail = new ArrayList<>(List.of(
                "Java", "JavaCore", "List", "ArrayList",
                "tran.the.dung@vsi-international.com", "dungtt@gmail.com", 
                "d@ung@vsi-international.com", "VietSoftw@re@vsi-international.com", 
                "@@@gmail.com"
        ));
        // Truyền dữ liệu của listemail sang cho result 
        List<String> result = filterAndModifyEmails(listemail);
        // In ra từng chuỗi trong result 
        result.forEach(System.out::println);
    }

    public static List<String> filterAndModifyEmails(ArrayList<String> list) {
        List<String> filteredList = new ArrayList<>();
        // Duyệt phần tử trong list và gán vào biến str 
        for (String str : list) {
            // Bỏ qua những chuỗi không có từ @ 
            if (str.contains("@")) {
                // xác định vị trí của ký tự @ cuối cùng 
                int lastAtIndex = str.lastIndexOf("@");
                // Lấy phần trước ký tự @ cuối cùng và thay phần sau bằng "..."
                String modifiedStr = str.substring(0, lastAtIndex + 1) + "...";
                // Thêm vào danh sách kết quả
                filteredList.add(modifiedStr);
            }
        }
        return filteredList;
    }
}
