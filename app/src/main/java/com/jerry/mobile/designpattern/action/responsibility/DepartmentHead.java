package com.jerry.mobile.designpattern.action.responsibility;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:具体处理者1：系主任类
 */
class DepartmentHead extends Leader{
    @Override
    public void handleRequest(int LeaveDays) {
      if(LeaveDays<=7){
          Log.i("DepartmentHead","系主任批准您请假" + LeaveDays + "天。");
      }else {
          if (getNext() != null) {
              getNext().handleRequest(LeaveDays);
          } else {
              System.out.println("请假天数太多，没有人批准该假条！");
          }
      }
    }
}
