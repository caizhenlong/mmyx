package  com.lmm.mmyx.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import  com.lmm.mmyx.model.product.SkuAttrValue;

import java.util.List;

/**
 * <p>
 * spu属性值 服务类
 * </p>
 *
 * @author lmm
 * @since 2023-06-08
 */
public interface SkuAttrValueService extends IService<SkuAttrValue> {

    //根据id查询商品属性信息列表
    List<SkuAttrValue> getAttrValueListBySkuId(Long id);
}
