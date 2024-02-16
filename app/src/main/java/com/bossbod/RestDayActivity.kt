package com.bossbod

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.bossbod.databinding.ActivityRestDayBinding
import com.bossbod.interfaces.TopBarClickListener
import com.bossbod.objects.HomePlanTableClass
import com.bossbod.utils.Constant
import com.bossbod.utils.Utils
import java.util.*


class RestDayActivity : BaseActivity() {

    var binding: ActivityRestDayBinding? = null
    var workoutPlanData: HomePlanTableClass? = null
    var dayId:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_rest_day)

        loadBannerAd(binding!!.llAdView,binding!!.llAdViewFacebook)
        initIntentParam()
        initBack()
        init()
    }

    private fun initIntentParam() {
        try {
            if (intent.extras != null) {
                if (intent.extras!!.containsKey("workoutPlanData")) {
                    val str = intent.getStringExtra("workoutPlanData")
                    workoutPlanData = Gson().fromJson(str, object :
                        TypeToken<HomePlanTableClass>() {}.type)!!
                    dayId = intent.getStringExtra(Constant.extra_day_id)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun init() {
        binding!!.topbar.tvTitleText.text = getString(R.string.rest_day)
        binding!!.topbar.isBackShow = true
        binding!!.topbar.topBarClickListener = TopClickListener()
        binding!!.handler = ClickHandler()

    }



    override fun onResume() {
        super.onResume()
    }


    inner class ClickHandler {

        fun onFinishedClick() {
            dayId?.let { dbHelper.updatePlanDayCompleteByDayId(it) }
            finish()
        }
    }

    inner class TopClickListener : TopBarClickListener {
        override fun onTopBarClickListener(view: View?, value: String?) {
            Utils.hideKeyBoard(getActivity(), view!!)

            if (value.equals(getString(R.string.back))) {
                finish()
                setResult(Activity.RESULT_OK)
            }

        }
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_OK)
        super.onBackPressed()
    }

}
