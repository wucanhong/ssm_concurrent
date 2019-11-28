package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

import java.util.List;

/**
 * @ClassName SeckillService
 * @Author 吴灿洪
 * @Description
 * @Date 2019/11/27 8:53
 * @Version 1.0
 */
public interface SeckillService {

    /**
     * 查询所有秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开始时，输出秒杀接口的URL
     * 否则输出秒杀开始时间和系统时间
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀接口
     * 可能会抛出异常，区分常见异常
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillException, RepeatKillException, SeckillCloseException;
}
