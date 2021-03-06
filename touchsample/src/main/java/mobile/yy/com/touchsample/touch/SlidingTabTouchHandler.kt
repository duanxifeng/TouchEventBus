package mobile.yy.com.touchsample.touch

import android.view.MotionEvent
import com.gxz.PagerSlidingTabStrip
import mobile.yy.com.toucheventbus.AttachToViewTouchEventHandler

/**
 * Created by 张宇 on 2018/4/25.
 * E-mail: zhangyu4@yy.com
 * YY: 909017428
 *
 * PagerSlidingTabStrip的点击事件
 */
class SlidingTabTouchHandler : AttachToViewTouchEventHandler<PagerSlidingTabStrip>() {

    override fun onTouch(v: PagerSlidingTabStrip, e: MotionEvent, hasBeenIntercepted: Boolean, insideView: Boolean): Boolean {
        v.dispatchTouchEvent(e)
        return false
    }

    override fun nextHandler() = listOf(TabTouchHandler::class.java)

    override fun name() = "SlidingTabTouchHandler"
}