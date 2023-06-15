package com.lmm.mmyx.home.controller;


import com.lmm.mmyx.client.product.ProductFeignClient;
import com.lmm.mmyx.model.product.Category;
import com.lmm.mmyx.result.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "商品分类")
@RestController
@RequestMapping("api/home")
public class CategoryApiController {

    @Autowired
    private ProductFeignClient productFeignClient;

    //查询所有分类
    @GetMapping("category")
    public Result categoryList() {
        List<Category> categoryList = productFeignClient.findAllCategoryList();
        return Result.ok(categoryList);
    }
}
