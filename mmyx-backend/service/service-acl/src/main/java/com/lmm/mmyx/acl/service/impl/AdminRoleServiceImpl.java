package  com.lmm.mmyx.acl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import  com.lmm.mmyx.acl.mapper.AdminRoleMapper;
import  com.lmm.mmyx.acl.service.AdminRoleService;
import  com.lmm.mmyx.model.acl.AdminRole;
import org.springframework.stereotype.Service;

@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements AdminRoleService {
}
