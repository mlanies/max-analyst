package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class x16 implements pi6, isc, ynf {
    public gh7 X = null;
    public td Y = null;
    public final a a;
    public final xnf b;
    public final Runnable c;
    public vnf o;

    public x16(a aVar, xnf xnfVar, dd4 dd4Var) {
        this.a = aVar;
        this.b = xnfVar;
        this.c = dd4Var;
    }

    @Override // defpackage.eh7
    public final gh7 Q() {
        b();
        return this.X;
    }

    public final void a(eg7 eg7Var) {
        this.X.d(eg7Var);
    }

    public final void b() {
        if (this.X == null) {
            this.X = new gh7(this);
            td tdVar = new td(this);
            this.Y = tdVar;
            tdVar.s();
            this.c.run();
        }
    }

    @Override // defpackage.pi6
    public final vnf o() {
        Application application;
        a aVar = this.a;
        vnf vnfVarO = aVar.o();
        if (!vnfVarO.equals(aVar.g1)) {
            this.o = vnfVarO;
            return vnfVarO;
        }
        if (this.o == null) {
            Context applicationContext = aVar.U0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.o = new jsc(application, aVar, aVar.Z);
        }
        return this.o;
    }

    @Override // defpackage.pi6
    public final wh9 p() {
        Application application;
        a aVar = this.a;
        Context applicationContext = aVar.U0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        wh9 wh9Var = new wh9(0);
        if (application != null) {
            wh9Var.a(unf.d, application);
        }
        wh9Var.a(z7.e, aVar);
        wh9Var.a(z7.f, this);
        Bundle bundle = aVar.Z;
        if (bundle != null) {
            wh9Var.a(z7.g, bundle);
        }
        return wh9Var;
    }

    @Override // defpackage.ynf
    public final xnf w() {
        b();
        return this.b;
    }

    @Override // defpackage.isc
    public final mm y() {
        b();
        return (mm) this.Y.o;
    }
}
