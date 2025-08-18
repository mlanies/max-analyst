package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ak6 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final me6 b;
    public final lr7 c;
    public final Context d;

    public ak6(me6 me6Var, lr7 lr7Var, Context context) {
        this.b = me6Var;
        this.d = context;
        this.c = lr7Var;
    }

    public final kr7 a() {
        kr7 kr7Var = new kr7();
        kr7Var.b = 3;
        kr7Var.c = 500L;
        kr7Var.d = 10L;
        return new kr7(kr7Var);
    }
}
