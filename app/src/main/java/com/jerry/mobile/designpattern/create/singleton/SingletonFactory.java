package com.jerry.mobile.designpattern.create.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:静态工厂方式(通过反射创建单例)
 */
public class SingletonFactory {
    private static  Singleton singleton;
    static {
        try {
            Class cls =Class.forName(Singleton.class.getName());
            Constructor constructor= cls.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton=(Singleton)constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static Singleton getSingleton(){
        return singleton;
    }
}
 /**
  * 通过获取构造器，然后设置访问权限，生成对象，然后提供给外部访问，保证内存中的对象唯一。
  */