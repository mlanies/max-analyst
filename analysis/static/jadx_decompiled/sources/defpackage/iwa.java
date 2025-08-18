package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import one.me.sdk.zoom.ZoomableDraweeView;

/* loaded from: classes.dex */
public final class iwa extends ZoomableDraweeView {
    public final String G0;
    public final GestureDetector H0;
    public hwa I0;
    public yt6 J0;
    public boolean K0;

    public iwa(Context context) {
        super(context);
        this.G0 = iwa.class.getName();
        GestureDetector gestureDetector = new GestureDetector(context, new q00(15, this));
        this.H0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        ma6 ma6Var = new ma6(getResources());
        ma6Var.l = ssc.o;
        ma6Var.b = 0;
        setHierarchy(ma6Var.a());
    }

    private final e2b getControllerBuilder() {
        e2b e2bVar = s36.a.get();
        yt6 yt6Var = this.J0;
        boolean z = false;
        if (yt6Var != null && yt6Var.e) {
            z = true;
        }
        e2bVar.j = z;
        Uri uri = yt6Var != null ? yt6Var.b : null;
        if (uri != null) {
            e2bVar.e = xv6.d(uri).a();
        } else {
            e2bVar.e = null;
        }
        e2bVar.k = true;
        e2bVar.l = getController();
        return e2bVar;
    }

    public final boolean getFailure() {
        return this.K0;
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView
    public final void n(Throwable th) {
        super.n(th);
        this.K0 = true;
        hm9.p(this.G0, "Set photo attach failed", th);
        hwa hwaVar = this.I0;
        if (hwaVar != null) {
            hwaVar.n();
        }
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView
    public final void o(ru6 ru6Var) {
        super.o(ru6Var);
        this.K0 = false;
        hwa hwaVar = this.I0;
        if (hwaVar != null) {
            hwaVar.b();
        }
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView, defpackage.uq4, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.H0.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void r(yt6 yt6Var, boolean z) {
        boolean z2 = !yt6Var.equals(this.J0) || z;
        this.J0 = yt6Var;
        this.K0 = false;
        if (z2) {
            e2b controllerBuilder = getControllerBuilder();
            Uri uri = yt6Var.h;
            if (uri != null) {
                controllerBuilder.f = xv6.d(uri).a();
            }
            setController(controllerBuilder.a());
        }
    }

    public final void setListener(hwa hwaVar) {
        this.I0 = hwaVar;
    }
}
