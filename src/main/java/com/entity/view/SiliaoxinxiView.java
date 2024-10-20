package com.entity.view;

import com.entity.SiliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 私聊信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-31 14:50:08
 */
@TableName("siliaoxinxi")
public class SiliaoxinxiView  extends SiliaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SiliaoxinxiView(){
	}
 
 	public SiliaoxinxiView(SiliaoxinxiEntity siliaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, siliaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
