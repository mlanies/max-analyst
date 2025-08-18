package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class kz {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;

    public kz(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8) {
        this.a = je7Var2;
        this.b = je7Var;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var6;
        this.f = je7Var5;
        this.g = je7Var7;
        this.h = je7Var8;
    }

    public static Object b(kz kzVar, cu8 cu8Var, boolean z, Long l, int i, hu3 hu3Var, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            l = null;
        }
        return j47.t0(((w9a) ((kke) kzVar.d.getValue())).b(), new jz(kzVar, cu8Var, (i2 & 8) != 0 ? 0 : i, l, z2, null), hu3Var);
    }

    public final Context a() {
        return (Context) this.f.getValue();
    }
}
