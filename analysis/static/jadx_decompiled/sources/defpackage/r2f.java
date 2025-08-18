package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r2f extends p2f {
    public final Iterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2f(jj5 jj5Var, Object obj) {
        super(obj);
        v2f v2fVar = (v2f) jj5Var.X;
        c6d c6dVar = (c6d) v2fVar.b.invoke(obj);
        this.b = c6dVar != null ? c6dVar.iterator() : null;
    }

    @Override // defpackage.u2f
    public final Object a() {
        Iterator it = this.b;
        if (it == null || !it.hasNext()) {
            return null;
        }
        return it.next();
    }
}
