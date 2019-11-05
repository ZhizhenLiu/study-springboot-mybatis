# springboot 学习入门

## 心得整理：
   1.Service层使用 @Autowired 自动装配userMapper时会有报错;
   原因:userMapper使用了@Mapper注解，idea不能把@Mapper注解的TuserMapper识别为Bean
   解决办法：Mapper类增加@repository注解，标注该类为DAO组件。并且在spring 启动application中增加注解@MapperScan("com.zhizhen.test.springboot_mybatis.mapper")

   2.删除原来的 application.properties，使用的是更为简洁的 yml 配置文件
   
## v2.0修改
1. v1.0版本中，我们访问数据库时，SQL语句还是写死在代码里面，处理起来并没有很方便。通常，我们把SQL语句与代码分离，使用MyBa…

…tis映射文件方式来访问数据库。

2.  v2.0增加mybatis映
