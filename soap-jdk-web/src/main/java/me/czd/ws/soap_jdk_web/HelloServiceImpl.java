package me.czd.ws.soap_jdk_web;

import javax.jws.WebService;

/**
 * 相对应的 WS 接口的实现类
 * 
 * 注解的内容，就是见名知意，自己理解下
 * 
 * tomcat 借助ri 然后自动发布我们的ws
 * 
 * @author Administrator
 *
 */
@WebService(serviceName = "HelloService", portName = "HelloServicePort", endpointInterface = "me.czd.ws.soap_jdk_web.HelloService")
public class HelloServiceImpl implements HelloService {

	public String say(String name) {
		return "hello。" + name + "本服务由jdk 提供  但是由tomcat 提供发布服务";
	}

}
