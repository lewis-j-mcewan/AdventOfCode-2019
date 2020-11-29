import java.util.List;

public class Day1 {

    public static void main(String[] args) throws Exception {
        
        List<String> input = LoadFile.FileToString("Day1/resources/Day1.txt");
        if(input.isEmpty() || input == null){
            return;
        }

        int sum = 0;
        for(String s : input){
            int mass = Integer.parseInt(s);
            while(mass > 0){
                int fuel = (mass/3)-2;
                if(fuel > 0){
                    sum += fuel;
                }
                mass = fuel;
            }
        }
        System.out.println(sum);
    }
}
