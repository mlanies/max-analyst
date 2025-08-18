package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p6a implements pi4 {
    public final long a = ei4.b.incrementAndGet();
    public final q0e b;
    public final w7c c;
    public final /* synthetic */ je7 d;

    public p6a(je7 je7Var) {
        this.d = je7Var;
        q0e q0eVarA = r0e.a(e());
        this.b = q0eVarA;
        this.c = new w7c(q0eVarA);
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.c;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        if (ei4.a(b54Var.a, this.a)) {
            je7 je7Var = this.d;
            icd icdVar = ((List) ((se5) ((qe5) je7Var.getValue())).i.getValue()) != null ? null : new icd("https://max.ru/s/img/big-logo.png", 2165956L, "Войти в MAX", null);
            qe5 qe5Var = (qe5) je7Var.getValue();
            List listSingletonList = icdVar != null ? Collections.singletonList(icdVar) : null;
            se5 se5Var = (se5) qe5Var;
            se5Var.getClass();
            se5Var.i = new v07(listSingletonList);
        }
        this.b.setValue(e());
    }

    public final kl7 e() {
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(new b54(this.a, new iqe("Включить баннер MAX в настройках?"), avb.ic_notification, null, new a54(((List) ((se5) ((qe5) this.d.getValue())).i.getValue()) != null), 8));
        return j1e.d(kl7VarL);
    }
}
