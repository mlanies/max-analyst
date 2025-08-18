package defpackage;

import com.jakewharton.processphoenix.ProcessPhoenix;

/* loaded from: classes2.dex */
public final class t23 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public t23(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
    }

    public final void a() {
        je7 je7Var = this.a;
        String strF = ((f5a) je7Var.getValue()).f();
        je7 je7Var2 = this.b;
        long jT = ((hyc) ((q33) je7Var2.getValue())).t();
        if (strF == null || strF.length() == 0 || jT == -1) {
            return;
        }
        ((ku7) this.c.getValue()).a(false);
        ((hyc) ((q33) je7Var2.getValue())).C(Long.valueOf(jT));
        ((f5a) je7Var.getValue()).h(strF, false);
        hm9.n("cu7", "Run onDropCache");
        ProcessPhoenix.b(((n8c) this.d.getValue()).a);
    }
}
