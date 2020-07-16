import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();
        File dir1 = new File("C://Games//src");
        if (dir1.mkdir()){
            strBuilder.append("src directory created\n");
        }

        File dir2 = new File("C://Games//res");
        if (dir2.mkdir()){
            strBuilder.append("res directory created\n");
        }

        File dir3 = new File("C://Games//savegames");
        if (dir3.mkdir()){
            strBuilder.append("savegames directory created\n");
        }

        File dir4 = new File("C://Games//temp");
        if (dir4.mkdir()){
            strBuilder.append("temp directory created\n");
        }

        File dir5 = new File("C://Games//src//main");
        if (dir5.mkdir()){
            strBuilder.append("src//main directory created\n");
        }

        File dir6 = new File("C://Games//src//test");
        if (dir6.mkdir()){
            strBuilder.append("src//temp directory created\n");
        }

        File mainFile = new File("C://Games//src//main//Main.java");
        try {
            if (mainFile.createNewFile())
                strBuilder.append("Main.java file created\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utilsFile = new File("C://Games//src//main//Utils.java");
        try {
            if (utilsFile.createNewFile())
                strBuilder.append("Utils.java file created\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File dir7 = new File("C://Games//res//drawables");
        if (dir7.mkdir()){
            strBuilder.append("res//drawables directory created\n");
        }

        File dir8 = new File("C://Games//res//vectors");
        if (dir8.mkdir()){
            strBuilder.append("res//vectors directory created\n");
        }

        File dir9 = new File("C://Games//res//icons");
        if (dir9.mkdir()){
            strBuilder.append("res//icons directory created\n");
        }

        File tempFile = new File("C://Games//temp//temp.txt");
        try {
            if (tempFile.createNewFile())
                strBuilder.append("temp.txt file created\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(tempFile, false)){
            writer.write(strBuilder.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
