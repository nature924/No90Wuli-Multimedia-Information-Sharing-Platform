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


import com.dao.SiliaoxinxiDao;
import com.entity.SiliaoxinxiEntity;
import com.service.SiliaoxinxiService;
import com.entity.vo.SiliaoxinxiVO;
import com.entity.view.SiliaoxinxiView;

@Service("siliaoxinxiService")
public class SiliaoxinxiServiceImpl extends ServiceImpl<SiliaoxinxiDao, SiliaoxinxiEntity> implements SiliaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SiliaoxinxiEntity> page = this.selectPage(
                new Query<SiliaoxinxiEntity>(params).getPage(),
                new EntityWrapper<SiliaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SiliaoxinxiEntity> wrapper) {
		  Page<SiliaoxinxiView> page =new Query<SiliaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SiliaoxinxiVO> selectListVO(Wrapper<SiliaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SiliaoxinxiVO selectVO(Wrapper<SiliaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SiliaoxinxiView> selectListView(Wrapper<SiliaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SiliaoxinxiView selectView(Wrapper<SiliaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
