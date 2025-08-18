package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class yn9 extends ej3 {
    public final ConnectivityManager Y;
    public final kh3 Z;

    public yn9(Context context, bkb bkbVar) {
        super(context, bkbVar);
        this.Y = (ConnectivityManager) ((Context) this.b).getSystemService("connectivity");
        this.Z = new kh3(1, this);
    }

    @Override // defpackage.ej3
    public final Object i() {
        return zn9.a(this.Y);
    }

    @Override // defpackage.ej3
    public final void r() {
        try {
            a14.u().n(zn9.a, "Registering network callback");
            on9.a(this.Y, this.Z);
        } catch (IllegalArgumentException e) {
            a14.u().r(zn9.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            a14.u().r(zn9.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.ej3
    public final void s() {
        try {
            a14.u().n(zn9.a, "Unregistering network callback");
            mn9.c(this.Y, this.Z);
        } catch (IllegalArgumentException e) {
            a14.u().r(zn9.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            a14.u().r(zn9.a, "Received exception while unregistering network callback", e2);
        }
    }
}
