1、简单工厂模式
   
   工厂生产所有的具体产品。如SimpleCarFactory的getCar方法
    
   具体产品继承抽象产品。如BMW、Benz、Volkswagen 实现Car
   
   产品使用者，调用工厂。如SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
   

2、工厂方法模式
    
   每个具体的工厂，生产对应的具体的产品。如BenzFactory生产Benz，BMWFactory生产BMW
   
   产品使用者，调用具体的工厂。如FactoryFuncTest类中的 CarFactory carFactory = new BMWFactory();
   
   具体产品继承抽象产品。如BMW、Benz、Volkswagen 实现Car
   
   具体工厂继承抽象工厂。如BenzFactory、BMWFactory等实现CarFactory
   
  
 