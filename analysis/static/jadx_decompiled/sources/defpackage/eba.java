package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class eba {
    public final bkb a;

    public eba(bkb bkbVar) {
        this.a = bkbVar;
    }

    public final tk5 a(int i, String str) {
        dba dbaVar = new dba();
        tk5 tk5Var = new tk5(1, 1, 0L, TimeUnit.MILLISECONDS, dbaVar, this.a.s(str, Integer.valueOf(i)));
        tk5Var.setRejectedExecutionHandler(new qw1(1));
        return tk5Var;
    }
}
