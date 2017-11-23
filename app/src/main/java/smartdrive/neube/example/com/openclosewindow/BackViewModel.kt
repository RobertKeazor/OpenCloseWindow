package smartdrive.neube.example.com.openclosewindow

import android.arch.lifecycle.ViewModel
import android.view.View

class BackViewodel : ViewModel() {
    fun updateDrawableResource(view: View){
        view.setBackgroundResource(Fireback().imageId())
    }
}