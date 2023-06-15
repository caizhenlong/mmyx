package  com.lmm.mmyx.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.lmm.mmyx.model.product.SkuPoster;

import java.util.List;

/**
 * <p>
 * 商品海报表 服务类
 * </p>
 *
 * @author lmm
 * @since 2023-06-08
 */
public interface SkuPosterService extends IService<SkuPoster> {

    //根据id查询商品海报列表
    List<SkuPoster> getPosterListBySkuId(Long id);
}
