package smartdrive.neube.example.com.openclosewindow

import android.arch.lifecycle.ViewModel
import android.content.Context

class BackViewodel : ViewModel() {

    val back = Back()

    val partfirebase = Fireback().imageId()

    fun updateDrawableResource(){

        back.mDrawableResource=partfirebase

    }

}

//the sta
