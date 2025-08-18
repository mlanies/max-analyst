package ru.ok.messages.views.widgets;

import android.content.res.Configuration;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import defpackage.gn5;

/* loaded from: classes2.dex */
public class FloatingLayout extends FrameLayout {
    private int getTargetXAnimateToEdge() {
        throw null;
    }

    public int getBottomMargin() {
        return 0;
    }

    public int getLeftMargin() {
        return 0;
    }

    public int getRightMargin() {
        return 0;
    }

    public int getTopMargin() {
        throw null;
    }

    public int getWindowHeight() {
        throw null;
    }

    public WindowManager.LayoutParams getWindowManagerLayoutParams() {
        return null;
    }

    public int getWindowWidth() {
        throw null;
    }

    public int getXPos() {
        throw null;
    }

    public int getYPos() {
        throw null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getContext();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    public void setListener(gn5 gn5Var) {
    }

    @Keep
    public void setX(int i) {
        throw null;
    }

    @Keep
    public void setY(int i) {
        throw null;
    }
}
