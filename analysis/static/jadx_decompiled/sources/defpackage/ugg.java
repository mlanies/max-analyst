package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ugg implements yhg, IInterface {
    public final IBinder c;

    public ugg(IBinder iBinder) {
        this.c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    public final Parcel k(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.c.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
