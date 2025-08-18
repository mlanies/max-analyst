package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zs implements Iterable, qb7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(String str) {
        for (lq6 lq6Var : (lq6[]) this.b) {
            if (eae.k0(lq6Var.a, str, true)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new u1(2, (Object[]) this.b);
            case 1:
                return new u1(2, (lq6[]) this.b);
            case 2:
                return new ms4((Iterator) ((k56) this.b).invoke());
            case 3:
                return ((c6d) this.b).iterator();
            default:
                return new u6d((r6d) this.b, 1);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "[" + ys.j0((lq6[]) this.b, ", ", 62) + ']';
            default:
                return super.toString();
        }
    }
}
