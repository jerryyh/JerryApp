package com.jerry.mobile.designpattern.action.responsibility;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
public class LeaveApprovalTest {
    public static void main(String[] args) {
        //组装责任链
        Leader teacher1=new ClassAdviser();
        Leader teacher2=new DepartmentHead();
        Leader teacher3=new Dean();
        Leader teacher4=new DeanOfStudies();
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        teacher3.setNext(teacher4);
        //提交请求
        teacher1.handleRequest(8);
    }
}
/**
 * 模式的应用场景
 *
 * 前边已经讲述了关于责任链模式的结构与特点，下面介绍其应用场景，责任链模式通常在以下几种情况使用。
 * 多个对象可以处理一个请求，但具体由哪个对象处理该请求在运行时自动确定。
 * 可动态指定一组对象处理请求，或添加新的处理者。
 * 需要在不明确指定请求处理者的情况下，向多个处理者中的一个提交请求。
 * 模式的扩展
 *
 * 职责链模式存在以下两种情况。
 * 纯的职责链模式：一个请求必须被某一个处理者对象所接收，且一个具体处理者对某个请求的处理只能采用以下两种行为之一：自己处理（承担责任）；把责任推给下家处理。
 * 不纯的职责链模式：允许出现某一个具体处理者对象在承担了请求的一部分责任后又将剩余的责任传给下家的情况，且一个请求可以最终不被任何接收端对象所接收
 */

/**
 *在责任链模式中，客户只需要将请求发送到责任链上即可，无须关心请求的处理细节和请求的传递过程，请求会自动进行传递。所以责任链将请求的发送者和请求的处理者解耦了。
 *
 * 责任链模式是一种对象行为型模式，其主要优点如下。
 * 降低了对象之间的耦合度。该模式使得一个对象无须知道到底是哪一个对象处理其请求以及链的结构，发送者和接收者也无须拥有对方的明确信息。
 * 增强了系统的可扩展性。可以根据需要增加新的请求处理类，满足开闭原则。
 * 增强了给对象指派职责的灵活性。当工作流程发生变化，可以动态地改变链内的成员或者调动它们的次序，也可动态地新增或者删除责任。
 * 责任链简化了对象之间的连接。每个对象只需保持一个指向其后继者的引用，不需保持其他所有处理者的引用，这避免了使用众多的 if 或者 if···else 语句。
 * 责任分担。每个类只需要处理自己该处理的工作，不该处理的传递给下一个对象完成，明确各类的责任范围，符合类的单一职责原则。
 *
 * 其主要缺点如下。
 * 不能保证每个请求一定被处理。由于一个请求没有明确的接收者，所以不能保证它一定会被处理，该请求可能一直传到链的末端都得不到处理。
 * 对比较长的职责链，请求的处理可能涉及多个处理对象，系统性能将受到一定影响。
 * 职责链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于职责链的错误设置而导致系统出错，如可能会造成循环调用。
 *
 *
 *
 *责任链模式在 Android 中的体现
 *
 *ViewGroup 事件传递
 *
 * 还记得 Android 总的事件分发机制吗，主要有三个方法，dispatchTouchEvent,onInterceptTouchEvent,onTouchEvent 三个方法
 *当TouchEvent发生时，首先Activity将TouchEvent传递给最顶层的View，TouchEvent最先到达最顶层 view 的 dispatchTouchEvent ，然后由  dispatchTouchEvent 方法进行分发，
 *
 * 如果dispatchTouchEvent返回true 消费事件，事件终结。
 * 如果dispatchTouchEvent返回 false ，则回传给父View的onTouchEvent事件处理；
 *
 * onTouchEvent事件返回true，事件终结，返回false，交给父View的OnTouchEvent方法处理
 *
 *
 * 如果dispatchTouchEvent返回super的话，默认会调用自己的onInterceptTouchEvent方法
 *
 * 默认的情况下interceptTouchEvent回调用super方法，super方法默认返回false，所以会交给子View的onDispatchTouchEvent方法处理
 * 如果 interceptTouchEvent 返回 true ，也就是拦截掉了，则交给它的 onTouchEvent 来处理，
 * 如果 interceptTouchEvent 返回 false ，那么就传递给子 view ，由子 view 的 dispatchTouchEvent 再来开始这个事件的分发。
 *
 *
 *
 * 通过这样链式的设计，确保了每一个 View 都有机会处理 touch 事件。如果中途有 View 处理了事件，就停止处理。
 *
 * 作者：程序员徐公
 * 链接：https://juejin.cn/post/6844903929604472846
 * 来源：掘金
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * 有序广播
 */


