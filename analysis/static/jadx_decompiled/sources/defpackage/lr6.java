package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lr6 implements mr6 {
    public IBinder c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // defpackage.mr6
    public final void f(i3b i3bVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (i3bVar != null) {
                parcelObtain.writeInt(1);
                i3bVar.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(3, parcelObtain, null, 1)) {
                int i = d98.d;
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.mr6
    public final void onQueueTitleChanged(CharSequence charSequence) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (charSequence != null) {
                parcelObtain.writeInt(1);
                TextUtils.writeToParcel(charSequence, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(6, parcelObtain, null, 1)) {
                int i = d98.d;
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.mr6
    public final void onRepeatModeChanged(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (!this.c.transact(9, parcelObtain, null, 1)) {
                int i2 = d98.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.mr6
    public final void onSessionDestroyed() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (!this.c.transact(2, parcelObtain, null, 1)) {
                int i = d98.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.mr6
    public final void onShuffleModeChanged(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (!this.c.transact(12, parcelObtain, null, 1)) {
                int i2 = d98.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.mr6
    public final void q(ArrayList arrayList) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            parcelObtain.writeTypedList(arrayList);
            if (!this.c.transact(5, parcelObtain, null, 1)) {
                int i = d98.d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.mr6
    public final void t(upa upaVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (upaVar != null) {
                parcelObtain.writeInt(1);
                upaVar.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(8, parcelObtain, null, 1)) {
                int i = d98.d;
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.mr6
    public final void y0(hd8 hd8Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (hd8Var != null) {
                parcelObtain.writeInt(1);
                parcelObtain.writeBundle(hd8Var.a);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.c.transact(4, parcelObtain, null, 1)) {
                int i = d98.d;
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
