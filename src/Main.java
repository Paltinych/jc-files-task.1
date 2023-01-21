import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();
        StringBuilder log = new StringBuilder();
        File dirSrc = new File("D:/Games", "src");
        File dirRes = new File("D:/Games", "res");
        File dirSaveGames = new File("D:/Games", "savegames");
        File dirTemp = new File("D:/Games", "temp");
        File dirMain = new File("D:/Games/src", "main");
        File dirTest = new File("D:/Games/src", "test");
        File dirDrawables = new File("D:/Games/res", "drawables");
        File dirVectors = new File("D:/Games/res", "vectors");
        File dirIcons = new File("D:/Games/res", "icons");
        File fileMain = new File("D:/Games/src/main", "Main.java");
        File fileUtils = new File("D:/Games/src/main", "Utils.java");

        if (dirSrc.mkdir()) {
            log.append(data + "\tпапка " + dirSrc + " создана\n");
        } else {
            log.append(data + "\tпапка " + dirSrc + " не создана\n");
        }

        if (dirMain.mkdir()) {
            log.append(data + "\tпапка " + dirMain + " создана\n");
        } else {
            log.append(data + "\tпапка " + dirMain + " не создана\n");
        }

        if (fileMain.exists()) {
            System.out.println("Файл существует");
        } else {
            System.out.println("Упс!!! Такого файла нет");
        }

        try {
            if (fileMain.createNewFile()) {
                log.append(data + "\tфайл " + fileMain + " создан\n");
            } else {
                log.append(data + "\tфайл " + fileMain + " не создан\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if (fileUtils.exists()) {
            System.out.println("Файл существует");
        } else {
            System.out.println("Упс!!! Такого файла нет");
        }

        try {
            if (fileUtils.createNewFile()) {
                log.append(data + "\tфайл " + fileUtils + " создан\n");
            } else {
                log.append(data + "\tфайл " + fileUtils + " не создан\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if (dirTest.mkdir()) {
            log.append(data + "\tпапка " + dirTest + " создана\n");
        } else {
            log.append(data + "\tпапка " + dirTest + " не создана\n");
        }

        if (dirRes.mkdir()) {
            log.append(data + "\tпапка " + dirRes + " создана\n");
        } else {
            log.append(data + "\tпапка " + dirRes + " не создана\n");
        }

        if (dirDrawables.mkdir()) {
            log.append(data + "\tпапка " + dirDrawables + " создана\n");
        } else {
            log.append(data + "\tпапка " + dirDrawables + " не создана\n");
        }

        if (dirVectors.mkdir()) {
            log.append(data + "\tпапка " + dirVectors + " создана\n");
        } else {
            log.append(data + "\tпапка " + dirVectors + " не создана\n");
        }

        if (dirIcons.mkdir()) {
            log.append(data + "\tпапка " + dirIcons + " создана\n");
        } else {
            log.append(data + "\tпапка " + dirIcons + " не создана\n");
        }

        if (dirSaveGames.mkdir()) {
            log.append(data + "\tпапка " + dirSaveGames + " создана\n");
        } else {
            log.append(data + "\tпапка " + dirSaveGames + " не создана\n");
        }

        if (dirTemp.mkdir()) {
            log.append(data + "\tпапка " + dirTemp + " создана\n");
        } else {
            log.append(data + "\tпапка " + dirTemp + " не создана\n");
        }

        try (FileWriter fileTemp = new FileWriter("D:/Games/temp/temp.txt", true)){
            fileTemp.write(String.valueOf(log));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
