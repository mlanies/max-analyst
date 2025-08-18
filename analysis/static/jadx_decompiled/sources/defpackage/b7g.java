package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* loaded from: classes.dex */
public final class b7g extends Binder {
    public final fd7 c;

    public b7g(fd7 fd7Var) {
        this.c = fd7Var;
    }

    public final void a(c7g c7gVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = c7gVar.a;
        f25 f25Var = (f25) this.c.a;
        f25Var.getClass();
        qne qneVar = new qne();
        f25Var.a.execute(new v05(f25Var, intent, qneVar, 2));
        qneVar.a.b(new cs(2), new gte(20, c7gVar));
    }
}
