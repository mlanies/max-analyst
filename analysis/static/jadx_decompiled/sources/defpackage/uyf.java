package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class uyf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppRootScreen Y;
    public final /* synthetic */ fxc Z;
    public final /* synthetic */ FrameLayout s0;
    public final /* synthetic */ LinearLayout t0;
    public final /* synthetic */ nfa u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyf(WebAppRootScreen webAppRootScreen, fxc fxcVar, FrameLayout frameLayout, LinearLayout linearLayout, nfa nfaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = webAppRootScreen;
        this.Z = fxcVar;
        this.s0 = frameLayout;
        this.t0 = linearLayout;
        this.u0 = nfaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        uyf uyfVar = (uyf) n((e0g) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        uyfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uyf uyfVar = new uyf(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
        uyfVar.X = obj;
        return uyfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e0g e0gVar = (e0g) this.X;
        bc7[] bc7VarArr = WebAppRootScreen.G0;
        WebAppRootScreen webAppRootScreen = this.Y;
        webAppRootScreen.y0().setTitle(e0gVar.a);
        WebAppRootScreen.D0(webAppRootScreen.y0(), e0gVar.b);
        b0g b0gVar = b0g.a;
        a0g a0gVar = e0gVar.c;
        boolean zF = tpa.f(a0gVar, b0gVar);
        fxc fxcVar = this.Z;
        FrameLayout frameLayout = this.s0;
        if (zF) {
            fxcVar.setVisibility(8);
            int childCount = frameLayout.getChildCount();
            LinearLayout linearLayout = this.t0;
            if (childCount <= 1 || frameLayout.getChildAt(1) != linearLayout) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(linearLayout, 1);
            }
            webAppRootScreen.E0(false);
        } else if (tpa.f(a0gVar, c0g.a)) {
            fxcVar.setVisibility(8);
            int childCount2 = frameLayout.getChildCount();
            nfa nfaVar = this.u0;
            if (childCount2 <= 1 || frameLayout.getChildAt(1) != nfaVar) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(nfaVar, 1);
            }
            webAppRootScreen.E0(false);
        } else {
            if (!(a0gVar instanceof d0g)) {
                throw new NoWhenBranchMatchedException();
            }
            fxcVar.setVisibility(0);
            if (frameLayout.getChildCount() > 1) {
                frameLayout.removeViewAt(1);
            }
            webAppRootScreen.E0(((d0g) a0gVar).a);
        }
        return e5f.a;
    }
}
