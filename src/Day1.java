import java.util.List;

public class Day1 {

    public static void main(String[] args) throws Exception {
        
        List<String> input = LoadFile.FileToString("resources/Day1.txt");
        System.out.println(input);
        int sum = 0;
        for(String s : input){
            int mass = Integer.parseInt(s);
            int result = (mass/3)-2;
            sum += result;
        }
        System.out.println(sum);
    }
}
