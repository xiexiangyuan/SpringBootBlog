# Springboot blog
以下内容为转载，项目代码为别人的下载过来，自己也在实现一个个人博客，维护点自己的东西，先参考下别人的，哈哈
My Blog是由Docker+SpringBoot+Mybatis+thymeleaf等技术实现的Java博客系统，博客模板是大神的开源项目[tale](https://github.com/otale/tale)，本来是一个docker和springboot的实战练习项目，目前已经开源，功能齐全、部署简单及完善的代码，一定会给使用者无与伦比的体验

- **你可以拿它作为博客模板，因为My Blog界面十分美观简洁，满足私人博客的一切要求；**
- **你也可以把它作为springboot技术的学习项目，My Blog也足够符合要求，且代码和功能完备；**
- **你还可以将其视为一个docker技术的练手教程，体验和使用红极一时的虚拟容器技术，My Blog中脚本和文档十分完善并且持续更新。**

#### tips

- **数据库文件目录为```docker-extension/mysql/schema.sql```；**
- **部署后你可以根据自己需求修改版权文案、logo图片、备案记录等信息；**
- **My Blog还有许多不完善的地方，鄙人才疏学浅，望见谅！**



[![Build Status](https://travis-ci.org/ZHENFENG13/My-Blog.svg?branch=master)](https://travis-ci.org/ZHENFENG13/My-Blog)
![Version 3.2.0](https://img.shields.io/badge/version-3.2.0-yellow.svg)
[![License](https://img.shields.io/badge/license-apache-blue.svg)](https://github.com/ZHENFENG13/My-Blog/blob/master/LICENSE)

#### 相关博客文章

* [x] [Docker+SpringBoot+Mybatis+thymeleaf的Java博客系统开源啦](http://www.cnblogs.com/han-1034683568/p/6840493.html)
* [x] [My-Blog搭建过程：如何让一个网站从零到可以上线访问](http://www.cnblogs.com/han-1034683568/p/6885545.html)
* [x] [利用Dockerfile构建mysql镜像并实现数据的初始化及权限设置](http://www.cnblogs.com/han-1034683568/p/6941337.html)
* [x] [Java开源博客My-Blog之docker容器组件化修改](http://www.cnblogs.com/han-1034683568/p/7102765.html)
* [x] [Java开源博客My-Blog之mysql容器重复初始化的严重bug修复过程](http://www.cnblogs.com/han-1034683568/p/7231895.html)
* [x] [Springboot与Thymeleaf模板引擎整合基础教程](http://www.cnblogs.com/han-1034683568/p/7520012.html)
* [x] [thymeleaf模板引擎调用java类中的方法](http://www.cnblogs.com/han-1034683568/p/7527564.html)

#### 捐赠

**网站的持续运行需要各项基础设施的搭建，而服务期的续费和维护及各种配套服务的购买也需要一定的费用，希望朋友们给予一点支持，谢谢！**

**支付宝：**<img src="https://raw.githubusercontent.com/ZHENFENG13/resource/master/images/2018-02-27/zhifubao1.jpg" width = "200" height = "200" alt="zhifubao"/>**微信支付：**<img src="https://raw.githubusercontent.com/ZHENFENG13/resource/master/images/2018-02-27/wxpay.jpg" width = "200" height = "200" alt="wxpay"/>

# Quick Start

* [x] [1.如何部署My Blog](https://github.com/ZHENFENG13/My-Blog/wiki/1-%E5%A6%82%E4%BD%95%E9%83%A8%E7%BD%B2My-Blog)
 - [1.0 基础环境搭建](https://github.com/ZHENFENG13/My-Blog/wiki/1.0-%E5%9F%BA%E7%A1%80%E7%8E%AF%E5%A2%83)
 - [1.1 安装Docker环境](https://github.com/ZHENFENG13/My-Blog/wiki/1.1-安装Docker环境)
 - [1.2 安装docker-compose](https://github.com/ZHENFENG13/My-Blog/wiki/1.2-%E5%AE%89%E8%A3%85docker-compose)
* [x] [2.通过共享镜像直接部署My Blog](https://github.com/ZHENFENG13/My-Blog/wiki/2-%E9%80%9A%E8%BF%87%E5%85%B1%E4%BA%AB%E9%95%9C%E5%83%8F%E7%9B%B4%E6%8E%A5%E9%83%A8%E7%BD%B2My-Blog)
* [x] [3.1 非docker环境运行My Blog](https://github.com/ZHENFENG13/My-Blog/wiki/3.1-%E9%9D%9Edocker%E7%8E%AF%E5%A2%83%E8%BF%90%E8%A1%8CMy-Blog)
* [x] [3.2 将My Blog部署到tomcat(非docker环境)](https://github.com/ZHENFENG13/My-Blog/wiki/3.2-%E5%B0%86My-Blog%E9%83%A8%E7%BD%B2%E5%88%B0tomcat(%E9%9D%9Edocker%E7%8E%AF%E5%A2%83))
* [x] [4.开发环境运行代码](https://github.com/ZHENFENG13/My-Blog/wiki/4-%E5%BC%80%E5%8F%91%E7%8E%AF%E5%A2%83%E8%BF%90%E8%A1%8C%E4%BB%A3%E7%A0%81)
* [x] [5.博客上线及备案相关流程](https://github.com/ZHENFENG13/My-Blog/wiki/%E4%B8%8A%E7%BA%BF%E5%8F%8A%E5%A4%87%E6%A1%88%E7%9B%B8%E5%85%B3)

[**常见问题**](https://github.com/ZHENFENG13/My-Blog/wiki/%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98)

# Preview

**博客展示页1：**
![My Blog](https://raw.githubusercontent.com/ZHENFENG13/resource/master/images/2018-06-13/my-blog-2.gif)
**博客展示页2：**
![My Blog](https://raw.githubusercontent.com/ZHENFENG13/resource/master/images/2018-06-13/my-blog-1.gif)
**登录页：**
![登录页](http://images2015.cnblogs.com/blog/859549/201705/859549-20170511122916004-738411708.png)
**My Blog后台：**
![My Blog](https://raw.githubusercontent.com/ZHENFENG13/resource/master/images/2018-06-13/My-Blog-admin-1.gif)
**My Blog后台：**
![My Blog](https://raw.githubusercontent.com/ZHENFENG13/resource/master/images/2018-06-13/My-Blog-admin-2.gif)


