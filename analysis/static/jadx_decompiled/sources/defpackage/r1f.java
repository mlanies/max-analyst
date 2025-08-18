package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r1f implements c6d {
    public final c6d a;
    public final m56 b;

    public r1f(c6d c6dVar, m56 m56Var) {
        this.a = c6dVar;
        this.b = m56Var;
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        return new q1f(this);
    }
}
