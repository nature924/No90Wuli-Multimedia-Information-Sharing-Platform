package com.dao;

import com.entity.DiscusszuopinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszuopinxinxiVO;
import com.entity.view.DiscusszuopinxinxiView;


/**
 * 作品信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-31 14:50:08
 */
public interface DiscusszuopinxinxiDao extends BaseMapper<DiscusszuopinxinxiEntity> {
	
	List<DiscusszuopinxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusszuopinxinxiEntity> wrapper);
	
	DiscusszuopinxinxiVO selectVO(@Param("ew") Wrapper<DiscusszuopinxinxiEntity> wrapper);
	
	List<DiscusszuopinxinxiView> selectListView(@Param("ew") Wrapper<DiscusszuopinxinxiEntity> wrapper);

	List<DiscusszuopinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszuopinxinxiEntity> wrapper);
	
	DiscusszuopinxinxiView selectView(@Param("ew") Wrapper<DiscusszuopinxinxiEntity> wrapper);
	

}
