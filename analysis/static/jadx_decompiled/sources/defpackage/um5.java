package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class um5 implements c6d {
    public final c6d a;
    public final m56 b;
    public final m56 c;

    public um5(c6d c6dVar, m56 m56Var, m56 m56Var2) {
        this.a = c6dVar;
        this.b = m56Var;
        this.c = m56Var2;
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        return new pk5(this);
    }
}
