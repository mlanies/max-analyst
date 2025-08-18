package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class vf9 extends Binder implements vr6 {
    public final /* synthetic */ MultiInstanceInvalidationService c;

    public vf9(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, vr6.b);
    }

    public final int R(ur6 ur6Var, String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                if (multiInstanceInvalidationService.c.register(ur6Var, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.b.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.vr6
    public final void h0(ur6 ur6Var, int i) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(ur6Var);
        }
    }

    public final void k(int i, String[] strArr) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Integer num = (Integer) multiInstanceInvalidationService.c.getBroadcastCookie(i2);
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((ur6) multiInstanceInvalidationService.c.getBroadcastItem(i2)).l(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.c.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = vr6.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        ur6 ur6Var = null;
        ur6 ur6Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(ur6.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ur6)) {
                    tr6 tr6Var = new tr6();
                    tr6Var.c = strongBinder;
                    ur6Var = tr6Var;
                } else {
                    ur6Var = (ur6) iInterfaceQueryLocalInterface;
                }
            }
            int iR = R(ur6Var, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iR);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(ur6.a);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof ur6)) {
                    tr6 tr6Var2 = new tr6();
                    tr6Var2.c = strongBinder2;
                    ur6Var2 = tr6Var2;
                } else {
                    ur6Var2 = (ur6) iInterfaceQueryLocalInterface2;
                }
            }
            h0(ur6Var2, parcel.readInt());
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            k(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }
}
