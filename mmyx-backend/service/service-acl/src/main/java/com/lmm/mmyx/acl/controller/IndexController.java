package  com.lmm.mmyx.acl.controller;

import  com.lmm.mmyx.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

/**
 * @author caizhenlong
 * @create 2023/6/8
 */
@Api(tags = "登录接口")
@RestController
@RequestMapping("/admin/acl/index")
////@CrossOrigin
public class IndexController {

    @ApiOperation("登录")
    @PostMapping("/login")
    public Result login(){
        Map<String,String> map = new HashMap<>();
        map.put("token","token-admin");
        return Result.ok(map);
    }


    @ApiOperation("获取用户信息")
    @GetMapping("/info")
    public Result info(){
        Map<String,String> map = new HashMap<>();
        map.put("name","admin");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }

    @ApiOperation("退出")
    @PostMapping("/logout")
    public Result logout(){
        return Result.ok(null);
    }



}
