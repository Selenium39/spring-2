```
1.自动装配:autowired:
    1.byType 
    2.byName:被引用的id的值必须与属性值相同
2.Bean之间的关系:
    1.依赖:depends-on 设置bean前置依赖bean
    2.继承:parent 可以继承实例Bean，也可以继承抽象Bean(abstract)
          注意并不是所有属性都会被继承:autowired和abstract不会被继承
3.Bean的作用域:
    1.singleton:单例(默认)
    2.prototype
    3.request
    4.session
4.使用外部属性文件进行注入:
    1.设置<context:property-placeholder location="xxx.properties"/>
	2.建立属性配置文件xxx.properties
	注意:spring2.5之前是通过<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer"></bean>   
5.SpringEl:#{}
    1.通过bean的id对bean进行引用
    2.调用方法以及对象中的属性
    3.计算表达式的值
    4.正则表达式的匹配
6.Bean的生命周期
    1.通过构造器或工厂方法创建bean的实例
    2.进行属性注入
    --后置处理器的前置处理--
    3.初始化 init-mehtod
    --后置处理器的后置处理--
    4.使用bean
    5.摧毁bean destory-method
7.使用后置处理器:
    1.自定义类并实现BeanPostProcessor接口
    2.在配置文件中注册后置处理器的bean
8.Bean的配置:
    1.全类名(反射)
    2.工厂方法(静态工厂方法,工厂方法实例)
      1.静态工厂方法:
        1.创建工厂类与静态工厂方法
        2.在配置文件中注册工厂类,指定静态工厂方法并传参
      2.实例工厂方法
        1.创建工厂类与非静态工厂方法
        2.在配置文件中注册工厂类
        3.在创建的bean中指定工厂类   
    3.FactoryBean:返回的不是类的实例而是getObject()的返回值
        1.创建类并实现FactoryBean接口,重写方法
        2.在配置文件中注册bean,class写实现了FactoryBean的类
9.基于注解的方式配置bean
　　１.在bean上加上注解
　　　　　１.@Component:基本注解，标识受spring管理的组件
         2.@Responsitory：持久层组件
         3.@service:业务层组件
         4.@Controller：表现层组件
    2.在配置文件中开启注解扫描<context componnet-scan=""></context>     
    注意:使用注解无需指定id属性，使用类首字母小写的类的全名作为id,如需指定@Component(value="id")```
