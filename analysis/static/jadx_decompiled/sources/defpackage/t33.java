package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class t33 extends hyc {
    public final boolean l;
    public volatile Boolean m;

    public t33(Context context, cj4 cj4Var, mi5 mi5Var) {
        super(context, mi5Var);
        this.m = null;
        this.l = false;
        this.j = cj4Var;
    }

    public final String D() {
        return g("server.host", this.l ? "api.oneme.ru" : null);
    }

    public final String E() {
        return g("server.port", this.l ? "443" : null);
    }

    public final long F() {
        return f("app.stats.session.id", 0L);
    }

    public final boolean G() {
        if (this.m == null) {
            this.m = Boolean.valueOf(this.g.getBoolean("ok_push_disabled", false));
        }
        try {
            return this.m.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.hyc, defpackage.e3
    public final void c() {
        String strD = D();
        String strE = E();
        boolean zD = d("server.useTls", true);
        ne7 ne7Var = this.g;
        String string = ne7Var.getString("server.loginError", null);
        String string2 = ne7Var.getString("device.id", null);
        String string3 = ne7Var.getString("user.Phone.Code", null);
        String strG = g("user.Phone", null);
        String string4 = ne7Var.getString("app.lastSuccessProxy", null);
        String string5 = ne7Var.getString("app.currentProxyList", null);
        int i = ne7Var.getInt("app.currentProxyListTtl", 299);
        boolean z = ne7Var.getBoolean("app.debugHostRotation", false);
        boolean z2 = ne7Var.getBoolean("app.debugUaDnsEmulation", false);
        String strR = r();
        String string6 = ne7Var.getString("user.systemLang", null);
        String string7 = ne7Var.getString("app.tenor.anon.id", "");
        long j = ne7Var.getLong("app.last.push.state.time", 0L);
        this.j.getClass();
        bcf bcfVar = bcf.a;
        bcfVar.b().getClass();
        long jF = F();
        ArrayMap arrayMap = new ArrayMap(1);
        ((HashMap) ne7Var.getAll()).forEach(new r33(0, arrayMap));
        super.c();
        m("server.host", strD);
        m("server.port", strE);
        j("server.useTls", zD);
        m("server.loginError", string);
        m("device.id", string2);
        m("user.Phone.Code", string3);
        m("user.Phone", strG);
        m("app.lastSuccessProxy", string4);
        m("app.currentProxyList", string5);
        k(i, "app.currentProxyListTtl");
        j("app.debugHostRotation", z);
        j("app.debugUaDnsEmulation", z2);
        m("user.lang", strR);
        m("user.systemLang", string6);
        m("app.tenor.anon.id", string7);
        l("app.last.push.state.time", Long.valueOf(j));
        this.j.getClass();
        bcfVar.b().getClass();
        l("app.stats.session.id", Long.valueOf(jF));
        arrayMap.forEach(new s33(0, this));
    }

    @Override // defpackage.e3
    public final boolean d(String str, boolean z) {
        return this.g.getBoolean(str, z);
    }
}
