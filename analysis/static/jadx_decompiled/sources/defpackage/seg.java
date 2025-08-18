package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class seg extends a {
    public final ooe K0;

    public seg(Context context, Looper looper, kad kadVar, ooe ooeVar, ge6 ge6Var, he6 he6Var) {
        super(context, looper, 270, kadVar, ge6Var, he6Var);
        this.K0 = ooeVar;
    }

    @Override // defpackage.ok
    public final int g() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof oeg ? (oeg) iInterfaceQueryLocalInterface : new oeg(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final pe5[] m() {
        return dy7.l;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle n() {
        ooe ooeVar = this.K0;
        ooeVar.getClass();
        Bundle bundle = new Bundle();
        String str = ooeVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean r() {
        return true;
    }
}
