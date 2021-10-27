public class Main {
    public static void main(String[] args) {
//        Câu 1: Cho chuỗi "Hello every one", thực hiện:
//        Ký tự e xuất hiện bao nhiêu lần và có index là bao nhiêu
        String example = "Hello every one";
        int count = 0;
        System.out.print("Các vị trí xuất hiện: ");
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == 'e') {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\nSố lần xuất hiện: %d\n", count);

        Cau2 temp = new Cau2();
        System.out.printf("Vị trí chuỗi strB: %d\n", temp.find("Đây là chữ cần tìm", "chữ"));

        Cau3 cau3 = new Cau3();
        System.out.println(cau3.longestWord("Không có gì quý hơn độc lập tự do"));
    }
}
