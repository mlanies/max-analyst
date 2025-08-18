package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class amd extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] t0;
    public final FrameLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final cmd o;
    public final yj s0;

    static {
        oi9 oi9Var = new oi9(amd.class, "shimmerBackground", "getShimmerBackground()Lone/me/sdk/uikit/common/shimmers/ShimmerContactCell$Companion$Background;");
        nec.a.getClass();
        t0 = new bc7[]{oi9Var};
    }

    public amd(Context context) {
        super(context, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(xoc.H);
        float f = 40;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        this.a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(xoc.L);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(169 * fk4.d().getDisplayMetrics().density), tu0.G(20 * fk4.d().getDisplayMetrics().density)));
        this.b = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(xoc.K);
        float f2 = 12;
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(90 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        this.c = frameLayout3;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(xoc.J);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cmd cmdVar = new cmd(context);
        cmdVar.setId(xoc.I);
        cmdVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.o = cmdVar;
        this.s0 = new yj(this);
        setId(xoc.G);
        setLayoutParams(new FrameLayout.LayoutParams(-1, tu0.G(62 * fk4.d().getDisplayMetrics().density)));
        constraintLayout.addView(frameLayout);
        constraintLayout.addView(frameLayout2);
        constraintLayout.addView(frameLayout3);
        cmdVar.addView(constraintLayout);
        addView(cmdVar);
        onThemeChanged(qp4.u0.j(this));
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = frameLayout.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        dj3VarQ.d(id, 6, 0, 6);
        new l2a(dj3VarQ, 6, id, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id2 = frameLayout2.getId();
        dj3VarQ.d(id2, 3, frameLayout.getId(), 3);
        dj3VarQ.d(id2, 6, frameLayout.getId(), 7);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id3 = frameLayout3.getId();
        dj3VarQ.d(id3, 4, frameLayout.getId(), 4);
        dj3VarQ.d(id3, 6, frameLayout.getId(), 7);
        new l2a(dj3VarQ, 6, id3, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(constraintLayout);
    }

    public final void a(fka fkaVar) {
        int iOrdinal = getShimmerBackground().ordinal();
        if (iOrdinal == 0) {
            fkaVar.b();
            setBackgroundColor(0);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            setBackgroundColor(fkaVar.b().k);
        }
    }

    public final zld getShimmerBackground() {
        bc7 bc7Var = t0[0];
        return (zld) this.s0.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        a(fkaVar);
        this.a.setBackground(hm9.S(Integer.valueOf(fkaVar.d().a.a.d), null, null));
        float f = 4;
        this.b.setBackground(hm9.b0(Integer.valueOf(fkaVar.d().a.a.d), null, null, tu0.G(fk4.d().getDisplayMetrics().density * f)));
        this.c.setBackground(hm9.b0(Integer.valueOf(fkaVar.d().a.a.d), null, null, tu0.G(f * fk4.d().getDisplayMetrics().density)));
        bkg bkgVar = new bkg(25);
        yld yldVar = (yld) bkgVar.b;
        yldVar.k = false;
        yldVar.i = 0.0f;
        bkgVar.w(1200L);
        bkgVar.v(fkaVar.d().a.a.d);
        yldVar.d = fkaVar.b().k;
        bkgVar.u();
        this.o.a(bkgVar.m());
    }

    public final void setShimmerBackground(zld zldVar) {
        this.s0.o1(this, t0[0], zldVar);
    }
}
