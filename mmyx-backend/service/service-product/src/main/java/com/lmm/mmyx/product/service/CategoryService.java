package  com.lmm.mmyx.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import  com.lmm.mmyx.model.product.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import  com.lmm.mmyx.vo.product.CategoryQueryVo;

/**
 * <p>
 * 商品三级分类 服务类
 * </p>
 *
 * @author lmm
 * @since 2023-06-08
 */
public interface CategoryService extends IService<Category> {

    //商品分类列表
    IPage<Category> selectPageCategory(Page<Category> pageParam, CategoryQueryVo categoryQueryVo);
}

