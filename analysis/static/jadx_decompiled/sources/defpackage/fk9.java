package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.messages.location.FrgLocationMap;
import ru.ok.messages.location.TamSupportMapFragment;

/* loaded from: classes2.dex */
public final class fk9 extends u2 implements lr7 {
    public final m7b A0;
    public final FrgLocationMap B0;
    public ir7 C0;
    public er7 D0;
    public e08 E0;
    public boolean F0;
    public final xpb G0;
    public final xpb H0;
    public sd7 I0;
    public final iq1 J0;
    public g28 K0;
    public final hc3 X;
    public final nr7 Y;
    public final rke Z;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap o;
    public final cn7 s0;
    public final long t0;
    public final long u0;
    public final String v0;
    public final e08 w0;
    public final el3 x0;
    public final k8g y0;
    public final hle z0;

    public fk9(ir7 ir7Var, ny7 ny7Var, er7 er7Var, boolean z, el9 el9Var, nr7 nr7Var, rke rkeVar, cn7 cn7Var, long j, long j2, String str, e08 e08Var, FrgLocationMap frgLocationMap, el3 el3Var, k8g k8gVar, ri4 ri4Var, hle hleVar, m7b m7bVar) {
        super(0, el9Var);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        this.o = new ConcurrentHashMap();
        hc3 hc3Var = new hc3();
        this.X = hc3Var;
        this.C0 = ir7Var;
        this.D0 = er7Var;
        this.F0 = z;
        this.Y = nr7Var;
        this.Z = rkeVar;
        this.s0 = cn7Var;
        this.t0 = j;
        this.u0 = j2;
        this.v0 = str;
        this.w0 = e08Var;
        this.z0 = hleVar;
        d08 d08Var = new d08(er7.Z);
        d08Var.i = true;
        this.E0 = new e08(d08Var);
        this.B0 = frgLocationMap;
        this.x0 = el3Var;
        this.y0 = k8gVar;
        this.A0 = m7bVar;
        boolean z2 = this.C0.a;
        b2(new fj0(17));
        if (e08Var != null) {
            concurrentHashMap.put(Long.valueOf(e08Var.c), e08Var);
        }
        if (this.C0.d == 3) {
            d08 d08Var2 = new d08(this.D0);
            d08Var2.b = j;
            d08Var2.h = true;
            d08Var2.e = str;
            d08Var2.d = i08.c;
            d08Var2.k = true;
            concurrentHashMap.put(0L, d08Var2.a());
        }
        el9Var.r(this);
        el9Var.L0 = ny7Var;
        TamSupportMapFragment tamSupportMapFragment = el9Var.B0;
        bk4.a(80.0f);
        tamSupportMapFragment.getClass();
        rde rdeVar = new rde(el9Var.Z, el9Var.x0, el9Var);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("getMapAsync must be called on the main thread.");
        }
        moa moaVar = tamSupportMapFragment.l1;
        b9b b9bVar = (b9b) moaVar.a;
        if (b9bVar != null) {
            b9bVar.m(rdeVar);
        } else {
            ((ArrayList) moaVar.s0).add(rdeVar);
        }
        h2(null);
        c2();
        f2();
        xpb xpbVar = new xpb();
        this.H0 = xpbVar;
        jle jleVar = (jle) hleVar;
        r0a r0aVarN = new e0a(new ty9(xpbVar.n(jleVar.a()), new jj9(12), 1), new ck9(this, 0), 3).n(ce.a());
        ck9 ck9Var = new ck9(this, 1);
        jj9 jj9Var = new jj9(6);
        r66 r66Var = ft.d;
        sd7 sd7Var = new sd7(ck9Var, jj9Var, r66Var);
        r0aVarN.a(sd7Var);
        hc3Var.a(sd7Var);
        if (this.C0.c == 1) {
            xpb xpbVar2 = new xpb();
            this.G0 = xpbVar2;
            sd7 sd7Var2 = new sd7(new ck9(this, 2), new jj9(7), r66Var);
            xpbVar2.a(sd7Var2);
            hc3Var.a(sd7Var2);
            xpb xpbVar3 = this.G0;
            Boolean bool = Boolean.TRUE;
            xpbVar3.e(bool);
            cn7Var.getClass();
            hm9.n("fk9", "onLiveLocationUpdate");
            this.G0.e(bool);
        }
        if (z2) {
            ((dn7) cn7Var).getClass();
            drd drdVarI = iqd.g(Boolean.FALSE).m(jleVar.a()).i(ce.a());
            iq1 iq1Var = new iq1(new ck9(this, 8), 2, new jj9(11));
            drdVarI.k(iq1Var);
            this.J0 = iq1Var;
        }
    }

    @Override // defpackage.lr7
    public final void U0() {
    }

    public final void Z1() {
        b2(new cy1(1, this));
        ConcurrentHashMap concurrentHashMap = this.c;
        h2((concurrentHashMap.size() < 1 || !concurrentHashMap.containsKey(0L)) ? null : new ck9(this, 4));
        f2();
    }

    public final void a2(int i) {
        ((p7b) this.A0).c.k(i, "app.location.map.type");
        el9 el9Var = (el9) ((kk9) this.b);
        qy7 qy7Var = el9Var.K0;
        if (qy7Var == null || qy7Var.d.Y() == i) {
            return;
        }
        el9Var.K0.f(i);
    }

    public final void b2(tj3 tj3Var) {
        ir7 ir7Var = this.C0;
        ir7Var.getClass();
        gr7 gr7Var = new gr7();
        gr7Var.a = ir7Var.a;
        gr7Var.b = ir7Var.b;
        gr7Var.c = ir7Var.c;
        gr7Var.d = ir7Var.d;
        gr7Var.e = ir7Var.e;
        gr7Var.f = ir7Var.f;
        gr7Var.g = ir7Var.g;
        gr7Var.h = ir7Var.h;
        gr7Var.i = ir7Var.i;
        gr7Var.j = ir7Var.j;
        gr7Var.k = ir7Var.k;
        gr7Var.l = ir7Var.l;
        gr7Var.m = ir7Var.m;
        gr7Var.n = ir7Var.n;
        gr7Var.o = ir7Var.o;
        gr7Var.p = ir7Var.p;
        gr7Var.q = ir7Var.q;
        gr7Var.r = ir7Var.r;
        tj3Var.accept(gr7Var);
        this.C0 = new ir7(gr7Var);
    }

    public final void c2() {
        ck9 ck9Var = new ck9(this, 7);
        nr7 nr7Var = this.Y;
        nr7Var.getClass();
        String[] strArr = wmd.f;
        Context context = nr7Var.o;
        if (wmd.j(context, strArr)) {
            oe6 oe6Var = (oe6) nr7Var.Z.get();
            fd7 fd7Var = new fd7(ck9Var);
            oe6Var.getClass();
            oe6.a(context, fd7Var);
            return;
        }
        try {
            ck9Var.accept(Boolean.FALSE);
        } catch (Throwable th) {
            hm9.p("nr7", "isServiceAvailable", th);
        }
    }

    public final void d2() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            this.H0.e((e08) it.next());
        }
        if (this.C0.d == 2) {
            d08 d08VarA = this.E0.a();
            d08VarA.i = true;
            e08 e08Var = new e08(d08VarA);
            this.E0 = e08Var;
            this.H0.e(e08Var);
            f2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e2() {
        /*
            Method dump skipped, instructions count: 1832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk9.e2():void");
    }

    public final void f2() {
        ir7 ir7Var;
        el9 el9Var = (el9) ((kk9) this.b);
        e08 e08Var = this.E0;
        il9 il9Var = el9Var.J0;
        if (il9Var == null || (ir7Var = il9Var.w0) == null || ir7Var.d != 2) {
            return;
        }
        boolean z = e08Var.i;
        Context context = (Context) il9Var.b;
        if (z) {
            il9Var.t0.setSubtitle(context.getString(jpc.t0));
            return;
        }
        String str = e08Var.f;
        if (oag.t(str)) {
            il9Var.t0.setSubtitle(context.getString(jpc.g3));
        } else {
            il9Var.t0.setSubtitle(str);
        }
    }

    public final void g2(long j) {
        e08 e08Var;
        cqc.b(this.K0);
        hm9.m("fk9", "Update track for message %d", Long.valueOf(j));
        if (this.C0.d != 1) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        e08 e08Var2 = (e08) concurrentHashMap.get(Long.valueOf(j));
        if (e08Var2 != null && e08Var2.h) {
            List listEmptyList = (List) this.o.get(Long.valueOf(j));
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            ((el9) ((kk9) this.b)).C(listEmptyList, e08Var2.k);
            ir7 ir7Var = this.C0;
            if (ir7Var.o != -1 && (e08Var = (e08) concurrentHashMap.get(Long.valueOf(ir7Var.h))) != null) {
                this.H0.e(e08Var);
            }
            hm9.m("fk9", "Update track for message %d: load track", Long.valueOf(j));
            this.s0.getClass();
            m28 m28Var = m28.a;
            hle hleVar = this.z0;
            hleVar.getClass();
            a38 a38VarF = m28Var.h(((jle) hleVar).a()).f(ce.a());
            g28 g28Var = new g28(new x72(this, j, e08Var2, 9), new c10(j, 25), new mc5(j, 6));
            a38VarF.a(g28Var);
            this.K0 = g28Var;
        }
    }

    public final void h2(ck9 ck9Var) {
        int i;
        el9 el9Var = (el9) ((kk9) this.b);
        ir7 ir7Var = this.C0;
        ir7 ir7Var2 = el9Var.O0;
        el9Var.O0 = ir7Var;
        if (el9Var.v0.p()) {
            e2f e2fVar = new e2f();
            e2fVar.R(new p12());
            e2fVar.I(200L);
            e2fVar.s0 = w1f.o(e2fVar.s0, xxb.layout_contact_location__rv_markers);
            e2fVar.p(xxb.frg_location_map__top_no_permission_panel_anchor);
            if (ir7Var2 == null || (((i = ir7Var2.d) == 1 && ir7Var.d == 3) || (i == 3 && ir7Var.d == 1))) {
                rsd rsdVar = new rsd();
                rsdVar.T0 = rsd.W0;
                eod eodVar = new eod();
                eodVar.a = 3.0f;
                eodVar.b = 80;
                rsdVar.I0 = eodVar;
                e2fVar.R(rsdVar);
            } else {
                e2fVar.R(new wa5());
            }
            if (ck9Var != null) {
                e2fVar.Q(new jj0(0, ck9Var));
            }
            c2f.b((ViewGroup) ((View) el9Var.c));
            c2f.a((ViewGroup) ((View) el9Var.c), e2fVar);
        }
        ir7 ir7Var3 = el9Var.O0;
        int iS = au1.s(ir7Var3.d);
        if (iS == 0) {
            View view = (View) el9Var.J0.c;
            if (view != null) {
                view.setVisibility(8);
            }
            el9Var.D0.setVisibility(8);
        } else if (iS == 1) {
            il9 il9Var = el9Var.J0;
            if (((View) il9Var.c) == null) {
                int i2 = il9.y0;
                ViewStub viewStub = el9Var.I0;
                viewStub.setLayoutResource(i2);
                il9Var.c = viewStub.inflate();
                il9Var.m();
                el9Var.J0.r(el9Var);
            }
            ((View) el9Var.J0.c).setVisibility(0);
            el9Var.J0.A(ir7Var3);
            el9Var.D0.setVisibility(0);
        } else if (iS == 2) {
            il9 il9Var2 = el9Var.J0;
            if (((View) il9Var2.c) == null) {
                int i3 = il9.y0;
                ViewStub viewStub2 = el9Var.I0;
                viewStub2.setLayoutResource(i3);
                il9Var2.c = viewStub2.inflate();
                il9Var2.m();
                el9Var.J0.r(el9Var);
            }
            ((View) el9Var.J0.c).setVisibility(0);
            el9Var.J0.A(ir7Var3);
            el9Var.D0.setVisibility(8);
        }
        boolean z = el9Var.O0.j;
        el9Var.y0.e();
        ir7 ir7Var4 = el9Var.O0;
        boolean z2 = ir7Var4.m;
        if (ir7Var4.f) {
            boolean z3 = ir7Var4.g;
        }
        if (!(!r2.p()) || ck9Var == null) {
            return;
        }
        fk9 fk9Var = ck9Var.b;
        fk9Var.c.remove(0L);
        fk9Var.e2();
    }

    @Override // defpackage.lr7
    public final void p1(er7 er7Var) {
        qy7 qy7Var;
        boolean zA = this.D0.a();
        kk9 kk9Var = (kk9) this.b;
        if (!zA) {
            el9 el9Var = (el9) kk9Var;
            qy7 qy7Var2 = el9Var.K0;
            if (qy7Var2 != null) {
                qy7Var2.g((Context) el9Var.b, true);
            }
            if (this.C0.d != 1 && (qy7Var = el9Var.K0) != null) {
                qy7Var.d(er7Var.a, er7Var.b, Float.valueOf(14.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
        }
        if (this.C0.d != 1 && this.F0 && this.D0.a()) {
            ((el9) kk9Var).B(er7Var.a, er7Var.b, false);
        }
        if (this.C0.d == 3) {
            ConcurrentHashMap concurrentHashMap = this.c;
            e08 e08Var = (e08) concurrentHashMap.get(0L);
            if (e08Var != null) {
                d08 d08VarA = e08Var.a();
                d08VarA.a = er7Var;
                concurrentHashMap.put(Long.valueOf(e08Var.c), new e08(d08VarA));
            } else {
                d08 d08Var = new d08(er7Var);
                d08Var.b = this.t0;
                d08Var.h = true;
                d08Var.e = this.v0;
                d08Var.d = i08.c;
                d08Var.k = true;
                concurrentHashMap.put(0L, d08Var.a());
            }
            e2();
        }
        if (this.C0.d == 2 && this.F0) {
            d08 d08VarA2 = this.E0.a();
            d08VarA2.a = er7Var;
            this.E0 = new e08(d08VarA2);
        }
        er7 er7Var2 = this.D0;
        if (!((nd) this.Z).f(er7Var.a, er7Var.b, er7Var2.a, er7Var2.b)) {
            d2();
        }
        this.D0 = er7Var;
        if (this.E0.a.a()) {
            return;
        }
        double[] dArrD = ((el9) kk9Var).D();
        d08 d08VarA3 = this.E0.a();
        d08VarA3.a = new er7(dArrD[0], dArrD[1]);
        this.E0 = new e08(d08VarA3);
        if (this.C0.d == 2) {
            d2();
        }
    }
}
