package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class w67 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        v67 v67Var = (v67) obj;
        v67 v67Var2 = (v67) obj2;
        if (v67Var.b == 0 && v67Var2.b != 0) {
            return -1;
        }
        if (v67Var.b == 0 || v67Var2.b != 0) {
            return Float.compare(v67Var.e, v67Var2.e);
        }
        return 1;
    }
}
