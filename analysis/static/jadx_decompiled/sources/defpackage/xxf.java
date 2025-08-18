package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class xxf implements ia7 {
    public final je7 a;
    public final Set b;
    public final zt0 c;
    public wsf d;

    public xxf(je7 je7Var) {
        this.a = je7Var;
        v25 v25Var = vxf.Y;
        ArrayList arrayList = new ArrayList(z53.S(v25Var, 10));
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            arrayList.add(((vxf) u1Var.next()).a);
        }
        this.b = x53.H0(arrayList);
        this.c = c37.a(0, 0, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.ia7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxf.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.ia7
    public final zt0 b() {
        return this.c;
    }

    @Override // defpackage.ia7
    public final Set c() {
        return this.b;
    }

    @Override // defpackage.ia7
    public final void d(wsf wsfVar) {
        this.d = wsfVar;
    }
}
