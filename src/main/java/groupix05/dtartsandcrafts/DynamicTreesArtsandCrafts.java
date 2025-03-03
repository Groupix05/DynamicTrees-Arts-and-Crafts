package groupix05.dtartsandcrafts;

import com.ferreusveritas.dynamictrees.api.GatherDataHelper;
import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.data.event.GatherDataEvent;

@Mod(DynamicTreesArtsandCrafts.MOD_ID)
public final class DynamicTreesArtsandCrafts {

    public static final String MOD_ID = "dtartsandcrafts";

    public DynamicTreesArtsandCrafts() {
        RegistryHandler.setup(MOD_ID);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::gatherData);
    }

    private void gatherData(final GatherDataEvent event) {
        GatherDataHelper.gatherTagData(MOD_ID, event);
        GatherDataHelper.gatherLootData(MOD_ID, event);
    }

}
