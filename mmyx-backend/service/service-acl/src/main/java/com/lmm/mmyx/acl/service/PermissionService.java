package  com.lmm.mmyx.acl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.lmm.mmyx.model.acl.Permission;

import java.util.List;

public interface PermissionService extends IService<Permission> {

    //查询所有菜单
    List<Permission> queryAllPermission();

    //递归删除菜单
    void removeChildById(Long id);
}
