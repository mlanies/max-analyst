package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.KeyStore;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class i3g implements o3g {
    public final long a;
    public final long b;
    public final Context c;
    public final kxf d;
    public final int e;
    public final String f;

    public i3g(long j, long j2, Context context, y7d y7dVar) {
        StringBuilder sbK = au1.k(j2, "webapp_s_key_", "_");
        sbK.append(j);
        kxf kxfVar = new kxf(sbK.toString(), false);
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = kxfVar;
        this.e = (int) ((qyc) y7dVar).q(PmsKey.f133webappsskeyscount, 10);
        this.f = i3g.class.getName();
    }

    @Override // defpackage.o3g
    public final Boolean a(String str, String str2) throws Throwable {
        Object njcVar;
        SharedPreferences sharedPreferencesC = c();
        try {
            njcVar = this.d.b(str2);
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            hm9.l0(this.f, "Can't encrypt value", pjc.a(njcVar));
            return Boolean.FALSE;
        }
        od2.a0(njcVar);
        String str3 = (String) njcVar;
        if (!sharedPreferencesC.contains(str) && sharedPreferencesC.getAll().size() == this.e) {
            return Boolean.FALSE;
        }
        sharedPreferencesC.edit().putString(str, str3).apply();
        return Boolean.TRUE;
    }

    @Override // defpackage.o3g
    public final String b(String str) {
        Object njcVar;
        String string = c().getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            njcVar = kxf.a(this.d, string);
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        return (String) (njcVar instanceof njc ? null : njcVar);
    }

    public final SharedPreferences c() {
        return this.c.getApplicationContext().getSharedPreferences("webapp_ss_" + this.b + "_" + this.a, 0);
    }

    @Override // defpackage.o3g
    public final Boolean clear() {
        Object njcVar;
        SharedPreferences sharedPreferencesC = c();
        if (sharedPreferencesC.getAll().isEmpty()) {
            return Boolean.FALSE;
        }
        kxf kxfVar = this.d;
        kxfVar.getClass();
        try {
            ((KeyStore) ((khe) kxfVar.o).getValue()).deleteEntry((String) kxfVar.a);
            njcVar = e5f.a;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (pjc.a(njcVar) != null) {
            hm9.m0((String) kxfVar.c, "Can't remove secret key", new Object[0]);
        }
        sharedPreferencesC.edit().clear().apply();
        return Boolean.TRUE;
    }

    @Override // defpackage.o3g
    public final Boolean remove(String str) {
        SharedPreferences sharedPreferencesC = c();
        if (!sharedPreferencesC.contains(str)) {
            return Boolean.FALSE;
        }
        sharedPreferencesC.edit().remove(str).apply();
        return Boolean.TRUE;
    }
}
