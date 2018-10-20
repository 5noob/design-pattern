代理模式：
    通过代理对象，间接控制并访问目标对象的方法。如媒婆、中介、spring中的AOP

静态代理：
    目标对象和代理对象，实现同样的接口。如Agent和Zhangsan都实现Person接口

    目标对象作为代理对象的一个属性

    通过代理对象的方法，访问目标对象的方法。如Agent的findJob()方法和findHouse()方法

    缺点：每多一个目标对象，就要多一个代理对象。


动态代理：
   动态生成代理对象，在运行期间生成。类文件缓存在java虚拟机中。

   DynamicHandler类中的Proxy.newProxyInstance(...)方法，是用来生成代理对象的，我们点进去看下。
其中这一句，是用来生成代理对象的。
        /*
         * Look up or generate the designated proxy class.
         */
        Class<?> cl = getProxyClass0(loader, intfs);


   我们再来看看生成的类文件，是什么样子的。由于类文件时缓存在java虚拟机中，我们将类文件打印到文件中，便于查看。
方法见ProxyTest类的generateProxyFile()方法。下面是生成的类文件，反编译的结果，为了好看，我调整了一下他的方法的位置。

   public final class $Proxy0 extends Proxy implements Person {
       private static Method m1;
       private static Method m4;
       private static Method m2;
       private static Method m3;
       private static Method m0;

       /**
       * 构造方法的参数是InvocationHandler。
       **/
       public $Proxy0(InvocationHandler var1) throws  {
           super(var1);
       }


        static { //匹配方法
                   try {
                       m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
                       m4 = Class.forName("com.me.staticproxy.Person").getMethod("findHouse");
                       m2 = Class.forName("java.lang.Object").getMethod("toString");
                       m3 = Class.forName("com.me.staticproxy.Person").getMethod("findJob");
                       m0 = Class.forName("java.lang.Object").getMethod("hashCode");
                   } catch (NoSuchMethodException var2) {
                       throw new NoSuchMethodError(var2.getMessage());
                   } catch (ClassNotFoundException var3) {
                       throw new NoClassDefFoundError(var3.getMessage());
                   }
               }

       /**
        * 代理对象$Proxy0的findHouse()方法，其实是给调用了h的invoke方法。h是什么，发现是InvocationHandler。
        * 这也就是为什么，我们的DynamicHandler类要实现发现是InvocationHandler接口，并重写它的invoke方法的原因了。
        **/
       public final void findHouse() throws  {
           try {
               super.h.invoke(this, m4, (Object[])null);
           } catch (RuntimeException | Error var2) {
               throw var2;
           } catch (Throwable var3) {
               throw new UndeclaredThrowableException(var3);
           }
       }

       public final String toString() throws  {
           try {
               return (String)super.h.invoke(this, m2, (Object[])null);
           } catch (RuntimeException | Error var2) {
               throw var2;
           } catch (Throwable var3) {
               throw new UndeclaredThrowableException(var3);
           }
       }

       public final void findJob() throws  {
           try {
               super.h.invoke(this, m3, (Object[])null);
           } catch (RuntimeException | Error var2) {
               throw var2;
           } catch (Throwable var3) {
               throw new UndeclaredThrowableException(var3);
           }
       }

       public final int hashCode() throws  {
           try {
               return (Integer)super.h.invoke(this, m0, (Object[])null);
           } catch (RuntimeException | Error var2) {
               throw var2;
           } catch (Throwable var3) {
               throw new UndeclaredThrowableException(var3);
           }
       }

       public final boolean equals(Object var1) throws  {
                  try {
                      return (Boolean)super.h.invoke(this, m1, new Object[]{var1});
                  } catch (RuntimeException | Error var3) {
                      throw var3;
                  } catch (Throwable var4) {
                      throw new UndeclaredThrowableException(var4);
                  }
              }
 }



