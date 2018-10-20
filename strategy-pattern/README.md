策略模式：
    对象的行为，在不同的环境下，有不同的实现。可以动态地改变对象的行为

    抽象策略对象

    具体策略对象

    环境对象：抽象策略对象，作为其属性


    比如，在JDK的Collections.sort方法中，不需为新的对象修改sort()方法，仅仅需要实现自己的Comparator接口：

    Collections.sort(
                list,   //待排序的集合
                new Comparator<>(){  //具体排序策略
                @Override
                public int compare(A a1, A a2) {
                    return ...; //具体大小判断规则
                }
            });

