package com.jerry.mobile;

/**
 * @author jerry
 * @date 2021/7/22
 * Description:
 */
public class HelloWorldJNI {
  // 加载Native动态库（so库），动态库的名称后面在mk文件中会使用到
  static {
    System.loadLibrary("helloworld_jni");
  }

  // 定义Native方法
  public static  native String getJniString(String name);

  public int num=10;
  public native int addNum();

  public static String name = "cfanr";
  public native void accessStaticField();

  private int age =18;
  public native void accessPrivateField();
  public int getAge() {
    return age;
  }
}
