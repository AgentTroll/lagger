package com.gmail.woodyc40.lagger.module;

import com.gmail.woodyc40.lagger.*;

public class NmsModule_v1_13_R01 extends NmsModule {
    @Override
    ChunkCompat provideChunkCompat() {
        return new ChunkCompat113R01();
    }

    @Override
    PacketSniffer providePacketSniffer(Lagger plugin) {
        return new PacketSniffer113R01(plugin);
    }

    @Override
    SkullCompat provideSkullCompat() {
        return new SkullCompat113R01();
    }

    @Override
    SetSlotCompat provideSetSlotCompat() {
        return new SetSlotCompat113R01();
    }
}
