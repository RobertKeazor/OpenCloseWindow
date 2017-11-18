package smartdrive.neube.example.com.openclosewindow

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import smartdrive.neube.example.com.openclosewindow.databinding.ActivityMainBinding
import android.R.attr.data
import android.view.View


class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {

        DataBindingUtil.bind<ActivityMainBinding>(viewRoot)

    }

    private val viewModel: BackViewodel by lazy {
        ViewModelProviders.of(this).get(BackViewodel::class.java)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
//        setContentView(R.layout.activity_main)
        //       val Regular = BackViewModel()
        binding.litener.apply { viewModel.updateDrawableResource() }

//        binding.buttond1.setOnClickListener(View.OnClickListener {  })
//       binding.back = viewModel.back
//
//        binding.setObj(data)
//        binding.handler = Handlers(
//   //     viewModel.back.setDrawable(resources.getDrawable(R.mipmap.jesqpretae))
//
//        buttone1.setOnClickListener { viewModel.updateDrawableResource()}
//
    }

}
//push this code on github when i will free i will solve this error
//ok
// when?
// whats is error?
//databinding erro i didnt use this type of databinding structure i used different one
//whic/h/ w
        //what abhout app:selected in xml file?
//that i need to check
//error is: the image not change when click
//yes
//why that ined to check?
// see u later//ty


