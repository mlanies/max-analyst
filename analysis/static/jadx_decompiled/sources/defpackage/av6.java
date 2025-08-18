package defpackage;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class av6 {
    public static final /* synthetic */ int c = 0;
    public final je7 a;
    public final je7 b;

    public av6(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public final void a(String str, zu6 zu6Var) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(null)) {
            b(zu6Var);
        } else {
            ((w9a) ((kke) this.b.getValue())).b().mo20dispatch(hz4.a, new yg3(this, str, zu6Var));
        }
    }

    public final void b(zu6 zu6Var) {
        if (zu6Var != null) {
            c(new wu6(zu6Var, 0));
        }
    }

    public final void c(Runnable runnable) {
        ((w9a) ((kke) this.b.getValue())).c().getImmediate().mo20dispatch(hz4.a, runnable);
    }
}
