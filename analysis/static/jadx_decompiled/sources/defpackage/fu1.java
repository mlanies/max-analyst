package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class fu1 implements ax1 {
    public final l0f A0;
    public final ux1 B0;
    public final boolean C0;
    public final boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public x99 H0;
    public final q40 I0;
    public final z23 J0;
    public final HashSet K0;
    public yv1 L0;
    public final Object M0;
    public boolean N0;
    public final ul4 O0;
    public final o9g P0;
    public final bee Q0;
    public final imc R0;
    public volatile int S0 = 3;
    public final va8 X;
    public final imc Y;
    public final st1 Z;
    public final gaa a;
    public final dx1 b;
    public final q6d c;
    public final zh6 o;
    public final eu1 s0;
    public final iu1 t0;
    public CameraDevice u0;
    public int v0;
    public sz1 w0;
    public final LinkedHashMap x0;
    public int y0;
    public final yt1 z0;

    public fu1(Context context, dx1 dx1Var, String str, iu1 iu1Var, l0f l0fVar, ux1 ux1Var, Executor executor, Handler handler, ul4 ul4Var, long j) throws CameraUnavailableException {
        va8 va8Var = new va8(22, (byte) 0);
        this.X = va8Var;
        this.v0 = 0;
        new AtomicInteger(0);
        this.x0 = new LinkedHashMap();
        this.y0 = 0;
        this.E0 = false;
        this.F0 = false;
        this.G0 = true;
        this.K0 = new HashSet();
        this.L0 = bw1.a;
        this.M0 = new Object();
        this.N0 = false;
        this.R0 = new imc(this);
        this.b = dx1Var;
        this.A0 = l0fVar;
        this.B0 = ux1Var;
        zh6 zh6Var = new zh6(handler);
        this.o = zh6Var;
        q6d q6dVar = new q6d(executor);
        this.c = q6dVar;
        this.s0 = new eu1(this, q6dVar, zh6Var, j);
        this.a = new gaa(str, 29);
        ((ci9) va8Var.b).i(new an7(zw1.CLOSED));
        imc imcVar = new imc(ux1Var);
        this.Y = imcVar;
        q40 q40Var = new q40(q6dVar);
        this.I0 = q40Var;
        this.O0 = ul4Var;
        try {
            xv1 xv1VarA = dx1Var.a(str);
            st1 st1Var = new st1(xv1VarA, zh6Var, q6dVar, new sy4(7, this), iu1Var.j);
            this.Z = st1Var;
            this.t0 = iu1Var;
            iu1Var.t(st1Var);
            iu1Var.h.m((ci9) imcVar.c);
            this.P0 = o9g.x(xv1VarA);
            this.w0 = z();
            bj6 bj6Var = iu1Var.j;
            bj6 bj6Var2 = zi4.a;
            z23 z23Var = new z23();
            z23Var.b = q6dVar;
            z23Var.a = zh6Var;
            z23Var.c = handler;
            z23Var.d = q40Var;
            z23Var.e = bj6Var;
            z23Var.f = bj6Var2;
            this.J0 = z23Var;
            this.C0 = iu1Var.j.d(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.D0 = iu1Var.j.d(LegacyCameraSurfaceCleanupQuirk.class);
            yt1 yt1Var = new yt1(this, str);
            this.z0 = yt1Var;
            ey1 ey1Var = new ey1(7, this);
            synchronized (ux1Var.b) {
                c54.p("Camera is already registered: " + this, !ux1Var.e.containsKey(this));
                ux1Var.e.put(this, new sx1(q6dVar, ey1Var, yt1Var));
            }
            dx1Var.a.b0(q6dVar, yt1Var);
            this.Q0 = new bee(context, str, dx1Var, new c32(8, (byte) 0));
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public static String v(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String w(x99 x99Var) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        x99Var.getClass();
        sb.append(x99Var.hashCode());
        return sb.toString();
    }

    public static String x(l9f l9fVar) {
        return l9fVar.g() + l9fVar.hashCode();
    }

    public final void A(boolean z) {
        if (!z) {
            this.s0.e.b = -1L;
        }
        this.s0.a();
        this.R0.K();
        toString();
        F(8);
        try {
            dx1 dx1Var = this.b;
            dx1Var.a.Z(this.t0.a, this.c, t());
        } catch (CameraAccessExceptionCompat e) {
            e.getMessage();
            toString();
            if (e.a == 10001) {
                E(3, new v90(e, 7), true);
                return;
            }
            imc imcVar = this.R0;
            if (((fu1) imcVar.c).S0 != 8) {
                ((fu1) imcVar.c).toString();
                return;
            }
            ((fu1) imcVar.c).toString();
            imcVar.K();
            imcVar.b = new bkb(imcVar);
        } catch (SecurityException e2) {
            e2.getMessage();
            toString();
            F(7);
            this.s0.b();
        }
    }

    public final void B() {
        int i = 9;
        c54.p(null, this.S0 == 9);
        ead eadVarM = this.a.m();
        if (!eadVarM.l || !eadVarM.k) {
            toString();
            return;
        }
        if (!this.B0.e(this.u0.getId(), this.A0.B(this.u0.getId()))) {
            int i2 = this.A0.b;
            toString();
            return;
        }
        HashMap map = new HashMap();
        Collection<fad> collectionN = this.a.n();
        Collection collectionS = this.a.s();
        aa0 aa0Var = e9e.a;
        ArrayList arrayList = new ArrayList(collectionS);
        Iterator it = collectionN.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fad fadVar = (fad) it.next();
            ce3 ce3Var = fadVar.g.b;
            aa0 aa0Var2 = e9e.a;
            if (ce3Var.o(aa0Var2) && fadVar.b().size() != 1) {
                String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(fadVar.b().size()));
                break;
            }
            if (fadVar.g.b.o(aa0Var2)) {
                int i3 = 0;
                for (fad fadVar2 : collectionN) {
                    if (((o9f) arrayList.get(i3)).N() == q9f.Y) {
                        c54.p("MeteringRepeating should contain a surface", !fadVar2.b().isEmpty());
                        map.put((xf4) fadVar2.b().get(0), 1L);
                    } else if (fadVar2.g.b.o(aa0Var2) && !fadVar2.b().isEmpty()) {
                        map.put((xf4) fadVar2.b().get(0), (Long) fadVar2.g.b.h(aa0Var2));
                    }
                    i3++;
                }
            }
        }
        sz1 sz1Var = this.w0;
        synchronized (sz1Var.a) {
            sz1Var.l = map;
        }
        sz1 sz1Var2 = this.w0;
        fad fadVarB = eadVarM.b();
        CameraDevice cameraDevice = this.u0;
        cameraDevice.getClass();
        z23 z23Var = this.J0;
        kq0.a(sz1Var2.l(fadVarB, cameraDevice, new jhe((bj6) z23Var.e, (bj6) z23Var.f, (q40) z23Var.d, (Executor) z23Var.b, (ScheduledExecutorService) z23Var.a, (Handler) z23Var.c)), new h7b(this, i, sz1Var2), this.c);
    }

    public final void C() {
        if (this.H0 != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.H0.getClass();
            sb.append(this.H0.hashCode());
            String string = sb.toString();
            gaa gaaVar = this.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) gaaVar.a;
            if (linkedHashMap.containsKey(string)) {
                m9f m9fVar = (m9f) linkedHashMap.get(string);
                m9fVar.e = false;
                if (!m9fVar.f) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.H0.getClass();
            sb2.append(this.H0.hashCode());
            String string2 = sb2.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) gaaVar.a;
            if (linkedHashMap2.containsKey(string2)) {
                m9f m9fVar2 = (m9f) linkedHashMap2.get(string2);
                m9fVar2.f = false;
                if (!m9fVar2.e) {
                    linkedHashMap2.remove(string2);
                }
            }
            x99 x99Var = this.H0;
            fw6 fw6Var = (fw6) x99Var.a;
            if (fw6Var != null) {
                fw6Var.a();
            }
            x99Var.a = null;
            this.H0 = null;
        }
    }

    public final void D() {
        fad fadVar;
        List listUnmodifiableList;
        c54.p(null, this.w0 != null);
        toString();
        sz1 sz1Var = this.w0;
        synchronized (sz1Var.a) {
            fadVar = sz1Var.f;
        }
        synchronized (sz1Var.a) {
            listUnmodifiableList = Collections.unmodifiableList(sz1Var.b);
        }
        sz1 sz1VarZ = z();
        this.w0 = sz1VarZ;
        sz1VarZ.n(fadVar);
        this.w0.j(listUnmodifiableList);
        if (au1.s(this.S0) != 8) {
            sz1Var.h();
            toString();
        } else if (this.C0 && sz1Var.h()) {
            toString();
            F(6);
        }
        if (this.D0 && sz1Var.h()) {
            toString();
            this.E0 = true;
        }
        sz1Var.a();
        bm7 bm7VarM = sz1Var.m();
        wg0.o(this.S0);
        toString();
        this.x0.put(sz1Var, bm7VarM);
        kq0.a(bm7VarM, new va8(this, sz1Var, false, 9), ju0.k());
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132 A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:28:0x0089, B:30:0x0090, B:32:0x009a, B:46:0x00cf, B:50:0x00d5, B:52:0x00db, B:54:0x00df, B:56:0x00ef, B:59:0x00f7, B:61:0x00fb, B:62:0x010a, B:64:0x0110, B:66:0x0122, B:75:0x0150, B:76:0x0153, B:67:0x0132, B:69:0x0136, B:71:0x013a, B:34:0x00a2, B:36:0x00b7, B:40:0x00be, B:42:0x00c5), top: B:119:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(int r11, defpackage.v90 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu1.E(int, v90, boolean):void");
    }

    public final void F(int i) {
        E(i, null, true);
    }

    public final ArrayList G(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            boolean z = this.G0;
            String strX = x(l9fVar);
            Class<?> cls = l9fVar.getClass();
            fad fadVar = z ? l9fVar.n : l9fVar.o;
            o9f o9fVar = l9fVar.f;
            vb0 vb0Var = l9fVar.g;
            arrayList2.add(new t90(strX, cls, fadVar, o9fVar, vb0Var != null ? vb0Var.a : null, vb0Var, l9fVar.c() == null ? null : c9e.J(l9fVar)));
        }
        return arrayList2;
    }

    public final void H(ArrayList arrayList) {
        Size size;
        boolean zIsEmpty = this.a.n().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t90 t90Var = (t90) it.next();
            if (!this.a.C(t90Var.a)) {
                gaa gaaVar = this.a;
                String str = t90Var.a;
                fad fadVar = t90Var.c;
                o9f o9fVar = t90Var.d;
                vb0 vb0Var = t90Var.f;
                List list = t90Var.g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) gaaVar.a;
                m9f m9fVar = (m9f) linkedHashMap.get(str);
                if (m9fVar == null) {
                    m9fVar = new m9f(fadVar, o9fVar, vb0Var, list);
                    linkedHashMap.put(str, m9fVar);
                }
                m9fVar.e = true;
                gaaVar.I(str, fadVar, o9fVar, vb0Var, list);
                arrayList2.add(t90Var.a);
                if (t90Var.b == h8b.class && (size = t90Var.e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        TextUtils.join(", ", arrayList2);
        toString();
        if (zIsEmpty) {
            this.Z.y(true);
            st1 st1Var = this.Z;
            synchronized (st1Var.d) {
                st1Var.p++;
            }
        }
        q();
        L();
        K();
        D();
        if (this.S0 == 9) {
            B();
        } else {
            int iS = au1.s(this.S0);
            if (iS == 2 || iS == 3) {
                I(false);
            } else if (iS != 4) {
                toString();
            } else {
                F(7);
                if (!this.x0.isEmpty() && !this.F0 && this.v0 == 0) {
                    c54.p("Camera Device should be open if session close is not complete", this.u0 != null);
                    F(9);
                    B();
                }
            }
        }
        if (rational != null) {
            this.Z.h.e = rational;
        }
    }

    public final void I(boolean z) {
        toString();
        if (this.B0.d(this)) {
            A(z);
        } else {
            toString();
            F(4);
        }
    }

    public final void J(boolean z) {
        toString();
        if (this.z0.b && this.B0.d(this)) {
            A(z);
        } else {
            toString();
            F(4);
        }
    }

    public final void K() {
        gaa gaaVar = this.a;
        gaaVar.getClass();
        ead eadVar = new ead();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) gaaVar.a).entrySet()) {
            m9f m9fVar = (m9f) entry.getValue();
            if (m9fVar.f && m9fVar.e) {
                String str = (String) entry.getKey();
                eadVar.a(m9fVar.a);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        boolean z = eadVar.l && eadVar.k;
        st1 st1Var = this.Z;
        if (!z) {
            st1Var.x = 1;
            st1Var.h.n = 1;
            st1Var.n.c = 1;
            this.w0.n(st1Var.s());
            return;
        }
        int i = eadVar.b().g.c;
        st1Var.x = i;
        st1Var.h.n = i;
        st1Var.n.c = i;
        eadVar.a(st1Var.s());
        this.w0.n(eadVar.b());
    }

    public final void L() {
        Iterator it = this.a.s().iterator();
        boolean zBooleanValue = false;
        while (it.hasNext()) {
            zBooleanValue |= ((Boolean) ((o9f) it.next()).f(o9f.m0, Boolean.FALSE)).booleanValue();
        }
        this.Z.l.c = zBooleanValue;
    }

    @Override // defpackage.ax1
    public final void b(yv1 yv1Var) {
        if (yv1Var == null) {
            yv1Var = bw1.a;
        }
        yv1Var.P();
        this.L0 = yv1Var;
        synchronized (this.M0) {
        }
    }

    @Override // defpackage.k9f
    public final void c(l9f l9fVar) {
        l9fVar.getClass();
        this.c.execute(new vt1(this, x(l9fVar), this.G0 ? l9fVar.n : l9fVar.o, l9fVar.f, l9fVar.g, l9fVar.c() == null ? null : c9e.J(l9fVar), 0));
    }

    @Override // defpackage.k9f
    public final void e(l9f l9fVar) {
        l9fVar.getClass();
        this.c.execute(new vt1(this, x(l9fVar), this.G0 ? l9fVar.n : l9fVar.o, l9fVar.f, l9fVar.g, l9fVar.c() == null ? null : c9e.J(l9fVar), 2));
    }

    @Override // defpackage.ax1
    public final ry9 f() {
        return this.X;
    }

    @Override // defpackage.ax1
    public final hw1 g() {
        return this.Z;
    }

    @Override // defpackage.ax1
    public final yv1 h() {
        return this.L0;
    }

    @Override // defpackage.k9f
    public final void i(l9f l9fVar) {
        l9fVar.getClass();
        this.c.execute(new vt1(this, x(l9fVar), this.G0 ? l9fVar.n : l9fVar.o, l9fVar.f, l9fVar.g, l9fVar.c() == null ? null : c9e.J(l9fVar), 1));
    }

    @Override // defpackage.ax1
    public final void j(boolean z) {
        this.c.execute(new u60(this, z, 7));
    }

    @Override // defpackage.ax1
    public final void k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        st1 st1Var = this.Z;
        synchronized (st1Var.d) {
            st1Var.p++;
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            String strX = x(l9fVar);
            HashSet hashSet = this.K0;
            if (!hashSet.contains(strX)) {
                hashSet.add(strX);
                l9fVar.v();
                l9fVar.t();
            }
        }
        try {
            this.c.execute(new ut1(this, new ArrayList(G(arrayList)), 1));
        } catch (RejectedExecutionException unused) {
            toString();
            st1Var.q();
        }
    }

    @Override // defpackage.ax1
    public final void l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(G(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            String strX = x(l9fVar);
            HashSet hashSet = this.K0;
            if (hashSet.contains(strX)) {
                l9fVar.w();
                hashSet.remove(strX);
            }
        }
        this.c.execute(new ut1(this, arrayList3, 0));
    }

    @Override // defpackage.k9f
    public final void m(l9f l9fVar) {
        l9fVar.getClass();
        this.c.execute(new wt1(this, 2, x(l9fVar)));
    }

    @Override // defpackage.ax1
    public final void o(boolean z) {
        this.G0 = z;
    }

    @Override // defpackage.ax1
    public final yw1 p() {
        return this.t0;
    }

    public final void q() {
        x99 x99Var;
        gaa gaaVar = this.a;
        fad fadVarB = gaaVar.m().b();
        kz1 kz1Var = fadVarB.g;
        int size = Collections.unmodifiableList(kz1Var.a).size();
        int size2 = fadVarB.b().size();
        if (fadVarB.b().isEmpty()) {
            return;
        }
        if (!Collections.unmodifiableList(kz1Var.a).isEmpty()) {
            if (size2 == 1 && size == 1) {
                C();
                return;
            }
            if (size >= 2) {
                C();
                return;
            } else {
                if (this.H0 == null || y()) {
                    return;
                }
                C();
                return;
            }
        }
        if (this.H0 == null) {
            this.H0 = new x99(this.t0.b, this.O0, new tt1(this, 2));
        }
        if (!y() || (x99Var = this.H0) == null) {
            return;
        }
        String strW = w(x99Var);
        x99 x99Var2 = this.H0;
        fad fadVar = (fad) x99Var2.b;
        q9f q9fVar = q9f.Y;
        List listSingletonList = Collections.singletonList(q9fVar);
        LinkedHashMap linkedHashMap = (LinkedHashMap) gaaVar.a;
        m9f m9fVar = (m9f) linkedHashMap.get(strW);
        w99 w99Var = (w99) x99Var2.c;
        if (m9fVar == null) {
            m9fVar = new m9f(fadVar, w99Var, null, listSingletonList);
            linkedHashMap.put(strW, m9fVar);
        }
        m9fVar.e = true;
        gaaVar.I(strW, fadVar, w99Var, null, listSingletonList);
        x99 x99Var3 = this.H0;
        fad fadVar2 = (fad) x99Var3.b;
        List listSingletonList2 = Collections.singletonList(q9fVar);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) gaaVar.a;
        m9f m9fVar2 = (m9f) linkedHashMap2.get(strW);
        if (m9fVar2 == null) {
            m9fVar2 = new m9f(fadVar2, (w99) x99Var3.c, null, listSingletonList2);
            linkedHashMap2.put(strW, m9fVar2);
        }
        m9fVar2.f = true;
    }

    public final void r() {
        ArrayList<kz1> arrayList;
        c54.p("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + wg0.r(this.S0) + " (error: " + v(this.v0) + ")", this.S0 == 5 || this.S0 == 2 || (this.S0 == 7 && this.v0 != 0));
        D();
        sz1 sz1Var = this.w0;
        synchronized (sz1Var.a) {
            try {
                if (sz1Var.b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(sz1Var.b);
                    sz1Var.b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (kz1 kz1Var : arrayList) {
                Iterator it = kz1Var.e.iterator();
                while (it.hasNext()) {
                    ((iv1) it.next()).a(kz1Var.a());
                }
            }
        }
    }

    public final void s() {
        c54.p(null, this.S0 == 2 || this.S0 == 5);
        c54.p(null, this.x0.isEmpty());
        if (!this.E0) {
            u();
            return;
        }
        if (this.F0) {
            toString();
            return;
        }
        if (!this.z0.b) {
            this.E0 = false;
            u();
            toString();
        } else {
            toString();
            oq1 oq1VarG = f8.g(new tt1(this, 1));
            this.F0 = true;
            oq1VarG.b.d(new b(28, this), this.c);
        }
    }

    public final CameraDevice.StateCallback t() {
        ArrayList arrayList = new ArrayList(this.a.m().b().c);
        arrayList.add((nw1) this.I0.Y);
        arrayList.add(this.s0);
        return xfg.g(arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.t0.a);
    }

    public final void u() {
        c54.p(null, this.S0 == 2 || this.S0 == 5);
        c54.p(null, this.x0.isEmpty());
        this.u0 = null;
        if (this.S0 == 5) {
            F(3);
            return;
        }
        this.b.a.g0(this.z0);
        F(1);
    }

    public final boolean y() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.M0) {
            try {
                i = this.A0.b == 2 ? 1 : 0;
            } finally {
            }
        }
        gaa gaaVar = this.a;
        gaaVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) gaaVar.a).entrySet()) {
            if (((m9f) entry.getValue()).e) {
                arrayList2.add((m9f) entry.getValue());
            }
        }
        for (m9f m9fVar : Collections.unmodifiableCollection(arrayList2)) {
            List list = m9fVar.d;
            if (list == null || list.get(0) != q9f.Y) {
                if (m9fVar.c == null || m9fVar.d == null) {
                    m9fVar.toString();
                    return false;
                }
                fad fadVar = m9fVar.a;
                o9f o9fVar = m9fVar.b;
                for (xf4 xf4Var : fadVar.b()) {
                    bee beeVar = this.Q0;
                    int inputFormat = o9fVar.getInputFormat();
                    xb0 xb0VarB = xb0.b(i, inputFormat, xf4Var.h, beeVar.i(inputFormat));
                    int inputFormat2 = o9fVar.getInputFormat();
                    Size size = xf4Var.h;
                    vb0 vb0Var = m9fVar.c;
                    arrayList.add(new l90(xb0VarB, inputFormat2, size, vb0Var.b, m9fVar.d, vb0Var.d, (Range) o9fVar.f(o9f.l0, null)));
                }
            }
        }
        this.H0.getClass();
        HashMap map = new HashMap();
        x99 x99Var = this.H0;
        map.put((w99) x99Var.c, Collections.singletonList((Size) x99Var.o));
        try {
            this.Q0.g(i, arrayList, map, false, false);
            toString();
            return true;
        } catch (IllegalArgumentException unused) {
            toString();
            return false;
        }
    }

    public final sz1 z() {
        sz1 sz1Var;
        synchronized (this.M0) {
            sz1Var = new sz1(this.P0, this.t0.j, false);
        }
        return sz1Var;
    }
}
