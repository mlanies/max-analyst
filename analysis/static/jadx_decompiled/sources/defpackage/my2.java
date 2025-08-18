package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class my2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ my2(ty2 ty2Var, long j, int i) {
        this.a = i;
        this.b = ty2Var;
        this.c = j;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ty2 ty2Var = this.b;
                ConcurrentHashMap concurrentHashMap = ((p82) ((je7) ty2Var.c).getValue()).f;
                long j = this.c;
                q0e q0eVarA = r0e.a((e52) concurrentHashMap.get(Long.valueOf(j)));
                e52 e52Var = (e52) q0eVarA.getValue();
                if (e52Var == null) {
                    j47.T((sx3) ((khe) ty2Var.X).getValue(), null, null, new qy2(q0eVarA, null, ty2Var, j), 3);
                } else {
                    long j2 = e52Var.b.a;
                    if (j2 != 0) {
                        ((ti9) ((ConcurrentHashMap) ty2Var.Z).computeIfAbsent(Long.valueOf(j2), new sy2(new py2(e52Var, 0)))).setValue(e52Var);
                    }
                }
                return q0eVarA;
            default:
                ty2 ty2Var2 = this.b;
                ConcurrentHashMap concurrentHashMap2 = ((p82) ((je7) ty2Var2.c).getValue()).g;
                long j3 = this.c;
                q0e q0eVarA2 = r0e.a((e52) concurrentHashMap2.get(Long.valueOf(j3)));
                e52 e52Var2 = (e52) q0eVarA2.getValue();
                if (e52Var2 == null) {
                    j47.T((sx3) ((khe) ty2Var2.X).getValue(), null, null, new ry2(q0eVarA2, null, ty2Var2, j3), 3);
                } else {
                    ((ti9) ((ConcurrentHashMap) ty2Var2.Y).computeIfAbsent(Long.valueOf(e52Var2.a), new sy2(new py2(e52Var2, 1)))).setValue(e52Var2);
                }
                return q0eVarA2;
        }
    }
}
