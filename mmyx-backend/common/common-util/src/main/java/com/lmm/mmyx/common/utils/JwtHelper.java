package  com.lmm.mmyx.common.utils;

import io.jsonwebtoken.*;
import org.springframework.util.StringUtils;
import java.util.Date;

public class JwtHelper {

    private static long tokenExpiration = 30*60*1000;
    private static String tokenSignKey = "lmm_mmyx";

    //根据userId+userName生成token字符串
    public static String createToken(Long userId, String userName) {
        String token = Jwts.builder()
                //分组
                .setSubject("mmyx-USER")
                //过期时间
                .setExpiration(new Date(System.currentTimeMillis() + tokenExpiration))
                //私有部分
                .claim("userId", userId)
                .claim("userName", userName)
                //公共部分
                .signWith(SignatureAlgorithm.HS512, tokenSignKey)

                .compressWith(CompressionCodecs.GZIP)
                .compact();
        return token;
    }

    public static Long getUserId(String token) {
        if(StringUtils.isEmpty(token)) return null;

        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        Integer userId = (Integer)claims.get("userId");
        return userId.longValue();
        // return 1L;
    }

    public static String getUserName(String token) {
        if(StringUtils.isEmpty(token)) return "";

        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        return (String)claims.get("userName");
    }

    public static void removeToken(String token) {
        //jwttoken无需删除，客户端扔掉即可。
    }

    public static void main(String[] args) {
        String token = JwtHelper.createToken(1L, "admin");
        System.out.println(token);

        System.out.println(JwtHelper.getUserId(token));
        System.out.println(JwtHelper.getUserName(token));
    }
}
