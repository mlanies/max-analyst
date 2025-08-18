package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class e3 {
    public final String e;
    public final Context f;
    public final ne7 g;

    public e3(Context context, String str, mi5 mi5Var) {
        this.f = context;
        this.e = "Prefs/" + str.replace(".prefs", "");
        this.g = new ne7(context, new li5(str), mi5Var, new fd7(this));
    }

    public static void i(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            editor.putFloat(str, ((Double) obj).floatValue());
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Set) {
            editor.putStringSet(str, (Set) obj);
        } else if (obj instanceof Map) {
            editor.putString(str, m6d.Q((Map) obj).toString());
        } else if (obj instanceof List) {
            editor.putString(str, m6d.P((List) obj).toString());
        }
    }

    public void c() {
        hm9.m(this.e, "clear: %s", getClass().getSimpleName());
        ji5 ji5Var = (ji5) this.g.edit();
        ji5Var.clear();
        ji5Var.commit();
    }

    public boolean d(String str, boolean z) {
        return this.g.getBoolean(str, z);
    }

    public final int e(String str, int i) {
        return this.g.getInt(str, i);
    }

    public final long f(String str, long j) {
        return this.g.getLong(str, j);
    }

    public final String g(String str, String str2) {
        return this.g.getString(str, str2);
    }

    public final List h(String str, List list) {
        JSONArray jSONArray = null;
        String strG = g(str, null);
        if (strG != null) {
            try {
                jSONArray = new JSONArray(strG);
            } catch (JSONException unused) {
            }
        }
        if (jSONArray == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public final void j(String str, boolean z) {
        ji5 ji5Var = (ji5) this.g.edit();
        ji5Var.putBoolean(str, z);
        ji5Var.apply();
    }

    public final void k(int i, String str) {
        ji5 ji5Var = (ji5) this.g.edit();
        ji5Var.putInt(str, i);
        ji5Var.apply();
    }

    public final void l(String str, Long l) {
        ji5 ji5Var = (ji5) this.g.edit();
        ji5Var.putLong(str, l.longValue());
        ji5Var.apply();
    }

    public final void m(String str, String str2) {
        ji5 ji5Var = (ji5) this.g.edit();
        ji5Var.putString(str, str2);
        ji5Var.apply();
    }
}
