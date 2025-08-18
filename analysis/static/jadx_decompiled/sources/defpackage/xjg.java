package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class xjg extends a {
    public final v70 K0;

    public xjg(Context context, Looper looper, kad kadVar, v70 v70Var, ge6 ge6Var, he6 he6Var) {
        super(context, looper, 68, kadVar, ge6Var, he6Var);
        v70Var = v70Var == null ? v70.o : v70Var;
        cjg cjgVar = new cjg();
        cjgVar.b = Boolean.FALSE;
        cjgVar.a = v70Var.a;
        cjgVar.b = Boolean.valueOf(v70Var.b);
        cjgVar.c = v70Var.c;
        byte[] bArr = new byte[16];
        yfg.a.nextBytes(bArr);
        cjgVar.c = Base64.encodeToString(bArr, 11);
        this.K0 = new v70(cjgVar);
    }

    @Override // defpackage.ok
    public final int g() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof skg ? (skg) iInterfaceQueryLocalInterface : new skg(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 4);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle n() {
        v70 v70Var = this.K0;
        v70Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", v70Var.a);
        bundle.putBoolean("force_save_dialog", v70Var.b);
        bundle.putString("log_session_id", v70Var.c);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
