package cn.paper_card.paper_whitelist.api;

import java.util.UUID;

/**
 * 白名单信息
 *
 * @param name       玩家名称
 * @param userId     玩家UUID
 * @param remark     备注信息
 * @param createTime 添加时间，秒级时间戳
 */
public record WhitelistInfo(
        String name,

        // 玩家UUID
        UUID userId,

        // 备注
        String remark,

        // 秒级时间戳
        long createTime
) {
}
