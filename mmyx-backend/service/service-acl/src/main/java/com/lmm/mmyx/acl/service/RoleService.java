package  com.lmm.mmyx.acl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import  com.lmm.mmyx.model.acl.Role;
import  com.lmm.mmyx.vo.acl.RoleQueryVo;

import java.util.Map;

/**
 * @author caizhenlong
 * @create 2023/6/8
 */
public interface RoleService extends IService<Role> {

    //角色条件分页查询
    IPage<Role> selectRolePage(Page<Role> pageParam, RoleQueryVo roleQueryVo);

    //获取所有角色，和根据用户id查询用户分配角色列表
    Map<String, Object> getRoleByAdminId(Long adminId);

    //为用户进行分配
    void saveAdminRole(Long adminId, Long[] roleIds);
}
