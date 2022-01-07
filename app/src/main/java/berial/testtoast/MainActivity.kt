package berial.testtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.drake.tooltip.toast
import com.hjq.toast.ToastUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_toast_utils).setOnClickListener {
            ToastUtils.show("ToastUtils")
        }

        findViewById<Button>(R.id.btn_tooltip).setOnClickListener {
            toast("Tooltip")
        }
    }
}