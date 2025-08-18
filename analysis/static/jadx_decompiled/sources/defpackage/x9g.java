package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class x9g extends pk0 {
    public static final qec c = new qec("\\p{Graph}+?");
    public final String a;
    public final w9g b;

    public x9g(Context context, String str) {
        this.a = str;
        this.b = new w9g(context);
    }

    public static final boolean b(String str) {
        return w9g.j.matcher(str).matches() || w9g.k.matcher(str).matches() || c.a(str);
    }

    @Override // defpackage.pk0
    public final iqd a() {
        return new q1a(1, new gte(23, this));
    }
}
