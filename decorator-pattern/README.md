装饰器模式：通过关联机制，拓展对象的行为

    装饰类和构件，实现同一接口，是个is a的层级关系
    而适配器模式，可以不必实现同一接口，可以没有层级关系，是has a的关系
    
    装饰器模式，关心的是拓展对象的行为
    适配器模式，关心的是转换、兼容
    
   抽象构件：为其他类的接口
   
   具体构件：实现抽象构件
   
   抽象装饰类：实现抽象构件，并把抽象构件作为属性
   
   具体装饰类：继承抽象装饰类，并在运行时装饰具体构件