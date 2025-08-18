package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class bn8 extends ci9 {
    public final rqc l = new rqc();

    @Override // defpackage.xm7
    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            nqc nqcVar = (nqc) it;
            if (!nqcVar.hasNext()) {
                return;
            } else {
                ((an8) ((Map.Entry) nqcVar.next()).getValue()).b();
            }
        }
    }

    @Override // defpackage.xm7
    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            nqc nqcVar = (nqc) it;
            if (!nqcVar.hasNext()) {
                return;
            }
            an8 an8Var = (an8) ((Map.Entry) nqcVar.next()).getValue();
            an8Var.a.j(an8Var);
        }
    }

    public void l(xm7 xm7Var, g2a g2aVar) {
        if (xm7Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        an8 an8Var = new an8(xm7Var, g2aVar);
        an8 an8Var2 = (an8) this.l.b(xm7Var, an8Var);
        if (an8Var2 != null && an8Var2.b != g2aVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (an8Var2 == null && this.c > 0) {
            an8Var.b();
        }
    }
}
