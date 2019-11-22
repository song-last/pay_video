package com.song.video_pay.mapper;

import com.song.video_pay.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    /**
     * 根据主键id查找
     * @param userId
     * @return
     */
    @Select("select * from user where id = #{id}")
    User findByid(@Param("id") int userId);

    /**
     * 根据openid找用户
     * @param openid
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User findByopenid(@Param("openid") String openid);


    /**
     * 保存用户新
     * @param user
     * @return
     */
    @Insert("INSERT INTO `user` ( `openid`, `name`, `head_img`, `phone`, `sign`, `sex`, `city`, `create_time`)" +
            "VALUES" +
            "(#{openid},#{name},#{head_img},#{phone},#{sign},#{sex},#{city},#{create_time});")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int save(User user);
}
