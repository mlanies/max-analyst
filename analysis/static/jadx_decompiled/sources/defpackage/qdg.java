package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.fragment.app.a;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class qdg implements neg {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ moa b;

    public qdg(moa moaVar, Bundle bundle) {
        this.b = moaVar;
        this.a = bundle;
    }

    @Override // defpackage.neg
    public final int a() {
        return 1;
    }

    @Override // defpackage.neg
    public final void b() {
        b9b b9bVar = (b9b) this.b.a;
        Bundle bundle = this.a;
        b9bVar.getClass();
        try {
            Bundle bundle2 = new Bundle();
            ngg.N(bundle, bundle2);
            Bundle bundle3 = ((a) b9bVar.b).Z;
            if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                ngg.O(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
            }
            yig yigVar = (yig) b9bVar.c;
            Parcel parcelG0 = yigVar.G0();
            agg.b(parcelG0, bundle2);
            yigVar.H0(parcelG0, 3);
            ngg.N(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
