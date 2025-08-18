package one.me.calls.ui.bottomsheet.previewjoinlink;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ac1;
import defpackage.ap1;
import defpackage.au1;
import defpackage.b8a;
import defpackage.bc1;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.dj3;
import defpackage.dy7;
import defpackage.eqe;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fnc;
import defpackage.fp3;
import defpackage.fua;
import defpackage.gg1;
import defpackage.glc;
import defpackage.hob;
import defpackage.je7;
import defpackage.k11;
import defpackage.knc;
import defpackage.kpa;
import defpackage.l2a;
import defpackage.l5g;
import defpackage.m38;
import defpackage.nec;
import defpackage.ng3;
import defpackage.od2;
import defpackage.oec;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.qp4;
import defpackage.rg1;
import defpackage.s;
import defpackage.s35;
import defpackage.ti3;
import defpackage.tta;
import defpackage.tu0;
import defpackage.vb1;
import defpackage.wb1;
import defpackage.x2;
import defpackage.x27;
import defpackage.y7a;
import defpackage.yia;
import defpackage.yo1;
import defpackage.zb1;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/bottomsheet/previewjoinlink/CallJoinLinkPreviewWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "link", "(Ljava/lang/String;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallJoinLinkPreviewWidget extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] B0;
    public final glc A0;
    public final qm0 X;
    public final qm0 Y;
    public final qm0 Z;
    public final l5g a;
    public final tta b;
    public final je7 c;
    public final je7 o;
    public final qm0 s0;
    public final qm0 t0;
    public final qm0 u0;
    public final q7c v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        hob hobVar = new hob(CallJoinLinkPreviewWidget.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        oec oecVar = nec.a;
        B0 = new bc7[]{hobVar, zr6.e(oecVar, CallJoinLinkPreviewWidget.class, "closeView", "getCloseView()Lone/me/calls/ui/view/RoundButtonView;", 0), zr6.f(CallJoinLinkPreviewWidget.class, "oneMeStackAvatarView", "getOneMeStackAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeStackAvatarView;", 0, oecVar), zr6.f(CallJoinLinkPreviewWidget.class, "microphoneSwitch", "getMicrophoneSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0, oecVar), zr6.f(CallJoinLinkPreviewWidget.class, "videoSwitch", "getVideoSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0, oecVar), zr6.f(CallJoinLinkPreviewWidget.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(CallJoinLinkPreviewWidget.class, "previewView", "getPreviewView()Lone/me/calls/ui/view/CallUserView;", 0, oecVar)};
    }

    public CallJoinLinkPreviewWidget(String str) {
        this(dy7.g(new kpa("call_join_link", str)));
    }

    public static void s0(knc kncVar, Drawable drawable, Drawable drawable2, m38 m38Var, eqe eqeVar, eqe eqeVar2) {
        kncVar.setVisibility(m38Var != m38.o ? 0 : 8);
        int iOrdinal = m38Var.ordinal();
        fnc fncVar = fnc.o;
        pq9 pq9Var = qp4.u0;
        if (iOrdinal == 0) {
            kncVar.A(drawable2, pq9Var.p(kncVar).c.getIcon().g);
            kncVar.setMode(fncVar);
            kncVar.setAccessibility(eqeVar2);
        } else {
            if (iOrdinal == 1) {
                pq9Var.p(kncVar).c.getIcon();
                kncVar.A(drawable, -1);
                kncVar.setMode(fnc.X);
                kncVar.setAccessibility(eqeVar);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            kncVar.A(drawable2, pq9Var.p(kncVar).c.getIcon().c);
            kncVar.setMode(fncVar);
            kncVar.setAccessibility(eqeVar2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getO() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.A0;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        ((rg1) this.c.getValue()).g(i);
    }

    public final knc m0() {
        bc7 bc7Var = B0[3];
        return (knc) this.s0.getValue();
    }

    public final yia n0() {
        bc7 bc7Var = B0[2];
        return (yia) this.Z.getValue();
    }

    public final TextView o0() {
        bc7 bc7Var = B0[0];
        return (TextView) this.X.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setLayoutParams(new ti3(-1, -1));
        pq9 pq9Var = qp4.u0;
        constraintLayout.setBackgroundColor(pq9Var.p(constraintLayout).c.b().j);
        FrameLayout frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setId(y7a.e0);
        ap1 ap1Var = new ap1(frameLayout.getContext(), null);
        ap1Var.setId(y7a.d0);
        ap1Var.setMode(yo1.o);
        ap1Var.J(null, ap1Var.getContext().getString(b8a.g0));
        zb1 zb1Var = new zb1(this);
        ap1Var.h1 = gg1.c;
        ap1Var.b1 = zb1Var;
        ap1Var.setCustomTheme(pq9Var.p(ap1Var).c);
        frameLayout.addView(ap1Var, -1, -1);
        constraintLayout.addView(frameLayout, -1, 0);
        constraintLayout.addView(o0(), -2, -2);
        bc7[] bc7VarArr = B0;
        bc7 bc7Var = bc7VarArr[1];
        qm0 qm0Var = this.Y;
        constraintLayout.addView((knc) qm0Var.getValue());
        constraintLayout.addView(n0());
        constraintLayout.addView(m0(), -2, -2);
        constraintLayout.addView(p0(), -2, -2);
        bc7 bc7Var2 = bc7VarArr[5];
        qm0 qm0Var2 = this.u0;
        constraintLayout.addView((OneMeButton) qm0Var2.getValue(), -1, -2);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = o0().getId();
        dj3VarQ.d(id, 6, 0, 6);
        float f = 60;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id, 4));
        dj3VarQ.d(id, 3, 0, 3);
        float f2 = 16;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id, 4));
        dj3VarQ.d(id, 7, 0, 7);
        new l2a(dj3VarQ, 7, id, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3VarQ.g(id).d.l0 = true;
        bc7 bc7Var3 = bc7VarArr[1];
        int id2 = ((knc) qm0Var.getValue()).getId();
        dj3VarQ.d(id2, 3, o0().getId(), 3);
        dj3VarQ.d(id2, 4, o0().getId(), 4);
        dj3VarQ.d(id2, 7, 0, 7);
        new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id3 = n0().getId();
        dj3VarQ.d(id3, 3, o0().getId(), 4);
        float f3 = 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        new l2a(dj3VarQ, 6, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        dj3VarQ.d(id3, 4, frameLayout.getId(), 3);
        int id4 = frameLayout.getId();
        dj3VarQ.d(id4, 3, n0().getId(), 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id4, 4));
        dj3VarQ.d(id4, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id4, 4));
        bc7 bc7Var4 = bc7VarArr[5];
        dj3VarQ.d(id4, 4, ((OneMeButton) qm0Var2.getValue()).getId(), 3);
        new l2a(dj3VarQ, 4, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id5 = m0().getId();
        dj3VarQ.d(id5, 4, frameLayout.getId(), 4);
        new l2a(dj3VarQ, 4, id5, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id5, 7, p0().getId(), 6);
        dj3VarQ.d(id5, 6, 0, 6);
        dj3VarQ.g(id5).d.V = 2;
        int id6 = p0().getId();
        dj3VarQ.d(id6, 4, m0().getId(), 4);
        dj3VarQ.d(id6, 3, m0().getId(), 3);
        dj3VarQ.d(id6, 7, 0, 7);
        dj3VarQ.d(id6, 6, m0().getId(), 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id6, 4));
        bc7 bc7Var5 = bc7VarArr[5];
        int id7 = ((OneMeButton) qm0Var2.getValue()).getId();
        dj3VarQ.d(id7, 7, frameLayout.getId(), 7);
        new l2a(dj3VarQ, 7, id7, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        dj3VarQ.d(id7, 6, frameLayout.getId(), 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id7, 4));
        dj3VarQ.d(id7, 4, 0, 4);
        new l2a(dj3VarQ, 4, id7, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        tta ttaVar = this.b;
        if (i == 159 && ttaVar.a().b(eua.l)) {
            q0().s(true);
        } else if (i == 160 && ttaVar.a().b(eua.h)) {
            q0().r(true);
        } else {
            ((rg1) this.c.getValue()).b(i, strArr, iArr);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        s35 s35Var = q0().A0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, getViewLifecycleOwner().Q(), fg7Var), new ac1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().x0, getViewLifecycleOwner().Q(), fg7Var), new bc1(null, this), 5), getViewLifecycleScope());
    }

    public final knc p0() {
        bc7 bc7Var = B0[4];
        return (knc) this.t0.getValue();
    }

    public final vb1 q0() {
        return (vb1) this.o.getValue();
    }

    public final void r0() {
        getRouter().B(this);
    }

    public CallJoinLinkPreviewWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new l5g(this, 1);
        this.b = new tta(fua.a.b());
        this.c = tu0.r(3, new wb1(this, 0));
        this.o = createViewModelLazy(vb1.class, new s(15, new x2(bundle, this, 10)));
        this.X = binding(new wb1(this, 7));
        this.Y = binding(new wb1(this, 8));
        this.Z = binding(new wb1(this, 9));
        this.s0 = binding(new wb1(this, 10));
        this.t0 = binding(new wb1(this, 11));
        this.u0 = binding(new wb1(this, 1));
        this.v0 = viewBinding(y7a.d0);
        this.w0 = tu0.r(3, new wb1(this, 2));
        this.x0 = tu0.r(3, new wb1(this, 3));
        this.y0 = tu0.r(3, new wb1(this, 5));
        this.z0 = tu0.r(3, new wb1(this, 6));
        this.A0 = new glc(new k11(15), null, 6);
    }
}
