package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes.dex */
public final class bkg implements nr8, ah9, y2a, qj3, b18, bn4, a76, m87, o1d, w2e, h7 {
    public static bkg c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ bkg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static synchronized bkg y(Context context) {
        bkg bkgVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (bkg.class) {
            bkgVar = c;
            if (bkgVar == null) {
                bkgVar = new bkg(0);
                l8e l8eVarA = l8e.a(applicationContext);
                bkgVar.b = l8eVarA;
                l8eVarA.b();
                l8eVarA.c();
                c = bkgVar;
            }
        }
        return bkgVar;
        return bkgVar;
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        ir0 ir0Var = (ir0) this.b;
        hr0 hr0Var = ir0Var.y0;
        if (hr0Var != null) {
            ir0Var.Y.W.remove(hr0Var);
        }
        hr0 hr0Var2 = new hr0(ir0Var.t0, x6gVar);
        ir0Var.y0 = hr0Var2;
        hr0Var2.e(ir0Var.getWindow());
        BottomSheetBehavior bottomSheetBehavior = ir0Var.Y;
        hr0 hr0Var3 = ir0Var.y0;
        ArrayList arrayList = bottomSheetBehavior.W;
        if (!arrayList.contains(hr0Var3)) {
            arrayList.add(hr0Var3);
        }
        return x6gVar;
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        String.format("Released audio source successfully: 0x%x", Integer.valueOf(((e70) this.b).hashCode()));
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 7:
                Throwable th = (Throwable) obj;
                s12 s12Var = (s12) this.b;
                hm9.p(s12Var.Z, "onUploadFailed: failed", th);
                eoe eoeVarS = s12Var.s();
                long j = s12Var.b;
                eoeVarS.d(j);
                s12Var.z();
                s12Var.y();
                s12Var.t().c(new oi0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new pke("internal-error", th.toString(), null)));
                break;
            case 18:
                hm9.p(((k29) this.b).b, "postProcessText: failed", (Throwable) obj);
                break;
            case 27:
                hm9.n(((cge) this.b).b, "Connection restored");
                break;
            default:
                ((t4f) this.b).a.setValue((Float) obj);
                break;
        }
    }

    @Override // defpackage.bn4
    public void b() {
        wk9 wk9Var = ((oj9) this.b).u0;
        if (wk9Var != null) {
            wk9Var.n(new fj0(18));
        }
    }

    @Override // defpackage.nr8
    public void c(wq8 wq8Var, boolean z) {
        ((dn) this.b).o(wq8Var);
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(((e70) this.b).hashCode()));
    }

    @Override // defpackage.m87
    public void e(g05 g05Var, int i) {
        fm5 fm5VarB;
        int i2;
        hic hicVar = (hic) this.b;
        if (g05Var == null) {
            hicVar.b.g(i, null);
            return;
        }
        zv6 zv6Var = hicVar.d;
        g05Var.o0();
        yv6 yv6VarCreateImageTranscoder = zv6Var.createImageTranscoder(g05Var.c, hicVar.c);
        yv6VarCreateImageTranscoder.getClass();
        fi0 fi0Var = hicVar.b;
        eab eabVar = hicVar.e;
        oj0 oj0Var = (oj0) eabVar;
        oj0Var.c.j(eabVar, "ResizeAndRotateProducer");
        wv6 wv6Var = oj0Var.a;
        y7g y7gVar = hicVar.h.b;
        y7gVar.getClass();
        rq8 rq8Var = new rq8((pq8) y7gVar.b);
        try {
            try {
                anc ancVar = wv6Var.j;
                jic jicVar = wv6Var.i;
                g05Var.o0();
                fm5VarB = yv6VarCreateImageTranscoder.b(g05Var, rq8Var, ancVar, jicVar, g05Var.u0);
                i2 = fm5VarB.b;
            } finally {
                rq8Var.close();
            }
        } catch (Exception e) {
            ((oj0) eabVar).c.d(eabVar, "ResizeAndRotateProducer", e, null);
            if (fi0.a(i)) {
                fi0Var.e(e);
            }
        }
        if (i2 == 2) {
            throw new RuntimeException("Error while transcoding the image");
        }
        dx6 dx6VarM = hicVar.m(g05Var, wv6Var.i, fm5VarB, yv6VarCreateImageTranscoder.a());
        v84 v84VarO0 = o43.o0(rq8Var.n());
        try {
            g05 g05Var2 = new g05(v84VarO0);
            g05Var2.c = qb4.a;
            try {
                g05Var2.S();
                ((oj0) eabVar).c.a(eabVar, "ResizeAndRotateProducer", dx6VarM);
                if (i2 != 1) {
                    i |= 16;
                }
                fi0Var.g(i, g05Var2);
            } finally {
                g05.d(g05Var2);
            }
        } finally {
            o43.S(v84VarO0);
        }
    }

    @Override // defpackage.bn4
    public void f(int i) {
        oj9 oj9Var = (oj9) this.b;
        oj9Var.c.c = 0;
        oj9.Z1(oj9Var, true, i * 10);
    }

    @Override // defpackage.w2e
    public void g(z2e z2eVar) {
    }

    @Override // defpackage.ah9
    public void h() {
        ((k56) this.b).invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // defpackage.o1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int i(int r7) {
        /*
            r6 = this;
            java.lang.Object r6 = r6.b
            one.me.sdk.sections.SectionRecyclerWidget r6 = (one.me.sdk.sections.SectionRecyclerWidget) r6
            r6.getClass()
            bc7[] r0 = one.me.sdk.sections.SectionRecyclerWidget.c
            r1 = 0
            r0 = r0[r1]
            q7c r2 = r6.a
            java.lang.Object r0 = r2.T0(r6, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            hdc r0 = r0.getAdapter()
            if (r0 != 0) goto L1b
            return r1
        L1b:
            int r2 = r0.j()
            if (r7 < r2) goto L22
            return r1
        L22:
            if (r7 >= 0) goto L25
            return r1
        L25:
            boolean r2 = r0 instanceof defpackage.nd3
            r3 = 0
            if (r2 == 0) goto L2e
            r2 = r0
            nd3 r2 = (defpackage.nd3) r2
            goto L2f
        L2e:
            r2 = r3
        L2f:
            if (r2 == 0) goto L50
            android.util.Pair r2 = r2.D(r7)
            java.lang.Object r4 = r2.first
            mfd r5 = r6.getX()
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 == 0) goto L42
            goto L43
        L42:
            r2 = r3
        L43:
            if (r2 == 0) goto L50
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L50
            int r7 = r2.intValue()
            goto L5a
        L50:
            mfd r2 = r6.getX()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ldb
        L5a:
            if (r7 > 0) goto L5e
            r0 = r3
            goto L76
        L5e:
            mfd r0 = r6.getX()
            iv r0 = r0.o
            java.util.List r0 = r0.f
            int r1 = r7 + (-1)
            java.lang.Object r0 = r0.get(r1)
            kfd r0 = (defpackage.kfd) r0
            int r0 = r0.u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L76:
            mfd r1 = r6.getX()
            iv r1 = r1.o
            java.util.List r1 = r1.f
            java.lang.Object r1 = r1.get(r7)
            kfd r1 = (defpackage.kfd) r1
            int r1 = r1.u()
            mfd r2 = r6.getX()
            iv r2 = r2.o
            java.util.List r2 = r2.f
            int r2 = r2.size()
            r4 = 1
            int r2 = r2 - r4
            if (r7 != r2) goto L99
            goto Lb0
        L99:
            mfd r6 = r6.getX()
            iv r6 = r6.o
            java.util.List r6 = r6.f
            int r7 = r7 + r4
            java.lang.Object r6 = r6.get(r7)
            kfd r6 = (defpackage.kfd) r6
            int r6 = r6.u()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
        Lb0:
            if (r0 != 0) goto Lb3
            goto Lb9
        Lb3:
            int r6 = r0.intValue()
            if (r6 == r1) goto Lc4
        Lb9:
            if (r3 != 0) goto Lbc
            goto Lc2
        Lbc:
            int r6 = r3.intValue()
            if (r1 == r6) goto Lc4
        Lc2:
            r4 = 4
            goto Lda
        Lc4:
            if (r0 != 0) goto Lc7
            goto Lda
        Lc7:
            int r6 = r0.intValue()
            if (r6 == r1) goto Lce
            goto Lda
        Lce:
            if (r3 != 0) goto Ld1
            goto Ld7
        Ld1:
            int r6 = r3.intValue()
            if (r1 == r6) goto Ld9
        Ld7:
            r4 = 3
            goto Lda
        Ld9:
            r4 = 2
        Lda:
            return r4
        Ldb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkg.i(int):int");
    }

    @Override // defpackage.ah9
    public void j() {
        ((k56) this.b).invoke();
    }

    @Override // defpackage.w2e
    public void k(z2e z2eVar) {
        bc7[] bc7VarArr = StickersScreen.v0;
        StickersScreen stickersScreen = (StickersScreen) this.b;
        boolean z = ((xf9) stickersScreen.o0().r().e.a.getValue()).a;
        long j = z2eVar.a;
        if (!z) {
            l6e.c.P1().b(":stickers/preview?sticker_id=" + j, null);
            return;
        }
        dg9 dg9VarR = stickersScreen.o0().r();
        dg9VarR.f.o1(dg9VarR, dg9.g[0], j47.S(dg9VarR.a, ((w9a) dg9VarR.b).a(), vx3.b, new bg9(dg9VarR, j, null)));
    }

    @Override // defpackage.ah9
    public void l() {
        ((k56) this.b).invoke();
    }

    public yld m() {
        yld yldVar = (yld) this.b;
        int i = yldVar.e;
        int[] iArr = yldVar.b;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = yldVar.d;
        iArr[3] = i;
        iArr[4] = i;
        float[] fArr = yldVar.a;
        fArr[0] = 0.0f;
        fArr[1] = 0.25f;
        fArr[2] = 0.5f;
        fArr[3] = 0.75f;
        fArr[4] = 1.0f;
        return yldVar;
    }

    public synchronized void n() {
        l8e l8eVar = (l8e) this.b;
        ReentrantLock reentrantLock = l8eVar.a;
        reentrantLock.lock();
        try {
            l8eVar.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.nr8
    public boolean o(wq8 wq8Var) {
        Window.Callback callback = ((dn) this.b).w0.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, wq8Var);
        return true;
    }

    public void p() {
        long j;
        y14 y14Var = (y14) this.b;
        synchronized (tu0.i) {
            try {
                j = tu0.j ? tu0.k : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        y14Var.L = j;
        y14Var.y(true);
    }

    @Override // defpackage.ah9
    public void q() {
        ((k56) this.b).invoke();
    }

    @Override // defpackage.ah9
    public void r() {
        ((k56) this.b).invoke();
    }

    @Override // defpackage.ah9
    public void s() {
        ((k56) this.b).invoke();
    }

    @Override // defpackage.ah9
    public void t() {
        ((k56) this.b).invoke();
    }

    public void u() {
        int iMin = ((int) (Math.min(1.0f, Math.max(0.0f, 1.0f)) * 255.0f)) << 24;
        yld yldVar = (yld) this.b;
        yldVar.e = iMin | (yldVar.e & 16777215);
    }

    public void v(int i) {
        yld yldVar = (yld) this.b;
        yldVar.e = (i & 16777215) | (yldVar.e & (-16777216));
    }

    public void w(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "Given a negative duration: ").toString());
        }
        ((yld) this.b).o = j;
    }

    public void x(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Given invalid width: ").toString());
        }
        ((yld) this.b).f = i;
    }

    public bkg(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new g8c(foe.h, TimeUnit.MINUTES);
                break;
            case 13:
                this.b = new i56(5, 0, (byte) 0);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                this.b = new CopyOnWriteArraySet();
                break;
            case 25:
                yld yldVar = new yld();
                this.b = yldVar;
                yldVar.l = false;
                break;
        }
    }
}
