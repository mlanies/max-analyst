package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class bhg extends a {
    public final qpd K0;
    public final qpd L0;
    public final qpd M0;

    public bhg(Context context, Looper looper, kad kadVar, ge6 ge6Var, he6 he6Var) {
        super(context, looper, 23, kadVar, ge6Var, he6Var);
        this.K0 = new qpd(0);
        this.L0 = new qpd(0);
        this.M0 = new qpd(0);
    }

    @Override // defpackage.ok
    public final int g() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof nkg ? (nkg) iInterfaceQueryLocalInterface : new nkg(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 2);
    }

    @Override // com.google.android.gms.common.internal.a
    public final pe5[] m() {
        return fm9.i;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final void s() {
        System.currentTimeMillis();
        synchronized (this.K0) {
            this.K0.clear();
        }
        synchronized (this.L0) {
            this.L0.clear();
        }
        synchronized (this.M0) {
            this.M0.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
