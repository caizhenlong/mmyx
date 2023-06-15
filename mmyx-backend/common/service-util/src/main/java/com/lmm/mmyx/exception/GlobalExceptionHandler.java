package  com.lmm.mmyx.exception;


import  com.lmm.mmyx.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//全局异常处理
//AOP 面向切面
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class) //异常处理器
    @ResponseBody  //返回json数据
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail(null);
    }

    //自定义异常处理
    @ExceptionHandler(MmyxException.class)
    @ResponseBody
    public Result error(MmyxException exception) {
        return Result.build(null,exception.getCode(),exception.getMessage());
    }
}
