package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q25 extends v2 {
    public abstract void A(q36 q36Var, Object obj);

    public final int B(Object obj) {
        q36 q36VarF = f();
        try {
            A(q36VarF, obj);
            return q36VarF.n();
        } finally {
            t(q36VarF);
        }
    }

    public final void C(Iterable iterable) {
        q36 q36VarF = f();
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                A(q36VarF, it.next());
                q36VarF.n();
            }
        } finally {
            t(q36VarF);
        }
    }
}
