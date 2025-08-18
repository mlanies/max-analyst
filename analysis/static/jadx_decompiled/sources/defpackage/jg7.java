package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class jg7 implements ah7 {
    public final x3c a;
    public final eh7 b;

    public jg7(eh7 eh7Var, x3c x3cVar) {
        this.b = eh7Var;
        this.a = x3cVar;
    }

    @p3a(eg7.ON_DESTROY)
    public void onDestroy(eh7 eh7Var) {
        x3c x3cVar = this.a;
        synchronized (x3cVar.b) {
            try {
                jg7 jg7VarE = x3cVar.e(eh7Var);
                if (jg7VarE == null) {
                    return;
                }
                x3cVar.l(eh7Var);
                Iterator it = ((Set) ((HashMap) x3cVar.o).get(jg7VarE)).iterator();
                while (it.hasNext()) {
                    ((HashMap) x3cVar.c).remove((wa0) it.next());
                }
                ((HashMap) x3cVar.o).remove(jg7VarE);
                jg7VarE.b.Q().f(jg7VarE);
            } finally {
            }
        }
    }

    @p3a(eg7.ON_START)
    public void onStart(eh7 eh7Var) {
        this.a.k(eh7Var);
    }

    @p3a(eg7.ON_STOP)
    public void onStop(eh7 eh7Var) {
        this.a.l(eh7Var);
    }
}
