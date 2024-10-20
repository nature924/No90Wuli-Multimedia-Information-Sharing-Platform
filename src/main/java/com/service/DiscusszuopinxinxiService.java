package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszuopinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszuopinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszuopinxinxiView;


/**
 * 作品信息评论表
 *
 * @author 
 * @email 
 * @date 2023-03-31 14:50:08
 */
public interface DiscusszuopinxinxiService extends IService<DiscusszuopinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszuopinxinxiVO> selectListVO(Wrapper<DiscusszuopinxinxiEntity> wrapper);
   	
   	DiscusszuopinxinxiVO selectVO(@Param("ew") Wrapper<DiscusszuopinxinxiEntity> wrapper);
   	
   	List<DiscusszuopinxinxiView> selectListView(Wrapper<DiscusszuopinxinxiEntity> wrapper);
   	
   	DiscusszuopinxinxiView selectView(@Param("ew") Wrapper<DiscusszuopinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszuopinxinxiEntity> wrapper);
   	

}

