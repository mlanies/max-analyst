package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class djg extends Binder implements IInterface {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Object d;

    public djg(ydg ydgVar) {
        this.d = ydgVar;
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.c;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        boolean z = false;
        switch (this.c) {
            case 0:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (!zOnTransact) {
                    if (i == 1) {
                        Parcelable.Creator<Status> creator = Status.CREATOR;
                        int i3 = jgg.a;
                        mqd.G(parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), null, (qne) ((ydg) this.d).e);
                        z = true;
                    }
                    break;
                }
                break;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                }
                if (i == 1) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i4 = igg.a;
                    Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    lgg lggVarCreateFromParcel = parcel.readInt() == 0 ? null : lgg.CREATOR.createFromParcel(parcel);
                    mqd.G(statusCreateFromParcel, lggVarCreateFromParcel != null ? new mp(lggVarCreateFromParcel.a, lggVarCreateFromParcel.b) : null, (qne) this.d);
                    z = true;
                }
                break;
        }
        return z;
    }

    public djg(qne qneVar) {
        this.d = qneVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }
}
