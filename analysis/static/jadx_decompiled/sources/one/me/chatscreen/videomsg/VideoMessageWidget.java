package one.me.chatscreen.videomsg;

import android.annotation.SuppressLint;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.bc7;
import defpackage.bse;
import defpackage.bx1;
import defpackage.dy1;
import defpackage.eg7;
import defpackage.eh7;
import defpackage.ejf;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.g8b;
import defpackage.gte;
import defpackage.hm9;
import defpackage.hob;
import defpackage.j47;
import defpackage.je7;
import defpackage.k56;
import defpackage.k9b;
import defpackage.ljf;
import defpackage.m56;
import defpackage.nec;
import defpackage.nhd;
import defpackage.njf;
import defpackage.od2;
import defpackage.oec;
import defpackage.ohf;
import defpackage.pjf;
import defpackage.q7c;
import defpackage.q8b;
import defpackage.rpc;
import defpackage.sif;
import defpackage.so2;
import defpackage.t8a;
import defpackage.to2;
import defpackage.tu0;
import defpackage.ujf;
import defpackage.v3c;
import defpackage.vjf;
import defpackage.vxd;
import defpackage.w7c;
import defpackage.x27;
import defpackage.ygf;
import defpackage.ze2;
import defpackage.zgf;
import defpackage.zn5;
import defpackage.zr6;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/chatscreen/videomsg/VideoMessageWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class VideoMessageWidget extends Widget {
    public static final /* synthetic */ bc7[] y0;
    public final q7c X;
    public final q7c Y;
    public final q7c Z;
    public final x27 a;
    public final je7 b;
    public final je7 c;
    public final q7c o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public ViewPropertyAnimator v0;
    public ScaleGestureDetector w0;
    public vxd x0;

    static {
        hob hobVar = new hob(VideoMessageWidget.class, "cameraPreview", "getCameraPreview()Landroidx/camera/view/PreviewView;", 0);
        oec oecVar = nec.a;
        y0 = new bc7[]{hobVar, zr6.e(oecVar, VideoMessageWidget.class, "torchButton", "getTorchButton()Landroid/widget/ImageView;", 0), zr6.f(VideoMessageWidget.class, "timerView", "getTimerView()Landroid/widget/TextView;", 0, oecVar), zr6.f(VideoMessageWidget.class, "durationView", "getDurationView()Lone/me/messages/list/ui/view/videomsg/VideoMessageDurationSlider;", 0, oecVar)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMessageWidget() {
        super(null, 0, 3, null);
        final int i = 0;
        this.a = new x27(3, null);
        je7 je7Var = so2.a;
        this.b = to2.a.getAccessor().d(ygf.class);
        this.c = createViewModelLazy(ljf.class, new nhd(14, new bse(14)));
        this.o = viewBinding(t8a.t);
        this.X = viewBinding(t8a.x);
        this.Y = viewBinding(t8a.w);
        this.Z = viewBinding(t8a.u);
        this.s0 = tu0.r(3, new bse(15));
        this.t0 = tu0.r(3, new k56(this) { // from class: mjf
            public final /* synthetic */ VideoMessageWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                VideoMessageWidget videoMessageWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = VideoMessageWidget.y0;
                        return kt3.b(videoMessageWidget.getContext(), woc.N);
                    default:
                        bc7[] bc7VarArr2 = VideoMessageWidget.y0;
                        return kt3.b(videoMessageWidget.getContext(), woc.M);
                }
            }
        });
        final int i2 = 1;
        this.u0 = tu0.r(3, new k56(this) { // from class: mjf
            public final /* synthetic */ VideoMessageWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                VideoMessageWidget videoMessageWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = VideoMessageWidget.y0;
                        return kt3.b(videoMessageWidget.getContext(), woc.N);
                    default:
                        bc7[] bc7VarArr2 = VideoMessageWidget.y0;
                        return kt3.b(videoMessageWidget.getContext(), woc.M);
                }
            }
        });
    }

    public static final void m0(VideoMessageWidget videoMessageWidget, FrameLayout frameLayout, int i, m56 m56Var) {
        videoMessageWidget.getClass();
        View imageView = new ImageView(frameLayout.getContext());
        float f = 40;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        layoutParams.leftMargin = i;
        layoutParams.bottomMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        imageView.setLayoutParams(layoutParams);
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(iG, iG, iG, iG);
        v3c.y(new ze2(3, null, 9), imageView);
        m56Var.invoke(imageView);
        frameLayout.addView(imageView);
    }

    public static final void n0(VideoMessageWidget videoMessageWidget, int i, int i2, g8b g8bVar) {
        videoMessageWidget.getClass();
        bc7[] bc7VarArr = y0;
        bc7 bc7Var = bc7VarArr[3];
        q7c q7cVar = videoMessageWidget.Z;
        ohf ohfVar = (ohf) q7cVar.T0(videoMessageWidget, bc7Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        ohfVar.setLayoutParams(layoutParams);
        ((ohf) q7cVar.T0(videoMessageWidget, bc7VarArr[3])).setVisibility(0);
        vxd vxdVar = videoMessageWidget.x0;
        if (vxdVar == null || !vxdVar.isActive()) {
            videoMessageWidget.x0 = j47.T(videoMessageWidget.getViewLifecycleScope(), null, null, new pjf(videoMessageWidget, i, i2, g8bVar, null), 3);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.a;
    }

    public final ygf o0() {
        return (ygf) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.videomsg.VideoMessageWidget.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((ejf) o0()).B0 = null;
        ejf ejfVar = (ejf) o0();
        ejfVar.getClass();
        hm9.n(ejf.class.getName(), "releaseAll videoMessage");
        bx1 bx1Var = ejfVar.K0;
        if (bx1Var != null) {
            bx1Var.b.d(eg7.ON_DESTROY);
        }
        ejfVar.K0 = null;
        ejfVar.G0.m(null, Boolean.FALSE);
        ejfVar.x0 = null;
        k9b k9bVar = ejfVar.Z;
        if (k9bVar != null) {
            k9bVar.f();
        }
        ejfVar.Z = null;
        ejfVar.z0 = null;
        ejfVar.y0 = null;
        ejfVar.v0 = null;
        zgf zgfVar = ejfVar.w0;
        if (zgfVar != null) {
            ((sif) zgfVar.e).release();
        }
        ejfVar.w0 = null;
        ejfVar.L0.compareAndSet(true, false);
        ejfVar.M0.o1(ejfVar, ejf.N0[0], null);
        ViewPropertyAnimator viewPropertyAnimator = this.v0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.w0 = null;
        vxd vxdVar = this.x0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.x0 = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        this.w0 = new ScaleGestureDetector(getContext(), new njf(this));
        eh7 viewLifecycleOwner = ((ejf) o0()).K0;
        if (viewLifecycleOwner == null) {
            viewLifecycleOwner = getViewLifecycleOwner();
        }
        ((q8b) this.o.T0(this, y0[0])).getPreviewStreamState().e(viewLifecycleOwner, new dy1(1, new rpc(15, this)));
        w7c w7cVar = ((ejf) o0()).E0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new ujf(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((ljf) this.c.getValue()).c, getViewLifecycleOwner().Q(), fg7Var), new vjf(null, this), 5), getViewLifecycleScope());
        ((ejf) o0()).B0 = new gte(12, this);
    }
}
