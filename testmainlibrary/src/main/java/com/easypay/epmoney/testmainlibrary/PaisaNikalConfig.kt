/**
 *Created by dhruv on 10-09-2019.
 */
package com.easypay.epmoney.testmainlibrary

import android.content.Context
import android.widget.Toast

/**
 *Created by dhruv on 10-09-2019.
 */
class PaisaNikalConfig {

    companion object{
        fun toast(c: Context,m:String){
            Toast.makeText(c, m, Toast.LENGTH_LONG).show()
        }
    }
}