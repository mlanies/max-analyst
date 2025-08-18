package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class tr6 implements ur6 {
    public IBinder c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.ur6
    public final void l(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(ur6.a);
            parcelObtain.writeStringArray(strArr);
            this.c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
