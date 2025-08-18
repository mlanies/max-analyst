package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class w72 implements Runnable {
    public final /* synthetic */ p82 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ e52 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ w72(p82 p82Var, long j, e52 e52Var, boolean z) {
        this.a = p82Var;
        this.b = j;
        this.c = e52Var;
        this.o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p82 p82Var = this.a;
        ConcurrentHashMap concurrentHashMap = p82Var.f;
        long j = this.b;
        boolean zContainsKey = concurrentHashMap.containsKey(Long.valueOf(j));
        Long lValueOf = Long.valueOf(j);
        e52 e52Var = this.c;
        concurrentHashMap.put(lValueOf, e52Var);
        boolean zF = e52Var.b.f(p82Var.K());
        k92 k92Var = e52Var.b;
        if (!zF) {
            p82Var.c.put(Long.valueOf(k92Var.l), e52Var);
        }
        if (zF || k92Var.a != 0) {
            p82Var.g.put(Long.valueOf(k92Var.a), e52Var);
        }
        boolean zT = oag.t(k92Var.I);
        ConcurrentHashMap concurrentHashMap2 = p82Var.h;
        if (zT) {
            concurrentHashMap2.remove(Long.valueOf(j));
        } else {
            concurrentHashMap2.put(Long.valueOf(j), e52Var);
        }
        if (zContainsKey) {
            je7 je7Var = p82Var.C;
            if (je7Var.getValue() != null) {
                ((zb2) ((ta2) je7Var.getValue())).k(j, e52Var);
            }
            if (this.o) {
                p82Var.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), false, false, mg4.REGULAR, null, true, wz4.a));
                List listSingletonList = Collections.singletonList(e52Var);
                o82 o82Var = p82Var.G;
                if (o82Var != null) {
                    o82Var.c(listSingletonList);
                }
            }
        }
    }
}
