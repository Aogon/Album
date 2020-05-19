package app.sakai.tororoimo.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preview = Intent(this, PreviewActivity::class.java)

        setOnClick(preview, albumImage1, R.drawable.sea_image, "海")
        setOnClick(preview, albumImage2, R.drawable.cat_image, "猫")
        setOnClick(preview, albumImage3, R.drawable.dog_image, "犬")
        setOnClick(preview, albumImage4, R.drawable.cake_image, "ケーキ")
        setOnClick(preview, albumImage5, R.drawable.night_image, "夜")
        setOnClick(preview, albumImage6, R.drawable.flower_image, "花")


    }

    fun setOnClick(preview: Intent, albumImage: ImageView, resId: Int, title: String) {

        albumImage.setOnClickListener {
            preview.putExtra("image", resId)
            preview.putExtra("title", title)
            startActivity(preview)
        }


    }

}
