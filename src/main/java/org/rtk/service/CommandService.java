package org.rtk.service;

import org.rtk.domain.Command;
import org.rtk.domain.Mem;

import java.io.IOException;
import java.util.List;

/**
 * Command service.
 */
public interface CommandService {
    /**
     * Write text in picture.
     *
     * @param mem object Mem.
     * @throws IOException exception.
     */
    void writeOnPicture(Mem mem) throws IOException;

    /**
     * Get list default commands.
     *
     * @return list commands.
     */
    List<Command> getDefaultCommands();
}
