package com.bossbod

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.bossbod.databinding.ActivityYourPlanBinding
import com.bossbod.objects.HomePlanTableClass
import com.bossbod.utils.Constant
import com.bossbod.utils.Utils


class YourPlanActivity : BaseActivity() {
    val TAG = YourPlanActivity::class.java.name + Constant.ARROW

    var binding: ActivityYourPlanBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_your_plan)
        init()
    }


    private fun init() {

        val str  = Utils.getPref(this,Constant.PREF_GOAL,"")

        if(str.isNullOrEmpty().not())
        {
            var planData: HomePlanTableClass = Gson().fromJson(str!!, object : TypeToken<HomePlanTableClass>() {}.type)

            binding!!.imgPlan.setImageResource(Utils.getDrawableId(planData!!.planImage,this))
            binding!!.tvPlanName.text = planData.planName

            Utils.setDayProgressData(this, planData, binding!!.tvDaysLeft,null, binding!!.pbDay)
        }

        binding!!.btnNext.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }

        binding!!.tvSkip.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }

        binding!!.tvGoToHomePage.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }
    }

}
