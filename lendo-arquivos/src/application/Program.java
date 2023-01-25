package application;

/*
* Manipulando pastas com File
*/
import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho da pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean succcess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso! " + succcess);

        sc.close();

    }
}
