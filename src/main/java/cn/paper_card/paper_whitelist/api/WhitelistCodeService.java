package cn.paper_card.paper_whitelist.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface WhitelistCodeService {

    /**
     * 生成验证码，如果同一个人重新创建，则旧的验证码立即失效
     */
    @NotNull WhitelistCodeInfo create(@NotNull UUID id, @NotNull String name) throws Exception;

    /**
     * 根据验证码取出信息
     */
    @Nullable WhitelistCodeInfo take(int code) throws Exception;

    /**
     * 根据用户ID查询
     */
    @Nullable WhitelistCodeInfo query(@NotNull UUID id) throws Exception;

    /**
     * 清理过期的验证码
     *
     * @return 删除的验证码个数
     */
    int deleteExpires() throws Exception;
}