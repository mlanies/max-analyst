package one.me.sdk.conductor.changehandlers.swipe;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.a81;
import defpackage.av3;
import defpackage.coc;
import defpackage.cv3;
import defpackage.e09;
import defpackage.hm9;
import defpackage.ir6;
import defpackage.nge;
import defpackage.om8;
import defpackage.rge;
import defpackage.rzd;
import defpackage.us7;
import defpackage.uu3;
import defpackage.wge;
import defpackage.x53;
import defpackage.y53;
import defpackage.znc;
import defpackage.zu3;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lone/me/sdk/arch/Widget;", "Lnge;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "conductor_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class SwipeWidget extends Widget implements nge {
    public static final /* synthetic */ int c = 0;
    public final String a;
    public boolean b;

    public SwipeWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = "SwipeWidget";
    }

    public static void s0(uu3 uu3Var) {
        Iterator<T> it = uu3Var.getChildRouters().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((znc) it.next()).e().iterator();
            while (it2.hasNext()) {
                coc cocVar = (coc) it2.next();
                uu3 uu3Var2 = cocVar.a;
                Method method = (Method) cv3.d.T0(null, cv3.a[2]);
                if (method == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                method.invoke(uu3Var2, Boolean.TRUE);
                s0(cocVar.a);
            }
        }
    }

    @Override // defpackage.uu3
    public boolean handleBack() {
        return this.b || super.handleBack();
    }

    public final uu3 m0() {
        coc cocVar = (coc) x53.j0(y53.L(getRouter().e()) - 1, getRouter().e());
        uu3 uu3Var = cocVar != null ? cocVar.a : null;
        if (uu3Var == null) {
            String str = this.a;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Z, str, "No underlying controller! Swiping won't work properly", null);
            }
        }
        return uu3Var;
    }

    public boolean n0() {
        return !(this instanceof ChatMediaViewerScreen);
    }

    public void o0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uu3
    public final void onChangeEnded(zu3 zu3Var, av3 av3Var) {
        super.onChangeEnded(zu3Var, av3Var);
        if (!S()) {
            String str = this.a;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "onChangeEnded: swipe is disabled", null);
                return;
            }
            return;
        }
        View view = getView();
        if (view == 0) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        uu3 uu3VarM0 = m0();
        a81 a81Var = uu3VarM0 == null ? null : new a81(uu3VarM0, this, viewGroup, 14);
        if (a81Var != null && av3Var.b) {
            String str2 = this.a;
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, str2, "onChangeEnded: setup swipe callbacks on new view", null);
            }
            boolean z = view instanceof wge;
            if (!z) {
                throw new IllegalStateException("'To' view must realize SwipeTouchHandler for work".toString());
            }
            rge rgeVar = new rge(u0(), new rzd(7, this), view, viewGroup, a81Var, n0() ? 2 : 1);
            rgeVar.q = this;
            rgeVar.r = t0();
            wge wgeVar = z ? (wge) view : null;
            if (wgeVar != null) {
                wgeVar.setOnTouch(new om8(1, rgeVar, rge.class, "onTouchEvent", "onTouchEvent(Landroid/view/MotionEvent;)Z", 0, 17));
                wgeVar.setOnRequestInterceptTouchEvent(new e09(0, rgeVar, rge.class, "resetDraggingState", "resetDraggingState()V", 0, 12));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public void onChangeStarted(zu3 zu3Var, av3 av3Var) {
        super.onChangeStarted(zu3Var, av3Var);
        if (av3Var.b) {
            return;
        }
        KeyEvent.Callback view = getView();
        wge wgeVar = view instanceof wge ? (wge) view : null;
        if (wgeVar != null) {
            wgeVar.setOnTouch(null);
            wgeVar.setOnRequestInterceptTouchEvent(null);
        }
    }

    public void p0() {
    }

    public void q0() {
    }

    public void r0() {
    }

    public Long t0() {
        return null;
    }

    public Integer u0() {
        return null;
    }
}
