package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class cdg implements IInterface {
    public final /* synthetic */ int c;
    public final IBinder d;
    public final String e;

    public /* synthetic */ cdg(IBinder iBinder, String str, int i) {
        this.c = i;
        this.d = iBinder;
        this.e = str;
    }

    public Parcel G0() {
        switch (this.c) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.e);
                return parcelObtain;
            case 2:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.e);
                return parcelObtain2;
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.e);
                return parcelObtain3;
        }
    }

    public void H0(Parcel parcel, int i) {
        Parcel parcelObtain;
        switch (this.c) {
            case 2:
                parcelObtain = Parcel.obtain();
                try {
                    this.d.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            case 3:
                parcelObtain = Parcel.obtain();
                try {
                    this.d.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            default:
                parcelObtain = Parcel.obtain();
                try {
                    this.d.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
        }
    }

    public Parcel R(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.d.transact(i, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.c) {
        }
        return this.d;
    }

    public Parcel k(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.d.transact(i, parcel, parcelObtain, 0);
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
