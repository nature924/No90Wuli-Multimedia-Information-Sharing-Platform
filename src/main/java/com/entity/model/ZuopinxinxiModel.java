package com.entity.model;

import com.entity.ZuopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 作品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-31 14:50:08
 */
public class ZuopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作品分类
	 */
	
	private String zuopinfenlei;
		
	/**
	 * 所属类别
	 */
	
	private String suoshuleibie;
		
	/**
	 * 作品封面
	 */
	
	private String zuopinfengmian;
		
	/**
	 * 灵感来源
	 */
	
	private String lingganlaiyuan;
		
	/**
	 * 音频
	 */
	
	private String yinpin;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 作品详情
	 */
	
	private String zuopinxiangqing;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 上传时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangchuanshijian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：作品分类
	 */
	 
	public void setZuopinfenlei(String zuopinfenlei) {
		this.zuopinfenlei = zuopinfenlei;
	}
	
	/**
	 * 获取：作品分类
	 */
	public String getZuopinfenlei() {
		return zuopinfenlei;
	}
				
	
	/**
	 * 设置：所属类别
	 */
	 
	public void setSuoshuleibie(String suoshuleibie) {
		this.suoshuleibie = suoshuleibie;
	}
	
	/**
	 * 获取：所属类别
	 */
	public String getSuoshuleibie() {
		return suoshuleibie;
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
	 * 设置：灵感来源
	 */
	 
	public void setLingganlaiyuan(String lingganlaiyuan) {
		this.lingganlaiyuan = lingganlaiyuan;
	}
	
	/**
	 * 获取：灵感来源
	 */
	public String getLingganlaiyuan() {
		return lingganlaiyuan;
	}
				
	
	/**
	 * 设置：音频
	 */
	 
	public void setYinpin(String yinpin) {
		this.yinpin = yinpin;
	}
	
	/**
	 * 获取：音频
	 */
	public String getYinpin() {
		return yinpin;
	}
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：作品详情
	 */
	 
	public void setZuopinxiangqing(String zuopinxiangqing) {
		this.zuopinxiangqing = zuopinxiangqing;
	}
	
	/**
	 * 获取：作品详情
	 */
	public String getZuopinxiangqing() {
		return zuopinxiangqing;
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
	 * 设置：上传时间
	 */
	 
	public void setShangchuanshijian(Date shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}
	
	/**
	 * 获取：上传时间
	 */
	public Date getShangchuanshijian() {
		return shangchuanshijian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
