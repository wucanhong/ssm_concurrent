package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * @ClassName SeckillDao
 * @Author 吴灿洪
 * @Description
 * @Date 2019/11/26 15:04
 * @Version 1.0
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1，即更新了，
     */
    int reduceNumber(@Param("seckillId")long seckillId, @Param("killTime")Date killTime);

    /**
     * 根据id查秒杀对象
     * @param seckillId
     * @return 查询的值
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return 查询的值（数组）
     */
    List<Seckill> queryAll(@Param("offset")int offset, @Param("limit")int limit);

    
}
