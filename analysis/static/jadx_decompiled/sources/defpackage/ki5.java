package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ki5 implements SharedPreferences {
    public static final Object h = new Object();
    public final li5 a;
    public final fd7 b;
    public final zy c;
    public qi9 d;
    public final khe e;
    public final je7 f;
    public final Object g;

    public ki5(File file, li5 li5Var, mi5 mi5Var, fd7 fd7Var) {
        this.a = li5Var;
        this.b = fd7Var;
        File file2 = new File(file, w9e.L0(li5Var.a, ".prefs").concat(".prefs"));
        zy zyVar = new zy(file2, fd7Var != null ? new q64(25, this) : null);
        this.c = zyVar;
        this.d = new qi9(10);
        this.e = new khe(new yf3(this, 10, mi5Var));
        this.f = tu0.r(2, new fh5(4));
        this.g = new Object();
        if (file2.exists()) {
            if (fd7Var != null) {
                try {
                    fd7Var.G("read prefs from file");
                } catch (Throwable th) {
                    fd7 fd7Var2 = this.b;
                    if (fd7Var2 != null) {
                        hm9.p(((e3) fd7Var2.a).e, "read prefs from file failure", th);
                        return;
                    }
                    return;
                }
            }
            pag.G(zyVar, new bk(9, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ri9 r27, boolean r28, defpackage.li9 r29) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki5.a(ri9, boolean, li9):void");
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.d.b(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        li5 li5Var = this.a;
        fd7 fd7Var = this.b;
        if (fd7Var != null) {
            li5Var.getClass();
            fd7Var.G("edit: strategy = ".concat("BIG_CHANGES"));
        }
        li5Var.getClass();
        return new ji5(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map getAll() {
        /*
            r15 = this;
            java.util.HashMap r0 = new java.util.HashMap
            qi9 r1 = r15.d
            int r1 = r1.e
            r0.<init>(r1)
            qi9 r15 = r15.d
            java.lang.Object[] r1 = r15.b
            java.lang.Object[] r2 = r15.c
            long[] r15 = r15.a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L54
            r4 = 0
            r5 = r4
        L18:
            r6 = r15[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4f
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L32:
            if (r10 >= r8) goto L4d
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L49
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            java.lang.String r12 = (java.lang.String) r12
            r0.put(r12, r11)
        L49:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L32
        L4d:
            if (r8 != r9) goto L54
        L4f:
            if (r5 == r3) goto L54
            int r5 = r5 + 1
            goto L18
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki5.getAll():java.util.Map");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objF = this.d.f(str);
        Boolean bool = objF instanceof Boolean ? (Boolean) objF : null;
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objF = this.d.f(str);
        Float f2 = objF instanceof Float ? (Float) objF : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objF = this.d.f(str);
        Integer num = objF instanceof Integer ? (Integer) objF : null;
        return num != null ? num.intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objF = this.d.f(str);
        Long l = objF instanceof Long ? (Long) objF : null;
        return l != null ? l.longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objF = this.d.f(str);
        String str3 = objF instanceof String ? (String) objF : null;
        return str3 == null ? str2 : str3;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objF = this.d.f(str);
        Set set2 = objF instanceof Set ? (Set) objF : null;
        return set2 == null ? set : set2;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((WeakHashMap) this.f.getValue()).put(onSharedPreferenceChangeListener, h);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((WeakHashMap) this.f.getValue()).remove(onSharedPreferenceChangeListener);
        }
    }
}
