package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Size;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class qp4 implements s24, Provider {
    public static final pq9 u0 = new pq9();
    public static volatile qp4 v0;
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public Object o;
    public Object s0;
    public Object t0;

    public qp4(Context context) {
        khe kheVar = new khe(new a5(context, 27));
        this.b = new h7b(context, 2);
        this.c = new wva(context);
        this.o = new td(context);
        adb adbVar = new adb();
        adbVar.a = bcd.a0(sba.d, sba.e, sba.f, sba.g);
        adbVar.b = kheVar;
        adbVar.c = tu0.r(3, new zj7(22, adbVar));
        this.X = adbVar;
        this.Y = new pl8(kheVar);
        q0e q0eVarA = r0e.a(i());
        this.Z = q0eVarA;
        this.s0 = r0e.a(0);
        this.t0 = new w7c(q0eVarA);
        this.a = "Chroma";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.qp4 r6, long r7, defpackage.uaa r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.op4
            if (r0 == 0) goto L13
            r0 = r10
            op4 r0 = (defpackage.op4) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            op4 r0 = new op4
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r7 = r0.Y
            uaa r9 = r0.X
            qp4 r6 = r0.o
            defpackage.od2.a0(r10)
        L2c:
            r3 = r7
            r5 = r9
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.od2.a0(r10)
            r0.o = r6
            r0.X = r9
            r0.Y = r7
            r0.t0 = r3
            java.lang.Object r10 = r6.c
            w23 r10 = (defpackage.w23) r10
            java.lang.Object r10 = r10.a(r7, r0)
            if (r10 != r1) goto L2c
            goto L77
        L4d:
            java.lang.Object r6 = r6.Z
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r6 = r6.getValue()
            pk r6 = (defpackage.pk) r6
            k4a r6 = (defpackage.k4a) r6
            boolean r7 = r6.o(r3)
            if (r7 != 0) goto L60
            goto L75
        L60:
            hp4 r7 = new hp4
            m7b r8 = r6.y()
            p7b r8 = (defpackage.p7b) r8
            t33 r8 = r8.a
            long r1 = r8.o()
            r0 = r7
            r0.<init>(r1, r3, r5)
            defpackage.k4a.w(r6, r7)
        L75:
            e5f r1 = defpackage.e5f.a
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp4.a(qp4, long, uaa, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void c(ViewGroup viewGroup, fka fkaVar) {
        l6d.X(l6d.f0(v3c.F(new at(7, viewGroup), new k8(0), new l8(0, fkaVar)), new l8(1, fkaVar)));
    }

    public static /* synthetic */ void d(qp4 qp4Var, ViewGroup viewGroup) {
        fka fkaVarI = qp4Var.i();
        qp4Var.getClass();
        c(viewGroup, fkaVarI);
    }

    public ic0 b() {
        String strG = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            strG = strG.concat(" profile");
        }
        if (((bue) this.c) == null) {
            strG = au1.g(strG, " inputTimebase");
        }
        if (((Size) this.o) == null) {
            strG = au1.g(strG, " resolution");
        }
        if (((Integer) this.X) == null) {
            strG = au1.g(strG, " colorFormat");
        }
        if (((jc0) this.Y) == null) {
            strG = au1.g(strG, " dataSpace");
        }
        if (((Integer) this.Z) == null) {
            strG = au1.g(strG, " frameRate");
        }
        if (((Integer) this.s0) == null) {
            strG = au1.g(strG, " IFrameInterval");
        }
        if (((Integer) this.t0) == null) {
            strG = au1.g(strG, " bitrate");
        }
        if (strG.isEmpty()) {
            return new ic0((String) this.a, ((Integer) this.b).intValue(), (bue) this.c, (Size) this.o, ((Integer) this.X).intValue(), (jc0) this.Y, ((Integer) this.Z).intValue(), ((Integer) this.s0).intValue(), ((Integer) this.t0).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strG));
    }

    public va8 e() {
        return (va8) this.t0;
    }

    @Override // defpackage.s24
    public List f(long j, vk6 vk6Var, int i, int i2, long j2, long j3) {
        if (!(vk6Var instanceof es8)) {
            hm9.p("qp4", "item must be instanceof Message", null);
            return Collections.emptyList();
        }
        es8 es8Var = (es8) vk6Var;
        if (i2 > 0) {
            h(es8Var, i2, 0);
        }
        if (i > 0) {
            h(es8Var, 0, i);
        }
        return ((s24) this.b).f(j, vk6Var, i, i2, j2, j3);
    }

    public sba g() {
        SharedPreferences sharedPreferences = (SharedPreferences) ((je7) ((pl8) this.Y).c).getValue();
        sba sbaVar = sba.d;
        sba sbaVarF = ((adb) this.X).f(sharedPreferences.getString("themename", sbaVar.a));
        return sbaVarF == null ? sbaVar : sbaVarF;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new t8f((Context) ((Provider) this.b).get(), (g99) ((Provider) this.c).get(), (h45) ((Provider) this.a).get(), (z77) ((Provider) this.o).get(), (Executor) ((Provider) this.X).get(), (fhe) ((Provider) this.Y).get(), (d9f) ((Provider) this.Z).get(), (d9f) ((Provider) this.s0).get(), (l33) ((Provider) this.t0).get());
    }

    public void h(es8 es8Var, int i, int i2) {
        zc8 zc8VarD = ((ad8) this.t0).d();
        cu8 cu8Var = es8Var.a;
        long j = cu8Var.c;
        if (zc8VarD.d == cu8Var.t0) {
            if (zc8VarD.c.containsAll((Set) this.s0)) {
                if (i > 0) {
                    long j2 = zc8VarD.b;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                if (i2 > 0) {
                    long j3 = zc8VarD.a;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
            }
        }
        e52 e52Var = (e52) this.Z;
        drd drdVarK = ((k4a) ((pk) this.X)).K(new au(e52Var.b.a, Long.valueOf(j), (Set) this.s0, Integer.valueOf(i), Integer.valueOf(i2)), muc.d);
        fme fmeVar = (fme) this.Y;
        fmeVar.getClass();
        de2 de2Var = (de2) drdVarK.j(new dme(fmeVar, 2, 0)).e();
        List listC = de2Var.c();
        ((au8) this.a).g(e52Var.a, ((p7b) ((m7b) this.o)).a.t(), listC);
        p82 p82Var = (p82) this.c;
        p82Var.getClass();
        cu8 cu8Var2 = es8Var.a;
        long j4 = cu8Var2.b;
        Set set = (Set) this.s0;
        long j5 = cu8Var2.o;
        long j6 = e52Var.a;
        p82Var.h(j6, false, new j82(p82Var, set, de2Var, i2, j4, i, j5, j6));
    }

    public fka i() {
        fka fkaVarA;
        SharedPreferences sharedPreferences = (SharedPreferences) ((je7) ((pl8) this.Y).c).getValue();
        sba sbaVar = sba.d;
        sba sbaVarF = ((adb) this.X).f(sharedPreferences.getString("themename", sbaVar.a));
        return (sbaVarF == null || (fkaVarA = sbaVarF.a(j())) == null) ? sbaVar.a(j()) : fkaVarA;
    }

    public boolean j() {
        gq9 gq9VarY = ((pl8) this.Y).y();
        if (gq9VarY instanceof bq9) {
            if (((int) ((Math.log10(ote.d(((Number) ((q0e) ((td) this.o).c).getValue()).floatValue(), 0.0f, 10000.0f)) / 4) * 100)) > ((bq9) gq9VarY).b) {
                return false;
            }
        } else {
            if (gq9VarY instanceof eq9) {
                return ((eq9) gq9VarY).b();
            }
            if (gq9VarY.equals(fq9.b)) {
                if (((l63) ((q0e) ((wva) this.c).b).getValue()) != l63.b) {
                    return false;
                }
            } else if (!gq9VarY.equals(dq9.b)) {
                if (gq9VarY.equals(cq9.b)) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public void k(gq9 gq9Var) {
        pl8 pl8Var = (pl8) this.Y;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((je7) pl8Var.c).getValue()).edit();
        gq9.a.getClass();
        editorEdit.putString("nightmode", yb9.g(gq9Var));
        editorEdit.apply();
        ((kld) pl8Var.b).g("nightmode");
    }

    public void l(String str, boolean z) {
        adb adbVar;
        sba sbaVarF;
        if (str.equals(i().getName()) || (sbaVarF = (adbVar = (adb) this.X).f(str)) == null) {
            return;
        }
        q0e q0eVar = (q0e) this.Z;
        if (!z) {
            q0eVar.setValue(sbaVarF.a(j()));
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((je7) adbVar.c).getValue();
        String str2 = sbaVarF.a;
        concurrentHashMap.put(str2, sbaVarF);
        Set set = (Set) adbVar.a;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (tpa.f(((sba) it.next()).a, str2)) {
                    pl8 pl8Var = (pl8) this.Y;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) ((je7) pl8Var.c).getValue()).edit();
                    editorEdit.putString("themename", str2);
                    editorEdit.apply();
                    ((kld) pl8Var.b).g("themename");
                    q0eVar.setValue(sbaVarF.a(j()));
                    return;
                }
            }
        }
        ((SharedPreferences) ((je7) adbVar.b).getValue()).edit();
        throw new jr9("An operation is not implemented: ONEME-18754 Добавить поддержку кастомных тем");
    }
}
