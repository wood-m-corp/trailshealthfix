package io.izzel.arclight.common.bridge.core.item.crafting;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.Recipe;

public interface RecipeBridge {

    Recipe bridge$toBukkitRecipe(NamespacedKey id);
}
