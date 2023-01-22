import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();
        File dirGames = new File("D:/Games");
        File dirSrc = new File(dirGames, "src");
        File dirRes = new File(dirGames, "res");
        File dirMain = new File(dirSrc, "main");
        String[] games = new String[]{"src", "res", "savegames", "temp"};
        String[] src = new String[]{"main", "test"};
        String[] res = new String[]{"drawables", "vectors", "icons"};
        String[] main = new String[]{"Main.java", "Utils.java"};

        makeDir(log, games, dirGames);
        makeDir(log, src, dirSrc);
        makeDir(log, res, dirRes);
        makeFile(log, main, dirMain);

        try (FileWriter fileTemp = new FileWriter("D:/Games/temp/temp.txt", true)) {
            fileTemp.write(String.valueOf(log));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static StringBuilder makeDir(StringBuilder log, String[] folders, File dir) {
        Date data = new Date();
        for (String folder : folders) {
            if ((new File(dir, folder)).mkdir()) {
                log.append(data + "\tпапка " + (new File(dir, folder)) + " создана\n");
            } else {
                log.append(data + "\tпапка " + (new File(dir, folder)) + " не создана\n");
            }
        }
        return log;
    }

    public static StringBuilder makeFile(StringBuilder log, String[] files, File dir) {
        Date data = new Date();
        for (String file : files) {
            if ((new File(dir, file)).exists()) {
                System.out.println("Файл существует");
            } else {
                System.out.println("Упс!!! Такого файла нет");
            }

            try {
                if ((new File(dir, file)).createNewFile()) {
                    log.append(data + "\tфайл " + (new File(dir, file)) + " создан\n");
                } else {
                    log.append(data + "\tфайл " + (new File(dir, file)) + " не создан\n");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return log;
    }
}
