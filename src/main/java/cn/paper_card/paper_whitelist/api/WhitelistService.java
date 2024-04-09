package cn.paper_card.paper_whitelist.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface WhitelistService {

    /**
     * 添加白名单
     *
     * @throws Exception 如果已经添加了白名单，抛出AlreadyWhitelistedException；其他异常代表其他错误
     */
    void add(@NotNull WhitelistInfo whitelistInfo) throws Exception;

    /**
     * 删除白名单
     *
     * @param userId 用户ID
     * @return 删除成功返回true，没有数据被删除返回false
     * @throws Exception 删除失败抛出异常
     */
    boolean remove(@NotNull UUID userId) throws Exception;

    /**
     * 根据用户ID查询白名单
     *
     * @param userId 用户ID
     * @return 白名单信息，没有返回null
     * @throws Exception 查询失败抛出异常
     */
    @Nullable WhitelistInfo query(@NotNull UUID userId) throws Exception;
}
