package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class vgg extends a {
    @Override // defpackage.ok
    public final int g() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof dig ? (dig) iInterfaceQueryLocalInterface : new dig(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final pe5[] m() {
        return np8.g;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean r() {
        return true;
    }
}
