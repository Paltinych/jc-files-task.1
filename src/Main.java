import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();
        StringBuilder log = new StringBuilder();
        File dirGames = new File("D:/Games");
        File dirSrc = new File(dirGames, "src");
        File dirRes = new File(dirGames, "res");
        File dirSaveGames = new File(dirGames, "savegames");
        File dirTemp = new File(dirGames, "temp");
        File dirMain = new File(dirSrc, "main");
        File dirTest = new File(dirSrc, "test");
        File dirDrawables = new File(dirRes, "drawables");
        File dirVectors = new File(dirRes, "vectors");
        File dirIcons = new File(dirRes, "icons");
        File fileMain = new File(dirMain, "Main.java");
        File fileUtils = new File(dirMain, "Utils.java");

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
