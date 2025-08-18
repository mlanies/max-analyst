package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class idg extends Binder implements IInterface {
    public final /* synthetic */ int c;

    public /* synthetic */ idg(int i) {
        this.c = i;
    }

    public abstract boolean G0(int i, Parcel parcel, Parcel parcel2);

    public boolean H0(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean I0(Parcel parcel, int i);

    public abstract boolean J0(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.c;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int i3 = 0;
        boolean zOnTransact = false;
        boolean z = false;
        switch (this.c) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return G0(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return H0(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                akg akgVar = (akg) this;
                if (i != 2) {
                    if (i == 3) {
                        Parcelable.Creator creator = Bundle.CREATOR;
                        int i4 = dgg.a;
                        int iDataAvail = parcel.dataAvail();
                        if (iDataAvail > 0) {
                            throw new BadParcelableException(zr6.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
                        }
                        akgVar.f.a.c(akgVar.e);
                        akgVar.d.b("onCompleteUpdate", new Object[0]);
                    }
                    return i3;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                int i5 = dgg.a;
                Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(zr6.h(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                ykg ykgVar = akgVar.f.a;
                qne qneVar = akgVar.e;
                ykgVar.c(qneVar);
                akgVar.d.b("onRequestInfo", new Object[0]);
                if (bundle.getInt("error.code", -2) != 0) {
                    qneVar.c(new InstallException(bundle.getInt("error.code", -2)));
                } else {
                    bundle.getInt("version.code", -1);
                    int i6 = bundle.getInt("update.availability");
                    bundle.getInt("install.status", 0);
                    if (bundle.getInt("client.version.staleness", -1) != -1) {
                        bundle.getInt("client.version.staleness");
                    }
                    bundle.getInt("in.app.update.priority", 0);
                    bundle.getLong("bytes.downloaded");
                    bundle.getLong("total.bytes.to.download");
                    bundle.getLong("additional.size.required");
                    kkg kkgVar = akgVar.g.d;
                    kkgVar.getClass();
                    kkg.a(new File(kkgVar.a.getFilesDir(), "assetpacks"));
                    HashMap map = new HashMap();
                    ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                    HashSet hashSet = new HashSet();
                    if (integerArrayList != null) {
                        hashSet.addAll(integerArrayList);
                    }
                    map.put("blocking.destructive.intent", hashSet);
                    ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                    HashSet hashSet2 = new HashSet();
                    if (integerArrayList2 != null) {
                        hashSet2.addAll(integerArrayList2);
                    }
                    map.put("nonblocking.destructive.intent", hashSet2);
                    ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
                    HashSet hashSet3 = new HashSet();
                    if (integerArrayList3 != null) {
                        hashSet3.addAll(integerArrayList3);
                    }
                    map.put("blocking.intent", hashSet3);
                    ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                    HashSet hashSet4 = new HashSet();
                    if (integerArrayList4 != null) {
                        hashSet4.addAll(integerArrayList4);
                    }
                    map.put("nonblocking.intent", hashSet4);
                    qneVar.d(new sp(i6));
                }
                i3 = 1;
                return i3;
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                hig higVar = (hig) this;
                if (i == 2) {
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    int i7 = egg.a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                    int iDataAvail3 = parcel.dataAvail();
                    if (iDataAvail3 > 0) {
                        throw new BadParcelableException(zr6.h(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    mkg mkgVar = higVar.f.a;
                    if (mkgVar != null) {
                        qne qneVar2 = higVar.e;
                        synchronized (mkgVar.f) {
                            mkgVar.e.remove(qneVar2);
                        }
                        mkgVar.a().post(new ljg(i3, mkgVar));
                    }
                    higVar.d.b("onGetLaunchReviewFlowInfo", new Object[0]);
                    higVar.e.d(new zeg((PendingIntent) bundle2.get("confirmation_intent"), bundle2.getBoolean("is_review_no_op")));
                    z = true;
                }
                return z;
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return H0(i, parcel, parcel2);
            case 5:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return I0(parcel, i);
            default:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact) {
                    return true;
                }
                return J0(i, parcel, parcel2);
        }
    }

    public idg(String str, int i) {
        this.c = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
            case 3:
            default:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 6:
                attachInterface(this, str);
                break;
        }
    }
}
