package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class qk5 implements c6d {
    public final c6d a;
    public final boolean b;
    public final m56 c;

    public qk5(c6d c6dVar, boolean z, m56 m56Var) {
        this.a = c6dVar;
        this.b = z;
        this.c = m56Var;
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        return new pk5(this);
    }
}
