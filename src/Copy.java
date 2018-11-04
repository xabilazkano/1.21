import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class Copy {

	public static void main(String[] args) throws IOException {
		String newfile = args[1];
		File file = new File(newfile);
		if(file.createNewFile()){
            System.out.println("file.txt File Created in Project root directory");
        }else System.out.println("File file.txt already exists in project root directory");
		
		String content = new Scanner(new File(args[0])).useDelimiter("\\Z").next();
		
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(content);
		fileWriter.flush();
		fileWriter.close();
	}

}
