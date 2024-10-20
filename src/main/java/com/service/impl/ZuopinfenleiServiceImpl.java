package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuopinfenleiDao;
import com.entity.ZuopinfenleiEntity;
import com.service.ZuopinfenleiService;
import com.entity.vo.ZuopinfenleiVO;
import com.entity.view.ZuopinfenleiView;

@Service("zuopinfenleiService")
public class ZuopinfenleiServiceImpl extends ServiceImpl<ZuopinfenleiDao, ZuopinfenleiEntity> implements ZuopinfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuopinfenleiEntity> page = this.selectPage(
                new Query<ZuopinfenleiEntity>(params).getPage(),
                new EntityWrapper<ZuopinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuopinfenleiEntity> wrapper) {
		  Page<ZuopinfenleiView> page =new Query<ZuopinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuopinfenleiVO> selectListVO(Wrapper<ZuopinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuopinfenleiVO selectVO(Wrapper<ZuopinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuopinfenleiView> selectListView(Wrapper<ZuopinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuopinfenleiView selectView(Wrapper<ZuopinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
