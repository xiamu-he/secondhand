package com.qzx.secondhand.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * @author qzx
 * @create 2021-10-22 21:14
 * @function
 */

public class JwtUtils {
    /**
     * 过期时间为一天
     * TODO 正式上线更换为1天
     */
    private static final long EXPIRE_TIME = 24 * 60 * 60 * 1000;

    /**
     * token私钥
     */
    private static final String TOKEN_SECRET = "qzx-jwt-secondhand";

    /**
     * 生成token
     * @param roleId //传入payload
     * @return 返回token
     */
//    public static String getToken(Long roleId){
//        JWTCreator.Builder builder = JWT.create();
//        builder.withClaim("roleId",roleId);
//        builder.withExpiresAt(new Date(System.currentTimeMillis() + EXPIRE_TIME));//设置过期时间
//        return builder.sign(Algorithm.HMAC256(TOKEN_SECRET)).toString();//设置加密算法返回Token
//    }

    public static String getToken(Long roleId){
        JWTCreator.Builder builder = JWT.create();
        builder.withClaim("roleId",roleId);
        builder.withExpiresAt(new Date(System.currentTimeMillis() +EXPIRE_TIME));//设置过期时间
        return builder.sign(Algorithm.HMAC256(TOKEN_SECRET)).toString();//设置加密算法返回Token
    }

    /**
     * 验证token
     * @param token
     * @return
     */
//    public static Long verifyRoleId(String token){
//        Long roleId =null;
//        try {
//            DecodedJWT verify = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).build().verify(token);
//            return verify.getClaim("roleId").asLong();
//        }
//        catch (Exception ignored) {
////            throw new UserDefinedException("token 错误");
//        }
//        return roleId;
//    }

    public static String verity(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            verifier.verify(token);
            return JWT.decode(token).getAudience().get(0);
        } catch (Exception ignored) {
        }
        return null;
    }


    public static Long verityUser(String token) {
        Long roleId =null;
        try {
            DecodedJWT verify = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).build().verify(token);
            return verify.getClaim("roleId").asLong();
        }
        catch (Exception ignored) {
//            throw new UserDefinedException("token 错误");
        }
        return roleId;
    }
}
