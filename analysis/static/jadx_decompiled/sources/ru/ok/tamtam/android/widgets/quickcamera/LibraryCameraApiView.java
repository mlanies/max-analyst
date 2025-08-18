package ru.ok.tamtam.android.widgets.quickcamera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.crb;
import defpackage.cx1;
import defpackage.hv1;
import defpackage.kkf;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class LibraryCameraApiView extends FrameLayout implements hv1 {
    public LibraryCameraApiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        View view = new View(context);
        view.setKeepScreenOn(true);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // defpackage.hv1
    public final void a(File file) {
    }

    @Override // defpackage.hv1
    public final void b() {
    }

    @Override // defpackage.hv1
    public final void c() {
    }

    @Override // defpackage.hv1
    public final void d(ExecutorService executorService) {
    }

    @Override // defpackage.hv1
    public final void e() {
    }

    @Override // defpackage.hv1
    public final void f(boolean z) {
    }

    @Override // defpackage.hv1
    public final void g() {
    }

    @Override // android.view.View, defpackage.hv1
    public View getRootView() {
        return this;
    }

    @Override // defpackage.hv1
    public final void h() {
    }

    @Override // defpackage.hv1
    public final void i() {
    }

    @Override // defpackage.hv1
    public final boolean j() {
        return false;
    }

    @Override // defpackage.hv1
    public void setCameraListener(cx1 cx1Var) {
    }

    @Override // defpackage.hv1
    public void setFlash(String str) {
    }

    public void setPictureSize(crb crbVar) {
    }

    public void setVideoQuality(kkf kkfVar) {
    }
}
