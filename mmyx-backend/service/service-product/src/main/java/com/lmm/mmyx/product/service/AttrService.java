package  com.lmm.mmyx.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.lmm.mmyx.model.product.Attr;

import java.util.List;

/**
 * <p>
 * 商品属性 服务类
 * </p>
 *
 * @author lmm
 * @since 2023-06-08
 */
public interface AttrService extends IService<Attr> {

    //根据平台属性分组id查询
    List<Attr> getAttrListByGroupId(Long groupId);
}

