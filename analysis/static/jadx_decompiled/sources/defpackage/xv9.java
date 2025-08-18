package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class xv9 {
    public final ida a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;

    public xv9(ida idaVar, rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3) {
        this.a = idaVar;
        this.b = rm4Var;
        this.c = rm4Var2;
        this.d = rm4Var3;
    }

    public final yx8 a(Context context, es8 es8Var, e52 e52Var) {
        cu8 cu8Var = es8Var.a;
        String strF = cu8Var.s0;
        boolean zX = cu8Var.x();
        rm4 rm4Var = this.c;
        if (zX) {
            rm4 rm4Var2 = this.b;
            strF = are.k(context, this.a, (el3) rm4Var2.get(), e52Var.I(), es8Var.a, ((el3) rm4Var2.get()).i(cu8Var.Y, true), true, true, ((hyc) ((q33) rm4Var.get())).t()).toString();
        } else if (strF == null || strF.length() == 0) {
            strF = ((are) this.d.get()).f(context, this.a, es8Var.a, true, false, true, false, ((hyc) ((q33) rm4Var.get())).t(), true);
        } else {
            this.a.getClass();
            cu8Var.D();
        }
        if (cu8Var.p()) {
            strF = context.getString(c2c.tt_forwarded_message_patten, strF);
        }
        if (strF == null) {
            strF = "";
        }
        return new yx8(strF, true, 0);
    }
}
