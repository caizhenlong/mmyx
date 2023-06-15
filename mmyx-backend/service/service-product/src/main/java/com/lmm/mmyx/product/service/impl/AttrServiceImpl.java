package  com.lmm.mmyx.product.service.impl;



import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import  com.lmm.mmyx.model.product.Attr;
import  com.lmm.mmyx.product.mapper.AttrMapper;
import  com.lmm.mmyx.product.service.AttrService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品属性 服务实现类
 * </p>
 *
 * @author lmm
 * @since 2023-06-08
 */
@Service
public class AttrServiceImpl extends ServiceImpl<AttrMapper, Attr> implements AttrService {

    //根据平台属性分组id查询
    @Override
    public List<Attr> getAttrListByGroupId(Long groupId) {
        LambdaQueryWrapper<Attr> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Attr::getAttrGroupId,groupId);
        List<Attr> list = baseMapper.selectList(wrapper);
        return list;
    }
}
