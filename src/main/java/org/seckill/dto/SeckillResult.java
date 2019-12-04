package org.seckill.dto;

/**
 * @ClassName SeckillResult
 * @Author 吴灿洪
 * @Description
 * @Date 2019/11/28 15:17
 * @Version 1.0
 */
public class SeckillResult<T> {

    private boolean success; //执行结果
    private T data; //返回数据对象
    private String error; //信息

    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

