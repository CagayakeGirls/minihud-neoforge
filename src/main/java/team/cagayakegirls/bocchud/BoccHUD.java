package team.cagayakegirls.bocchud;

import fi.dy.masa.minihud.MiniHUD;
import fi.dy.masa.minihud.compat.modmenu.ModMenuImpl;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = BoccHUD.MOD_ID, dist = Dist.CLIENT)
public class BoccHUD {
    public static final String MOD_ID = "bocchud";

    public BoccHUD(ModContainer modContainer) {
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, new ModMenuImpl().getModConfigScreenFactory());
        new MiniHUD().onInitialize();
    }
}
