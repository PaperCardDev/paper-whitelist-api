package cn.paper_card.paper_whitelist.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public interface PaperWhitelistApi {
    @NotNull WhitelistService getWhitelistService();

    void onPreLoginCheck(@NotNull Object event, @Nullable Object suffix);
}
