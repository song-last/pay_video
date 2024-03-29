package com.song.video_pay.utils;

import com.song.video_pay.domain.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * jwt工具类
 */
public class JwtUtils {

  public static final String SUBJECT = "idstudy";

  public static final long EXPIRE = 1000*60*60*24*7;  //过期时间,毫秒,周

  public static final String APPSECRET = "it666";    //密钥
    /**
     * 生成jwt
     * @param user
     * @return
     */
  public static String geneJsonWebToken(User user){

      if(user==null||user.getId()==null||user.getName()==null||user.getHead_img()==null){
          return null;
      }

      String token = Jwts.builder().setSubject(SUBJECT)
              .claim("id", user.getId())
              .claim("name", user.getName())
              .claim("img", user.getHead_img())
              .setIssuedAt(new Date())
              .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
              .signWith(SignatureAlgorithm.HS256, APPSECRET).compact();
      return token;
  }

    /**
     * 校验token
     * @param token
     * @return
     */
  public static Claims checkedJwt(String token){
      //校验失败就会报异常
      try{
          final Claims claims = Jwts.parser().setSigningKey(APPSECRET).
                  parseClaimsJws(token).getBody();
          return claims;
      }catch(Exception e){
          return null;
      }

  }
}
