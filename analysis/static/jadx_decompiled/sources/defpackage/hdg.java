package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class hdg implements neg {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ moa d;

    public hdg(moa moaVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.d = moaVar;
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
    }

    @Override // defpackage.neg
    public final int a() {
        return 0;
    }

    @Override // defpackage.neg
    public final void b() {
        b9b b9bVar = (b9b) this.d.a;
        Activity activity = this.a;
        Bundle bundle = this.c;
        b9bVar.getClass();
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) this.b.getParcelable("MapOptions");
        try {
            Bundle bundle2 = new Bundle();
            ngg.N(bundle, bundle2);
            yig yigVar = (yig) b9bVar.c;
            oy9 oy9Var = new oy9(activity);
            Parcel parcelG0 = yigVar.G0();
            agg.c(parcelG0, oy9Var);
            agg.b(parcelG0, googleMapOptions);
            agg.b(parcelG0, bundle2);
            yigVar.H0(parcelG0, 2);
            ngg.N(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
