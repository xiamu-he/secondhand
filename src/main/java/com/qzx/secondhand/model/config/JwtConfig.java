package com.qzx.secondhand.model.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author qzx
 * @create 2021-11-29 15:43
 * @function
 */
@Data
@ConfigurationProperties(prefix = "user.token")
public class JwtConfig {
    private Long expireTime;
}
