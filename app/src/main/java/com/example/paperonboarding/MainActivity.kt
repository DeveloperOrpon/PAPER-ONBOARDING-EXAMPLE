package com.example.paperonboarding
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.ramotion.paperonboarding.PaperOnboardingFragment
import com.ramotion.paperonboarding.PaperOnboardingPage


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        val paperOnboardingFragment = PaperOnboardingFragment.newInstance(getDataforOnboarding())
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.frame_layout, paperOnboardingFragment);
        fragmentTransaction.commit()

    }

    private fun getDataforOnboarding(): ArrayList<PaperOnboardingPage> {
        val source = PaperOnboardingPage(
            "Bank",
            "Your Bank is One Of The Best bank In Bangladesh",
            Color.parseColor("#FFB3B3"),
            R.drawable.ic_baseline_account_balance_24,
            R.drawable.ic_baseline_account_balance_24
        )
        val source1 = PaperOnboardingPage(
            "Hotel",
            "In Your Hotel is Hospitality and service is one of the good",
            Color.parseColor("#FFDBA4"),
            R.drawable.ic_baseline_home_repair_service_24,
            R.drawable.ic_baseline_home_repair_service_24
        )
        val source2 = PaperOnboardingPage(
            "Store",
            "Your Store is Bigger then any and Safety and security is 24H",
            Color.parseColor("#C1EFFF"),
            R.drawable.ic_baseline_store_24,
            R.drawable.ic_baseline_store_24
        )
        val element=ArrayList<PaperOnboardingPage>()
        element.add(source)
        element.add(source1)
        element.add(source2)
        return element


    }
}