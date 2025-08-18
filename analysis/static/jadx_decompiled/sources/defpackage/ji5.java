package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class ji5 implements SharedPreferences.Editor {
    public final HashMap a = new HashMap();
    public final Object b = new Object();
    public boolean c;
    public final /* synthetic */ ki5 d;

    public ji5(ki5 ki5Var) {
        this.d = ki5Var;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        fd7 fd7Var = this.d.b;
        if (fd7Var != null) {
            fd7Var.G("apply");
        }
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        synchronized (this.b) {
            this.c = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:27:0x009e, B:31:0x00a6, B:33:0x00af, B:35:0x00b3, B:38:0x00bc, B:40:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00dd, B:47:0x00e3, B:52:0x00fa, B:54:0x0100, B:56:0x0106, B:59:0x010d, B:65:0x011d, B:60:0x0111, B:63:0x0118, B:67:0x0122, B:69:0x0129, B:71:0x012d, B:72:0x0132, B:73:0x0143, B:75:0x0147), top: B:85:0x009e, outer: #1 }] */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean commit() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji5.commit():boolean");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.b) {
            this.a.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.b) {
            this.a.put(str, Float.valueOf(f));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.b) {
            this.a.put(str, Integer.valueOf(i));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.b) {
            this.a.put(str, Long.valueOf(j));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.b) {
            this.a.put(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        synchronized (this.b) {
            this.a.put(str, set);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        synchronized (this.b) {
            this.a.put(str, this);
        }
        return this;
    }
}
