package  com.lmm.mmyx.acl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import  com.lmm.mmyx.acl.service.RoleService;
import  com.lmm.mmyx.model.acl.Role;
import  com.lmm.mmyx.result.Result;
import  com.lmm.mmyx.vo.acl.RoleQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "角色接口")
@RestController
@RequestMapping("/admin/acl/role")
////@CrossOrigin //跨域
public class RoleController {

    //注入service
    @Autowired
    private RoleService roleService;

    @ApiOperation("角色条件分页查询")
    @GetMapping("{current}/{limit}")
    public Result pageList(@ApiParam("当前页") @PathVariable Long current,
                           @ApiParam("每页显示记录数") @PathVariable Long limit,
                           RoleQueryVo roleQueryVo) {
        //创建page对象，传递当前页和每页记录数
        Page<Role> pageParam = new Page<>(current, limit);

        //调用service方法实现条件分页查询，返回分页对象
        IPage<Role> pageModel = roleService.selectRolePage(pageParam, roleQueryVo);
        return Result.ok(pageModel);
    }

    @ApiOperation("根据id查询角色")
    @GetMapping("get/{id}")
    public Result get(@PathVariable Long id) {
        Role role = roleService.getById(id);
        return Result.ok(role);
    }

    @ApiOperation("添加角色")
    @PostMapping("save")
    public Result save(@RequestBody Role role) {
        boolean is_success = roleService.save(role);
        if (is_success) {
            return Result.ok(null);
        } else {
            return Result.fail(null);
        }
    }

    @ApiOperation("修改角色")
    @PutMapping("update")
    public Result update(@RequestBody Role role) {
        roleService.updateById(role);
        return Result.ok(null);
    }

    @ApiOperation("根据id删除角色")
    @DeleteMapping("remove/{id}")
    public Result remove(@PathVariable Long id) {
        roleService.removeById(id);
        return Result.ok(null);
    }

    // json数组[1,2,3]  --- java的list集合
    @ApiOperation("批量删除角色")
    @DeleteMapping("batchRemove")
    public Result batchRemove(@RequestBody List<Long> idList) {
        roleService.removeByIds(idList);
        return Result.ok(null);
    }

}
