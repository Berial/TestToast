package berial.testtoast

import android.app.Application
import android.view.Gravity
import com.drake.tooltip.ToastConfig
import com.hjq.toast.ToastUtils

/**
 *
 * @author Berial
 * @date 2022/1/7
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        ToastConfig.apply {
            onToast { _, _ ->
                setGravity(Gravity.CENTER, 0, 0)
            }
        }

        ToastUtils.init(this)
        ToastUtils.setGravity(Gravity.CENTER)
    }
}