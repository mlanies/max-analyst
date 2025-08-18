package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class h3g implements o3g {
    public final long a;
    public final long b;
    public final Context c;
    public final int d;

    public h3g(long j, long j2, Context context, y7d y7dVar) {
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = (int) ((qyc) y7dVar).q(PmsKey.f132webappdskeyscount, 100);
    }

    @Override // defpackage.o3g
    public final Boolean a(String str, String str2) {
        SharedPreferences sharedPreferencesC = c();
        if (!sharedPreferencesC.contains(str) && sharedPreferencesC.getAll().size() == this.d) {
            return Boolean.FALSE;
        }
        sharedPreferencesC.edit().putString(str, str2).apply();
        return Boolean.TRUE;
    }

    @Override // defpackage.o3g
    public final String b(String str) {
        return c().getString(str, null);
    }

    public final SharedPreferences c() {
        return this.c.getApplicationContext().getSharedPreferences("webapp_ds_" + this.b + "_" + this.a, 0);
    }

    @Override // defpackage.o3g
    public final Boolean clear() {
        SharedPreferences sharedPreferencesC = c();
        if (sharedPreferencesC.getAll().isEmpty()) {
            return Boolean.FALSE;
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
