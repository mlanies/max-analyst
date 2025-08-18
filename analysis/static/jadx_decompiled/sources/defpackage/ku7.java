package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class ku7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;

    public ku7(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10, je7 je7Var11, je7 je7Var12, je7 je7Var13, je7 je7Var14, je7 je7Var15, je7 je7Var16, je7 je7Var17, je7 je7Var18, je7 je7Var19, je7 je7Var20, je7 je7Var21, je7 je7Var22, je7 je7Var23) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
        this.g = je7Var7;
        this.h = je7Var8;
        this.i = je7Var9;
        this.j = je7Var10;
        this.k = je7Var11;
        this.l = je7Var12;
        this.m = je7Var13;
        this.n = je7Var14;
        this.o = je7Var15;
        this.p = je7Var16;
        this.q = je7Var17;
        this.r = je7Var18;
        this.s = je7Var19;
        this.t = je7Var20;
        this.u = je7Var21;
        this.v = je7Var22;
        this.w = je7Var23;
    }

    public final void a(boolean z) {
        kj6 kj6Var;
        OneMeRoomDatabase oneMeRoomDatabase;
        ilc ilcVar;
        zkc zkcVar;
        q36 q36VarF;
        Object njcVar;
        int i = 21;
        int i2 = 1;
        int i3 = 0;
        int i4 = 2;
        hm9.n(ku7.class.getName(), "process: start");
        tle tleVar = (tle) ((mle) this.j.getValue());
        tleVar.getClass();
        String str = tle.B0;
        hm9.n(str, "restartSynchronous");
        if (z) {
            ((ExecutorService) tleVar.y0.getValue()).shutdownNow();
        } else {
            ju7 ju7Var = new ju7(((p7b) ((m7b) tleVar.Y.getValue())).a.o(), ((xie) ((ti4) ((ri4) tleVar.Z.getValue())).i.getValue()).d());
            tleVar.b(ju7Var, ju7Var, false);
            ((ExecutorService) tleVar.y0.getValue()).shutdown();
            if (tleVar.b != null) {
                try {
                    tleVar.b.await(5L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    hm9.l(str, "syncLogoutLatch timeout", e);
                }
            }
        }
        tleVar.y0 = new khe(new rzd(8, tleVar));
        if (z) {
            ((yle) tleVar.x0.getValue()).i();
        } else {
            ((yle) tleVar.x0.getValue()).Y.getAndUpdate(new oe2(12));
        }
        hm9.n(str, "restartSynchronous finished");
        p7b p7bVar = (p7b) ((m7b) this.a.getValue());
        p7bVar.a.c();
        p7bVar.b.c();
        p7bVar.c.c();
        p7bVar.d.c();
        p7bVar.e.c();
        el3 el3Var = (el3) this.b.getValue();
        el3Var.b();
        el3Var.a.clear();
        el3Var.b.clear();
        el3Var.c.clear();
        ((u7b) this.c.getValue()).o.clear();
        p82 p82Var = (p82) this.d.getValue();
        p82Var.e();
        p82Var.f0("clear", new s72(p82Var, i2));
        p7c p7cVar = (p7c) this.e.getValue();
        p7cVar.getClass();
        ConcurrentHashMap concurrentHashMap = p7cVar.i;
        ArrayList arrayList = new ArrayList(concurrentHashMap.values());
        concurrentHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cqc.b((zl4) it.next());
        }
        t6b t6bVar = (t6b) this.f.getValue();
        if (t6bVar != null) {
            t6bVar.a();
        }
        o2e o2eVar = (o2e) this.g.getValue();
        o2eVar.getClass();
        hm9.n("o2e", "Clear");
        o2eVar.a.clear();
        o2eVar.b.clear();
        ((p7b) o2eVar.d).a.l("user.stickersLastSync", 0L);
        x9c x9cVar = (x9c) o2eVar.j.get();
        x9cVar.getClass();
        hm9.n("x9c", "Clear");
        x9cVar.f.d();
        nd7.U(new qa3(x9cVar.b().b(), 2, new p4c(11)).l(), ft.e, new m2e(9), new fa4(10));
        synchronized (o2eVar) {
            ((kk5) ((zi5) o2eVar.e.get())).p().delete();
        }
        cqc.b(o2eVar.k);
        Continuation continuation = null;
        cqc.b(null);
        o2eVar.l.e(Collections.emptyList());
        dq0 dq0Var = (dq0) this.m.getValue();
        if (dq0Var != null) {
            cqc.a(new e5(i4, dq0Var), (ztc) cqc.a.b, null, new un0(i2), null);
        }
        jy8 jy8Var = (jy8) this.n.getValue();
        jy8Var.getClass();
        hm9.n("jy8", "clear: ");
        try {
            Iterator it2 = ((List) ((py8) jy8Var.a.getValue()).a().c(nz4.a)).iterator();
            while (it2.hasNext()) {
                ((dg5) jy8Var.c.getValue()).a(((iy8) it2.next()).a.a);
            }
        } catch (Throwable th) {
            hm9.p("jy8", "clear failure!", th);
        }
        try {
            new qa3(((py8) jy8Var.a.getValue()).b(), 2, new hj8(18)).a();
            hm9.n("jy8", "clear: cleared message upload repository");
        } catch (Exception e2) {
            hm9.p("jy8", "clear: failed to clear message upload repository", e2);
        }
        mp4 mp4Var = (mp4) this.o.getValue();
        if (mp4Var != null) {
            String str2 = mp4.g;
            hm9.n(str2, "clear: ");
            try {
                bc7 bc7Var = mp4.f[2];
                njcVar = (List) new o28(new e0a(new q28(new o28(((up4) mp4Var.d.get()).a(), 2, huc.Z), crd.Z, 0), b46.t0, 3).v(), 2, xxc.X).b();
            } catch (Throwable th2) {
                njcVar = new njc(th2);
            }
            Object obj = nz4.a;
            if (njcVar instanceof njc) {
                njcVar = obj;
            }
            List list = (List) njcVar;
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    long j = ((lp4) it3.next()).a.a;
                    hm9.n(str2, "cancel: chatId = " + j);
                    bc7 bc7Var2 = mp4.f[1];
                    ((dg5) mp4Var.c.get()).b(j);
                }
            }
            try {
                bc7 bc7Var3 = mp4.f[2];
                new qa3(((up4) mp4Var.d.get()).a(), 2, hx9.Z).a();
                hm9.n(str2, "clear: cleared draft upload repository");
            } catch (Throwable th3) {
                hm9.p(str2, "clear: failed to clear draft upload repository", th3);
            }
        }
        c7f c7fVar = (c7f) this.p.getValue();
        synchronized (c7fVar) {
            hm9.n("c7f", "clear: ");
            c7fVar.i.d();
            c7fVar.h.clear();
            qy9 qy9VarL = c7fVar.a.clear().l();
            kj6Var = ft.e;
            nd7.U(qy9VarL, kj6Var, new n2f(4), new fa4(12));
        }
        wef wefVar = (wef) this.q.getValue();
        synchronized (wefVar) {
            hm9.n("wef", "clear: ");
            wefVar.h.d();
            wefVar.i.clear();
            nd7.U(new qa3(wefVar.b.a(), 2, new n2f(19)).l(), kj6Var, new n2f(16), new fa4(13));
        }
        cea ceaVar = (cea) this.h.getValue();
        o44 o44VarB = ceaVar.b();
        o44VarB.getClass();
        hm9.n(o44.k, "cancelAll");
        o44VarB.c(new g44(o44VarB, continuation, i3));
        ((bea) ceaVar.a.getValue()).a(2);
        ((bea) ceaVar.a.getValue()).a(6);
        ((vr7) ceaVar.b.getValue()).getClass();
        k24 k24Var = (k24) ((c34) this.i.getValue());
        pfa pfaVar = k24Var.a;
        try {
            hm9.n("k24", "deleteAllExceptStats start");
            ((OneMeRoomDatabase) pfaVar.m()).c();
            t19 t19VarD = k24Var.c.d();
            ilc ilcVar2 = t19VarD.a;
            ilcVar2.b();
            p19 p19Var = t19VarD.q;
            q36 q36VarF2 = p19Var.f();
            try {
                ilcVar2.c();
                try {
                    q36VarF2.n();
                    ilcVar2.r();
                    p19Var.t(q36VarF2);
                    k24Var.b.b();
                    ir3 ir3VarH = k24Var.d.h();
                    ilc ilcVar3 = ir3VarH.a;
                    ilcVar3.c();
                    try {
                        ir3.a(ir3VarH);
                        ilcVar3.r();
                        ilcVar3.l();
                        k24Var.e.a();
                        hoe hoeVarB = k24Var.f.b();
                        ilcVar = hoeVarB.a;
                        ilcVar.b();
                        zkcVar = hoeVarB.h;
                        q36VarF = zkcVar.f();
                        try {
                            ilcVar.c();
                        } catch (Throwable th4) {
                            zkcVar.t(q36VarF);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        ilcVar3.l();
                        throw th5;
                    }
                } finally {
                    ilcVar2.l();
                }
            } catch (Throwable th6) {
                p19Var.t(q36VarF2);
                throw th6;
            }
        } catch (Throwable th7) {
            try {
                hm9.p("k24", "During deleting got exception", th7);
                oneMeRoomDatabase = (OneMeRoomDatabase) pfaVar.m();
            } catch (Throwable th8) {
                ((OneMeRoomDatabase) pfaVar.m()).l();
                hm9.n("k24", "deleteAllExceptStats end");
                throw th8;
            }
        }
        try {
            q36VarF.n();
            ilcVar.r();
            zkcVar.t(q36VarF);
            n4e n4eVar = (n4e) ((khe) k24Var.h.c).getValue();
            ilc ilcVar4 = n4eVar.a;
            ilcVar4.b();
            zkc zkcVar2 = n4eVar.c;
            q36 q36VarF3 = zkcVar2.f();
            try {
                ilcVar4.c();
                try {
                    q36VarF3.n();
                    ilcVar4.r();
                    zkcVar2.t(q36VarF3);
                    k24Var.u.d();
                    try {
                        k24Var.j.clear().a();
                    } catch (Throwable unused) {
                    }
                    try {
                        new qa3(k24Var.p.a.n().h(new m2e(i)), 2, new m2e(17)).a();
                    } catch (Throwable unused2) {
                    }
                    ((OneMeRoomDatabase) pfaVar.m()).H().a();
                    ((OneMeRoomDatabase) pfaVar.m()).r();
                    oneMeRoomDatabase = (OneMeRoomDatabase) pfaVar.m();
                    oneMeRoomDatabase.l();
                    hm9.n("k24", "deleteAllExceptStats end");
                    ((ri4) this.k.getValue()).getClass();
                    eca ecaVar = (eca) this.l.getValue();
                    if (ecaVar != null) {
                        hm9.n("OneMeInitialDataStorage", "reset");
                        na9 na9Var = (na9) ecaVar.b.getValue();
                        ((AtomicReference) na9Var.c).set(nz4.a);
                        try {
                            zy zyVarB = na9Var.b();
                            if (zyVarB.c.delete() && zyVarB.d.delete()) {
                                zyVarB.e.delete();
                            }
                        } catch (Throwable unused3) {
                        }
                        ya9 ya9Var = (ya9) ecaVar.c.getValue();
                        ((AtomicReference) ya9Var.c).set(nz4.a);
                        try {
                            zy zyVarB2 = ya9Var.b();
                            if (zyVarB2.c.delete() && zyVarB2.d.delete()) {
                                zyVarB2.e.delete();
                            }
                        } catch (Throwable unused4) {
                        }
                    }
                    ConcurrentHashMap concurrentHashMap2 = ((cde) this.s.getValue()).a;
                    Iterator it4 = concurrentHashMap2.values().iterator();
                    while (it4.hasNext()) {
                        ((bde) it4.next()).clear();
                    }
                    concurrentHashMap2.clear();
                    ((dz) this.t.getValue()).a.clear();
                    md5 md5Var = (md5) this.u.getValue();
                    md5Var.getClass();
                    hm9.n("md5", "clear: ");
                    hd5 hd5Var = (hd5) md5Var.g.get();
                    hd5Var.getClass();
                    hm9.n("hd5", "cancelRequests: ");
                    hd5Var.f.clear();
                    hd5Var.g.d();
                    md5Var.h.d();
                    nd7.U(new qa3(((hc5) md5Var.a.get()).a(), 2, new ta4(21)).l(), ft.e, new nc5(22), new fa4(3));
                    adb adbVar = ((blb) this.w.getValue()).a;
                    ilc ilcVar5 = (ilc) adbVar.a;
                    ilcVar5.b();
                    p19 p19Var2 = (p19) adbVar.c;
                    q36 q36VarF4 = p19Var2.f();
                    try {
                        ilcVar5.c();
                        try {
                            q36VarF4.n();
                            ilcVar5.r();
                            p19Var2.t(q36VarF4);
                            for (qu7 qu7Var : (List) this.v.getValue()) {
                                try {
                                    qu7Var.a();
                                } catch (Throwable th9) {
                                    hm9.p(ku7.class.getName(), "notifyListeners: listener " + qu7Var + " failed!", th9);
                                }
                            }
                            k24 k24Var2 = (k24) ((c34) this.i.getValue());
                            k24Var2.getClass();
                            try {
                                k24Var2.a.close();
                            } catch (Throwable th10) {
                                hm9.p("k24", "Got error during closing database", th10);
                            }
                            hm9.n(ku7.class.getName(), "process: done");
                        } finally {
                            ilcVar5.l();
                        }
                    } catch (Throwable th11) {
                        p19Var2.t(q36VarF4);
                        throw th11;
                    }
                } finally {
                    ilcVar4.l();
                }
            } catch (Throwable th12) {
                zkcVar2.t(q36VarF3);
                throw th12;
            }
        } finally {
            ilcVar.l();
        }
    }
}
