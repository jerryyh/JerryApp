
#include <string.h>
#include "com_jerry_mobile_HelloWorldJNI.h"
/*
 3  * Class:     com_jerry_mobile_HelloWorldJNI
 4  * Method:    getJniString
 5  * Signature: ()Ljava/lang/String;
 6  */
JNIEXPORT jstring JNICALL Java_com_jerry_mobile_HelloWorldJNI_getJniString(JNIEnv *env, jobject obj, jstring str){
    return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
}


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