LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := helloworld_jni

LOCAL_SRC_FILES := helloworld.c

include $(BUILD_SHARED_LIBRARY)