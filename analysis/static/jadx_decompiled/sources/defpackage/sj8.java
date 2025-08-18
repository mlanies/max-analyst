package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class sj8 extends Binder implements qr6 {
    public static final /* synthetic */ int i = 0;
    public final WeakReference c;
    public final xi8 d;
    public final m5d e;
    public final Set f;
    public efc g;
    public int h;

    public sj8(ii8 ii8Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.c = new WeakReference(ii8Var);
        this.d = xi8.a(ii8Var.f);
        this.e = new m5d(ii8Var);
        this.f = Collections.synchronizedSet(new HashSet());
        this.g = efc.u0;
    }

    public static bm7 I0(ii8 ii8Var, oh8 oh8Var, int i2, rj8 rj8Var, pj3 pj3Var) {
        if (ii8Var.i()) {
            return ew6.b;
        }
        bm7 bm7Var = (bm7) rj8Var.k(ii8Var, oh8Var, i2);
        ccd ccdVar = new ccd();
        bm7Var.d(new yg3(ii8Var, ccdVar, pj3Var, bm7Var, 10), nk4.a);
        return ccdVar;
    }

    public static void M0(oh8 oh8Var, int i2, sad sadVar) {
        try {
            nh8 nh8Var = oh8Var.d;
            fm9.l(nh8Var);
            nh8Var.j(i2, sadVar);
        } catch (RemoteException e) {
            z04.d0("Failed to send result to controller " + oh8Var, e);
        }
    }

    public static z16 N0(pj3 pj3Var) {
        return new z16(26, new z16(27, pj3Var));
    }

    @Override // defpackage.qr6
    public final void A0(kr6 kr6Var, int i2, final int i3, final int i4, final int i5) {
        if (kr6Var == null || i3 < 0 || i4 < i3 || i5 < 0) {
            return;
        }
        K0(kr6Var, i2, 20, N0(new pj3() { // from class: gj8
            @Override // defpackage.pj3
            public final void accept(Object obj) {
                ((x4b) obj).u0(i3, i4, i5);
            }
        }));
    }

    @Override // defpackage.qr6
    public final void B(kr6 kr6Var, int i2, Bundle bundle) {
        if (kr6Var == null || bundle == null) {
            return;
        }
        try {
            K0(kr6Var, i2, 29, N0(new y98(this, 5, j0f.b(bundle))));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    @Override // defpackage.qr6
    public final void C(kr6 kr6Var, int i2) {
        oh8 oh8VarZ;
        if (kr6Var == null || (oh8VarZ = this.e.z(kr6Var.asBinder())) == null) {
            return;
        }
        L0(oh8VarZ, i2, 12, N0(new wa8(20)));
    }

    @Override // defpackage.qr6
    public final void C0(kr6 kr6Var, int i2, int i3, int i4) {
        if (kr6Var == null || i3 < 0 || i4 < 0) {
            return;
        }
        K0(kr6Var, i2, 20, N0(new h75(i3, i4, 4)));
    }

    @Override // defpackage.qr6
    public final void D0(kr6 kr6Var, int i2, int i3, Bundle bundle) {
        if (kr6Var == null || bundle == null || i3 < 0) {
            return;
        }
        try {
            K0(kr6Var, i2, 20, new kj8(new y98(new fj8(1, tb8.b(bundle)), 8, new ej8(this, i3, 2)), 1));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.qr6
    public final void E(kr6 kr6Var, int i2, int i3, Bundle bundle) {
        if (kr6Var == null || bundle == null || i3 < 0) {
            return;
        }
        try {
            K0(kr6Var, i2, 20, new kj8(new y98(new fj8(0, tb8.b(bundle)), 8, new ej8(this, i3, 1)), 1));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.qr6
    public final void E0(kr6 kr6Var, int i2, boolean z) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 14, N0(new l01(z, 9)));
    }

    @Override // defpackage.qr6
    public final void F(kr6 kr6Var, int i2, int i3) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 34, N0(new z64(i3, 8)));
    }

    @Override // defpackage.qr6
    public final void G(kr6 kr6Var, int i2) {
        oh8 oh8VarZ;
        if (kr6Var == null || (oh8VarZ = this.e.z(kr6Var.asBinder())) == null) {
            return;
        }
        L0(oh8VarZ, i2, 11, N0(new wa8(15)));
    }

    public final m4b G0(m4b m4bVar) {
        zw6 zw6VarA = m4bVar.D.a();
        ww6 ww6VarI = zw6.i();
        iw6 iw6Var = new iw6(4);
        for (int i2 = 0; i2 < zw6VarA.size(); i2++) {
            o0f o0fVar = (o0f) zw6VarA.get(i2);
            rze rzeVarB = o0fVar.b();
            String string = (String) this.g.get(rzeVarB);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i3 = this.h;
                this.h = i3 + 1;
                int i4 = oaf.a;
                sb.append(Integer.toString(i3, 36));
                sb.append("-");
                sb.append(rzeVarB.b);
                string = sb.toString();
            }
            iw6Var.J(rzeVarB, string);
            ww6VarI.d(o0fVar.a(string));
        }
        this.g = iw6Var.j();
        m4b m4bVarB = m4bVar.b(new p0f(ww6VarI.j()));
        j0f j0fVar = m4bVarB.E;
        if (j0fVar.A.isEmpty()) {
            return m4bVarB;
        }
        h0f h0fVarC = j0fVar.a().c();
        m5f it = j0fVar.A.values().iterator();
        while (it.hasNext()) {
            c0f c0fVar = (c0f) it.next();
            rze rzeVar = c0fVar.a;
            String str = (String) this.g.get(rzeVar);
            if (str != null) {
                h0fVarC.a(new c0f(rzeVar.a(str), c0fVar.b));
            } else {
                h0fVarC.a(c0fVar);
            }
        }
        return m4bVarB.o(h0fVarC.b());
    }

    public final m5d H0() {
        return this.e;
    }

    @Override // defpackage.qr6
    public final void I(kr6 kr6Var, int i2, int i3) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 34, N0(new z64(i3, 7)));
    }

    @Override // defpackage.qr6
    public final void J(kr6 kr6Var, int i2, IBinder iBinder, boolean z) {
        if (kr6Var == null || iBinder == null) {
            return;
        }
        try {
            zw6 zw6VarA = pu0.a(iBinder);
            ww6 ww6VarI = zw6.i();
            for (int i3 = 0; i3 < zw6VarA.size(); i3++) {
                Bundle bundle = (Bundle) zw6VarA.get(i3);
                bundle.getClass();
                ww6VarI.a(tb8.b(bundle));
            }
            K0(kr6Var, i2, 20, new kj8(new y98(new fe4(ww6VarI.j(), z, 4), 7, new hj8(4)), 1));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final int J0(oh8 oh8Var, x4b x4bVar, int i2) {
        if (x4bVar.t1(17)) {
            m5d m5dVar = this.e;
            if (!m5dVar.G(oh8Var, 17) && m5dVar.G(oh8Var, 16)) {
                return x4bVar.p0() + i2;
            }
        }
        return i2;
    }

    @Override // defpackage.qr6
    public final void K(kr6 kr6Var, int i2, int i3, int i4) {
        if (kr6Var == null || i3 < 0 || i4 < i3) {
            return;
        }
        K0(kr6Var, i2, 20, new z16(26, new dj8(this, i3, i4)));
    }

    public final void K0(kr6 kr6Var, int i2, int i3, rj8 rj8Var) {
        oh8 oh8VarZ = this.e.z(kr6Var.asBinder());
        if (oh8VarZ != null) {
            L0(oh8VarZ, i2, i3, rj8Var);
        }
    }

    @Override // defpackage.qr6
    public final void L(kr6 kr6Var, int i2, int i3) {
        if (kr6Var == null || i3 < 0) {
            return;
        }
        K0(kr6Var, i2, 20, new z16(26, new ej8(this, i3, 4)));
    }

    public final void L0(final oh8 oh8Var, final int i2, final int i3, final rj8 rj8Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final ii8 ii8Var = (ii8) this.c.get();
            if (ii8Var != null && !ii8Var.i()) {
                oaf.W(ii8Var.l, new Runnable() { // from class: jj8
                    @Override // java.lang.Runnable
                    public final void run() {
                        m5d m5dVar = this.a.e;
                        final oh8 oh8Var2 = oh8Var;
                        int i4 = i3;
                        boolean zG = m5dVar.G(oh8Var2, i4);
                        final int i5 = i2;
                        if (!zG) {
                            sj8.M0(oh8Var2, i5, new sad(-4));
                            return;
                        }
                        final ii8 ii8Var2 = ii8Var;
                        ii8Var2.s(oh8Var2);
                        ii8Var2.e.getClass();
                        final rj8 rj8Var2 = rj8Var;
                        if (i4 != 27) {
                            m5dVar.s(oh8Var2, i4, new zg3() { // from class: nj8
                                @Override // defpackage.zg3
                                public final bm7 run() {
                                    return (bm7) rj8Var2.k(ii8Var2, oh8Var2, i5);
                                }
                            });
                        } else {
                            rj8Var2.k(ii8Var2, oh8Var2, i5);
                            m5dVar.s(oh8Var2, i4, new mj8());
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.qr6
    public final void N(kr6 kr6Var, int i2, int i3, int i4, IBinder iBinder) {
        if (kr6Var == null || iBinder == null || i3 < 0 || i4 < i3) {
            return;
        }
        try {
            zw6 zw6VarA = pu0.a(iBinder);
            ww6 ww6VarI = zw6.i();
            for (int i5 = 0; i5 < zw6VarA.size(); i5++) {
                Bundle bundle = (Bundle) zw6VarA.get(i5);
                bundle.getClass();
                ww6VarI.a(tb8.b(bundle));
            }
            K0(kr6Var, i2, 20, new kj8(new y98(new z16(24, ww6VarI.j()), 8, new dj8(this, i3, i4)), 1));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.qr6
    public final void O(kr6 kr6Var, int i2) {
        oh8 oh8VarZ;
        if (kr6Var == null || (oh8VarZ = this.e.z(kr6Var.asBinder())) == null) {
            return;
        }
        L0(oh8VarZ, i2, 9, N0(new wa8(21)));
    }

    @Override // defpackage.qr6
    public final void P(kr6 kr6Var, int i2, int i3, long j) {
        if (kr6Var == null || i3 < 0) {
            return;
        }
        K0(kr6Var, i2, 10, new z16(26, new e74(this, i3, j, 4)));
    }

    @Override // defpackage.qr6
    public final void Q(kr6 kr6Var, int i2, IBinder iBinder) {
        if (kr6Var == null || iBinder == null) {
            return;
        }
        try {
            zw6 zw6VarA = pu0.a(iBinder);
            ww6 ww6VarI = zw6.i();
            for (int i3 = 0; i3 < zw6VarA.size(); i3++) {
                Bundle bundle = (Bundle) zw6VarA.get(i3);
                bundle.getClass();
                ww6VarI.a(tb8.b(bundle));
            }
            K0(kr6Var, i2, 20, new kj8(new y98(new z72(18, ww6VarI.j()), 8, new wa8(23)), 1));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    public final void R(kr6 kr6Var, final int i2, final y9d y9dVar, final int i3, final rj8 rj8Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final ii8 ii8Var = (ii8) this.c.get();
            if (ii8Var != null && !ii8Var.i()) {
                final oh8 oh8VarZ = this.e.z(kr6Var.asBinder());
                if (oh8VarZ == null) {
                    return;
                }
                oaf.W(ii8Var.l, new Runnable() { // from class: ij8
                    @Override // java.lang.Runnable
                    public final void run() {
                        m5d m5dVar = this.a.e;
                        oh8 oh8Var = oh8VarZ;
                        if (m5dVar.E(oh8Var)) {
                            y9d y9dVar2 = y9dVar;
                            int i4 = i2;
                            if (y9dVar2 != null) {
                                if (!m5dVar.I(oh8Var, y9dVar2)) {
                                    sj8.M0(oh8Var, i4, new sad(-4));
                                    return;
                                }
                            } else if (!m5dVar.H(oh8Var, i3)) {
                                sj8.M0(oh8Var, i4, new sad(-4));
                                return;
                            }
                            rj8Var.k(ii8Var, oh8Var, i4);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.qr6
    public final void S(kr6 kr6Var, int i2) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 4, N0(new hj8(0)));
    }

    @Override // defpackage.qr6
    public final void U(kr6 kr6Var, int i2, int i3, IBinder iBinder) {
        if (kr6Var == null || iBinder == null || i3 < 0) {
            return;
        }
        try {
            zw6 zw6VarA = pu0.a(iBinder);
            ww6 ww6VarI = zw6.i();
            for (int i4 = 0; i4 < zw6VarA.size(); i4++) {
                Bundle bundle = (Bundle) zw6VarA.get(i4);
                bundle.getClass();
                ww6VarI.a(tb8.b(bundle));
            }
            K0(kr6Var, i2, 20, new kj8(new y98(new z72(17, ww6VarI.j()), 8, new ej8(this, i3, 3)), 1));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.qr6
    public final void V(kr6 kr6Var, int i2) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 6, N0(new wa8(18)));
    }

    @Override // defpackage.qr6
    public final void X(kr6 kr6Var, int i2, long j) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 5, N0(new c10(j, 23)));
    }

    @Override // defpackage.qr6
    public final void Y(kr6 kr6Var, int i2) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 2, N0(new wa8(29)));
    }

    @Override // defpackage.qr6
    public final void Z(kr6 kr6Var, int i2, int i3) {
        if (kr6Var == null || i3 < 0) {
            return;
        }
        K0(kr6Var, i2, 10, new z16(26, new ej8(this, i3, 0)));
    }

    @Override // defpackage.qr6
    public final void a(kr6 kr6Var, int i2, Bundle bundle) {
        ah3 ah3Var;
        if (kr6Var == null || bundle == null) {
            return;
        }
        try {
            sad sadVarA = sad.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                m5d m5dVar = this.e;
                IBinder iBinderAsBinder = kr6Var.asBinder();
                synchronized (m5dVar.b) {
                    try {
                        oh8 oh8VarZ = m5dVar.z(iBinderAsBinder);
                        ah3Var = oh8VarZ != null ? (ah3) ((us) m5dVar.o).get(oh8VarZ) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                cd6 cd6Var = ah3Var != null ? ah3Var.b : null;
                if (cd6Var == null) {
                    return;
                }
                cd6Var.s(i2, sadVarA);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.qr6
    public final void a0(kr6 kr6Var, int i2) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 26, N0(new wa8(24)));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.qr6
    public final void c0(kr6 kr6Var, int i2, boolean z) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 1, N0(new l01(z, 7)));
    }

    @Override // defpackage.qr6
    public final void d(kr6 kr6Var, int i2, Bundle bundle, boolean z) {
        if (kr6Var == null || bundle == null) {
            return;
        }
        try {
            K0(kr6Var, i2, 35, N0(new fe4(h30.a(bundle), z, 3)));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    @Override // defpackage.qr6
    public final void d0(kr6 kr6Var, int i2, Bundle bundle) {
        l0(kr6Var, i2, bundle, true);
    }

    @Override // defpackage.qr6
    public final void e(kr6 kr6Var, int i2) {
        oh8 oh8VarZ;
        if (kr6Var == null || (oh8VarZ = this.e.z(kr6Var.asBinder())) == null) {
            return;
        }
        L0(oh8VarZ, i2, 1, N0(new wa8(12)));
    }

    @Override // defpackage.qr6
    public final void e0(kr6 kr6Var, int i2) {
        if (kr6Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ii8 ii8Var = (ii8) this.c.get();
            if (ii8Var != null && !ii8Var.i()) {
                oaf.W(ii8Var.l, new vs5(this, 24, kr6Var));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.qr6
    public final void i(kr6 kr6Var, int i2, Bundle bundle, long j) {
        if (kr6Var == null || bundle == null) {
            return;
        }
        try {
            K0(kr6Var, i2, 31, new kj8(new y98(new lt1(tb8.b(bundle), j, 6), 7, new hj8(4)), 1));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.qr6
    public final void i0(kr6 kr6Var, int i2, Surface surface) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 27, N0(new z16(25, surface)));
    }

    @Override // defpackage.qr6
    public final void j0(kr6 kr6Var, int i2, Bundle bundle) {
        if (kr6Var == null || bundle == null) {
            return;
        }
        try {
            oh3 oh3VarA = oh3.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = oh3VarA.d;
            }
            try {
                vi8 vi8Var = new vi8(oh3VarA.c, callingPid, callingUid);
                k(kr6Var, new oh8(vi8Var, oh3VarA.a, oh3VarA.b, this.d.b(vi8Var), new oj8(kr6Var), oh3VarA.e));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    public final void k(kr6 kr6Var, oh8 oh8Var) {
        if (kr6Var != null) {
            ii8 ii8Var = (ii8) this.c.get();
            if (ii8Var == null || ii8Var.i()) {
                try {
                    kr6Var.c(0);
                } catch (RemoteException unused) {
                }
            } else {
                this.f.add(oh8Var);
                oaf.W(ii8Var.l, new yg3(this, oh8Var, ii8Var, kr6Var, 9));
            }
        }
    }

    @Override // defpackage.qr6
    public final void l0(kr6 kr6Var, int i2, Bundle bundle, boolean z) {
        if (kr6Var == null || bundle == null) {
            return;
        }
        try {
            K0(kr6Var, i2, 31, new kj8(new y98(new fe4(tb8.b(bundle), z, 2), 7, new hj8(4)), 1));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // defpackage.qr6
    public final void m0(kr6 kr6Var) {
        if (kr6Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ii8 ii8Var = (ii8) this.c.get();
            if (ii8Var != null && !ii8Var.i()) {
                oh8 oh8VarZ = this.e.z(kr6Var.asBinder());
                if (oh8VarZ != null) {
                    oaf.W(ii8Var.l, new vs5(this, 25, oh8VarZ));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.qr6
    public final void n0(kr6 kr6Var, int i2, int i3) {
        if (kr6Var == null || i3 < 0) {
            return;
        }
        K0(kr6Var, i2, 25, N0(new z64(i3, 10)));
    }

    @Override // defpackage.qr6
    public final void o0(kr6 kr6Var, int i2, Bundle bundle) {
        if (kr6Var == null || bundle == null) {
            return;
        }
        try {
            K0(kr6Var, i2, 13, N0(new n98(new c3b(bundle.getFloat(c3b.e, 1.0f), bundle.getFloat(c3b.f, 1.0f)), 2)));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i2 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i2) {
            case 3002:
                y(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                n0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                z(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                a0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                w0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                l0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                i(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                l0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                J(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                J(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                v(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                c0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                a(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                j0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                kr6 kr6VarK = ga8.k(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                p0(kr6VarK, i4, (Bundle) fp3.a(parcel, creator), (Bundle) fp3.a(parcel, creator));
                return true;
            case 3017:
                z0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                E0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                L(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                K(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3021:
                r0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3022:
                C0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3023:
                A0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3024:
                p(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                e(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                Y(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                o0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                x(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                kr6 kr6VarK2 = ga8.k(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                Bundle bundle = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                if (kr6VarK2 != null && bundle != null) {
                    try {
                        K0(kr6VarK2, i5, 20, new kj8(new y98(new fj8(2, tb8.b(bundle)), 8, new wa8(25)), 1));
                    } catch (RuntimeException e) {
                        z04.d0("Ignoring malformed Bundle for MediaItem", e);
                    }
                }
                return true;
            case 3030:
                E(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                Q(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3032:
                U(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3033:
                u0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                x0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                e0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                S(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                Z(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                X(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                P(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                G(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                C(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                V(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                w(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                i0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Surface) fp3.a(parcel, Surface.CREATOR));
                return true;
            case 3045:
                m0(ga8.k(parcel.readStrongBinder()));
                return true;
            case 3046:
                v0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                O(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                B(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                kr6 kr6VarK3 = ga8.k(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                if (kr6VarK3 != null && string != null && bundle2 != null) {
                    if (TextUtils.isEmpty(string)) {
                        z04.c0("setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            R(kr6VarK3, i6, null, 40010, new kj8(new wa8(string, 22, e5c.a(bundle2)), 1));
                        } catch (RuntimeException e2) {
                            z04.d0("Ignoring malformed Bundle for Rating", e2);
                        }
                    }
                }
                return true;
            case 3050:
                kr6 kr6VarK4 = ga8.k(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                Bundle bundle3 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                if (kr6VarK4 != null && bundle3 != null) {
                    try {
                        e5c.a(bundle3);
                        R(kr6VarK4, i7, null, 40010, new kj8(new hj8(5), 1));
                    } catch (RuntimeException e3) {
                        z04.d0("Ignoring malformed Bundle for Rating", e3);
                    }
                }
                return true;
            case 3051:
                s(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3052:
                F(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3053:
                I(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3054:
                s0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 3055:
                D0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                N(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3057:
                d(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            default:
                switch (i2) {
                    case 4001:
                        kr6 kr6VarK5 = ga8.k(parcel.readStrongBinder());
                        int i8 = parcel.readInt();
                        Bundle bundle4 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                        if (kr6VarK5 != null) {
                            if (bundle4 == null) {
                                R(kr6VarK5, i8, null, 50000, new kj8(new wa8(28), 0));
                            } else {
                                try {
                                    oc8.a(bundle4);
                                    R(kr6VarK5, i8, null, 50000, new kj8(new wa8(28), 0));
                                } catch (RuntimeException e4) {
                                    z04.d0("Ignoring malformed Bundle for LibraryParams", e4);
                                }
                            }
                        }
                        return true;
                    case 4002:
                        kr6 kr6VarK6 = ga8.k(parcel.readStrongBinder());
                        int i9 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (kr6VarK6 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                z04.c0("getItem(): Ignoring empty mediaId");
                            } else {
                                R(kr6VarK6, i9, null, 50004, new kj8(new wa8(19), 0));
                            }
                        }
                        return true;
                    case 4003:
                        kr6 kr6VarK7 = ga8.k(parcel.readStrongBinder());
                        int i10 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i11 = parcel.readInt();
                        int i12 = parcel.readInt();
                        Bundle bundle5 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                        if (kr6VarK7 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                z04.c0("getChildren(): Ignoring empty parentId");
                            } else if (i11 < 0) {
                                z04.c0("getChildren(): Ignoring negative page");
                            } else if (i12 < 1) {
                                z04.c0("getChildren(): Ignoring pageSize less than 1");
                            } else if (bundle5 == null) {
                                R(kr6VarK7, i10, null, 50003, new kj8(new wa8(11), 0));
                            } else {
                                try {
                                    oc8.a(bundle5);
                                    R(kr6VarK7, i10, null, 50003, new kj8(new wa8(11), 0));
                                } catch (RuntimeException e5) {
                                    z04.d0("Ignoring malformed Bundle for LibraryParams", e5);
                                }
                            }
                        }
                        return true;
                    case 4004:
                        kr6 kr6VarK8 = ga8.k(parcel.readStrongBinder());
                        int i13 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle6 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                        if (kr6VarK8 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                z04.c0("search(): Ignoring empty query");
                            } else if (bundle6 == null) {
                                R(kr6VarK8, i13, null, 50005, new kj8(new hj8(3), 0));
                            } else {
                                try {
                                    oc8.a(bundle6);
                                    R(kr6VarK8, i13, null, 50005, new kj8(new hj8(3), 0));
                                } catch (RuntimeException e6) {
                                    z04.d0("Ignoring malformed Bundle for LibraryParams", e6);
                                }
                            }
                        }
                        return true;
                    case 4005:
                        kr6 kr6VarK9 = ga8.k(parcel.readStrongBinder());
                        int i14 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i15 = parcel.readInt();
                        int i16 = parcel.readInt();
                        Bundle bundle7 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                        if (kr6VarK9 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                z04.c0("getSearchResult(): Ignoring empty query");
                            } else if (i15 < 0) {
                                z04.c0("getSearchResult(): Ignoring negative page");
                            } else if (i16 < 1) {
                                z04.c0("getSearchResult(): Ignoring pageSize less than 1");
                            } else if (bundle7 == null) {
                                R(kr6VarK9, i14, null, 50006, new kj8(new wa8(26), 0));
                            } else {
                                try {
                                    oc8.a(bundle7);
                                    R(kr6VarK9, i14, null, 50006, new kj8(new wa8(26), 0));
                                } catch (RuntimeException e7) {
                                    z04.d0("Ignoring malformed Bundle for LibraryParams", e7);
                                }
                            }
                        }
                        return true;
                    case 4006:
                        kr6 kr6VarK10 = ga8.k(parcel.readStrongBinder());
                        int i17 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle8 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                        if (kr6VarK10 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                z04.c0("subscribe(): Ignoring empty parentId");
                            } else if (bundle8 == null) {
                                R(kr6VarK10, i17, null, 50001, new kj8(new hj8(1), 0));
                            } else {
                                try {
                                    oc8.a(bundle8);
                                    R(kr6VarK10, i17, null, 50001, new kj8(new hj8(1), 0));
                                } catch (RuntimeException e8) {
                                    z04.d0("Ignoring malformed Bundle for LibraryParams", e8);
                                }
                            }
                        }
                        return true;
                    case 4007:
                        kr6 kr6VarK11 = ga8.k(parcel.readStrongBinder());
                        int i18 = parcel.readInt();
                        String string7 = parcel.readString();
                        if (kr6VarK11 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                z04.c0("unsubscribe(): Ignoring empty parentId");
                            } else {
                                R(kr6VarK11, i18, null, 50002, new kj8(new wa8(10), 0));
                            }
                        }
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
        }
    }

    @Override // defpackage.qr6
    public final void p(kr6 kr6Var, int i2) {
        oh8 oh8VarZ;
        if (kr6Var == null || (oh8VarZ = this.e.z(kr6Var.asBinder())) == null) {
            return;
        }
        L0(oh8VarZ, i2, 1, N0(new y98(this, 6, oh8VarZ)));
    }

    @Override // defpackage.qr6
    public final void p0(kr6 kr6Var, int i2, Bundle bundle, Bundle bundle2) {
        if (kr6Var == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            y9d y9dVarA = y9d.a(bundle);
            R(kr6Var, i2, y9dVarA, 0, new kj8(new wa8(y9dVarA, 16, bundle2), 1));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.qr6
    public final void r0(kr6 kr6Var, int i2) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 20, N0(new hj8(2)));
    }

    @Override // defpackage.qr6
    public final void s(kr6 kr6Var, int i2, int i3, int i4) {
        if (kr6Var == null || i3 < 0) {
            return;
        }
        K0(kr6Var, i2, 33, N0(new h75(i3, i4, 3)));
    }

    @Override // defpackage.qr6
    public final void s0(kr6 kr6Var, int i2, boolean z, int i3) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 34, N0(new cl3(z, i3)));
    }

    @Override // defpackage.qr6
    public final void u0(kr6 kr6Var, int i2, Bundle bundle) {
        if (kr6Var == null || bundle == null) {
            return;
        }
        try {
            K0(kr6Var, i2, 19, N0(new f75(gd8.b(bundle), 2)));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for MediaMetadata", e);
        }
    }

    @Override // defpackage.qr6
    public final void v(kr6 kr6Var, int i2, IBinder iBinder, int i3, long j) {
        if (kr6Var == null || iBinder == null) {
            return;
        }
        if (i3 == -1 || i3 >= 0) {
            try {
                zw6 zw6VarA = pu0.a(iBinder);
                ww6 ww6VarI = zw6.i();
                for (int i4 = 0; i4 < zw6VarA.size(); i4++) {
                    Bundle bundle = (Bundle) zw6VarA.get(i4);
                    bundle.getClass();
                    ww6VarI.a(tb8.b(bundle));
                }
                K0(kr6Var, i2, 20, new kj8(new y98(new e74(ww6VarI.j(), i3, j, 5), 7, new hj8(4)), 1));
            } catch (RuntimeException e) {
                z04.d0("Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    @Override // defpackage.qr6
    public final void v0(kr6 kr6Var, int i2) {
        oh8 oh8VarZ;
        if (kr6Var == null || (oh8VarZ = this.e.z(kr6Var.asBinder())) == null) {
            return;
        }
        L0(oh8VarZ, i2, 7, N0(new wa8(17)));
    }

    @Override // defpackage.qr6
    public final void w(kr6 kr6Var, int i2) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 8, N0(new wa8(13)));
    }

    @Override // defpackage.qr6
    public final void w0(kr6 kr6Var, int i2, boolean z) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 26, N0(new l01(z, 8)));
    }

    @Override // defpackage.qr6
    public final void x(kr6 kr6Var, int i2, float f) {
        if (kr6Var == null || f <= 0.0f) {
            return;
        }
        K0(kr6Var, i2, 13, N0(new b75(3, f)));
    }

    @Override // defpackage.qr6
    public final void x0(kr6 kr6Var, int i2) {
        oh8 oh8VarZ;
        if (kr6Var == null || (oh8VarZ = this.e.z(kr6Var.asBinder())) == null) {
            return;
        }
        L0(oh8VarZ, i2, 3, N0(new wa8(27)));
    }

    @Override // defpackage.qr6
    public final void y(kr6 kr6Var, int i2, float f) {
        if (kr6Var == null || f < 0.0f || f > 1.0f) {
            return;
        }
        K0(kr6Var, i2, 24, N0(new b75(4, f)));
    }

    @Override // defpackage.qr6
    public final void z(kr6 kr6Var, int i2) {
        if (kr6Var == null) {
            return;
        }
        K0(kr6Var, i2, 26, N0(new wa8(14)));
    }

    @Override // defpackage.qr6
    public final void z0(kr6 kr6Var, int i2, int i3) {
        if (kr6Var == null) {
            return;
        }
        if (i3 == 2 || i3 == 0 || i3 == 1) {
            K0(kr6Var, i2, 15, N0(new z64(i3, 9)));
        }
    }
}
