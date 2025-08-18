package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class k94 implements p24 {
    public final Context a;
    public final y0f b;
    public final p24 c;

    public k94(Context context, String str, h84 h84Var) {
        ib4 ib4Var = new ib4();
        ib4Var.b = str;
        this.a = context.getApplicationContext();
        this.b = h84Var;
        this.c = ib4Var;
    }

    @Override // defpackage.p24
    public final r24 a() {
        i94 i94Var = new i94(this.a, this.c.a());
        y0f y0fVar = this.b;
        if (y0fVar != null) {
            i94Var.N(y0fVar);
        }
        return i94Var;
    }
}
