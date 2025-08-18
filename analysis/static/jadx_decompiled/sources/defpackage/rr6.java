package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class rr6 implements sr6 {
    public IBinder c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.sr6
    public final void f0(kr6 kr6Var, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
            parcelObtain.writeStrongInterface(kr6Var);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.c.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
