package fi.dy.masa.minihud.compat.modmenu;

import fi.dy.masa.minihud.gui.GuiConfigs;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

public class ModMenuImpl
{
    public IConfigScreenFactory getModConfigScreenFactory()
    {
        return (modContainer, screen) -> {
            GuiConfigs gui = new GuiConfigs();
            gui.setParent(screen);
            return gui;
        };
    }
}
