package dev.wuason.storagemechanic.storages.config;

import java.util.ArrayList;

public class StorageSoundConfig {
    private String id;
    private String sound;
    private ArrayList<Integer> pages;
    private ArrayList<Integer> slots;
    private type type;

    public StorageSoundConfig(String id, String sound, ArrayList<Integer> pages, StorageSoundConfig.type type,ArrayList<Integer> slots) {
        this.id = id;
        this.sound = sound;
        this.pages = pages;
        this.type = type;
        this.slots = slots;
    }

    public String getId() {
        return id;
    }

    public String getSound() {
        return sound;
    }

    public ArrayList<Integer> getPages() {
        return pages;
    }

    public ArrayList<Integer> getSlots() {
        return slots;
    }

    public StorageSoundConfig.type getType() {
        return type;
    }

    public enum type {
        OPEN,
        CLOSE,
        CLICK

    }
}

