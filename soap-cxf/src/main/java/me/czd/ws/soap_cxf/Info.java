package me.czd.ws.soap_cxf;

/**
 * java界 有一个知名的 ws 框架，就是apache 给我们提供的 cxf
 * cxf 对很多都有支持，我们我们需要了解下cxf
 * 首先我们需要知道cxf 的jar 包。然后并导入，我们这里用的maven 直接仓库依赖
 * 
 * cxf 发布ws 有好几种方式，是经过不断改善的但又不能将之前的丢掉
 * 
 * 核心只是要知道，java中好多内容都是通过代理来实现的
 * 因为代理可以帮助我们去代理一些事情，代理一些我们本来做不了的事情
 * 
 * 核心发布ws 调用ws 使用ws
 * 类似于rpc 也就是调用其他服务端提供的    service
 * 
 * 这个包下就是 cxf 关于soap 单独的使用
 * 
 * 都是一些 factoryBean 充当客户端来调用
 * 发布的都是 封装了 来进行发布
 * 一般也不知么用，应用我们发布都是通过绑定容器来进行发布
 * 直接和 我们的 服务器来进行绑定，这样子舒服，效率好
 * 
 *
 */
public class Info {
}
