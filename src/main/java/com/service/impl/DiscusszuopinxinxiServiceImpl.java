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


import com.dao.DiscusszuopinxinxiDao;
import com.entity.DiscusszuopinxinxiEntity;
import com.service.DiscusszuopinxinxiService;
import com.entity.vo.DiscusszuopinxinxiVO;
import com.entity.view.DiscusszuopinxinxiView;

@Service("discusszuopinxinxiService")
public class DiscusszuopinxinxiServiceImpl extends ServiceImpl<DiscusszuopinxinxiDao, DiscusszuopinxinxiEntity> implements DiscusszuopinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszuopinxinxiEntity> page = this.selectPage(
                new Query<DiscusszuopinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszuopinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszuopinxinxiEntity> wrapper) {
		  Page<DiscusszuopinxinxiView> page =new Query<DiscusszuopinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszuopinxinxiVO> selectListVO(Wrapper<DiscusszuopinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszuopinxinxiVO selectVO(Wrapper<DiscusszuopinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszuopinxinxiView> selectListView(Wrapper<DiscusszuopinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszuopinxinxiView selectView(Wrapper<DiscusszuopinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
