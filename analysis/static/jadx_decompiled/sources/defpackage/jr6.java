package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class jr6 implements kr6 {
    public IBinder c;

    @Override // defpackage.kr6
    public final void A(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            od2.c(parcelObtain, bundle);
            this.c.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.kr6
    public final void D(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            od2.c(parcelObtain, bundle);
            this.c.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.kr6
    public final void F0(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            od2.c(parcelObtain, bundle);
            this.c.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.kr6
    public final void H(int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            od2.c(parcelObtain, bundle);
            od2.c(parcelObtain, bundle2);
            this.c.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.kr6
    public final void M(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            od2.c(parcelObtain, bundle);
            this.c.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.kr6
    public final void b(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            this.c.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.kr6
    public final void c(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            this.c.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.kr6
    public final void q0(int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            od2.c(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.c.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.kr6
    public final void r(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            od2.c(parcelObtain, bundle);
            this.c.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
