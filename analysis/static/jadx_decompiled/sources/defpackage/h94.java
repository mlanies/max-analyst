package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class h94 implements q24 {
    public final Context a;
    public final q24 b;

    public h94(Context context) {
        this(context, new jb4());
    }

    @Override // defpackage.q24
    public final t24 a() {
        return new j94(this.a, this.b.a());
    }

    public h94(Context context, q24 q24Var) {
        this.a = context.getApplicationContext();
        this.b = q24Var;
    }
}
