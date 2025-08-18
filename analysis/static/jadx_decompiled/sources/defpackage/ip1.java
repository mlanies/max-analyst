package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* loaded from: classes.dex */
public final class ip1 extends FrameLayout implements dra {
    public static final /* synthetic */ int z0 = 0;
    public final khe a;
    public final Handler b;
    public TextureViewRenderer c;
    public gp1 o;
    public k56 s0;
    public haf t0;
    public boolean u0;
    public llf v0;
    public final je7 w0;
    public boolean x0;
    public boolean y0;

    public ip1(Context context) {
        ugf videoLayoutUpdatesController;
        super(context, null, 0);
        this.a = new khe(new dk1(15));
        this.b = new Handler(Looper.getMainLooper());
        this.w0 = tu0.r(3, new md1(4, this));
        setClipChildren(false);
        setClipToPadding(false);
        addOnLayoutChangeListener(new qq0(3, this));
        if (!isLaidOut() || this.c == null || (videoLayoutUpdatesController = getVideoLayoutUpdatesController()) == null) {
            return;
        }
        videoLayoutUpdatesController.a(this, this.v0);
    }

    public static void a(ip1 ip1Var) {
        ip1Var.b.post(ip1Var.getUpdateWhenReadyRunnable());
    }

    private final FrameLayout.LayoutParams getParams() {
        if (this.x0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        return layoutParams2;
    }

    private final Runnable getUpdateWhenReadyRunnable() {
        return (Runnable) this.w0.getValue();
    }

    private final era getVideoController() {
        return (era) this.a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ugf getVideoLayoutUpdatesController() {
        k56 k56Var = this.s0;
        if (k56Var != null) {
            return (ugf) k56Var.invoke();
        }
        return null;
    }

    public final void c() {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            llf llfVar = this.v0;
            if (llfVar != null) {
                ((fra) getVideoController()).removeParticipantView(llfVar.b, textureViewRenderer);
            }
            ugf videoLayoutUpdatesController = getVideoLayoutUpdatesController();
            if (videoLayoutUpdatesController != null) {
                videoLayoutUpdatesController.c(textureViewRenderer);
            }
            ((fra) getVideoController()).releaseParticipantView(textureViewRenderer);
            removeAllViews();
        }
        gp1 gp1Var = this.o;
        if (gp1Var != null) {
            gp1Var.a(false);
        }
        this.v0 = null;
        this.c = null;
        this.y0 = false;
        this.b.removeCallbacks(getUpdateWhenReadyRunnable());
        ((fra) getVideoController()).X.remove(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip1.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        ugf videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.a(this, this.v0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ugf videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.c(this);
        }
        c();
    }

    public final void setFullScreen(boolean z) {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            ViewGroup.LayoutParams layoutParams = textureViewRenderer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            setLayoutParams(getParams());
            textureViewRenderer.setLayoutParams(layoutParams);
        }
        this.x0 = z;
    }

    public final void setListener(gp1 gp1Var) {
        this.o = gp1Var;
    }

    public final void setVideoLayoutUpdatesControllerProvider(k56 k56Var) {
        this.s0 = k56Var;
    }
}
