package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class tg4 implements pn9 {
    public final a4c a;
    public volatile pn9 b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public o38 d = new o38(1, null, true);
    public final sg4 e = new sg4(this);

    public tg4(a4c a4cVar) {
        this.a = a4cVar;
    }

    @Override // defpackage.pn9
    public final void a(n38 n38Var) {
        this.c.remove(n38Var);
    }

    public final void b(n38 n38Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList.contains(n38Var)) {
            return;
        }
        copyOnWriteArrayList.add(n38Var);
        n38Var.p(this.d);
    }
}
