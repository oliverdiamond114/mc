package net.mcreator.theepic.procedures;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.theepic.TheepicModElements;
import net.mcreator.theepic.TheepicMod;

import java.util.Map;

@TheepicModElements.ModElement.Tag
public class GmspCommandExecutedProcedure extends TheepicModElements.ModElement {
	public GmspCommandExecutedProcedure(TheepicModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheepicMod.LOGGER.warn("Failed to load dependency entity for procedure GmspCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.SPECTATOR);
	}
}
