package  com.lmm.mmyx.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import  com.lmm.mmyx.model.sys.Region;
import  com.lmm.mmyx.sys.mapper.RegionMapper;
import  com.lmm.mmyx.sys.service.RegionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 地区表 服务实现类
 * </p>
 *
 * @author lmm
 * @since 2023-06-08
 */
@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements RegionService {
    //根据区域关键字查询区域列表信息
    @Override
    public List<Region> getRegionByKeyword(String keyword) {
        LambdaQueryWrapper<Region> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(Region::getName,keyword);
        List<Region> list = baseMapper.selectList(wrapper);
        return list;
    }
}
