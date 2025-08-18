package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jm4 extends q1 {
    public final HashSet X = new HashSet();
    public final Iterator c;
    public final m56 o;

    public jm4(Iterator it, pz2 pz2Var) {
        this.c = it;
        this.o = pz2Var;
    }

    @Override // defpackage.q1
    public final void a() {
        Object next;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.a = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.X.add(this.o.invoke(next)));
        this.b = next;
        this.a = 1;
    }
}
