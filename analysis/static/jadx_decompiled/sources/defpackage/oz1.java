package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class oz1 extends iv1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oz1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.iv1
    public void b(int i, pv1 pv1Var) {
        switch (this.a) {
            case 1:
                i99 i99Var = (i99) this.b;
                synchronized (i99Var.a) {
                    try {
                        if (i99Var.X) {
                            return;
                        }
                        i99Var.t0.put(pv1Var.getTimestamp(), new qv1(pv1Var));
                        i99Var.e();
                        return;
                    } finally {
                    }
                }
            case 2:
                Iterator it = ((aqf) this.b).a.iterator();
                while (it.hasNext()) {
                    fad fadVar = ((l9f) it.next()).n;
                    Iterator it2 = fadVar.g.e.iterator();
                    while (it2.hasNext()) {
                        ((iv1) it2.next()).b(i, new ik5(pv1Var, fadVar.g.g, -1L));
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.iv1
    public void d(int i) {
        switch (this.a) {
            case 0:
                ju0.D().execute(new cu1(7, this));
                break;
        }
    }
}
