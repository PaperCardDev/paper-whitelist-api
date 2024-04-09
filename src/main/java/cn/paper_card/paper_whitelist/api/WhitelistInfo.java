package cn.paper_card.paper_whitelist.api;

import java.util.UUID;

public record WhitelistInfo(

        // 玩家名
        String name,

        // 玩家UUID
        UUID userId,

        // 备注
        String remark,

        // 秒级时间戳
        long createTime
) {
}
