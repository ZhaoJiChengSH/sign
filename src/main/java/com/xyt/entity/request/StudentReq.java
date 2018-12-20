package com.xyt.entity.request;


import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="studentReq",description="用户对象")
@Data
public class StudentReq {
	
	@ApiModelProperty(value="用户学工号",example="15401190209")
	@NotBlank
	private String user_number;
	
	@ApiModelProperty(value="用户姓名",example="徐雅婷")
	@NotBlank
	private String user_name;
	
	@ApiModelProperty(value="用户密码,在前段用32位MD5加密",example="e10adc3949ba59abbe56e057f20f883e")
	@NotBlank
	private String password;
	
	@ApiModelProperty(value="用户班级外键('STUDENT'时不为空)")
	private String class_id;
	
	@ApiModelProperty(value="手机号",example="15757469199")
	private String phone;
	
	@ApiModelProperty(value="用户照片，请用Base64编码成字符串")
	private String image;
	
	@ApiModelProperty(value="入学日期,时间戳格式字符串",example="2018-10-7 0:0")
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	@NotNull
	private Date create_time;
	
	@ApiModelProperty(value="学生类型",example="本科")
	private String education;
	
	@ApiModelProperty(value="身份证号",example="330501199702030038")
	private String id_card;
	
	@ApiModelProperty(value="性别",example="男")
	private String gender;
	
	@ApiModelProperty(value="银行卡号",example="6228480318136832272")
	private String card_number;
	
	@ApiModelProperty(value="出生日期",example="2018-10-7 0:0")
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date birthday;
	
	@ApiModelProperty(value="寝室号",example="9427")
	private String bedroom_number;
	
	@ApiModelProperty(value="民族",example="汉族")
	private String ethnic;
	
	@ApiModelProperty(value="生源地")
	private String hometown;
	
	@ApiModelProperty(value="政治面貌",example="共青团员")
	private String political_status;
	
	
}
