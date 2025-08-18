package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class xgg extends idg {
    public final /* synthetic */ int d;
    public final /* synthetic */ qne e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgg(int i, qne qneVar) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 5);
        this.d = i;
        switch (i) {
            case 1:
                this.e = qneVar;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 5);
                break;
            default:
                this.e = qneVar;
                break;
        }
    }

    @Override // defpackage.idg
    public final boolean I0(Parcel parcel, int i) {
        switch (this.d) {
            case 0:
                if (i == 1) {
                    rr7 rr7Var = (rr7) zfg.a(parcel, rr7.CREATOR);
                    zfg.c(parcel);
                    mqd.G(rr7Var.a, new mq9(12), this.e);
                    break;
                }
                break;
            default:
                if (i == 1) {
                    Status status = (Status) zfg.a(parcel, Status.CREATOR);
                    Location location = (Location) zfg.a(parcel, Location.CREATOR);
                    zfg.c(parcel);
                    mqd.G(status, location, this.e);
                    break;
                }
                break;
        }
        return true;
    }
}
