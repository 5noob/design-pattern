1、简单工厂模式
   
   工厂生产所有的具体产品。如SimpleCarFactory的getCar方法
    
   具体产品继承抽象产品。如BMW、Benz、Volkswagen 实现Car
   
   产品使用者，调用工厂。如SimpleFactoryTest类中的SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
   

2、工厂方法模式

   具体产品继承抽象产品。如BMW、Benz、Volkswagen 实现Car
       
   具体工厂继承抽象工厂。如BenzCarFactory、BMWCarFactory等实现CarFactory
    
   每个具体的工厂，生产对应的具体的产品。如BenzFactory生产Benz，BMWFactory生产BMW
   
   产品使用者，调用具体的工厂。如FactoryFuncTest类中的 CarFactory carFactory = new BMWFactory();
  
   
3、抽象工厂模式：对一组具有相同主题的工厂进行封装。相同主题，表示同一个产品族。如车辆，船只，是同一个产品族，共同组成交通工具
   

   具体产品继承抽象产品
   
   具体工厂继承抽象工厂
   
   每个具体的工厂，包含多个子工厂。子工厂负责生产具体的子产品，子产品组成一个具体的产品
   
   产品使用者，调用具体的工厂
   
