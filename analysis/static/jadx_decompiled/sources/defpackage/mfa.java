package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class mfa extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nfa o;

    /* JADX WARN: Illegal instructions before constructor call */
    public mfa(nfa nfaVar, int i) {
        this.c = i;
        switch (i) {
            case 1:
                kfa kfaVar = kfa.a;
                this.o = nfaVar;
                super(9, kfaVar);
                break;
            default:
                efa efaVar = efa.a;
                this.o = nfaVar;
                super(9, efaVar);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                pq9 pq9Var = qp4.u0;
                nfa nfaVar = this.o;
                nfaVar.setIndicatorColor(nfa.d((gfa) obj2, pq9Var.j(nfaVar)));
                return;
            default:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                lfa lfaVar = (lfa) obj2;
                boolean zF = tpa.f(lfaVar, hfa.a);
                nfa nfaVar2 = this.o;
                if (zF) {
                    nfaVar2.setIndicatorSize(tu0.G(40 * fk4.d().getDisplayMetrics().density));
                    nfaVar2.setTrackThickness(tu0.G(4 * fk4.d().getDisplayMetrics().density));
                } else if (tpa.f(lfaVar, ifa.a)) {
                    nfaVar2.setIndicatorSize(tu0.G(24 * fk4.d().getDisplayMetrics().density));
                    nfaVar2.setTrackThickness(tu0.G(2 * fk4.d().getDisplayMetrics().density));
                } else if (tpa.f(lfaVar, jfa.a)) {
                    nfaVar2.setIndicatorSize(tu0.G(16 * fk4.d().getDisplayMetrics().density));
                    nfaVar2.setTrackThickness(tu0.G(1 * fk4.d().getDisplayMetrics().density));
                } else if (!tpa.f(lfaVar, kfa.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                nfaVar2.requestLayout();
                nfaVar2.invalidate();
                return;
        }
    }
}
