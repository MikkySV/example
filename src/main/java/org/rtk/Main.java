 package org.rtk;

 import org.rtk.domain.Command;
 import org.rtk.domain.Mem;
 import org.rtk.service.CommandService;

 import java.io.Console;
 import java.io.IOException;
 import java.nio.file.Path;
 import java.util.List;
 import java.util.Objects;

 // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        CommandService commandService = new CommandService();
        List<Command> commandList = commandService.getDefaultCommands();


        for (String arg : args) {
            if (arg.equals("help")) {
                for (Command command :commandList) {
                    System.out.println(command.getName()
                            + ": " + command.getDescription());
                }
                break;
            }

            if (arg.equals("mem")) {
                Path pathToFile = Path.of(args[1]);
                String memText = args[2];

                String fileName = "";
                int nameIndex = pathToFile.toString().lastIndexOf("\\");
                if (nameIndex > 0) {
                    fileName = pathToFile.toString().substring(nameIndex+1);
                }
                String extension = "";
                int extIndex = fileName.lastIndexOf('.');
                if (extIndex > 0) {
                    extension = fileName.substring(extIndex+1);
                }

                Mem mem = new Mem(pathToFile, fileName, extension, memText);
                commandService.writeOnPicture(mem);
            }
        }
    }
}