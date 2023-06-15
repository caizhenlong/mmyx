package  com.lmm.mmyx.sys.controller;


import  com.lmm.mmyx.model.sys.Ware;
import  com.lmm.mmyx.result.Result;
import  com.lmm.mmyx.sys.service.WareService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 仓库表 前端控制器
 * </p>
 *
 * @author lmm
 * @since 2023-06-08
 */
@RestController
@RequestMapping("/admin/sys/ware")
////@CrossOrigin
public class WareController {

    @Autowired
    private WareService wareService;

    @ApiOperation("查询所有仓库列表")
    @GetMapping("findAllList")
    public Result findAllList() {
        List<Ware> list = wareService.list();
        return Result.ok(list);
    }
}


