import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class Copy {

	public static void main(String[] args) throws IOException {
		if (args.length==2) {
		String newfile = args[1];
		File file = new File(newfile);
		if(file.createNewFile()){
            System.out.println("file.txt File Created in Project root directory");
        }else System.out.println("File file.txt already exists in project root directory");
		
		Scanner sc = new Scanner(new File(args[0]));
		String content = sc.useDelimiter("\\z").next();
		
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(content);
		fileWriter.flush();
		fileWriter.close();
		sc.close();
		
	}
		else {
			System.out.println("You haven't entered two arguments");
		}
	}

}
