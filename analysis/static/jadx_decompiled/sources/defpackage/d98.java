package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class d98 extends Binder implements mr6 {
    public static final /* synthetic */ int d = 0;
    public final WeakReference c;

    public d98(ba8 ba8Var) {
        attachInterface(this, IMediaControllerCallback.DESCRIPTOR);
        this.c = new WeakReference(ba8Var);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.mr6
    public final void f(i3b i3bVar) {
        ba8 ba8Var = (ba8) this.c.get();
        if (ba8Var != null) {
            ba8Var.i(2, i3bVar, null);
        }
    }

    @Override // defpackage.mr6
    public final void onExtrasChanged(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // defpackage.mr6
    public final void onQueueTitleChanged(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // defpackage.mr6
    public final void onRepeatModeChanged(int i) {
        ba8 ba8Var = (ba8) this.c.get();
        if (ba8Var != null) {
            ba8Var.i(9, Integer.valueOf(i), null);
        }
    }

    @Override // defpackage.mr6
    public final void onSessionDestroyed() {
        throw new AssertionError();
    }

    @Override // defpackage.mr6
    public final void onShuffleModeChanged(int i) {
        ba8 ba8Var = (ba8) this.c.get();
        if (ba8Var != null) {
            ba8Var.i(12, Integer.valueOf(i), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString(IMediaControllerCallback.DESCRIPTOR);
            return true;
        }
        WeakReference weakReference = this.c;
        switch (i) {
            case 1:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                String string = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                ba8 ba8Var = (ba8) weakReference.get();
                if (ba8Var != null) {
                    ba8Var.i(1, string, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                onSessionDestroyed();
                return true;
            case 3:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                f(parcel.readInt() != 0 ? i3b.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                y0(parcel.readInt() != 0 ? hd8.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 5:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                q(parcel.createTypedArrayList(yh8.CREATOR));
                return true;
            case 6:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                onQueueTitleChanged(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                return true;
            case 7:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                onExtrasChanged(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 8:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                t(parcel.readInt() != 0 ? upa.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 9:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                onRepeatModeChanged(parcel.readInt());
                return true;
            case 10:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                boolean z = parcel.readInt() != 0;
                ba8 ba8Var2 = (ba8) weakReference.get();
                if (ba8Var2 != null) {
                    ba8Var2.i(11, Boolean.valueOf(z), null);
                }
                return true;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                onShuffleModeChanged(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
                ba8 ba8Var3 = (ba8) weakReference.get();
                if (ba8Var3 != null) {
                    ba8Var3.i(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.mr6
    public final void q(ArrayList arrayList) {
        throw new AssertionError();
    }

    @Override // defpackage.mr6
    public final void t(upa upaVar) {
        throw new AssertionError();
    }

    @Override // defpackage.mr6
    public final void y0(hd8 hd8Var) {
        throw new AssertionError();
    }
}
