package me.mrdaniel.adventuremmo.catalogtypes.abilities.abilities;

import org.spongepowered.api.entity.living.player.Player;

import me.mrdaniel.adventuremmo.catalogtypes.abilities.ActiveAbility;

public class Slaughter extends ActiveAbility {

	public Slaughter() {
		super("Slaughter", "slaughter", 5.0, 0.08);
	}

	@Override
	protected void activate(final Player p) {
		
	}

	@Override
	protected void deactivate(final Player p) {
		
	}
}