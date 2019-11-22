package com.song.video_pay.mapper;

import com.song.video_pay.domain.Video_order;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 订单dao层
 */
//@Mapper
public interface VideoOrderMapper {

    /**
     * 保存订单，返回包含主键
     * @param videoOrder
     * @return
     */
    @Insert("INSERT INTO `video_order` (`openid`, `out_trade_no`, `state`, `create_time`," +
            " `notify_time`, `total_fee`, `nickname`, `head_img`, `video_id`, `video_title`," +
            " `video_img`, `user_id`, `ip`, `del`)" +
            "VALUES" +
            "(#{openid},#{out_trade_no},#{state},#{create_time},#{notify_time},#{total_fee}," +
            "#{nickname},#{head_img},#{video_id},#{video_title},#{video_img},#{user_id},#{ip},#{del});")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insert(Video_order videoOrder);


    /**
     * 根据主键查找订单
     * @param id
     * @return
     */
    @Select("select * from video_order where id=#{order_id} and del=0")
    Video_order findById(@Param("order_id") int id);


    /**
     * 根据交易订单号获取订单对象
     * @param outTradeNo
     * @return
     */
    @Select("select * from video_order where out_trade_no=#{out_trade_no} and del=0")
    Video_order findByOutTradeNo(@Param("out_trade_no") String outTradeNo);


    /**
     * 逻辑删除订单
     * @param id
     * @param userId
     * @return
     */
    @Update("update video_order set del=0 where id=#{id} and user_id =#{userId}")
    int del(@Param("id") int id, @Param("userId") int userId);


    /**
     * 查找我的全部订单
     * @param userId
     * @return
     */
    @Select("select * from video_order where user_id =#{userId}")
    List<Video_order> findMyOrderList(int userId);


    /**
     * 根据订单流水号更新
     * @param videoOrder
     * @return
     */
    @Update("update video_order set state=#{state}, notify_time=#{notify_time}, openid=#{openid}" +
            " where out_trade_no=#{out_trade_no} and state=0 and del=0")
    int updateVideoOderByOutTradeNo(Video_order videoOrder);

}