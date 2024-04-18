package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * 类描述
 *
 * @author top
 * @date 2024/4/13 16:18
 */
@Mapper
public interface UserMapper {

    /**
     * 根据openid查询用户
     * @param openid
     * @return
     */
    @Select("select * from user where openid=#{openid}")
    User getByOpenId(String openid);

    /**
     * 创建新用户
     * @param user
     */
    void insert(User user);

    @Select("select * from user where id=#{userID}")
    User getById(Long userId);

    /**
     * 动态查询用户新增数量
     * @param map
     * @return
     */
    Integer getUserNum(Map map);
}
