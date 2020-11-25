import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day1 {

    public static List<String> FileToString(String loc) throws IOException {
        File file = new File(loc);
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (Exception e) {
            System.out.println("File not found");
            return new ArrayList<String>();
        }

        List<String> input = new ArrayList<>();
        try {
            String line;
            while((line = reader.readLine()) != null){
                input.add(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error reading file into arrayList");
            e.printStackTrace();
            return null;
        } finally {
            if(reader != null) reader.close();
        }
        
        return input;
    }

    public static void main(String[] args) throws Exception {
        
        List<String> input = FileToString("resources/Day1.txt");
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
