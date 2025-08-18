package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class jv1 extends iv1 {
    public final ArrayList a = new ArrayList();

    public jv1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iv1 iv1Var = (iv1) it.next();
            if (!(iv1Var instanceof kv1)) {
                this.a.add(iv1Var);
            }
        }
    }

    @Override // defpackage.iv1
    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((iv1) it.next()).a(i);
        }
    }

    @Override // defpackage.iv1
    public final void b(int i, pv1 pv1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((iv1) it.next()).b(i, pv1Var);
        }
    }

    @Override // defpackage.iv1
    public final void c(int i, dp3 dp3Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((iv1) it.next()).c(i, dp3Var);
        }
    }

    @Override // defpackage.iv1
    public final void d(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((iv1) it.next()).d(i);
        }
    }
}
