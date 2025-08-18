package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q2f extends p2f {
    public boolean b;
    public Iterator c;
    public boolean d;
    public final /* synthetic */ jj5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2f(jj5 jj5Var, Object obj) {
        super(obj);
        this.e = jj5Var;
        c6d c6dVar = jj5Var.X;
    }

    @Override // defpackage.u2f
    public final Object a() {
        boolean z = this.d;
        jj5 jj5Var = this.e;
        Object obj = this.a;
        if (!z && this.c == null) {
            m56 m56Var = ((v2f) jj5Var.X).d;
            if (m56Var != null && !((Boolean) m56Var.invoke(obj)).booleanValue()) {
                return null;
            }
            c6d c6dVar = (c6d) ((v2f) jj5Var.X).b.invoke(obj);
            Iterator it = c6dVar != null ? c6dVar.iterator() : null;
            this.c = it;
            if (it == null) {
                a66 a66Var = ((v2f) jj5Var.X).f;
                if (a66Var != null) {
                    a66Var.invoke(obj, new IllegalStateException("Cannot list leafs of " + obj));
                }
                this.d = true;
            }
        }
        Iterator it2 = this.c;
        if (it2 != null && it2.hasNext()) {
            return this.c.next();
        }
        if (!this.b) {
            this.b = true;
            return obj;
        }
        m56 m56Var2 = ((v2f) jj5Var.X).e;
        if (m56Var2 == null) {
            return null;
        }
        m56Var2.invoke(obj);
        return null;
    }
}
