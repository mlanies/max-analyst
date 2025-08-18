package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class sg4 implements n38 {
    public final /* synthetic */ tg4 a;

    @Override // defpackage.n38
    public final void p(o38 o38Var) {
        tg4 tg4Var = this.a;
        tg4Var.d = o38Var;
        Iterator it = tg4Var.c.iterator();
        while (it.hasNext()) {
            ((n38) it.next()).p(o38Var);
        }
    }
}
