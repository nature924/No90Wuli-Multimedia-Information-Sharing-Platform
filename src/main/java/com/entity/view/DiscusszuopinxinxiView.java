package com.entity.view;

import com.entity.DiscusszuopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作品信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-31 14:50:08
 */
@TableName("discusszuopinxinxi")
public class DiscusszuopinxinxiView  extends DiscusszuopinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszuopinxinxiView(){
	}
 
 	public DiscusszuopinxinxiView(DiscusszuopinxinxiEntity discusszuopinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusszuopinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
