package com.entity.model;

import com.entity.SiliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 私聊信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-31 14:50:08
 */
public class SiliaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作品封面
	 */
	
	private String zuopinfengmian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 私聊内容
	 */
	
	private String siliaoneirong;
		
	/**
	 * 私聊账号
	 */
	
	private String siliaozhanghao;
		
	/**
	 * 私聊姓名
	 */
	
	private String siliaoxingming;
		
	/**
	 * 私聊日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date siliaoriqi;
		
	/**
	 * 回复内容
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：作品封面
	 */
	 
	public void setZuopinfengmian(String zuopinfengmian) {
		this.zuopinfengmian = zuopinfengmian;
	}
	
	/**
	 * 获取：作品封面
	 */
	public String getZuopinfengmian() {
		return zuopinfengmian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：私聊内容
	 */
	 
	public void setSiliaoneirong(String siliaoneirong) {
		this.siliaoneirong = siliaoneirong;
	}
	
	/**
	 * 获取：私聊内容
	 */
	public String getSiliaoneirong() {
		return siliaoneirong;
	}
				
	
	/**
	 * 设置：私聊账号
	 */
	 
	public void setSiliaozhanghao(String siliaozhanghao) {
		this.siliaozhanghao = siliaozhanghao;
	}
	
	/**
	 * 获取：私聊账号
	 */
	public String getSiliaozhanghao() {
		return siliaozhanghao;
	}
				
	
	/**
	 * 设置：私聊姓名
	 */
	 
	public void setSiliaoxingming(String siliaoxingming) {
		this.siliaoxingming = siliaoxingming;
	}
	
	/**
	 * 获取：私聊姓名
	 */
	public String getSiliaoxingming() {
		return siliaoxingming;
	}
				
	
	/**
	 * 设置：私聊日期
	 */
	 
	public void setSiliaoriqi(Date siliaoriqi) {
		this.siliaoriqi = siliaoriqi;
	}
	
	/**
	 * 获取：私聊日期
	 */
	public Date getSiliaoriqi() {
		return siliaoriqi;
	}
				
	
	/**
	 * 设置：回复内容
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}
			
}
