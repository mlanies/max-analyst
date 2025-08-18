package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class jig extends a {
    @Override // defpackage.ok
    public final int g() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof aig ? (aig) iInterfaceQueryLocalInterface : new aig(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
