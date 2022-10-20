
import java.io.*;
import java.util.*;

public class Countwords {

    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("readwords.txt");
        Scanner fileInput = new Scanner(fin);

        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();

        while(fileInput.hasNext()) {
            String nextWord = fileInput.next();

            if(words.contains(nextWord)){
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index) + 1);
            }
            else{
                words.add(nextWord);
                count.add(1);
            }
        }
        fileInput.close();
        fin.close();

        for(int i = 0; i < words.size(); i++){
            PrintWriter output_file = new PrintWriter("Outputfile.txt");
            //print to terminal
            System.out.println(words.get(i) + " appeared " + count.get(i) + " time(s) ");
            //print to file
            output_file.println(words.get(i) + " appeared " + count.get(i) + " time(s) ");
            output_file.close();
        }
    
    }
}