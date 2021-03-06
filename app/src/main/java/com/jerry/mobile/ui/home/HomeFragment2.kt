package com.jerry.mobile.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jerry.mobile.HelloWorldJNI
import com.jerry.mobile.bean.UserJava
import com.jerry.mobile.databinding.FragmentHomeBinding
import com.jerry.mobile.designpattern.action.observer.SubscriptionSubject
import com.jerry.mobile.designpattern.action.observer.WeixinUser
import com.jerry.mobile.designpattern.action.strategy.OperationAdd
import com.jerry.mobile.designpattern.action.strategy.OperationSubtract
import com.jerry.mobile.designpattern.action.strategy.Strategy
import com.jerry.mobile.designpattern.create.abstractfactory.DarkThemeFactory
import com.jerry.mobile.designpattern.create.builder.*
import com.jerry.mobile.designpattern.struct.adapter.Adaptee
import com.jerry.mobile.designpattern.struct.adapter.Adapter
import com.jerry.mobile.designpattern.struct.adapter.B
import com.jerry.mobile.designpattern.struct.adapter.ObjectAdapter
import com.jerry.mobile.designpattern.struct.bridge.Abstraction
import com.jerry.mobile.designpattern.struct.bridge.ConcreateImplementorA
import com.jerry.mobile.designpattern.struct.bridge.ConcreateImplementorB
import com.jerry.mobile.designpattern.struct.bridge.RefinedAbstraction
import com.jerry.mobile.designpattern.struct.decorator.Boy
import com.jerry.mobile.designpattern.struct.decorator.CheapCloth
import com.jerry.mobile.designpattern.struct.decorator.ExpensiveCloth
import com.jerry.mobile.designpattern.struct.decorator.Person
import com.jerry.mobile.designpattern.struct.facade.Facade
import com.jerry.mobile.designpattern.struct.proxy.*
import com.kongzue.kongzueupdatesdk.v3.UpdateUtil
import com.kongzue.kongzueupdatesdk.v3.UpdateUtil.OnUpdateStatusChangeListener
import java.lang.reflect.Proxy

class HomeFragment2 : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private var updateUtil:UpdateUtil?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer { textView.text = it })
        val fieldJni = HelloWorldJNI()

        //?????????
         updateUtil = activity?.let { UpdateUtil(it) }
        val onUpdateStatusChangeListener: OnUpdateStatusChangeListener =
            object : OnUpdateStatusChangeListener {
                override fun onDownloadStart() {
//                    txtCustomStatus.setText("????????????")
                }

                override fun onDownloading(progress: Int) {
//                    txtCustomStatus.setText("???????????????$progress%")
//                    progressBar.setProgress(progress)
                }

                override fun onDownloadCompleted() {
//                    txtCustomStatus.setText("????????????")
                }

                override fun onInstallStart() {
//                    txtCustomStatus.setText("????????????")
                }

                override fun onDownloadCancel() {
//                    txtCustomStatus.setText("????????????")
                }
            }
        updateUtil?.setOnUpdateStatusChangeListener(onUpdateStatusChangeListener)
            ?.showDownloadNotification("????????????", "????????????UpdateV3????????????...")
            ?.showDownloadProgressDialog("????????????", "????????????", "??????")?.start(
            "http:www.baidu.com",  //????????????
            "????????????",
            """
                1.????????????????????????????????????????????????????????????
                2.??????????????????????????????????????????????????????
                3.??????????????????????????????????????????????????????????????????
                4.????????????????????????GitHub???????????????+1s
                5.????????????????????????????????????????????????
                """.trimIndent(),
            "??????",
            "??????",
            "?????????",
            false
        )


        binding.btBridge.setOnClickListener {
//            val text: String = HelloWorldJNI.getJniString("jerry")
//            binding.btBridge.text=text

//            Log.e("TAG", "????????????num = " + fieldJni.num)
//            Log.e("TAG", "????????????" + fieldJni.addNum())

            //??????
//            Log.e("TAG", "????????????name = " + HelloWorldJNI.name);
//            fieldJni.accessStaticField();
//            Log.e("TAG", "????????????" + HelloWorldJNI.name);
//            binding.btBridge.text= fieldJni.addNum().toString()

            //??????
            Log.e("TAG", "????????????age = " + fieldJni.getAge());
            fieldJni.accessPrivateField();
            Log.e("TAG", "????????????age = " + fieldJni.getAge());
            binding.btBridge.text=  fieldJni.getAge().toString()
        }
//        binding.btBridge.setOnClickListener {
            val abstraction: Abstraction = RefinedAbstraction()
            //????????????????????????
            abstraction.implementor = ConcreateImplementorA()
            abstraction.operation()
            abstraction.implementor = ConcreateImplementorB()
            abstraction.operation()


            val person: Person = Boy()
            val cheapCloth = CheapCloth(person)
            cheapCloth.dressed()
            val expensiveCloth = ExpensiveCloth(person)
            expensiveCloth.dressed()

            val shop = Shop()//????????????
            val proxyShop = ProxyShop(shop)
            proxyShop.shop("??????")

            val friend = Friend();//????????????
            val dynamiProxyHandler = DynamiProxyHandler(friend);
            val shop1: IShop = Proxy.newProxyInstance(
                Friend::class.java.classLoader,
                Friend::class.java.interfaces,
                dynamiProxyHandler
            ) as IShop
            shop1.shop("??????")

            val facade = Facade() //????????????
            facade.open()

            //???????????????
            val adapter = Adapter()
            adapter.method1()
            adapter.method2()

            //???????????????
            val objectAdapter = ObjectAdapter(Adaptee())
            objectAdapter.method1()
            objectAdapter.method2()

            //???????????????
            val b: B = object : B() {
                override fun a2() {
                    super.a2()
                    Log.i("a2", "a2????????????")
                }
            }
            b.a2()

            //???????????????
//            val director = ComputerDirector()
//            val amdComputerBuilder = AmdComputerBuilder();
//            director.construct(amdComputerBuilder);
//            val amdComputer = amdComputerBuilder.computer;
//            Log.i("", "??????AMD???????????????$amdComputer");

//            val intelComputerBuilder = IntelComputerBuilder();
//            director.construct(intelComputerBuilder);
//            val intelComputer = intelComputerBuilder.computer;
//            Log.i("", "??????Intel???????????????$intelComputer");


            // ??? Builder ??????
            val computer = MyComputer(" cpu", "screen", "memory", "mainboard");
            // Builder ??????
            val newComputer = NewMyComputer.Builder()
                .cpu("cpu")
                .screen("screen")
                .memory("memory")
                .mainboard("mainboard")
                .build();


            //????????????
            val factory = DarkThemeFactory(context)
            //????????????????????????
            factory.createButton();
            ////???????????????????????????
            factory.createToolbar()

            //???????????????
            val subscriptionSubject = SubscriptionSubject()
            subscriptionSubject.attach(WeixinUser("??????"))
            subscriptionSubject.attach(WeixinUser("??????"))
            subscriptionSubject.attach(WeixinUser("??????"))
            subscriptionSubject.notify("???????????????????????????");

            //????????????
            val strategy = Strategy(OperationAdd());
            strategy.executeStrategy(6, 3)
            Log.i("????????????6+3", ""+strategy.executeStrategy(6, 3))
            val strategy2 = Strategy(OperationSubtract());
            strategy2.executeStrategy(6, 3)
            Log.i("????????????6-3", ""+strategy2.executeStrategy(6, 3))
            val strategy3 = Strategy(OperationSubtract());
            strategy3.executeStrategy(6, 3)
            Log.i("????????????6*3", ""+strategy3.executeStrategy(6, 3))


            val user= UserJava()
            user.age
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        updateUtil?.recycle()
    }
}