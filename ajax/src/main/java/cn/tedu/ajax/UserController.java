package cn.tedu.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@RequestMapping("login")
	@ResponseBody//��ʾ��Ӧ���� 
	public JsonResult login(String username, String password){
		JsonResult jsonResult = new JsonResult();
		if("root".equals(username)){
			
			if("1234".equals(password)){
				jsonResult.setResult(1);
				jsonResult.setUsername("��������Ա");
				 //�û���������ȷ
			}else{
				jsonResult.setResult(3);
				jsonResult.setMessage("��¼ʧ��,�������");
				 //�����
			}
		}else{
			jsonResult.setResult(2);
			jsonResult.setMessage("��¼ʧ��,�û�������");
			 // �û�����
		}
		return jsonResult;
		
	}
	
	
	
}
