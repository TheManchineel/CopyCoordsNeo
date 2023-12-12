package net.newspawn.copycoordsneo;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandCc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // get player's location
        if (sender instanceof Player) {
            final Player player = (Player) sender;
            final Location location = player.getLocation();
            final int x = location.getBlockX();
            final int y = location.getBlockY();
            final int z = location.getBlockZ();

            final TextComponent message = Component.text("Your location: ")
                    .append(
                            Component.text(x + " " + y + " " + z)
                            .clickEvent(ClickEvent.suggestCommand(x + " " + y + " " + z))
                            .hoverEvent(Component.text("Click to copy coordinates!"))
                            .color(net.kyori.adventure.text.format.TextColor.color(0x00FF00))
                            .decoration(net.kyori.adventure.text.format.TextDecoration.BOLD, true)
                            .decoration(net.kyori.adventure.text.format.TextDecoration.ITALIC, true)
                            .decoration(net.kyori.adventure.text.format.TextDecoration.UNDERLINED, true)
                    );
            player.sendMessage(message);
            return true;
        }

        return false;
    }
}
