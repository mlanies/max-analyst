package defpackage;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class ej4 implements k56 {
    public final Application a;
    public final Context b;
    public final String c = "https";
    public final String o = "max.ru";

    public ej4(Application application, c5a c5aVar) {
        this.a = application;
        this.b = c5aVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        try {
            if (!c37.g) {
                hm9.n = true;
                c37.g = true;
                ema.c = new hx9();
            }
            jy2 jy2Var = new jy2(9, this);
            y5f y5fVar = new y5f("app-scope");
            jy2Var.invoke(y5fVar);
            c37.f = y5fVar.a();
        } catch (Throwable unused) {
        }
        return e5f.a;
    }
}
