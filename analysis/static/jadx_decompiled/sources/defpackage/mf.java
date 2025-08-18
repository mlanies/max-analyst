package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.video.widgets.FloatingVideoView;

/* loaded from: classes2.dex */
public final class mf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void C(Animator animator) {
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((g60) this.b).z0 = false;
                break;
            case 3:
                p85 p85Var = (p85) this.b;
                p85Var.A0 = null;
                p85Var.requestLayout();
                break;
            case 5:
                ht8 ht8Var = (ht8) this.b;
                ht8Var.Q0 = null;
                ht8Var.I0.setForeground(null);
                ht8Var.J().setAlpha(150);
                break;
            case 6:
                u1b u1bVar = (u1b) this.b;
                u1bVar.b.T(u1bVar.a.getX(), u1bVar.a.getY());
                u1bVar.b();
                break;
            case 7:
                z5c z5cVar = (z5c) this.b;
                z5cVar.a = false;
                z5cVar.b = null;
                break;
            case 10:
                ((ejf) this.b).J0 = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                break;
            case 1:
                g60 g60Var = (g60) obj;
                g60Var.z0 = false;
                g60Var.y0 = null;
                break;
            case 2:
                bc7[] bc7VarArr = CallWaitingRoomEventsWidget.v0;
                ((CallWaitingRoomEventsWidget) obj).q0();
                break;
            case 3:
                p85 p85Var = (p85) obj;
                p85Var.A0 = null;
                p85Var.requestLayout();
                break;
            case 4:
                int i = FloatingVideoView.E0;
                FloatingVideoView floatingVideoView = (FloatingVideoView) obj;
                floatingVideoView.getClass();
                t33 t33Var = vl.o.a().a;
                WindowManager.LayoutParams layoutParams = floatingVideoView.B0;
                int i2 = layoutParams.x;
                int i3 = layoutParams.y;
                t33Var.k(i2, "app.video.pip.pos.x");
                t33Var.k(i3, "app.video.pip.pos.y");
                break;
            case 5:
                ht8 ht8Var = (ht8) obj;
                ht8Var.Q0 = null;
                ht8Var.I0.setForeground(null);
                ht8Var.J().setAlpha(150);
                break;
            case 6:
                u1b u1bVar = (u1b) obj;
                u1bVar.b.T(u1bVar.a.getX(), u1bVar.a.getY());
                u1bVar.b();
                break;
            case 7:
                z5c z5cVar = (z5c) obj;
                z5cVar.a = false;
                z5cVar.b = null;
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                rge rgeVar = (rge) obj;
                nge ngeVar = rgeVar.q;
                if (ngeVar != null) {
                    ((SwipeWidget) ngeVar).p0();
                }
                View view = rgeVar.b;
                wge wgeVar = view instanceof wge ? (wge) view : null;
                if (wgeVar != null) {
                    wgeVar.setOnTouch(null);
                    wgeVar.setOnRequestInterceptTouchEvent(null);
                }
                ViewGroup viewGroup = rgeVar.c;
                viewGroup.removeView(view);
                viewGroup.removeView(viewGroup.findViewById(wwb.swipe_fade));
                nge ngeVar2 = rgeVar.q;
                if (ngeVar2 != null) {
                    SwipeWidget swipeWidget = (SwipeWidget) ngeVar2;
                    swipeWidget.b = false;
                    swipeWidget.getRouter().C();
                }
                rgeVar.q = null;
                break;
            case 10:
                ((ejf) obj).J0 = null;
                break;
            default:
                ((lsf) obj).getHandFreeDotView().setAlpha(1.0f);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((OneMeButton) this.b).setClickable(false);
                break;
            case 1:
                ((g60) this.b).setVisibility(0);
                break;
        }
    }

    public mf(rge rgeVar, float f) {
        this.a = 9;
        this.b = rgeVar;
    }
}
