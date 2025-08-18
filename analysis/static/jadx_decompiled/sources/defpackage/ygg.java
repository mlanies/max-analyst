package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class ygg extends idg {
    public final /* synthetic */ Object d;
    public final /* synthetic */ qne e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygg(Boolean bool, qne qneVar) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.d = bool;
        this.e = qneVar;
    }

    @Override // defpackage.idg
    public final boolean G0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) rdg.a(parcel, Status.CREATOR);
        rdg.b(parcel);
        mqd.G(status, this.d, this.e);
        return true;
    }
}
