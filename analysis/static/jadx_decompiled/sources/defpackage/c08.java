package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class c08 implements Comparator {
    public final /* synthetic */ int a;
    public final long b;

    public /* synthetic */ c08(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long lValueOf;
        switch (this.a) {
            case 0:
                return ((e08) obj).c == this.b ? -1 : 0;
            case 1:
                kzc kzcVar = (kzc) obj2;
                e52 e52Var = kzcVar.o;
                Long lValueOf2 = null;
                long j = this.b;
                if (e52Var == null || !e52Var.b.f(j)) {
                    e52 e52Var2 = kzcVar.o;
                    lValueOf = e52Var2 != null ? Long.valueOf(e52Var2.m()) : null;
                } else {
                    lValueOf = Long.MAX_VALUE;
                }
                kzc kzcVar2 = (kzc) obj;
                e52 e52Var3 = kzcVar2.o;
                if (e52Var3 == null || !e52Var3.b.f(j)) {
                    e52 e52Var4 = kzcVar2.o;
                    if (e52Var4 != null) {
                        lValueOf2 = Long.valueOf(e52Var4.m());
                    }
                } else {
                    lValueOf2 = Long.MAX_VALUE;
                }
                return xfg.f(lValueOf, lValueOf2);
            default:
                long j2 = this.b;
                return xfg.f(new ft4(((urf) obj2).b(j2)), new ft4(((urf) obj).b(j2)));
        }
    }
}
