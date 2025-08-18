package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class xeg extends idg {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeg(z16 z16Var) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 1);
        this.e = z16Var;
    }

    @Override // defpackage.idg
    public final boolean H0(int i, Parcel parcel, Parcel parcel2) throws SecurityException {
        Object jfgVar;
        eig eigVar;
        int i2 = 18;
        int i3 = 20;
        Object obj = this.e;
        int i4 = 0;
        int i5 = 1;
        switch (this.d) {
            case 0:
                if (i != 1) {
                    return false;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    jfgVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    jfgVar = iInterfaceQueryLocalInterface instanceof lfg ? (lfg) iInterfaceQueryLocalInterface : new jfg(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 3);
                }
                agg.a(parcel);
                fp3.n(jfgVar);
                ti0 ti0Var = (ti0) ((z16) obj).b;
                qy7 qy7Var = ti0Var.a;
                qy7Var.getClass();
                try {
                    jfg jfgVar2 = (jfg) jfgVar;
                    Parcel parcelR = jfgVar2.R(jfgVar2.G0(), 30);
                    xr6 xr6VarK0 = oy9.K0(parcelR.readStrongBinder());
                    parcelR.recycle();
                    Object objL0 = oy9.L0(xr6VarK0);
                    if (objL0 instanceof Long) {
                        Long l = (Long) objL0;
                        l.getClass();
                        xi0 xi0Var = (xi0) qy7Var.a.get(l);
                        el9 el9Var = ti0Var.b;
                        if (xi0Var != null) {
                            e08 e08Var = xi0Var.b;
                            el9Var.getClass();
                            el9Var.n(new gj0(e08Var, i4));
                        } else {
                            xi0 xi0Var2 = (xi0) qy7Var.b.get(l);
                            if (xi0Var2 != null) {
                                e08 e08Var2 = xi0Var2.b;
                                el9Var.getClass();
                                el9Var.n(new gj0(e08Var2, i5));
                            }
                        }
                        i4 = 1;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i4);
                    return true;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            case 1:
                if (i != 1) {
                    return false;
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    eigVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    eigVar = iInterfaceQueryLocalInterface2 instanceof eig ? (eig) iInterfaceQueryLocalInterface2 : new eig(strongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 3);
                }
                agg.a(parcel);
                y7g y7gVar = new y7g(eigVar);
                rde rdeVar = (rde) obj;
                rdeVar.getClass();
                try {
                    eig eigVar2 = (eig) y7gVar.b;
                    Parcel parcelG0 = eigVar2.G0();
                    parcelG0.writeInt(0);
                    parcelG0.writeInt(0);
                    parcelG0.writeInt(0);
                    parcelG0.writeInt(0);
                    eigVar2.H0(parcelG0, 39);
                    qy7 qy7Var2 = new qy7(new rxd(i3, y7gVar), rdeVar.a, rdeVar.b, new o84(8), new qx7(7), new c32(13, (byte) 0), new kp7(14), new kp7(15), new kp7(16), new kp7(17));
                    el9 el9Var2 = rdeVar.c;
                    el9Var2.K0 = qy7Var2;
                    ny7 ny7Var = el9Var2.L0;
                    boolean z = ny7Var.c;
                    boolean z2 = ny7Var.d;
                    boolean z3 = ny7Var.e;
                    Context context = (Context) el9Var2.b;
                    qy7Var2.g(context, z3);
                    rxd rxdVar = qy7Var2.d;
                    y7g y7gVar2 = (y7g) rxdVar.b;
                    u5e u5eVar = y7gVar2.A() == null ? null : new u5e(y7gVar2.A());
                    if (u5eVar != null) {
                        wmc wmcVar = (wmc) u5eVar.a;
                        wmcVar.getClass();
                        mgg mggVar = (mgg) wmcVar.a;
                        try {
                            Parcel parcelG02 = mggVar.G0();
                            parcelG02.writeInt(z ? 1 : 0);
                            mggVar.H0(parcelG02, 1);
                            try {
                                Parcel parcelG03 = mggVar.G0();
                                parcelG03.writeInt(z2 ? 1 : 0);
                                mggVar.H0(parcelG03, 5);
                                try {
                                    Parcel parcelG04 = mggVar.G0();
                                    parcelG04.writeInt(z2 ? 1 : 0);
                                    mggVar.H0(parcelG04, 20);
                                    try {
                                        Parcel parcelG05 = mggVar.G0();
                                        parcelG05.writeInt(0);
                                        mggVar.H0(parcelG05, 18);
                                        try {
                                            Parcel parcelG06 = mggVar.G0();
                                            parcelG06.writeInt(0);
                                            mggVar.H0(parcelG06, 3);
                                        } catch (RemoteException e2) {
                                            throw new RuntimeRemoteException(e2);
                                        }
                                    } catch (RemoteException e3) {
                                        throw new RuntimeRemoteException(e3);
                                    }
                                } catch (RemoteException e4) {
                                    throw new RuntimeRemoteException(e4);
                                }
                            } catch (RemoteException e5) {
                                throw new RuntimeRemoteException(e5);
                            }
                        } catch (RemoteException e6) {
                            throw new RuntimeRemoteException(e6);
                        }
                    }
                    qy7Var2.f(ny7Var.f);
                    double d = ny7Var.a;
                    if (d != 1.401298464324817E-45d) {
                        double d2 = ny7Var.b;
                        if (d2 != 1.401298464324817E-45d) {
                            qy7Var2.d(d, d2, Float.valueOf(ny7Var.g), Float.valueOf(ny7Var.h), Float.valueOf(ny7Var.i));
                        }
                    }
                    z16 z16Var = new z16(i2, new ti0(qy7Var2, el9Var2));
                    y7g y7gVar3 = (y7g) rxdVar.b;
                    y7gVar3.H(z16Var);
                    y7gVar3.I(new z16(17, new ti0(qy7Var2, el9Var2)));
                    if (qp4.u0.b(context).i().h() == l63.b) {
                        qy7 qy7Var3 = el9Var2.K0;
                        int i6 = tzb.google_map_night_style;
                        if (i6 == 0) {
                            qy7Var3.getClass();
                        } else {
                            xy7 xy7Var = (xy7) qy7Var3.c.get(Integer.valueOf(i6));
                            if (xy7Var != null) {
                                ((y7g) qy7Var3.d.b).G(xy7Var.a);
                            } else {
                                cqc.b(qy7Var3.n);
                                drd drdVarI = new q1a(1, new ui0(qy7Var3, context, i6, i4)).m(qy7Var3.f).i(ce.a());
                                iq1 iq1Var = new iq1(new hd0(i6, i5, qy7Var3), 2, new xw0(27));
                                drdVarI.k(iq1Var);
                                qy7Var3.n = iq1Var;
                            }
                        }
                    } else {
                        qy7 qy7Var4 = el9Var2.K0;
                        cqc.b(qy7Var4.n);
                        ((y7g) qy7Var4.d.b).G(null);
                    }
                    for (fk9 fk9Var : (Set) el9Var2.a) {
                        fk9Var.e2();
                        fk9Var.d2();
                        long j = fk9Var.C0.h;
                        if (j != 0) {
                            fk9Var.g2(j);
                        }
                        fk9Var.Y.a(fk9Var);
                    }
                    parcel2.writeNoException();
                    return true;
                } catch (RemoteException e7) {
                    throw new RuntimeRemoteException(e7);
                }
            default:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                int i7 = agg.a;
                LatLng latLngCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                agg.a(parcel);
                ti0 ti0Var2 = (ti0) ((z16) obj).b;
                ti0Var2.a.getClass();
                el9 el9Var3 = ti0Var2.b;
                el9Var3.getClass();
                Iterator it = ((Set) el9Var3.a).iterator();
                while (it.hasNext()) {
                    ((fk9) it.next()).getClass();
                }
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeg(z16 z16Var, byte b) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 1);
        this.e = z16Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeg(rde rdeVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 1);
        this.e = rdeVar;
    }
}
