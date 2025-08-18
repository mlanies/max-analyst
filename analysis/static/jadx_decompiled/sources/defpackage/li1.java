package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class li1 extends ConstraintLayout implements bk1, zj1 {
    public final /* synthetic */ CallScreen G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li1(CallScreen callScreen, Context context) {
        super(context);
        this.G0 = callScreen;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(qp4.u0.p(this).c.b().k);
        setId(rvb.call_screen_container_id);
        w12 w12Var = new w12(getContext());
        w12Var.setId(rvb.call_bottom_control_container);
        w12Var.setLayoutParams(new ti3(-2, -2));
        w12Var.setPadding(0, 0, 0, tu0.G(fk4.c() * 24));
        br7.d(w12Var, new x27(0, new yq0(5, 1, false), 1), null);
        i1b i1bVar = callScreen.z0;
        h1b h1bVar = h1b.b;
        i1bVar.a(w12Var, h1bVar);
        boolean zIsLaidOut = w12Var.isLaidOut();
        i1b i1bVar2 = callScreen.z0;
        if (!zIsLaidOut || w12Var.isLayoutRequested()) {
            w12Var.addOnLayoutChangeListener(new ii1(callScreen, 1));
        } else {
            i1bVar2.c();
        }
        w12 w12Var2 = new w12(getContext());
        w12Var2.setId(rvb.call_top_control_container);
        br7.d(w12Var2, new x27(5, null, 2), null);
        i1bVar2.a(w12Var2, h1b.a);
        if (!w12Var2.isLaidOut() || w12Var2.isLayoutRequested()) {
            w12Var2.addOnLayoutChangeListener(new ii1(callScreen, 2));
        } else {
            i1bVar2.c();
        }
        uv3 uv3VarZ0 = callScreen.z0();
        w12Var2.addOnLayoutChangeListener((View.OnLayoutChangeListener) uv3VarZ0.e.getValue());
        uv3VarZ0.c = w12Var2;
        w12Var.addOnLayoutChangeListener((View.OnLayoutChangeListener) uv3VarZ0.f.getValue());
        uv3VarZ0.d = w12Var;
        w12 w12Var3 = new w12(getContext());
        w12Var3.setId(rvb.call_events_view);
        w12Var3.setLayoutParams(new ti3(-1, -2));
        w12Var3.setPadding(w12Var3.getPaddingLeft(), w12Var3.getPaddingTop(), w12Var3.getPaddingRight(), tu0.G(16 * fk4.d().getDisplayMetrics().density));
        i1bVar2.a(w12Var3, h1bVar);
        View w12Var4 = new w12(getContext());
        w12Var4.setId(y7a.W1);
        w12Var4.setLayoutParams(new ti3(-1, -2));
        float f = 12;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        w12Var4.setPadding(iG, iG, iG, iG);
        View w12Var5 = new w12(getContext());
        w12Var5.setId(rvb.call_screen_vpn_container_id);
        w12Var5.setLayoutParams(new ti3(-1, -2));
        addView(callScreen.E0());
        addView(callScreen.C0());
        addView(callScreen.B0());
        addView(w12Var);
        addView(w12Var2, 0, -2);
        addView(w12Var3);
        addView(w12Var4);
        addView(callScreen.A0());
        addView(w12Var5);
        dj3 dj3VarQ = fp3.q(this);
        int id = callScreen.E0().getId();
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 4, 0, 4);
        int id2 = w12Var2.getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 7, 0, 7);
        int id3 = callScreen.C0().getId();
        dj3VarQ.d(id3, 3, w12Var2.getId(), 4);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        int id4 = callScreen.B0().getId();
        dj3VarQ.d(id4, 3, 0, 3);
        dj3VarQ.d(id4, 6, 0, 6);
        dj3VarQ.d(id4, 7, 0, 7);
        int id5 = w12Var.getId();
        dj3VarQ.d(id5, 4, 0, 4);
        dj3VarQ.d(id5, 6, 0, 6);
        dj3VarQ.d(id5, 7, 0, 7);
        int id6 = callScreen.A0().getId();
        dj3VarQ.d(id6, 3, 0, 3);
        dj3VarQ.d(id6, 4, 0, 4);
        dj3VarQ.d(id6, 6, 0, 6);
        dj3VarQ.d(id6, 7, 0, 7);
        int id7 = w12Var3.getId();
        dj3VarQ.d(id7, 4, w12Var.getId(), 3);
        dj3VarQ.d(id7, 6, 0, 6);
        dj3VarQ.d(id7, 7, 0, 7);
        int id8 = w12Var4.getId();
        dj3VarQ.d(id8, 3, w12Var2.getId(), 4);
        dj3VarQ.d(id8, 6, 0, 6);
        dj3VarQ.d(id8, 7, 0, 7);
        int id9 = w12Var5.getId();
        dj3VarQ.d(id9, 4, w12Var.getId(), 3);
        dj3VarQ.d(id9, 6, 0, 6);
        dj3VarQ.d(id9, 7, 0, 7);
        dj3VarQ.a(this);
    }

    @Override // defpackage.bk1
    public final void a(boolean z) {
        if (z) {
            CallScreen callScreen = this.G0;
            mm1 mm1VarO0 = CallScreen.o0(callScreen);
            if (mm1VarO0 != null) {
                mm1VarO0.a(true);
            }
            callScreen.p0(true);
        }
    }

    @Override // defpackage.bk1
    public final void b(boolean z) {
        if (z) {
            return;
        }
        yxc yxcVar = CallScreen.R0;
        this.G0.p0(false);
    }

    @Override // defpackage.zj1
    public final void d(RectF rectF, boolean z) {
        mm1 mm1VarO0 = CallScreen.o0(this.G0);
        if (mm1VarO0 != null) {
            mm1VarO0.d(rectF, z);
        }
    }

    @Override // defpackage.zj1
    public final void e(boolean z) {
        yxc yxcVar = CallScreen.R0;
        CallScreen callScreen = this.G0;
        callScreen.p0(false);
        mm1 mm1VarO0 = CallScreen.o0(callScreen);
        if (mm1VarO0 != null) {
            mm1VarO0.e(z);
        }
    }

    @Override // defpackage.zj1
    public final void f(kl7 kl7Var, boolean z, long j) {
        CallScreen callScreen = this.G0;
        mm1 mm1VarO0 = CallScreen.o0(callScreen);
        if (mm1VarO0 != null) {
            mm1VarO0.f(kl7Var, z, j);
        }
        if (br7.G(callScreen.C0())) {
            callScreen.v0().f(kl7Var, z, j);
        }
    }

    public boolean getShouldScaleMainOpponent() {
        mm1 mm1VarO0 = CallScreen.o0(this.G0);
        if (mm1VarO0 != null) {
            return mm1VarO0.getShouldScaleMainOpponent();
        }
        return false;
    }

    @Override // defpackage.bk1
    public final void h(kl7 kl7Var, boolean z, long j) {
        mm1 mm1VarO0 = CallScreen.o0(this.G0);
        if (mm1VarO0 != null) {
            mm1VarO0.h(kl7Var, z, j);
        }
    }

    @Override // defpackage.zj1
    public final void o(boolean z) {
        if (z) {
            yxc yxcVar = CallScreen.R0;
            CallScreen callScreen = this.G0;
            if (br7.G(callScreen.C0())) {
                dm1 dm1VarV0 = callScreen.v0();
                dm1VarV0.getClass();
                dm1VarV0.setAlpha(1.0f);
            }
            callScreen.p0(true);
            mm1 mm1VarO0 = CallScreen.o0(callScreen);
            if (mm1VarO0 != null) {
                mm1VarO0.o(true);
            }
        }
    }
}
