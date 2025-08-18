package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes.dex */
public final class ahg extends idg implements tkg {
    public static final /* synthetic */ int e = 0;
    public final td d;

    public ahg(td tdVar) {
        super("com.google.android.gms.location.ILocationCallback", 5);
        this.d = tdVar;
    }

    @Override // defpackage.idg
    public final boolean I0(Parcel parcel, int i) {
        td tdVar = this.d;
        if (i == 1) {
            LocationResult locationResult = (LocationResult) zfg.a(parcel, LocationResult.CREATOR);
            zfg.c(parcel);
            tdVar.x().b(new wmc(locationResult, false));
        } else if (i == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) zfg.a(parcel, LocationAvailability.CREATOR);
            zfg.c(parcel);
            tdVar.x().b(new u5e(locationAvailability));
        } else {
            if (i != 3) {
                return false;
            }
            u();
        }
        return true;
    }

    @Override // defpackage.tkg
    public final void u() {
        this.d.x().b(new w5e(this));
    }
}
