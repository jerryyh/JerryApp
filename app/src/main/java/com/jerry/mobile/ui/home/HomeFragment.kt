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

class HomeFragment : Fragment() {

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

        //初始化
         updateUtil = activity?.let { UpdateUtil(it) }
        val onUpdateStatusChangeListener: OnUpdateStatusChangeListener =
            object : OnUpdateStatusChangeListener {
                override fun onDownloadStart() {
//                    txtCustomStatus.setText("开始下载")
                }

                override fun onDownloading(progress: Int) {
//                    txtCustomStatus.setText("正在下载：$progress%")
//                    progressBar.setProgress(progress)
                }

                override fun onDownloadCompleted() {
//                    txtCustomStatus.setText("下载完成")
                }

                override fun onInstallStart() {
//                    txtCustomStatus.setText("开始安装")
                }

                override fun onDownloadCancel() {
//                    txtCustomStatus.setText("下载取消")
                }
            }
        updateUtil?.setOnUpdateStatusChangeListener(onUpdateStatusChangeListener)
            ?.showDownloadNotification("正在更新", "正在下载UpdateV3框架更新...")
            ?.showDownloadProgressDialog("正在下载", "后台下载", "取消")?.start(
            "http:www.baidu.com",  //开始下载
            "发现更新",
            """
                1.上线了极力要求以至于无法再拒绝的收入功能
                2.出行的二级分类加入了地铁、地铁、地铁
                3.「关于」新增应用商店评分入口，你们知道怎么做
                4.「关于」还加入了GitHub地址，情怀+1s
                5.全新的底层适配框架，优化更多机型
                """.trimIndent(),
            "开始",
            "取消",
            "去商店",
            false
        )


        binding.btBridge.setOnClickListener {
//            val text: String = HelloWorldJNI.getJniString("jerry")
//            binding.btBridge.text=text
//            Log.e("TAG", "调用前：num = " + fieldJni.num)
//            Log.e("TAG", "调用后：" + fieldJni.addNum())

            //调用
//            Log.e("TAG", "调用前：name = " + HelloWorldJNI.name);
//            fieldJni.accessStaticField();
//            Log.e("TAG", "调用后：" + HelloWorldJNI.name);
//            binding.btBridge.text= fieldJni.addNum().toString()

            //调用
            Log.e("TAG", "调用前：age = " + fieldJni.getAge());
            fieldJni.accessPrivateField();
            Log.e("TAG", "调用后：age = " + fieldJni.getAge());
            binding.btBridge.text=  fieldJni.getAge().toString()
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        updateUtil?.recycle()
    }
}