package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class r25 extends v2 {
    public abstract void A(q36 q36Var, Object obj);

    public final void B(Iterable iterable) {
        q36 q36VarF = f();
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                A(q36VarF, it.next());
                q36VarF.m();
            }
        } finally {
            t(q36VarF);
        }
    }

    public final void C(Object obj) {
        q36 q36VarF = f();
        try {
            A(q36VarF, obj);
            q36VarF.m();
        } finally {
            t(q36VarF);
        }
    }

    public final long D(Object obj) {
        q36 q36VarF = f();
        try {
            A(q36VarF, obj);
            return q36VarF.m();
        } finally {
            t(q36VarF);
        }
    }
}
