package net.xsn.framework.security.cache;

import cn.hutool.core.collection.ListUtil;
import lombok.AllArgsConstructor;
import net.xsn.framework.common.cache.RedisCache;
import net.xsn.framework.common.cache.RedisKeys;
import net.xsn.framework.security.properties.SecurityProperties;
import net.xsn.framework.security.user.UserDetail;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * 认证 Cache
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Component
@AllArgsConstructor
public class TokenStoreCache {
    private final RedisCache redisCache;
    private final SecurityProperties securityProperties;

    public void saveUser(String accessToken, UserDetail user) {
        String key = RedisKeys.getAccessTokenKey(accessToken);
        redisCache.set(key, user, securityProperties.getAccessTokenExpire());
    }

    public void saveUser(String accessToken, UserDetail user, long expire) {
        String key = RedisKeys.getAccessTokenKey(accessToken);
        redisCache.set(key, user, expire);
    }

    public Long getExpire(String accessToken) {
        String key = RedisKeys.getAccessTokenKey(accessToken);

        return redisCache.getExpire(key);
    }

    public UserDetail getUser(String accessToken) {
        String key = RedisKeys.getAccessTokenKey(accessToken);
        return (UserDetail) redisCache.get(key);
    }

    public void deleteUser(String accessToken) {
        String key = RedisKeys.getAccessTokenKey(accessToken);
        redisCache.delete(key);
    }

    public List<String> getUserKeyList() {
        String pattern = RedisKeys.getAccessTokenKey("*");
        Set<String> sets = redisCache.keys(pattern);

        return ListUtil.toList(sets);
    }
}