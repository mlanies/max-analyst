package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class qy7 {
    public static final /* synthetic */ int t = 0;
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashMap c = new HashMap();
    public final rxd d;
    public final vy7 e;
    public final ztc f;
    public final o84 g;
    public final qx7 h;
    public final c32 i;
    public final kp7 j;
    public final kp7 k;
    public final kp7 l;
    public final kp7 m;
    public iq1 n;
    public bkg o;
    public iq1 p;
    public long q;
    public iq1 r;
    public bkg s;

    public qy7(rxd rxdVar, vy7 vy7Var, ztc ztcVar, o84 o84Var, qx7 qx7Var, c32 c32Var, kp7 kp7Var, kp7 kp7Var2, kp7 kp7Var3, kp7 kp7Var4) {
        this.d = rxdVar;
        this.e = vy7Var;
        this.f = ztcVar;
        this.g = o84Var;
        this.h = qx7Var;
        this.i = c32Var;
        this.j = kp7Var;
        this.k = kp7Var2;
        this.l = kp7Var3;
        this.m = kp7Var4;
    }

    public final void a() {
        bkg bkgVar = this.s;
        if (bkgVar == null) {
            return;
        }
        v13 v13Var = (v13) bkgVar.b;
        v13Var.getClass();
        try {
            fjg fjgVar = (fjg) v13Var.a;
            fjgVar.H0(fjgVar.G0(), 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void b() {
        c();
        bkg bkgVar = this.o;
        if (bkgVar == null) {
            return;
        }
        h5b h5bVar = (h5b) bkgVar.b;
        h5bVar.getClass();
        try {
            ofg ofgVar = (ofg) h5bVar.a;
            ofgVar.H0(ofgVar.G0(), 1);
            this.o = null;
            this.q = 0L;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void c() {
        cqc.b(this.p);
        cqc.b(this.r);
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((xi0) it.next()).a.F();
        }
        linkedHashMap.clear();
    }

    public final void d(double d, double d2, Float f, Float f2, Float f3) {
        lx1 lx1Var = (lx1) this.k.b();
        LatLng latLng = new LatLng(d, d2);
        kx1 kx1Var = lx1Var.a;
        kx1Var.c = latLng;
        kx1Var.a = f.floatValue();
        kx1Var.b = f2.floatValue();
        float fFloatValue = f3.floatValue();
        kx1Var.getClass();
        CameraPosition cameraPosition = new CameraPosition((LatLng) kx1Var.c, kx1Var.a, kx1Var.b, fFloatValue);
        this.g.getClass();
        try {
            sfg sfgVar = mr0.m;
            fp3.o(sfgVar, "CameraUpdateFactory is not initialized");
            Parcel parcelG0 = sfgVar.G0();
            agg.b(parcelG0, cameraPosition);
            Parcel parcelR = sfgVar.R(parcelG0, 7);
            xr6 xr6VarK0 = oy9.K0(parcelR.readStrongBinder());
            parcelR.recycle();
            e(new bkg(6, new y8(xr6VarK0)), false);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void e(bkg bkgVar, boolean z) {
        y8 y8Var = (y8) bkgVar.b;
        rxd rxdVar = this.d;
        if (!z) {
            rxdVar.getClass();
            y7g y7gVar = (y7g) rxdVar.b;
            y7gVar.getClass();
            try {
                fp3.o(y8Var, "CameraUpdate must not be null.");
                eig eigVar = (eig) y7gVar.b;
                xr6 xr6Var = (xr6) y8Var.a;
                Parcel parcelG0 = eigVar.G0();
                agg.c(parcelG0, xr6Var);
                eigVar.H0(parcelG0, 4);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        rxdVar.getClass();
        y7g y7gVar2 = (y7g) rxdVar.b;
        y7gVar2.getClass();
        try {
            fp3.o(y8Var, "CameraUpdate must not be null.");
            eig eigVar2 = (eig) y7gVar2.b;
            xr6 xr6Var2 = (xr6) y8Var.a;
            Parcel parcelG02 = eigVar2.G0();
            agg.c(parcelG02, xr6Var2);
            parcelG02.writeInt(800);
            parcelG02.writeStrongBinder(null);
            eigVar2.H0(parcelG02, 7);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void f(int i) {
        int i2;
        rxd rxdVar = this.d;
        rxdVar.getClass();
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                int i3 = 2;
                if (i != 2) {
                    i3 = 3;
                    if (i != 3) {
                        i3 = 4;
                        if (i != 4) {
                            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unknown tam map type = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                        }
                    }
                }
                i2 = i3;
            }
        } else {
            i2 = 0;
        }
        y7g y7gVar = (y7g) rxdVar.b;
        y7gVar.getClass();
        try {
            eig eigVar = (eig) y7gVar.b;
            Parcel parcelG0 = eigVar.G0();
            parcelG0.writeInt(i2);
            eigVar.H0(parcelG0, 16);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void g(Context context, boolean z) {
        boolean z2 = false;
        rxd rxdVar = this.d;
        if (!z) {
            rxdVar.e0(false);
            return;
        }
        int iC = z7.c(context, "android.permission.ACCESS_FINE_LOCATION");
        int iC2 = z7.c(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (iC == 0 && iC2 == 0) {
            z2 = true;
        }
        rxdVar.e0(z2);
    }
}
