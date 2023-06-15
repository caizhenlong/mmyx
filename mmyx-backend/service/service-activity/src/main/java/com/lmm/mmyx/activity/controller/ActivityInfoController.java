package  com.lmm.mmyx.activity.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import  com.lmm.mmyx.activity.service.ActivityInfoService;
import  com.lmm.mmyx.model.activity.ActivityInfo;
import  com.lmm.mmyx.model.product.SkuInfo;
import  com.lmm.mmyx.result.Result;
import  com.lmm.mmyx.vo.activity.ActivityRuleVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 活动表 前端控制器
 * </p>
 *
 * @author lmm
 * @since 2023-06-09
 */
@Api(value = "活动控制器")
@RestController
@RequestMapping("/admin/activity/activityInfo")
////@CrossOrigin
public class ActivityInfoController {

    @Autowired
    private ActivityInfoService activityInfoService;


    @ApiOperation("活动列表")
    @GetMapping("{page}/{limit}")
    public Result list(@PathVariable Long page,
                       @PathVariable Long limit) {
        Page<ActivityInfo> pageParam = new Page<>(page, limit);
        IPage<ActivityInfo> pageModel =
                activityInfoService.selectPage(pageParam);
        return Result.ok(pageModel);
    }

    @ApiOperation("根据id获取活动信息")
    @GetMapping("get/{id}")
    public Result get(@PathVariable Long id) {
        ActivityInfo activityInfo = activityInfoService.getById(id);
        activityInfo.setActivityTypeString(activityInfo.getActivityType().getComment());
        return Result.ok(activityInfo);
    }

    @ApiOperation("添加活动")
    @PostMapping("save")
    public Result save(@RequestBody ActivityInfo activityInfo) {
        activityInfoService.save(activityInfo);
        return Result.ok(null);
    }

    @ApiOperation("根据活动id获取活动规则数据")
    @GetMapping("findActivityRuleList/{id}")
    public Result findActivityRuleList(@PathVariable Long id) {
        Map<String, Object> activityRuleMap =
                activityInfoService.findActivityRuleList(id);
        return Result.ok(activityRuleMap);
    }

    @ApiOperation("在活动里面添加规则数据")
    @PostMapping("saveActivityRule")
    public Result saveActivityRule(@RequestBody ActivityRuleVo activityRuleVo) {
        activityInfoService.saveActivityRule(activityRuleVo);
        return Result.ok(null);
    }

    @ApiOperation("根据关键字查询匹配sku信息")
    @GetMapping("findSkuInfoByKeyword/{keyword}")
    public Result findSkuInfoByKeyword(@PathVariable("keyword") String keyword) {
        List<SkuInfo> list =
                activityInfoService.findSkuInfoByKeyword(keyword);
        return Result.ok(list);
    }

}

