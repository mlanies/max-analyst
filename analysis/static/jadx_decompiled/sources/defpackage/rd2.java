package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class rd2 extends ol implements lme {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final int s0;
    public final int t0;
    public final Set u0;
    public final String v0;

    public rd2(long j, long j2, long j3, long j4, long j5, int i, int i2, Set set) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = i;
        this.t0 = i2;
        this.u0 = set;
        this.v0 = rd2.class.getName();
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        final de2 de2Var = (de2) gleVar;
        hm9.n(this.v0, "onSuccess: " + de2Var);
        if (m().C(this.o) == null) {
            return;
        }
        p().g(this.o, ((p7b) r()).a.t(), de2Var.c());
        final p82 p82VarM = m();
        p82VarM.getClass();
        final int i = de2Var.X;
        hm9.n("p82", "onChatMedia: totalCount = " + i);
        final int i2 = this.t0;
        final int i3 = this.s0;
        final Set set = this.u0;
        final long j = this.Y;
        final long j2 = this.o;
        p82VarM.h(j2, false, new qj3() { // from class: a82
            /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
            @Override // defpackage.qj3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r20) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 472
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.a82.accept(java.lang.Object):void");
            }
        });
        p82VarM.m.c(new vz2(Collections.singletonList(Long.valueOf(j2)), false));
        l().c(new gf2(this.a, this.Y, this.s0, this.t0, de2Var.c().size(), this.u0));
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        l().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.ol
    public final dle i() {
        return new au(this.X, Long.valueOf(this.Z), this.u0, Integer.valueOf(this.s0), Integer.valueOf(this.t0));
    }
}
