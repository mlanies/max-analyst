package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class eme implements Comparator {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ b66 b;

    public /* synthetic */ eme(Iterable iterable, b66 b66Var) {
        this.a = iterable;
        this.b = b66Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        b66 b66Var = this.b;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        for (Long l : this.a) {
            try {
                if (l.equals(b66Var.mo131apply(obj))) {
                    i2 = i;
                } else if (l.equals(b66Var.mo131apply(obj2))) {
                    i3 = i;
                }
                if (i2 != -1 && i3 != -1) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }
}
