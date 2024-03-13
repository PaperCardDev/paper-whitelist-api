package cn.paper_card.paper_whitelist.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface WhitelistCodeService {

    /**
     * 生成验证码，如果同一个人重新创建，则旧的验证码立即失效
     */
    int create(@NotNull UUID id, @NotNull String name) throws Exception;

    /**
     * 根据验证码取出信息
     */
    @Nullable WhitelistCodeInfo take(int code) throws Exception;

    /**
     * 判断验证码是否已经过期
     */
    boolean isOutdated(@NotNull WhitelistCodeInfo info);
}
