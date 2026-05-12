package com.icegamer7810.satiscraftory;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(SatiscraftoryMod.MOD_ID)
public final class SatiscraftoryMod {
    public static final String MOD_ID = "satiscraftory";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SatiscraftoryMod(IEventBus modEventBus, ModContainer modContainer) {
    }
}

