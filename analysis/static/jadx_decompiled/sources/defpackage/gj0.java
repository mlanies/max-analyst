package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class gj0 implements tj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e08 b;

    public /* synthetic */ gj0(e08 e08Var, int i) {
        this.a = i;
        this.b = e08Var;
    }

    @Override // defpackage.tj3
    public final void accept(Object obj) {
        e08 e08Var;
        switch (this.a) {
            case 0:
                fk9 fk9Var = (fk9) obj;
                fk9Var.getClass();
                e08 e08Var2 = this.b;
                long j = e08Var2.c;
                long j2 = fk9Var.C0.h;
                ConcurrentHashMap concurrentHashMap = fk9Var.c;
                kk9 kk9Var = (kk9) fk9Var.b;
                er7 er7Var = e08Var2.a;
                if (j == j2) {
                    fk9Var.b2(new fj0(16));
                    e08 e08Var3 = (e08) concurrentHashMap.get(Long.valueOf(fk9Var.C0.h));
                    if (e08Var3 != null) {
                        fk9Var.H0.e(e08Var3);
                    }
                    ((el9) kk9Var).B(er7Var.a, er7Var.b, false);
                } else {
                    if (j2 != -1 && (e08Var = (e08) concurrentHashMap.get(Long.valueOf(j2))) != null) {
                        d08 d08VarA = e08Var.a();
                        d08VarA.d = i08.b;
                        concurrentHashMap.put(Long.valueOf(e08Var.c), new e08(d08VarA));
                    }
                    long j3 = fk9Var.C0.h;
                    long j4 = e08Var2.c;
                    if (j4 != j3) {
                        fk9Var.b2(new gj0(e08Var2, 3));
                        e08 e08Var4 = (e08) concurrentHashMap.get(Long.valueOf(fk9Var.C0.h));
                        if (e08Var4 != null) {
                            d08 d08VarA2 = e08Var4.a();
                            d08VarA2.d = i08.c;
                            concurrentHashMap.put(Long.valueOf(e08Var4.c), new e08(d08VarA2));
                            fk9Var.H0.e(e08Var4);
                        }
                        fk9Var.g2(j4);
                        ((el9) kk9Var).B(er7Var.a, er7Var.b, false);
                    }
                }
                ((el9) kk9Var).A(-1L, e08Var2.k);
                fk9Var.F0 = true;
                fk9Var.h2(null);
                fk9Var.e2();
                break;
            case 1:
                fk9 fk9Var2 = (fk9) obj;
                fk9Var2.getClass();
                e08 e08Var5 = this.b;
                long j5 = e08Var5.j;
                long j6 = fk9Var2.C0.o;
                kk9 kk9Var2 = (kk9) fk9Var2.b;
                er7 er7Var2 = e08Var5.a;
                if (j5 != j6) {
                    if (((List) fk9Var2.o.get(Long.valueOf(e08Var5.c))) != null) {
                        fk9Var2.b2(new gj0(e08Var5, 4));
                        fk9Var2.h2(null);
                        el9 el9Var = (el9) kk9Var2;
                        el9Var.A(e08Var5.j, e08Var5.k);
                        e08 e08Var6 = (e08) fk9Var2.c.get(Long.valueOf(fk9Var2.C0.h));
                        if (e08Var6 != null) {
                            fk9Var2.H0.e(e08Var6);
                        }
                        el9Var.B(er7Var2.a, er7Var2.b, false);
                        break;
                    }
                } else {
                    ((el9) kk9Var2).B(er7Var2.a, er7Var2.b, false);
                    break;
                }
                break;
            case 2:
                ((gr7) obj).h = this.b.c;
                break;
            case 3:
                gr7 gr7Var = (gr7) obj;
                gr7Var.h = this.b.c;
                gr7Var.o = -1L;
                break;
            default:
                ((gr7) obj).o = this.b.j;
                break;
        }
    }
}
