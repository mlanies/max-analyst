package defpackage;

import android.content.Context;
import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class nfa extends d23 implements kre {
    public static final /* synthetic */ bc7[] D0 = {new oi9(nfa.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Appearance;"), rh4.g(nec.a, nfa.class, "size", "getSize()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Size;")};
    public final mfa B0;
    public final mfa C0;

    public nfa(Context context) {
        super(context, null, tsb.circularProgressIndicatorStyle, d23.A0);
        e23 e23Var = (e23) this.a;
        y13 y13Var = new y13(e23Var);
        Context context2 = getContext();
        tz6 tz6Var = new tz6(context2, e23Var, y13Var, new a23(e23Var));
        Resources resources = context2.getResources();
        int i = yub.indeterminate_static;
        qbf qbfVar = new qbf();
        ThreadLocal threadLocal = vic.a;
        qbfVar.a = qic.a(resources, i, null);
        new pbf(qbfVar.a.getConstantState());
        tz6Var.y0 = qbfVar;
        setIndeterminateDrawable(tz6Var);
        setProgressDrawable(new di4(getContext(), e23Var, y13Var));
        this.B0 = new mfa(this, 0);
        this.C0 = new mfa(this, 1);
        setIndeterminate(true);
        setTrackCornerRadius(tu0.G(20 * fk4.d().getDisplayMetrics().density));
    }

    public static int d(gfa gfaVar, fka fkaVar) {
        if (tpa.f(gfaVar, zea.a)) {
            return fkaVar.e().e.a.a;
        }
        if (tpa.f(gfaVar, afa.a)) {
            fkaVar.e().e.b.getClass();
            return -1;
        }
        if (tpa.f(gfaVar, bfa.a)) {
            return fkaVar.e().e.c.a;
        }
        if (tpa.f(gfaVar, cfa.a)) {
            return fkaVar.e().e.e.a;
        }
        if (tpa.f(gfaVar, dfa.a)) {
            fkaVar.e().e.f.getClass();
            return -15921907;
        }
        if (tpa.f(gfaVar, ffa.a)) {
            return fkaVar.e().e.g.a;
        }
        if (tpa.f(gfaVar, efa.a)) {
            return fkaVar.e().e.d.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final gfa getAppearance() {
        bc7 bc7Var = D0[0];
        return (gfa) this.B0.b;
    }

    public final lfa getSize() {
        bc7 bc7Var = D0[1];
        return (lfa) this.C0.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        setIndicatorColor(d(getAppearance(), fkaVar));
    }

    public final void setAppearance(gfa gfaVar) {
        this.B0.o1(this, D0[0], gfaVar);
    }

    public final void setSize(lfa lfaVar) {
        this.C0.o1(this, D0[1], lfaVar);
    }
}
