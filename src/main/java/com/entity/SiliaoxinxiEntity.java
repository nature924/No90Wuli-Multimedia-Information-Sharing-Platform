package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 私聊信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-31 14:50:08
 */
@TableName("siliaoxinxi")
public class SiliaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SiliaoxinxiEntity() {
		
	}
	
	public SiliaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 作品名称
	 */
					
	private String zuopinmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date siliaoriqi;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：作品名称
	 */
	public void setZuopinmingcheng(String zuopinmingcheng) {
		this.zuopinmingcheng = zuopinmingcheng;
	}
	/**
	 * 获取：作品名称
	 */
	public String getZuopinmingcheng() {
		return zuopinmingcheng;
	}
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
