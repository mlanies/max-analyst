package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes2.dex */
public final class vl extends ContextWrapper implements ug, ase {
    public static vl o;
    public final Application a;
    public final je7 b;
    public final je7 c;

    public vl(Application application, je7 je7Var, khe kheVar, x6a x6aVar) {
        super(application);
        nd7.h = x6aVar;
        this.b = je7Var;
        this.a = application;
        this.c = kheVar;
        o = this;
    }

    public static ed3 b() {
        return (ed3) o.c.getValue();
    }

    public final p7b a() {
        return (p7b) this.b.getValue();
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return this.a.getBaseContext();
    }

    @Override // defpackage.ase
    public final sme u() {
        return ((tme) ((y8a) b()).getAccessor().c(tme.class)).c();
    }
}
