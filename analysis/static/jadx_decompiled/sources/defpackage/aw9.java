package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class aw9 {
    public final Context a;
    public final xv9 b;

    public aw9(Context context, xv9 xv9Var) {
        this.a = context;
        this.b = xv9Var;
    }

    public final String a(String str, String str2, String str3, boolean z) {
        if (z) {
            return rh4.j(str2, ": ", str3);
        }
        if (str != null && str.length() != 0) {
            return str2 + " | " + str + ": " + str3;
        }
        return str2 + " " + this.a.getString(c2c.tt_in_chat) + ": " + str3;
    }
}
