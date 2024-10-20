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


import com.dao.ZuopinxinxiDao;
import com.entity.ZuopinxinxiEntity;
import com.service.ZuopinxinxiService;
import com.entity.vo.ZuopinxinxiVO;
import com.entity.view.ZuopinxinxiView;

@Service("zuopinxinxiService")
public class ZuopinxinxiServiceImpl extends ServiceImpl<ZuopinxinxiDao, ZuopinxinxiEntity> implements ZuopinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuopinxinxiEntity> page = this.selectPage(
                new Query<ZuopinxinxiEntity>(params).getPage(),
                new EntityWrapper<ZuopinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuopinxinxiEntity> wrapper) {
		  Page<ZuopinxinxiView> page =new Query<ZuopinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuopinxinxiVO> selectListVO(Wrapper<ZuopinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuopinxinxiVO selectVO(Wrapper<ZuopinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuopinxinxiView> selectListView(Wrapper<ZuopinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuopinxinxiView selectView(Wrapper<ZuopinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
