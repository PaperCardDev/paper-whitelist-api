package cn.paper_card.paper_whitelist.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class AlreadyWhitelistedException extends Exception {
    private final @NotNull WhitelistInfo whitelistInfo;

    public AlreadyWhitelistedException(@NotNull WhitelistInfo info, @NotNull String message) {
        super(message);
        this.whitelistInfo = info;
    }

    public @NotNull WhitelistInfo getWhitelistInfo() {
        return this.whitelistInfo;
    }
}
