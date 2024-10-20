package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuopinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuopinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuopinxinxiView;


/**
 * 作品信息
 *
 * @author 
 * @email 
 * @date 2023-03-31 14:50:08
 */
public interface ZuopinxinxiService extends IService<ZuopinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuopinxinxiVO> selectListVO(Wrapper<ZuopinxinxiEntity> wrapper);
   	
   	ZuopinxinxiVO selectVO(@Param("ew") Wrapper<ZuopinxinxiEntity> wrapper);
   	
   	List<ZuopinxinxiView> selectListView(Wrapper<ZuopinxinxiEntity> wrapper);
   	
   	ZuopinxinxiView selectView(@Param("ew") Wrapper<ZuopinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuopinxinxiEntity> wrapper);
   	

}

