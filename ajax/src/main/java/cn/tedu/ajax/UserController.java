package cn.tedu.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@RequestMapping("login")
	@ResponseBody//表示响应正文 
	public JsonResult login(String username, String password){
		JsonResult jsonResult = new JsonResult();
		if("root".equals(username)){
			
			if("1234".equals(password)){
				jsonResult.setResult(1);
				jsonResult.setUsername("超级管理员");
				 //用户名密码正确
			}else{
				jsonResult.setResult(3);
				jsonResult.setMessage("登录失败,密码错误");
				 //密码错
			}
		}else{
			jsonResult.setResult(2);
			jsonResult.setMessage("登录失败,用户名错误");
			 // 用户名错
		}
		return jsonResult;
		
	}
	
	
	
}
