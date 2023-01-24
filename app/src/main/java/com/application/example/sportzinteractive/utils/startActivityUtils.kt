package com.application.example.sportzinteractive.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

/*

fun Activity.startActivityUtils(
    context: Context,
    componentActivity: Class<out Activity>,
    bundleKey : String ="",
    rivalryArrayList: ArrayList<*>? = null
) {
    val intent = Intent(context,componentActivity)
    if (rivalryArrayList != null)
    {
        val bundle = Bundle()
        bundle.putSerializable(bundleKey,rivalryArrayList)
        intent.putExtras(bundle)
    }
    context.startActivity(intent)


}

*/


fun Activity.startActivityUtils(a: Activity, c: Class<*>, bundle: Bundle, requestCode: Int) {

    a.startActivityForResult(Intent(a, c).putExtras(bundle), requestCode)
//    a.overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
}

