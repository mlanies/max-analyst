package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzc implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Collection c;
    public final /* synthetic */ Collection d;

    public /* synthetic */ zzc(List list, Collection collection, Collection collection2, int i) {
        this.a = i;
        this.b = list;
        this.c = collection;
        this.d = collection2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean zContains;
        switch (this.a) {
            case 0:
                kzc kzcVar = (kzc) obj;
                e52 e52Var = kzcVar.o;
                if (e52Var != null) {
                    zContains = ((Set) this.c).contains(Long.valueOf(e52Var.a));
                } else {
                    uj3 uj3Var = kzcVar.X;
                    if (uj3Var == null) {
                        return true;
                    }
                    if (nd7.c(this.b, new c10(uj3Var.n(), 27))) {
                        return false;
                    }
                    zContains = ((Set) this.d).contains(Long.valueOf(uj3Var.n()));
                }
                return true ^ zContains;
            default:
                vpb vpbVar = (vpb) obj;
                f52 f52Var = vpbVar.a;
                if (f52Var != null) {
                    return ((List) this.c).contains(Long.valueOf(f52Var.a));
                }
                kq3 kq3Var = vpbVar.c;
                if (kq3Var == null) {
                    return false;
                }
                wm3 wm3Var = kq3Var.a;
                if (nd7.c(this.b, new c10(wm3Var.a, 27))) {
                    return true;
                }
                return ((List) this.d).contains(Long.valueOf(wm3Var.a));
        }
    }
}
