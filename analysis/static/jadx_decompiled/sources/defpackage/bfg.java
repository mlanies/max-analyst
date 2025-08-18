package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public abstract class bfg {
    public Object a;
    public boolean b;
    public final /* synthetic */ a c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ a f;

    public bfg(a aVar, int i, Bundle bundle) {
        this.f = aVar;
        Boolean bool = Boolean.TRUE;
        this.c = aVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public final /* bridge */ void a() {
        a aVar = this.f;
        int i = this.d;
        if (i != 0) {
            aVar.v(1, null);
            Bundle bundle = this.e;
            b(new ph3(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (c()) {
                return;
            }
            aVar.v(1, null);
            b(new ph3(8, null));
        }
    }

    public abstract void b(ph3 ph3Var);

    public abstract boolean c();

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
        synchronized (this.c.v0) {
            this.c.v0.remove(this);
        }
    }
}
