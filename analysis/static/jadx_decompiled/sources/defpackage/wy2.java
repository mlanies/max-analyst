package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final /* synthetic */ class wy2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ wy2(jz2 jz2Var, long j, int i) {
        this.a = i;
        this.b = jz2Var;
        this.c = j;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                p82 p82VarL = this.b.l();
                long j = this.c;
                e52 e52VarF = p82VarL.F(j);
                if (e52VarF != null && (e52VarF.C() || e52VarF.R())) {
                    return e52VarF;
                }
                return p82VarL.b(j92.a, Collections.singletonList(Long.valueOf(j)), null, null);
            default:
                return this.b.l().z(this.c);
        }
    }
}
