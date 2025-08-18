package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public class ek4 extends sh4 {
    public int m;

    public ek4(r5g r5gVar) {
        super(r5gVar);
        if (r5gVar instanceof eo6) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.sh4
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            oh4 oh4Var = (oh4) it.next();
            oh4Var.a(oh4Var);
        }
    }
}
