package hopperOptimizations;

import hopperOptimizations.settings.Settings;
import optionsmod.OptionsmodExtension;
import optionsmod.OptionsmodExtension;
import optionsmod.OptionsmodServer;
import optionsmod.settings.SettingsManager;

/**
 * Hopper Optimization Mod
 *
 * @author 2No2Name
 * adapted from the fabric carpet extension example mod.
 * bloom filter contribution originally by skyrising
 */
public class HopperOptimizationsExtension implements OptionsmodExtension {
    private static SettingsManager mySettingManager;

    static {
        String myVersion = "0.1.17";

        mySettingManager = new SettingsManager(myVersion, "hopperoptimizations", "Hopper Optimizations Mod");
        OptionsmodServer.manageExtension(new HopperOptimizationsExtension());
    }

    public static void noop() {
    }

    @Override
    public void onGameStarted() {
        // let's /hopperoptimizations handle our few simple settings
        mySettingManager.parseSettingsClass(Settings.class);
    }

    @Override
    public SettingsManager customSettingsManager() {
        // this will ensure that our settings are loaded properly when world loads
        return mySettingManager;
    }
}
