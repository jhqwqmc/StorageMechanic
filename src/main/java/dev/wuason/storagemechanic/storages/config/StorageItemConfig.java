package dev.wuason.storagemechanic.storages.config;

import dev.wuason.mechanics.Mechanics;
import dev.wuason.mechanics.compatibilities.adapter.Adapter;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class StorageItemConfig {
    private String id;
    private String amount;
    private Map<Integer, Set<Integer>> pagesToSlots;
    private Set<String> itemsList;
    private float chance;
    private ItemStack[] items;

    public StorageItemConfig(String id, String amount, List<Integer> slots, List<Integer> pages, List<String> itemsList, float chance) {
        this.id = id;
        this.amount = amount;
        this.itemsList = new HashSet<>(itemsList);
        this.chance = chance;
        this.pagesToSlots = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>(slots);
        //BUILD ITEMS
        items = new ItemStack[itemsList.size()];
        for(int i=0;i<itemsList.size();i++){
            items[i] = Adapter.getInstance().getItemStack(itemsList.get(i));
        }
        for(Integer i : pages){
            pagesToSlots.put(i,hashSet);
        }
    }

    public String getId() {
        return id;
    }

    public String getAmount() {
        return amount;
    }

    public Map<Integer, Set<Integer>> getPagesToSlots() {
        return pagesToSlots;
    }

    public Set<String> getItemsList() {
        return itemsList;
    }

    public ItemStack[] getItems() {
        return items;
    }

    public float getChance() {
        return chance;
    }


}
