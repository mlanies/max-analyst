package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class v2f implements c6d {
    public final Object a;
    public final m56 b;
    public final m56 d;
    public final int c = 1;
    public final m56 e = null;
    public final a66 f = null;
    public final int g = Integer.MAX_VALUE;

    public v2f(Object obj, m56 m56Var, m56 m56Var2) {
        this.a = obj;
        this.b = m56Var;
        this.d = m56Var2;
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        return new jj5(this);
    }
}
