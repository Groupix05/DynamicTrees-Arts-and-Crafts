package groupix05.dtartsandcrafts;

import com.ferreusveritas.dynamictrees.api.GatherDataHelper;
import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import com.ferreusveritas.dynamictrees.block.leaves.LeavesProperties;
import com.ferreusveritas.dynamictrees.tree.family.Family;
import com.ferreusveritas.dynamictrees.tree.species.Species;
import com.ferreusveritas.dynamictrees.resources.Resources;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(DynamicTreesArtsandCrafts.MOD_ID)
public final class DynamicTreesArtsandCrafts {

    public static final String MOD_ID = "dtartsandcrafts";

    public DynamicTreesArtsandCrafts() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::gatherData);
        RegistryHandler.setup(MOD_ID);
    }

    private void gatherData(final GatherDataEvent event) {
        //Resources.MANAGER.gatherData();
        GatherDataHelper.gatherAllData(MOD_ID, event,
                Family.REGISTRY,
                Species.REGISTRY,
                LeavesProperties.REGISTRY
        );
    }

}
