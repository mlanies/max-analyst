package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ne7 implements SharedPreferences {
    public final khe a;

    public ne7(Context context, li5 li5Var, mi5 mi5Var, fd7 fd7Var) {
        this.a = new khe(new bp(context.getDir("file_prefs", 0), li5Var, mi5Var, fd7Var, 3));
    }

    public final ki5 a() {
        return (ki5) this.a.getValue();
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return a().d.b(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return a().edit();
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return a().getAll();
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return a().getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return a().getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return a().getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return a().getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return a().getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return a().getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
