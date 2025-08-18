package defpackage;

import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class e5a {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public e5a(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
    }

    public final q33 a() {
        return (q33) this.b.getValue();
    }

    public final Object b(String str, gu7 gu7Var) {
        long j;
        String str2;
        long jP = ((hyc) a()).p();
        long j2 = ((hyc) a()).g.getLong("user.contactsLastSync", 0L);
        long jF = ((hyc) a()).f("user.presenceLastSync", 0L);
        String name = e5a.class.getName();
        String strG = nu0.G(new Long(jP));
        String strG2 = nu0.G(new Long(j2));
        String strG3 = nu0.G(new Long(jF));
        StringBuilder sbK = k7d.k("LoginTamTask: chatsLastSync = ", strG, ", contactLastSync = ", strG2, ", presenceLastSync = ");
        sbK.append(strG3);
        hm9.n(name, sbK.toString());
        je7 je7Var = this.c;
        String strW = ((qyc) ((y7d) je7Var.getValue())).w(pyc.a, null);
        if (((qyc) ((y7d) je7Var.getValue())).g.getInt(ClientCookie.VERSION_ATTR, 1) < 6) {
            ((qyc) ((y7d) je7Var.getValue())).k(6, ClientCookie.VERSION_ATTR);
            j = 0;
            str2 = null;
        } else {
            j = jP;
            str2 = strW;
        }
        return ((ome) this.a.getValue()).e(new jt7(str, ((ri4) this.d.getValue()).d(), j, j2, jF, str2, ((hyc) a()).g.getLong("user.callsLastSync", 0L), ((hyc) a()).g.getLong("app.last.login.time", 0L), ((hyc) a()).g.getLong("user.draftsLastSync", -1L)), gu7Var);
    }
}
