package io.github.landonjw.pixelmonshowdown.commands;

import io.github.landonjw.pixelmonshowdown.utilities.UIManager;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;

public class showdownCommand implements CommandExecutor {
    public CommandResult execute(CommandSource src, CommandContext args) {
        if (src instanceof Player) {
            Player player = (Player) src;

            if(player.hasPermission("pixelmonshowdown.user.command.pixelmonshowdown")) {
                UIManager manager = new UIManager(player);
                manager.openMainGUI();
            }
        }
        return CommandResult.success();
    }
}