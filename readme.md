# 设计模式笔记

## 六大设计原则：

开闭原则：一个软件实体如类、模块和函数应该对修改封闭，对扩展开放。
单一职责原则：一个类只做一件事，一个类应该只有一个引起它修改的原因。
里氏替换原则：子类应该可以完全替换父类。也就是说在使用继承时，只扩展新功能，而不要破坏父类原有的功能。
依赖倒置原则：细节应该依赖于抽象，抽象不应依赖于细节。把抽象层放在程序设计的高层，并保持稳定，程序的细节变化由低层的实现层来完成。
迪米特法则：又名“最少知道原则”，一个类不应知道自己操作的类的细节，换言之，只和朋友谈话，不和朋友的朋友谈话。
接口隔离原则：客户端不应依赖它不需要的接口。如果一个接口在实现时，部分方法由于冗余被客户端空实现，则应该将接口拆分，让实现类只需依赖自己需要的接口方法。

## 一构建型模式

1. 工厂方法模式：为每一类对象建立工厂，将对象交由工厂创建，客户端只和工厂打交道。
2. 抽象工厂模式：为每一类工厂提取出抽象接口，使得新增工厂、替换工厂变得非常容易。
3. 建造者模式：用于创建构造过程稳定的对象，不同的 Builder 可以定义不同的配置。
4. 单例模式：全局使用同一个对象，分为饿汉式和懒汉式。懒汉式有双检锁和内部类两种实现方式。
5. 原型模式：为一个类定义 clone 方法，使得创建相同的对象更方便。


### 1工厂模式
每次构建对象通过new的方式，不利于松耦合。构建过程可以封装起来，工厂模式是用于封装对象的设计模式。

1. 公共工厂接口，
2. 具体的每个实例工厂实现接口，
3. 在使用时就无需再关心是哪个工厂类，只需要将此工厂当作抽象的 IFactory 接口使用即可。这种经过抽象的工厂方法模式被称作抽象工厂模式。


### 2单例模式
全局只需要一个实例时，使用单例。
1. 避免重复创建
2. 避免操作不同实例导致逻辑错误

实现方式有：
1. 饿汉式
2. 懒汉式

> 著名的软件大师 Martin 在《代码整洁之道》一书中也说到：不提倡使用懒加载方式，因为程序应该将构建与使用分离，达到解耦。饿汉式在声明时直接初始化变量的方式也更直观易懂。所以在使用饿汉式还是懒汉式时，需要权衡利弊。

### 3建造者模式
建造者模式用于创建过程稳定，但配置多变的对象。在《设计模式》一书中的定义是：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
建造者模式主要用来通过链式调用生成不同的配置
比如我们要制作一杯珍珠奶茶。它的制作过程是稳定的，除了必须要知道奶茶的种类和规格外，是否加珍珠和是否加冰是可选的。


### 4原型模式
用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
原型模式就是用来克隆对象的。

## 结构型模式 Structural Patterns
1. 适配器模式adapter：有相关性但不兼容的接口，例如200v的电源需要adapter为5v后给手机充电；
2. 桥接模式bridge：同等级的接口互相结合，例如正方形圆形可以使用接口，假如需要加入颜色使用桥接是最为简便的方式，而不是直接进行排列组合；
3. 组合模式Composite：整体与部分的结构整体与部分的结构，当整体与部分有相似的结构，在操作时可以被一致对待时，就可以使用组合模式;
3. 装饰模式 decorator： 1增强一个类原有的功能 2为一个类添加新的功能；
4. 外观模式 Facade：体现封装，相当于前台，统一调度沟通管理；
5. 享元模式：体现面向对象的可复用性；
6. 代理模式：主要用于对某个对象加以控制。

## 行为型模式 Behavioral Patterns

行为型模式重点关注类与类之间的交互与协作。如同在工作中，每个人的行为都可能影响到其他同事，同时每个人也会受到别人的影响。我们一边接收上级的指令，一边派发任务给下级，在这样的协作中完成一项项伟大的工作。程序在运行时，每个对象都不是孤立的，他们可以通过通信与协作完成种种复杂的功能。


1.责任链模式：处理职责相同，程度不同的对象，使其在一条链上传递
1.命令模式：封装“方法调用”，将行为请求者和行为实现者解耦
1.解释器模式：定义自己的语法规则
1.迭代器模式：定义 next() 方法和 hasNext() 方法，让外部类使用这两个方法来遍历列表，以达到隐藏列表内部细节的目的
1.中介者模式：通过引入中介者，将网状耦合结构变成星型结构
1.备忘录模式：存储对象的状态，以便恢复
1.观察者模式：处理一对多的依赖关系，被观察的对象改变时，多个观察者都能收到通知
1.状态模式：关于多态的设计模式，每个状态类处理对象的一种状态
1.策略模式：殊途同归，用多种方法做同一件事
1.模板方法模式：关于继承的设计模式，父类是子类的模板
1.访问者模式：将数据的结构和对数据的操作分离

### 1责任链模式
同一个岗位上的责任，就可以组成一条链。
例，工厂流水线，生产一个个产品

### 2命令模式
封装“方法调用”，将行为请求者和行为实现者解耦,代码会变多，但是解耦
例，请假单经公司领导层层审批

### 3解释器模式
定义自己的语法规则

### 4迭代器模式
定义 next() 方法和 hasNext() 方法，让外部类使用这两个方法来遍历列表，以达到隐藏列表内部细节的目的

### 5中介者模式
通过引入中介者，将网状耦合结构变成星型结构
例，转账操作需要一个中间中心化机构来进行统一处理

### 6备忘录模式
存储对象的状态，以便恢复
增加一个用于存储状态的类

### 7观察者模式
处理一对多的依赖关系，被观察的对象改变时，多个观察者都能收到通知

### 8状态模式 
关于多态的设计模式，每个状态类处理对象的一种状态
将状态判断的ifelse 换为不同的状态类处理

### 9策略模式
殊途同归，用多种方法做同一件事
例，为排序接口设定使用不同的排序类，进行排序

### 10模板方法模式
关于继承的设计模式，父类是子类的模板

### 11访问者模式
将数据的结构和对数据的操作分离

# 参考
作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/design-patterns
来源：力扣（LeetCode）

