public class Cau3 {
    /*
  "Không có gì quý hơn độc lập tự do"
  Từ dài nhất là "Không"
  */
    public String longestWord(String input) {
        String word = "", large="";
        String[] words = new String[100];
        int length = 0;

        input = input + " ";

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                word = word + input.charAt(i);
            }
            else{
                words[length] = word;
                length++;
                word = "";
            }
        }

        for(int k = 0; k < length; k++){
            if(large.length() < words[k].length())
                large = words[k];
        }

        return large;
    }

}
