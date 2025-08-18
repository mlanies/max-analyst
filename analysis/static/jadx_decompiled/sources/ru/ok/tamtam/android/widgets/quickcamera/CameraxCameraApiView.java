package ru.ok.tamtam.android.widgets.quickcamera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.adc;
import defpackage.b9b;
import defpackage.bx1;
import defpackage.c54;
import defpackage.cdc;
import defpackage.crb;
import defpackage.cx1;
import defpackage.cy1;
import defpackage.dy1;
import defpackage.eg7;
import defpackage.ey1;
import defpackage.fjc;
import defpackage.gv1;
import defpackage.hg7;
import defpackage.hi5;
import defpackage.hm9;
import defpackage.hv1;
import defpackage.ig7;
import defpackage.kkf;
import defpackage.kq0;
import defpackage.kw1;
import defpackage.l;
import defpackage.l9b;
import defpackage.mb0;
import defpackage.n8b;
import defpackage.ngg;
import defpackage.nx0;
import defpackage.ot3;
import defpackage.px1;
import defpackage.q8b;
import defpackage.rxd;
import defpackage.y8;
import defpackage.z7;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ok/tamtam/android/widgets/quickcamera/CameraxCameraApiView;", "Landroid/widget/FrameLayout;", "Lhv1;", "", "getStatusBarHeight", "()I", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "Lcrb;", "sizeSelector", "Le5f;", "setPictureSize", "(Lcrb;)V", "Lkkf;", "videoQuality", "setVideoQuality", "(Lkkf;)V", "Lcx1;", "cameraListener", "setCameraListener", "(Lcx1;)V", "", "flash", "setFlash", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class CameraxCameraApiView extends FrameLayout implements hv1 {
    public static final /* synthetic */ int u0 = 0;
    public final Executor a;
    public final q8b b;
    public final ig7 c;
    public final bx1 o;
    public cx1 s0;
    public cdc t0;

    public CameraxCameraApiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    private final int getStatusBarHeight() {
        WindowInsets rootWindowInsets;
        Insets insets;
        Window window;
        Context context = getContext();
        View decorView = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = new Rect();
            if (decorView != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            return rect.top;
        }
        if (decorView == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null || (insets = rootWindowInsets.getInsets(1)) == null) {
            return 0;
        }
        return insets.top;
    }

    @Override // defpackage.hv1
    public final void a(File file) {
        hm9.n(CameraxCameraApiView.class.getName(), "startRecordVideo");
        if (z7.c(getContext(), "android.permission.RECORD_AUDIO") != 0) {
            hm9.m0(CameraxCameraApiView.class.getName(), "No permission to record audio", new Object[0]);
            return;
        }
        hi5 hi5VarV = new y8(file).v();
        cy1 cy1Var = new cy1(0, this);
        ig7 ig7Var = this.c;
        ig7Var.getClass();
        kq0.e();
        c54.p("Camera not initialized.", ig7Var.i());
        kq0.e();
        boolean z = false;
        c54.p("VideoCapture disabled.", (ig7Var.b & 4) != 0);
        kq0.e();
        cdc cdcVar = ig7Var.g;
        if (cdcVar != null && !cdcVar.a.get()) {
            z = true;
        }
        c54.p("Recording video. Only one recording can be active at a time.", !z);
        Context context = ig7Var.B;
        kw1 kw1Var = new kw1(ig7Var, ot3.a(context), cy1Var);
        nx0 nx0Var = new nx0(context, (adc) ig7Var.f.L(), hi5VarV);
        if (ngg.m(context, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
        }
        nx0Var.x();
        cdc cdcVarU = nx0Var.u(this.a, kw1Var);
        ig7Var.h.put(kw1Var, cdcVarU);
        ig7Var.g = cdcVarU;
        this.t0 = cdcVarU;
    }

    @Override // defpackage.hv1
    public final void b() {
        try {
            this.c.l(1);
        } catch (IllegalStateException e) {
            hm9.p(CameraxCameraApiView.class.getName(), "failed to enable photo-mode", e);
            cx1 cx1Var = this.s0;
            if (cx1Var != null) {
                ((rxd) cx1Var).b0(new CameraExceptionImpl(e));
            }
        }
    }

    @Override // defpackage.hv1
    public final void c() {
        hm9.n(CameraxCameraApiView.class.getName(), "destroyCamera");
        ig7 ig7Var = this.c;
        ig7Var.getClass();
        kq0.e();
        ig7Var.E = null;
        ig7Var.m = null;
        l9b l9bVar = ig7Var.n;
        if (l9bVar != null) {
            l9bVar.a.f();
        }
        this.o.b.d(eg7.ON_DESTROY);
    }

    @Override // defpackage.hv1
    public final void d(ExecutorService executorService) {
        hm9.n(CameraxCameraApiView.class.getName(), "takePicture");
        ey1 ey1Var = new ey1(0, this);
        ig7 ig7Var = this.c;
        ig7Var.getClass();
        kq0.e();
        c54.p("Camera not initialized.", ig7Var.i());
        kq0.e();
        c54.p("ImageCapture disabled.", (ig7Var.b & 1) != 0);
        kq0.e();
        if (ig7Var.d.H() == 3 && (ig7Var.f() == null || ig7Var.f().b == null)) {
            throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
        }
        ig7Var.d.J(executorService, ey1Var);
    }

    @Override // defpackage.hv1
    public final void e() {
        bx1 bx1Var = this.o;
        ig7 ig7Var = this.c;
        hm9.n(CameraxCameraApiView.class.getName(), "startPreviewCamera");
        try {
            ig7Var.getClass();
            kq0.e();
            ig7Var.E = bx1Var;
            ig7Var.q(null);
            bx1Var.b.d(eg7.ON_RESUME);
        } catch (IllegalStateException e) {
            hm9.p(CameraxCameraApiView.class.getName(), "failed to bind camera controller, start preview aborted", e);
            ig7Var.getClass();
            kq0.e();
            ig7Var.E = null;
            ig7Var.m = null;
            l9b l9bVar = ig7Var.n;
            if (l9bVar != null) {
                l9bVar.a.f();
            }
            cx1 cx1Var = this.s0;
            if (cx1Var != null) {
                ((rxd) cx1Var).b0(new CameraExceptionImpl(e));
            }
        }
    }

    @Override // defpackage.hv1
    public final void f(boolean z) {
        this.c.k(z ? px1.b : px1.c);
    }

    @Override // defpackage.hv1
    public final void g() {
        hm9.n(CameraxCameraApiView.class.getName(), "stopRecordVideo");
        cdc cdcVar = this.t0;
        if (cdcVar != null) {
            cdcVar.close();
        }
        this.t0 = null;
    }

    @Override // android.view.View, defpackage.hv1
    public View getRootView() {
        return this;
    }

    @Override // defpackage.hv1
    public final void h() {
        hm9.n(CameraxCameraApiView.class.getName(), "stopPreviewCamera");
        this.o.b.d(eg7.ON_STOP);
    }

    @Override // defpackage.hv1
    public final void i() {
        this.c.l(4);
    }

    @Override // defpackage.hv1
    public final boolean j() {
        ig7 ig7Var = this.c;
        ig7Var.getClass();
        kq0.e();
        hg7 hg7Var = ig7Var.m;
        fjc fjcVar = hg7Var == null ? null : hg7Var.c.C0;
        return fjcVar != null && fjcVar.a.g() == 0;
    }

    @Override // defpackage.hv1
    public void setCameraListener(cx1 cameraListener) {
        this.s0 = cameraListener;
    }

    @Override // defpackage.hv1
    public void setFlash(String flash) {
        int iOrdinal = gv1.valueOf(flash).ordinal();
        int i = 2;
        if (iOrdinal != 0) {
            int i2 = 1;
            if (iOrdinal != 1) {
                i2 = 0;
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i = i2;
        }
        this.c.m(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        this.b.setOnClickListener(l);
    }

    public void setPictureSize(crb sizeSelector) {
    }

    public void setVideoQuality(kkf videoQuality) {
        int iOrdinal = videoQuality.ordinal();
        ig7 ig7Var = this.c;
        switch (iOrdinal) {
            case 0:
                ig7Var.n(b9b.k(mb0.h));
                return;
            case 1:
                ig7Var.n(b9b.k(mb0.i));
                return;
            case 2:
                ig7Var.n(b9b.k(mb0.h));
                return;
            case 3:
                ig7Var.n(b9b.k(mb0.d));
                return;
            case 4:
                ig7Var.n(b9b.k(mb0.e));
                return;
            case 5:
                ig7Var.n(b9b.k(mb0.f));
                return;
            case 6:
                ig7Var.n(b9b.k(mb0.g));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public CameraxCameraApiView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.a = ot3.a(context);
        q8b q8bVar = new q8b(context);
        this.b = q8bVar;
        ig7 ig7Var = new ig7(context);
        this.c = ig7Var;
        bx1 bx1Var = new bx1();
        this.o = bx1Var;
        q8bVar.setKeepScreenOn(true);
        addView(q8bVar, new FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels + getStatusBarHeight()));
        q8bVar.getPreviewStreamState().e(bx1Var, new dy1(0, new l(21, this)));
        q8bVar.setImplementationMode(n8b.COMPATIBLE);
        ig7Var.k(px1.c);
        ig7Var.l(1);
        q8bVar.getViewPort();
        kq0.e();
        ig7Var.t = true;
        q8bVar.setController(ig7Var);
    }
}
