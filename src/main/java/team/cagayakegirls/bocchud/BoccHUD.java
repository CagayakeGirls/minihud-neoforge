package team.cagayakegirls.bocchud;

import fi.dy.masa.minihud.MiniHUD;
import fi.dy.masa.minihud.compat.modmenu.ModMenuImpl;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(BoccHUD.MOD_ID)
public class BoccHUD {
    public static final String MOD_ID = "bocchud";

    public BoccHUD(ModContainer modContainer) {
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, new ModMenuImpl().getModConfigScreenFactory());
        new MiniHUD().onInitialize();
    }
}
