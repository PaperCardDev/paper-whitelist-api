package cn.paper_card.paper_whitelist.api;

import java.util.UUID;

public record WhitelistCodeInfo(
        int code,
        UUID id,
        String name,
        long createTime,
        long expires
) {
}
