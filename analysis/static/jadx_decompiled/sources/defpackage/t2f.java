package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class t2f extends p2f {
    public boolean b;
    public Iterator c;
    public final /* synthetic */ jj5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2f(jj5 jj5Var, Object obj) {
        super(obj);
        this.d = jj5Var;
        c6d c6dVar = jj5Var.X;
    }

    @Override // defpackage.u2f
    public final Object a() {
        a66 a66Var;
        boolean z = this.b;
        jj5 jj5Var = this.d;
        Object obj = this.a;
        if (!z) {
            m56 m56Var = ((v2f) jj5Var.X).d;
            if (m56Var != null && !((Boolean) m56Var.invoke(obj)).booleanValue()) {
                return null;
            }
            this.b = true;
            return obj;
        }
        Iterator it = this.c;
        if (it != null && !it.hasNext()) {
            m56 m56Var2 = ((v2f) jj5Var.X).e;
            if (m56Var2 == null) {
                return null;
            }
            m56Var2.invoke(obj);
            return null;
        }
        if (this.c == null) {
            c6d c6dVar = (c6d) ((v2f) jj5Var.X).b.invoke(obj);
            Iterator it2 = c6dVar != null ? c6dVar.iterator() : null;
            this.c = it2;
            if (it2 == null && (a66Var = ((v2f) jj5Var.X).f) != null) {
                a66Var.invoke(obj, new IllegalStateException("Cannot list leafs of " + obj));
            }
            Iterator it3 = this.c;
            if (it3 == null || !it3.hasNext()) {
                m56 m56Var3 = ((v2f) jj5Var.X).e;
                if (m56Var3 != null) {
                    m56Var3.invoke(obj);
                }
                return null;
            }
        }
        return this.c.next();
    }
}
