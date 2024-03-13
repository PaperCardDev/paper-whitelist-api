package cn.paper_card.paper_whitelist.api;

import java.util.UUID;

public record WhitelistInfo(
        UUID userId,
        String remark,
        long createTime
) {
}
