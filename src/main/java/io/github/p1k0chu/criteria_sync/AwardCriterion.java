package io.github.p1k0chu.criteria_sync;

import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.server.level.ServerPlayer;

public interface AwardCriterion {
    /// trimmed down version of award. doesn't send message in chat,
    /// but main reason is to avoid unnecessary recursion
    void criteria_sync$awardSynced(AdvancementHolder adv, String criterion);
}
