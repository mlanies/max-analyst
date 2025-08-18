package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.PowerManager;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class bq7 implements we8 {
    public final ze8 a;
    public final u65 b;
    public final ye8 c;
    public final Context d;
    public ve8 e;
    public fef f;
    public ue8 g;
    public float h;
    public boolean i;
    public boolean j;
    public PowerManager k;
    public PowerManager.WakeLock l;

    public bq7(ze8 ze8Var, u65 u65Var, ye8 ye8Var, Context context, float f, boolean z, boolean z2) {
        this.a = ze8Var;
        this.b = u65Var;
        this.c = ye8Var;
        this.d = context;
        this.h = f;
        this.i = z;
        this.j = z2;
    }

    public final void a() {
        ze8 ze8Var = ze8.a;
        ze8 ze8Var2 = this.a;
        if (ze8Var2 == ze8Var || ze8Var2 == ze8.b || !l()) {
            return;
        }
        if (this.l == null) {
            if (this.k == null) {
                this.k = (PowerManager) this.d.getSystemService("power");
            }
            PowerManager powerManager = this.k;
            Locale locale = Locale.ENGLISH;
            this.l = powerManager.newWakeLock(536870922, "tamtam:media_player_controller_" + ze8Var2);
        }
        if (this.l.isHeld()) {
            return;
        }
        try {
            this.l.acquire();
            hm9.m("bq7", "New wake lock acquire %s", ze8Var2);
        } catch (Exception unused) {
        }
    }

    public final String b(String str) {
        Locale locale = Locale.ENGLISH;
        StringBuilder sbO = rh4.o(str, "-");
        sbO.append(this.a);
        return sbO.toString();
    }

    public final boolean c() {
        if (this.f == null) {
            return false;
        }
        ye8 ye8Var = this.c;
        ye8Var.getClass();
        ze8 ze8Var = ze8.c;
        ze8 ze8Var2 = this.a;
        if ((ze8Var2 != ze8Var || !ye8Var.q()) && ze8Var2 != ze8.b) {
            return false;
        }
        lj9 lj9Var = ye8Var.u0.B0;
        return (lj9Var == null || !lj9Var.b()) && !ye8Var.Z.c.x;
    }

    public final long d() {
        long jM;
        if (this.f == null) {
            return 0L;
        }
        u65 u65Var = this.b;
        if (u65Var.Z == null) {
            return 0L;
        }
        zpd zpdVar = u65Var.a;
        zpdVar.Z1();
        t75 t75Var = zpdVar.c;
        t75Var.s2();
        if (t75Var.n()) {
            z2b z2bVar = t75Var.k1;
            jM = z2bVar.k.equals(z2bVar.b) ? maf.M(t75Var.k1.q) : t75Var.c();
        } else {
            t75Var.s2();
            if (t75Var.k1.a.q()) {
                jM = t75Var.m1;
            } else {
                z2b z2bVar2 = t75Var.k1;
                if (z2bVar2.k.d != z2bVar2.b.d) {
                    jM = maf.M(z2bVar2.a.n(t75Var.p0(), (jue) t75Var.b, 0L).y0);
                } else {
                    long j = z2bVar2.q;
                    if (t75Var.k1.k.a()) {
                        z2b z2bVar3 = t75Var.k1;
                        gue gueVarH = z2bVar3.a.h(z2bVar3.k.a, t75Var.z0);
                        long j2 = gueVarH.Z.a(t75Var.k1.k.b).a;
                        j = j2 == Long.MIN_VALUE ? gueVarH.o : j2;
                    }
                    z2b z2bVar4 = t75Var.k1;
                    lue lueVar = z2bVar4.a;
                    Object obj = z2bVar4.k.a;
                    gue gueVar = t75Var.z0;
                    lueVar.h(obj, gueVar);
                    jM = maf.M(j + gueVar.X);
                }
            }
        }
        return jM - u65Var.Z.m();
    }

    public final lze e() {
        int iIntValue;
        fef fefVar = this.f;
        lze lzeVar = lze.u0;
        if (fefVar == null) {
            return lzeVar;
        }
        kad kadVar = this.b.b;
        bf4 bf4Var = (bf4) kadVar.a;
        ez7 ez7Var = bf4Var.c;
        if (ez7Var == null || (iIntValue = ((Integer) kadVar.d(ez7Var).second).intValue()) < 0) {
            return lzeVar;
        }
        qe4 qe4VarA = ((ne4) bf4Var.e.get()).a(iIntValue, ez7Var.c[iIntValue]);
        if (qe4VarA != null) {
            for (lze lzeVar2 : kadVar.b().b) {
                if (lzeVar2.s0 == qe4VarA.a) {
                    if (lzeVar2.t0 == qe4VarA.b[0]) {
                        return lzeVar2;
                    }
                }
            }
        }
        zpd zpdVar = (zpd) kadVar.b;
        zpdVar.Z1();
        t75 t75Var = zpdVar.c;
        t75Var.s2();
        m85[] m85VarArr = (m85[]) t75Var.k1.i.X;
        int length = m85VarArr.length;
        for (int i = 0; i < length; i++) {
            oy5 oy5VarJ = null;
            if (i < length) {
                m85 m85Var = m85VarArr[i];
                if (m85Var instanceof m85) {
                    oy5VarJ = m85Var.j();
                }
            }
            if (oy5VarJ != null && ha9.g(oy5VarJ.w0) == 1) {
                Iterator it = ((List) kadVar.o).iterator();
                while (it.hasNext()) {
                    for (lze lzeVar3 : ((mze) it.next()).b) {
                        if (kad.a(lzeVar3, oy5VarJ)) {
                            return lzeVar3;
                        }
                    }
                }
            }
        }
        return lzeVar;
    }

    public final long f() {
        if (this.f == null) {
            return 0L;
        }
        u65 u65Var = this.b;
        if (u65Var.Z == null) {
            return 0L;
        }
        return u65Var.a.k() - u65Var.Z.m();
    }

    public final long g() {
        if (this.f == null) {
            return 0L;
        }
        return this.b.v();
    }

    public final int h() {
        if (this.f == null) {
            return 0;
        }
        u65 u65Var = this.b;
        if (u65Var.Z == null) {
            return 0;
        }
        return u65Var.v0;
    }

    public final int i() {
        if (this.f == null) {
            return 0;
        }
        return this.b.w0;
    }

    public final int j() {
        if (this.f == null) {
            return 0;
        }
        u65 u65Var = this.b;
        if (u65Var.Z == null) {
            return 0;
        }
        return u65Var.u0;
    }

    public final boolean k() {
        if (this.f == null) {
            return false;
        }
        return this.b.b();
    }

    public final boolean l() {
        return this.h == 1.0f;
    }

    public final void m() {
        this.c.p(this);
        ve8 ve8Var = this.e;
        if (ve8Var != null) {
            ve8Var.i();
        }
        a();
    }

    public final void n() {
        if (this.f == null) {
            return;
        }
        hm9.m("bq7", "Pause %s", this.a);
        this.j = false;
        this.b.pause();
    }

    public final void o() {
        if (this.f == null) {
            return;
        }
        hm9.m("bq7", "Play %s", this.a);
        this.j = true;
        this.b.play();
    }

    public final void p() {
        PowerManager.WakeLock wakeLock = this.l;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.l.release();
            hm9.m("bq7", "Release wake lock %s", this.a);
        }
    }

    public final void q(long j) {
        if (this.f == null) {
            return;
        }
        u65 u65Var = this.b;
        u65Var.getClass();
        u65.u();
        if (u65Var.Z == null) {
            return;
        }
        zpd zpdVar = u65Var.a;
        zpdVar.Z1();
        t75 t75Var = zpdVar.c;
        if (t75Var.c() != 0) {
            zpdVar.Z1();
            if (j > t75Var.c() - u65Var.Z.m()) {
                return;
            }
        }
        zpdVar.r(zpdVar.p0(), u65Var.Z.m() + j);
    }

    public final void r(Surface surface) {
        hm9.m("bq7", "Set surface %s", this.a);
        u65 u65Var = this.b;
        u65Var.getClass();
        u65.u();
        hm9.m("u65", "Set surface %s", surface);
        zpd zpdVar = u65Var.a;
        if (surface == null) {
            zpdVar.Z1();
            t75 t75Var = zpdVar.c;
            t75Var.s2();
            t75Var.m2(null);
            t75Var.i2(0, 0);
            return;
        }
        zpdVar.Z1();
        t75 t75Var2 = zpdVar.c;
        t75Var2.s2();
        t75Var2.m2(surface);
        t75Var2.i2(-1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [ph4] */
    /* JADX WARN: Type inference failed for: r10v8, types: [imc] */
    public final void s(fef fefVar, ue8 ue8Var) {
        dj0 znbVar;
        ve8 ve8Var;
        bq7 bq7Var;
        ve8 ve8Var2;
        int i = 23;
        boolean z = false;
        int i2 = 1;
        hm9.m("bq7", "Set video content %s", this.a);
        this.f = fefVar;
        ue8 ue8Var2 = this.g;
        if (ue8Var2 != null && ue8Var2 != ue8Var) {
            ue8Var2.c1();
        }
        this.g = ue8Var;
        u65 u65Var = this.b;
        u65Var.getClass();
        u65.u();
        u65Var.Y = this;
        u65Var.g(((ok0) this.f).g ? 0.0f : this.h);
        boolean z2 = this.i;
        u65.u();
        zpd zpdVar = u65Var.a;
        zpdVar.Z1();
        t75 t75Var = zpdVar.c;
        t75Var.s2();
        if (t75Var.N0 != z2) {
            t75Var.N0 = z2 ? 1 : 0;
            aie aieVar = t75Var.w0.s0;
            aieVar.getClass();
            yhe yheVarB = aie.b();
            yheVarB.a = aieVar.a.obtainMessage(11, z2 ? 1 : 0, 0);
            yheVarB.b();
            z64 z64Var = new z64(z2 ? 1 : 0, i2);
            z23 z23Var = t75Var.x0;
            z23Var.h(8, z64Var);
            t75Var.o2();
            z23Var.e();
        }
        fef fefVar2 = this.f;
        boolean z3 = this.j;
        u65.u();
        fef fefVar3 = u65Var.Z;
        zpd zpdVar2 = u65Var.a;
        if (fefVar3 != null && fefVar3.equals(fefVar2)) {
            zpdVar2.Z1();
            t75 t75Var2 = zpdVar2.c;
            t75Var2.s2();
            if (t75Var2.k1.e != 1) {
                zpd zpdVar3 = u65Var.a;
                zpdVar3.Z1();
                t75 t75Var3 = zpdVar3.c;
                t75Var3.s2();
                if (t75Var3.k1.e == 4) {
                    hm9.n("u65", "Video ended. Seek to start");
                    u65Var.B();
                }
                zpdVar2.Z1();
                t75 t75Var4 = zpdVar2.c;
                t75Var4.s2();
                if (t75Var4.k1.e == 3 && (bq7Var = u65Var.Y) != null && (ve8Var2 = bq7Var.e) != null) {
                    ve8Var2.j1();
                }
                zpdVar2.Y(z3);
                if (z3) {
                    bq7 bq7Var2 = u65Var.Y;
                    if (bq7Var2 != null) {
                        bq7Var2.m();
                    }
                    u65Var.y();
                    return;
                }
                return;
            }
        }
        hm9.n("u65", "Prepare new video content");
        u65Var.u0 = 0;
        u65Var.v0 = 0;
        u65Var.w0 = 0;
        u65Var.x0 = false;
        bq7 bq7Var3 = u65Var.Y;
        if (bq7Var3 != null && (ve8Var = bq7Var3.e) != null) {
            ve8Var.y0();
        }
        u65Var.Z = fefVar2;
        u65Var.s0 = fefVar2.getWidth() / fefVar2.getHeight();
        fef fefVar4 = u65Var.Z;
        kad kadVar = u65Var.b;
        kadVar.c = fefVar4;
        kadVar.o = Collections.emptyList();
        bf4 bf4Var = (bf4) kadVar.a;
        pe4 pe4VarB = bf4Var.b();
        SparseArray sparseArray = pe4VarB.M;
        if (sparseArray.size() != 0) {
            sparseArray.clear();
        }
        bf4Var.h(pe4VarB);
        kadVar.e();
        fef fefVar5 = u65Var.Z;
        Uri uriL = fefVar5.l();
        p24 p24VarA = u65Var.o.a(uriL, !((ok0) fefVar5).c);
        if (fefVar5 instanceof b24) {
            DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(p24VarA);
            rb8 rb8VarA = rb8.a(uriL);
            kb8 kb8Var = rb8VarA.b;
            kb8Var.getClass();
            l14 l14Var = new l14();
            List list = kb8Var.c;
            znbVar = new x14(rb8VarA, dashMediaSource$Factory.b, !list.isEmpty() ? new ph4(l14Var, list) : l14Var, dashMediaSource$Factory.a, dashMediaSource$Factory.d, dashMediaSource$Factory.c.x(rb8VarA), dashMediaSource$Factory.e, dashMediaSource$Factory.f);
        } else if (fefVar5 instanceof yn6) {
            HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(p24VarA);
            rb8 rb8VarA2 = rb8.a(uriL);
            kb8 kb8Var2 = rb8VarA2.b;
            kb8Var2.getClass();
            rq9 imcVar = hlsMediaSource$Factory.c;
            List list2 = kb8Var2.c;
            if (!list2.isEmpty()) {
                imcVar = new imc(imcVar, list2, z, 18);
            }
            oq9 oq9Var = hlsMediaSource$Factory.b;
            sr4 sr4VarX = hlsMediaSource$Factory.f.x(rb8VarA2);
            hlsMediaSource$Factory.d.getClass();
            buc bucVar = hlsMediaSource$Factory.g;
            znbVar = new rm6(rb8VarA2, hlsMediaSource$Factory.a, oq9Var, hlsMediaSource$Factory.e, sr4VarX, bucVar, new hb4(hlsMediaSource$Factory.a, bucVar, imcVar), hlsMediaSource$Factory.j, hlsMediaSource$Factory.h, hlsMediaSource$Factory.i);
        } else if (fefVar5 instanceof ee9) {
            ee9 ee9Var = (ee9) fefVar5;
            List list3 = ee9Var.j;
            dj0[] dj0VarArr = new dj0[list3.size()];
            int i3 = 0;
            while (i3 < list3.size()) {
                ce9 ce9Var = (ce9) list3.get(i3);
                yt8 yt8Var = new yt8(i, new ua4());
                buc bucVar2 = new buc();
                rb8 rb8VarA3 = rb8.a(Uri.parse(ce9Var.a));
                rb8VarA3.b.getClass();
                rb8VarA3.b.getClass();
                rb8VarA3.b.getClass();
                int i4 = i3;
                znb znbVar2 = new znb(rb8VarA3, p24VarA, yt8Var, sr4.a, bucVar2);
                dj0VarArr[i4] = fefVar5 instanceof w2f ? new d43(znbVar2, TimeUnit.MILLISECONDS.toMicros(ee9Var.k())) : znbVar2;
                i3 = i4 + 1;
            }
            znbVar = new bs8(dj0VarArr);
        } else {
            yt8 yt8Var2 = new yt8(i, new ua4());
            buc bucVar3 = new buc();
            rb8 rb8VarA4 = rb8.a(uriL);
            rb8VarA4.b.getClass();
            rb8VarA4.b.getClass();
            rb8VarA4.b.getClass();
            znbVar = new znb(rb8VarA4, p24VarA, yt8Var2, sr4.a, bucVar3);
        }
        u65Var.t0 = znbVar;
        zpdVar2.Y(z3);
        fef fefVar6 = u65Var.Z;
        long jMax = Math.max(((ok0) fefVar6).b, fefVar6.m());
        boolean z4 = ((ok0) u65Var.Z).c;
        t75 t75Var5 = zpdVar2.c;
        if (z4 || jMax == 0) {
            dj0 dj0Var = u65Var.t0;
            zpdVar2.Z1();
            t75Var5.s2();
            List listSingletonList = Collections.singletonList(dj0Var);
            t75Var5.s2();
            t75Var5.s2();
            t75Var5.l2(listSingletonList, -1, -9223372036854775807L, true);
        } else {
            dj0 dj0Var2 = u65Var.t0;
            zpdVar2.Z1();
            t75Var5.s2();
            List listSingletonList2 = Collections.singletonList(dj0Var2);
            t75Var5.s2();
            t75Var5.l2(listSingletonList2, 0, jMax, false);
        }
        zpdVar2.Z1();
        t75Var5.s2();
        boolean zU = t75Var5.u();
        int iD = t75Var5.I0.d(2, zU);
        t75Var5.p2(iD, (!zU || iD == 1) ? 1 : 2, zU);
        z2b z2bVar = t75Var5.k1;
        if (z2bVar.e == 1) {
            z2b z2bVarE = z2bVar.e(null);
            z2b z2bVarF = z2bVarE.f(z2bVarE.a.q() ? 4 : 2);
            t75Var5.O0++;
            aie aieVar2 = t75Var5.w0.s0;
            aieVar2.getClass();
            yhe yheVarB2 = aie.b();
            yheVarB2.a = aieVar2.a.obtainMessage(0);
            yheVarB2.b();
            t75Var5.q2(z2bVarF, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
        if (z3) {
            bq7 bq7Var4 = u65Var.Y;
            if (bq7Var4 != null) {
                bq7Var4.m();
            }
            u65Var.y();
        }
    }

    public final void t(float f) {
        fef fefVar = this.f;
        if (fefVar == null || !((ok0) fefVar).g) {
            this.h = f;
            this.b.g(f);
            if (l() && this.f != null && l()) {
                this.c.p(this);
            }
        }
    }

    public final void u() {
        if (this.f == null) {
            return;
        }
        hm9.m("bq7", "Stop %s", this.a);
        this.b.E();
    }

    public final void v() {
        t(0.0f);
    }
}
