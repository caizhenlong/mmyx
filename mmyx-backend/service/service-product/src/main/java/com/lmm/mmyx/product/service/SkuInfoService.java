package  com.lmm.mmyx.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import  com.lmm.mmyx.model.product.SkuInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import  com.lmm.mmyx.vo.product.SkuInfoQueryVo;
import  com.lmm.mmyx.vo.product.SkuInfoVo;
import  com.lmm.mmyx.vo.product.SkuStockLockVo;

import java.util.List;

/**
 * <p>
 * sku信息 服务类
 * </p>
 *
 * @author lmm
 * @since 2023-06-08
 */
public interface SkuInfoService extends IService<SkuInfo> {
    //sku列表
    IPage<SkuInfo> selectPageSkuInfo(Page<SkuInfo> pageParam, SkuInfoQueryVo skuInfoQueryVo);

    //添加商品sku信息
    void saveSkuInfo(SkuInfoVo skuInfoVo);

    //获取sku信息
    SkuInfoVo getSkuInfo(Long id);

    //修改sku
    void updateSkuInfo(SkuInfoVo skuInfoVo);

    //商品审核
    void check(Long skuId, Integer status);

    //商品上下架
    void publish(Long skuId, Integer status);

    //新人专享
    void isNewPerson(Long skuId, Integer status);
    //根据skuId列表得到sku信息列表
    List<SkuInfo> findSkuInfoList(List<Long> skuIdList);

    //根据关键字匹配sku列表
    List<SkuInfo> findSkuInfoByKeyword(String keyword);

    //获取新人专享商品
    List<SkuInfo> findNewPersonSkuInfoList();

    //根据skuId获取sku信息
    SkuInfoVo getSkuInfoVo(Long skuId);

    //验证和锁定库存
    Boolean checkAndLock(List<SkuStockLockVo> skuStockLockVoList, String orderNo);

    //扣减库存成功，更新订单状态
    void minusStock(String orderNo);
}
