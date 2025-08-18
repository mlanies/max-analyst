package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.u;

/* loaded from: classes2.dex */
public final class h77 implements Iterator {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ i77 b;

    public h77(i77 i77Var, Iterator it) {
        this.b = i77Var;
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        u uVar = (u) this.b.c;
        Object next = this.a.next();
        uVar.getClass();
        return u.a(next);
    }
}
