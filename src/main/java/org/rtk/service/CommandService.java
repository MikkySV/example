package org.rtk.service;

import org.rtk.domain.Command;
import org.rtk.domain.Mem;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class CommandService {
    public CommandService() {
    }
    public void writeOnPicture(Mem mem) throws IOException {
        BufferedImage image =
                ImageIO.read(new File(mem.getPath().toString()));

        Graphics g = image.getGraphics();
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 64));
        g.drawString(mem.getMemText(), 800, 200);
        g.dispose();
        ImageIO.write(image, mem.getExtension(), new File(mem.getPath().toString()));
    }

    public List<Command> getDefaultCommands() {
        return List.of(
                new Command("help", "Помощь по командам"),
                new Command("mem", "Добавляет к картинке текст")
        );
    }
}
