package me.abel.tencent.qywechat.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description
 * @author Abel.li
 * @contact abel0130@163.com
 * @version
 */
@Data
@Configuration
@PropertySource(value="classpath:handler.properties")
public class WechatConfiguration {

	@Value("${system.wechat.param.corpid}")
	private String corpId;
	
    @Value("${system.wechat.param.corpsecret}")
    private String corpsecret;

	@Value("${system.wechat.param.agentid}")
	private String agentId;

    @Value("${system.wechat.param.agentsecret}")
    private String agentsecret;
    
    @Value("${system.wechat.message.token}")
    private String token;

    @Value("${system.wechat.message.encodingaeskey}")
    private String encodingaeskey;

    @Value("${system.wechat.url.accesstoken}")
    private String accessTokenUrl;

    @Value("${system.wechat.sever.host}")
    private String serverHost;

    @Value("${system.wechat.url.redirect}")
    private String redirectUrl;

    @Value("${system.wechat.url.send}")
    private String sendUrl;

    @Value("${system.wechat.url.code2user}")
    private String code2userUrl;

    @Value("${system.wechat.customer.secret}")
    private String customerSecret;

    @Value("${system.wechat.url.customercontacts}")
    private String customercontactsUrl;

    @Value("${system.wechat.url.customercontactlist}")
    private String customercontactlistUrl;

    @Value("${system.wechat.url.customercontactdetail}")
    private String customercontactdetailUrl;

    @Value("${system.wechat.url.unassignedcustomers}")
    private String unassignedcustomersUrl;

    @Value("${system.wechat.url.transferexternalcontact}")
    private String transferexternalcontactUrl;

    @Value("${system.wechat.url.departments}")
    private String departmentsUrl;

    @Value("${system.wechat.url.departmentcreate}")
    private String departmentcreateUrl;

    @Value("${system.wechat.url.departmentupdate}")
    private String departmentupdateUrl;

    @Value("${system.wechat.url.departmentdelete}")
    private String departmentdeleteUrl;

    @Value("${system.wechat.url.usercreate}")
    private String usercreateUrl;

    @Value("${system.wechat.url.userget}")
    private String usergetUrl;

    @Value("${system.wechat.url.userupdate}")
    private String userupdateUrl;

    @Value("${system.wechat.url.userdelete}")
    private String userdeleteUrl;

    @Value("${system.wechat.url.userbatchdelete}")
    private String userbatchdeleteUrl;

    @Value("${system.wechat.url.userbaselist}")
    private String userbaselistUrl;

    @Value("${system.wechat.url.userdetaillist}")
    private String userdetaillistUrl;

    @Value("${system.wechat.url.converttoopenid}")
    private String converttoopenidUrl;

    @Value("${system.wechat.url.converttouserid}")
    private String converttouseridUrl;

    @Value("${system.wechat.url.authsucc}")
    private String authsuccUrl;

    @Value("${system.wechat.url.batchinvite}")
    private String batchinviteUrl;

    @Value("${system.wechat.customer.state}")
    private String customerState;

    @Value("${system.wechat.url.addcontactway}")
    private String addContactwayUrl;

    @Value("${system.wechat.url.getcontactway}")
    private String getContactwayUrl;

    @Value("${system.wechat.url.updatecontactway}")
    private String updateContactwayUrl;

    @Value("${system.wechat.url.delcontactway}")
    private String delContactwayUrl;
    
    @Value("${system.wechat.url.tagget}")
    private String tagUrl;
    

}
