package org.seckill.dto;

/**
 * @Description 暴露秒杀地址DTO
 * @Date 2019/11/27 10:16
 */
public class Exposer {

    //是否开启秒杀
    private boolean exposed;
    //加密
    private String md5;

    //id
    private long seckillId;

    //系统当前时间
    private long now;
    //开启时间
    private long start;
    //结束时间
    private long end;

    //秒杀商品不存在，返回false和秒杀商品id
    public Exposer(boolean exposed, long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    //秒杀未开启或者秒杀时间不对等原因
    public Exposer(boolean exposed, long seckillId, long now, long start, long end) {
        this.exposed = exposed;
        this.seckillId = seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
    }

    //秒杀开始时，系统时间符合，则暴露md5加密的秒杀接口
    public Exposer(boolean exposed, String md5, long seckillId) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public boolean isExposed() {
        return exposed;
    }

    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }
}
