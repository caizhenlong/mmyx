package  com.lmm.mmyx.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.lmm.mmyx.model.product.SkuImage;

import java.util.List;

/**
 * <p>
 * 商品图片 服务类
 * </p>
 *
 * @author lmm
 * @since 2023-06-08
 */
public interface SkuImageService extends IService<SkuImage> {

    //根据id查询商品图片列表
    List<SkuImage> getImageListBySkuId(Long id);
}
