package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import one.me.chats.tab.ChatsTabWidget;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class ck implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ck() {
        this.a = 11;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v11 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws InterruptedException {
        hj hjVar;
        AccessibilityManager accessibilityManager;
        RecyclerView recyclerView;
        int i = 5;
        switch (this.a) {
            case 0:
                dk dkVar = (dk) this.b;
                if (((hj) dkVar.Z) == null && dkVar.c) {
                    hj hjVar2 = new hj((View) dkVar.o);
                    dkVar.Z = hjVar2;
                    hjVar2.a();
                }
                hj hjVar3 = (hj) dkVar.Z;
                if (hjVar3 != null && hjVar3.c && (hjVar = (hj) dkVar.Z) != null) {
                    hjVar.a();
                    break;
                }
                break;
            case 2:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                String str = chatsTabWidget.b;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | tabs view attached to window. Scope isActive: ", j1e.z(chatsTabWidget.getLifecycleScope())), null);
                }
                ChatsTabWidget chatsTabWidget2 = (ChatsTabWidget) this.b;
                chatsTabWidget2.B0 = od2.L(new zn5(chatsTabWidget2.p0().w0, new tz2(null, (ChatsTabWidget) this.b), i), ((ChatsTabWidget) this.b).getViewLifecycleScope());
                ChatsTabWidget chatsTabWidget3 = (ChatsTabWidget) this.b;
                int iIntValue = ((Number) chatsTabWidget3.p0().v0.a.getValue()).intValue();
                chatsTabWidget3.n0().e(iIntValue, false);
                chatsTabWidget3.m0().q(iIntValue, 0.0f, true, true, true);
                break;
            case 3:
                ((e53) this.b).e.p();
                break;
            case 4:
                mw4 mw4Var = (mw4) this.b;
                Drawable drawable = ((ImageView) mw4Var.a).getDrawable();
                zjVar = drawable instanceof zj ? (zj) drawable : 0;
                if (zjVar != 0) {
                    Drawable drawableB = zjVar.b();
                    RLottieDrawable rLottieDrawable = zjVar.x0;
                    if (drawableB == rLottieDrawable && rLottieDrawable != null) {
                        rLottieDrawable.addParentView(mw4Var.G0);
                    }
                    zjVar.start();
                    break;
                }
                break;
            case 5:
                m15 m15Var = (m15) this.b;
                if (m15Var.I0 != null && (accessibilityManager = m15Var.H0) != null) {
                    WeakHashMap weakHashMap = zmf.a;
                    if (m15Var.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new b4(m15Var.I0));
                        break;
                    }
                }
                break;
            case 7:
                ImageView imageView = (ImageView) this.b;
                Object drawable2 = imageView.getDrawable();
                Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
                if (animatable != null) {
                    animatable.start();
                }
                Drawable drawable3 = imageView.getDrawable();
                zj zjVar = drawable3 instanceof zj ? (zj) drawable3 : null;
                if (zjVar != null) {
                    Drawable drawableB2 = zjVar.b();
                    RLottieDrawable rLottieDrawable2 = zjVar.x0;
                    if (drawableB2 == rLottieDrawable2) {
                        if (rLottieDrawable2 != null) {
                            rLottieDrawable2.setMasterParent(imageView);
                        }
                        RLottieDrawable rLottieDrawable3 = zjVar.x0;
                        if (rLottieDrawable3 != null) {
                            rLottieDrawable3.setAllowDecodeSingleFrame(true);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ujc ujcVar = (ujc) this.b;
                if (!ujcVar.f && (recyclerView = (RecyclerView) ujcVar.d.get()) != null) {
                    ujcVar.a(recyclerView);
                    break;
                }
                break;
            case 10:
                WeakHashMap weakHashMap2 = zmf.a;
                mmf.c(view);
                y27.a.a((g1e) this.b);
                break;
            case 11:
                vxd vxdVar = (vxd) this.b;
                if (vxdVar == null || !vxdVar.isActive()) {
                    TextView textView = view instanceof TextView ? (TextView) view : null;
                    if (textView != null) {
                        this.b = od2.L(new ac(od2.h(new zn5(new zn5((w7c) qp4.u0.b(textView.getContext()).t0, new bpf(textView, null)), new cpf(textView, null), i)), 18, new er2(3, zjVar, 4)), lnf.b(view));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) throws InterruptedException {
        AccessibilityManager accessibilityManager;
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                dk dkVar = (dk) this.b;
                hj hjVar = (hj) dkVar.Z;
                if (hjVar != null) {
                    hjVar.c = true;
                    hj.o.removeCallbacks(hjVar);
                }
                dkVar.Z = null;
                break;
            case 1:
                zz1 zz1Var = (zz1) this.b;
                ViewTreeObserver viewTreeObserver = zz1Var.J0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        zz1Var.J0 = view.getViewTreeObserver();
                    }
                    zz1Var.J0.removeGlobalOnLayoutListener(zz1Var.u0);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                String str = chatsTabWidget.b;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | tabs view detached from window. Scope isActive: ", j1e.z(chatsTabWidget.getLifecycleScope())), null);
                }
                x77 x77Var = ((ChatsTabWidget) this.b).B0;
                if (x77Var != null) {
                    x77Var.cancel(null);
                }
                ((ChatsTabWidget) this.b).B0 = null;
                break;
            case 3:
                ((e53) this.b).e.r();
                break;
            case 4:
                ((mw4) this.b).E(false);
                break;
            case 5:
                m15 m15Var = (m15) this.b;
                q64 q64Var = m15Var.I0;
                if (q64Var != null && (accessibilityManager = m15Var.H0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new b4(q64Var));
                    break;
                }
                break;
            case 6:
                Handler handler = cia.a;
                cia.b((zha) ((i50) this.b).s0, yha.o);
                break;
            case 7:
                ImageView imageView = (ImageView) this.b;
                Object drawable = imageView.getDrawable();
                Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                if (animatable != null) {
                    animatable.stop();
                }
                Drawable drawable2 = imageView.getDrawable();
                zj zjVar = drawable2 instanceof zj ? (zj) drawable2 : null;
                if (zjVar != null) {
                    Drawable drawableB = zjVar.b();
                    RLottieDrawable rLottieDrawable = zjVar.x0;
                    if (drawableB == rLottieDrawable) {
                        if (rLottieDrawable != null) {
                            rLottieDrawable.setMasterParent(null);
                        }
                        RLottieDrawable rLottieDrawable2 = zjVar.x0;
                        if (rLottieDrawable2 != null) {
                            rLottieDrawable2.setAllowDecodeSingleFrame(true);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ujc ujcVar = (ujc) this.b;
                if (!ujcVar.f && (recyclerView = (RecyclerView) ujcVar.d.get()) != null) {
                    ujcVar.b(recyclerView);
                    break;
                }
                break;
            case 9:
                yxd yxdVar = (yxd) this.b;
                ViewTreeObserver viewTreeObserver2 = yxdVar.A0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        yxdVar.A0 = view.getViewTreeObserver();
                    }
                    yxdVar.A0.removeGlobalOnLayoutListener(yxdVar.u0);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 10:
                y27.a.f((g1e) this.b);
                break;
            case 11:
                vxd vxdVar = (vxd) this.b;
                if (vxdVar != null) {
                    vxdVar.cancel((CancellationException) null);
                }
                this.b = null;
                break;
            default:
                Widget widget = (Widget) this.b;
                hm9.n(v3c.w(widget), "lifecycle: preAttach invoke onViewDetachedFromWindow");
                view.removeOnAttachStateChangeListener(this);
                widget.finalizeCleanActions(widget);
                break;
        }
    }

    public /* synthetic */ ck(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
