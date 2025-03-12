package net.hyper_pigeon.homing_pigeons;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(net.hyper_pigeon.homing_pigeons.Constants.MOD_ID)
public class HomingPigeonsNeoforge {

    public HomingPigeonsNeoforge(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        net.hyper_pigeon.homing_pigeons.HomingPigeons.init();

    }
}