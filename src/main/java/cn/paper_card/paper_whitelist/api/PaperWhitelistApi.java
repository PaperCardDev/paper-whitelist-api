package cn.paper_card.paper_whitelist.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface PaperWhitelistApi {
    @NotNull WhitelistService getWhitelistService();

    @NotNull WhitelistCodeService getWhitelistCodeService();
}
