package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class yjg extends idg implements ekg {
    public yjg() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 5);
    }

    @Override // defpackage.idg
    public final boolean I0(Parcel parcel, int i) {
        if (i == 1) {
            ejg ejgVar = (ejg) zfg.a(parcel, ejg.CREATOR);
            zfg.c(parcel);
            h(ejgVar);
        } else {
            if (i != 2) {
                return false;
            }
            b0();
        }
        return true;
    }
}
