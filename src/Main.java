import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();
        String[] dirArray = {"C://Games//src",
                             "C://Games//res",
                             "C://Games//savegames",
                             "C://Games//temp",
                             "C://Games//src//main",
                             "C://Games//src//test",
                             "C://Games//res//drawables",
                             "C://Games//res//vectors",
                             "C://Games//res//icons"};

        String[] fileArray = {"C://Games//src//main//Main.java",
                              "C://Games//src//main//Utils.java",
                              "C://Games//temp//temp.txt"};

        for(String path : dirArray){
            File dir = new File(path);
            if (dir.mkdir()){
                String[] dirNames = path.split("//");
                strBuilder.append(dirNames[dirNames.length - 1]);
                strBuilder.append(" directory created\n");
            }
        }

        for(String path : fileArray){
            File file = new File(path);
            String[] fileNames = path.split("//");
            try {
                if (file.createNewFile()){
                    strBuilder.append(fileNames[fileNames.length - 1]);
                    strBuilder.append(" file created\n");}
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        try (FileWriter writer = new FileWriter("C://Games//temp//temp.txt", false)){
            writer.write(strBuilder.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
