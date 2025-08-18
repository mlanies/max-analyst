package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class pu0 extends Binder {
    public static final int d;
    public final zw6 c;

    static {
        d = oaf.a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public pu0(List list) {
        this.c = zw6.j(list);
    }

    public static zw6 a(IBinder iBinder) {
        int i;
        if (iBinder instanceof pu0) {
            return ((pu0) iBinder).c;
        }
        ww6 ww6VarI = zw6.i();
        int i2 = 1;
        int i3 = 0;
        while (i2 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i3);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            ww6VarI.a(bundle);
                            i3++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i2 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return ww6VarI.j();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        zw6 zw6Var = this.c;
        int size = zw6Var.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < d) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) zw6Var.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
