# NDK Demo
## native方法定义和调用
    public int num = 10;
    public native int addNum();
    FieldJni fieldJni = new FieldJni();
    Log.e(TAG, "调用前：num = " + fieldJni.num);
    Log.e(TAG, "调用后：" + fieldJni.addNum());
## C++层
    JNIEXPORT jint JNICALL
    Java_com_jerry_mobile_HelloWorldJNI_addNum(JNIEnv *env, jobject jobj) {
    //获取实例对应的 class
    jclass jclazz = (*env)->GetObjectClass(env,jobj);
    //通过class获取相应的变量的 field id
    jfieldID fid = (*env)->GetFieldID(env,jclazz, "num", "I");
    //通过 field id 获取对应的值
    jint num = (*env)->GetIntField(env,jobj, fid);  //注意，不是用 jclazz, 使用 jobj
    num++;
    return num;
    } 
## 访问一个 static 变量，并对其修改
    public static String name = "cfanr";
    public native void accessStaticField();
     //调用
    Log.e(TAG, "调用前：name = " + fieldJni.name);
    fieldJni.accessStaticField();
    Log.e(TAG, "调用后：" + fieldJni.name);`
    //访问一个 static 变量，并对其修改
    JNIEXPORT void JNICALL
    Java_com_jerry_mobile_HelloWorldJNI_accessStaticField(JNIEnv *env, jobject obj) {
         jclass jclazz=(*env)->GetObjectClass(env,obj);
         jfieldID fid = (*env)->GetStaticFieldID(env,jclazz, "name", "Ljava/lang/String;");
         jstring name=(jstring)(*env)->GetStaticObjectField(env,jclazz,fid);
         const char* str  =   (*env)->GetStringUTFChars(env,name,JNI_FALSE);
    /*
     * 不要用 == 比较字符串
     * name == (jstring) "cfanr"
     * 或用 = 直接赋值
     * name = (jstring) "navy"
     * 警告：warning: result of comparison against a string literal is unspecified (use strncmp instead) [-Wstring-compare]
     */
      char ch[30] = "hello, ";
      strcat(ch, str);
      jstring new_str = (*env)->NewStringUTF(env,ch);
      // 将jstring类型的变量，设置到java
      (*env)->SetStaticObjectField(env,jclazz, fid, new_str);
    }
## 访问一个 private 变量，并对其修改 
    private int age = 21;
    public native void accessPrivateField();
    public int getAge() {
       return age;
    }
    //调用
    Log.e(TAG, "调用前：age = " + fieldJni.getAge());
    fieldJni.accessPrivateField();
    Log.e(TAG, "调用后：age = " + fieldJni.getAge());`
    
    //访问一个 private 变量，并对其修改
    JNIEXPORT void JNICALL
    Java_com_jerry_mobile_HelloWorldJNI_accessPrivateField(JNIEnv *env, jobject jobj) {
    jclass clazz = (*env)->GetObjectClass(env,jobj);
    jfieldID fid = (*env)->GetFieldID(env,clazz, "age", "I");
    jint age = (*env)->GetIntField(env,jobj, fid);
    if(age > 18) {
        age = 18;
    } else {
        age--;
    }
    (*env)->SetIntField(env,jobj, fid, age);
    } 
    
# lottie的简单实用

### build.gradle(:app)里添加依赖
     implementation 'com.airbnb.android:lottie:3.4.0'
###  xml添加布局
      <com.airbnb.lottie.LottieAnimationView
            android:id="@+id/lottieAnimationView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_gravity="center"
            android:scaleType="fitXY"
            app:lottie_fileName="colorline.json"
            app:lottie_loop="true"
            app:lottie_autoPlay="true" />
###  资源文件里放入lottie的专用json文件
      colorline.json
 