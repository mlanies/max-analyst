package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class v8g implements Runnable {
    public static final String D0 = a14.O("WorkerWrapper");
    public volatile boolean C0;
    public final h8g X;
    public gm7 Y;
    public final wne Z;
    public final Context a;
    public final String b;
    public final List c;
    public final glc o;
    public final me3 t0;
    public final cy5 u0;
    public final WorkDatabase v0;
    public final i8g w0;
    public final ph4 x0;
    public final List y0;
    public String z0;
    public fm7 s0 = fm7.a();
    public final dcd A0 = new dcd();
    public final dcd B0 = new dcd();

    public v8g(qp4 qp4Var) {
        this.a = (Context) qp4Var.b;
        this.Z = (wne) qp4Var.a;
        this.u0 = (cy5) qp4Var.c;
        h8g h8gVar = (h8g) qp4Var.Y;
        this.X = h8gVar;
        this.b = h8gVar.a;
        this.c = (List) qp4Var.Z;
        this.o = (glc) qp4Var.t0;
        this.Y = null;
        this.t0 = (me3) qp4Var.o;
        WorkDatabase workDatabase = (WorkDatabase) qp4Var.X;
        this.v0 = workDatabase;
        this.w0 = workDatabase.y();
        this.x0 = workDatabase.t();
        this.y0 = (List) qp4Var.s0;
    }

    public final void a(fm7 fm7Var) {
        boolean z = fm7Var instanceof em7;
        h8g h8gVar = this.X;
        String str = D0;
        if (!z) {
            if (fm7Var instanceof dm7) {
                a14.u().x(str, "Worker result RETRY for " + this.z0);
                c();
                return;
            }
            a14.u().x(str, "Worker result FAILURE for " + this.z0);
            if (h8gVar.d()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        a14.u().x(str, "Worker result SUCCESS for " + this.z0);
        if (h8gVar.d()) {
            d();
            return;
        }
        ph4 ph4Var = this.x0;
        String str2 = this.b;
        i8g i8gVar = this.w0;
        WorkDatabase workDatabase = this.v0;
        workDatabase.c();
        try {
            i8gVar.q(m7g.c, str2);
            i8gVar.p(str2, ((em7) this.s0).a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = ph4Var.n(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (i8gVar.j(str3) == m7g.X && ph4Var.q(str3)) {
                    a14.u().x(str, "Setting status to enqueued for " + str3);
                    i8gVar.q(m7g.a, str3);
                    i8gVar.o(jCurrentTimeMillis, str3);
                }
            }
            workDatabase.r();
            workDatabase.l();
            e(false);
        } catch (Throwable th) {
            workDatabase.l();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean zH = h();
        WorkDatabase workDatabase = this.v0;
        String str = this.b;
        if (!zH) {
            workDatabase.c();
            try {
                m7g m7gVarJ = this.w0.j(str);
                workDatabase.x().f(str);
                if (m7gVarJ == null) {
                    e(false);
                } else if (m7gVarJ == m7g.b) {
                    a(this.s0);
                } else if (!m7gVarJ.a()) {
                    c();
                }
                workDatabase.r();
                workDatabase.l();
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((auc) it.next()).d(str);
            }
            nuc.a(this.t0, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.b;
        i8g i8gVar = this.w0;
        WorkDatabase workDatabase = this.v0;
        workDatabase.c();
        try {
            i8gVar.q(m7g.a, str);
            i8gVar.o(System.currentTimeMillis(), str);
            i8gVar.n(-1L, str);
            workDatabase.r();
        } finally {
            workDatabase.l();
            e(true);
        }
    }

    public final void d() {
        String str = this.b;
        i8g i8gVar = this.w0;
        WorkDatabase workDatabase = this.v0;
        workDatabase.c();
        try {
            i8gVar.o(System.currentTimeMillis(), str);
            ilc ilcVar = (ilc) i8gVar.a;
            i8gVar.q(m7g.a, str);
            ilcVar.b();
            ktf ktfVar = (ktf) i8gVar.j;
            q36 q36VarF = ktfVar.f();
            if (str == null) {
                q36VarF.W(1);
            } else {
                q36VarF.f(1, str);
            }
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
                ilcVar.l();
                ktfVar.t(q36VarF);
                ilcVar.b();
                ktfVar = (ktf) i8gVar.f;
                q36VarF = ktfVar.f();
                if (str == null) {
                    q36VarF.W(1);
                } else {
                    q36VarF.f(1, str);
                }
                ilcVar.c();
                try {
                    q36VarF.n();
                    ilcVar.r();
                    ilcVar.l();
                    ktfVar.t(q36VarF);
                    i8gVar.n(-1L, str);
                    workDatabase.r();
                } finally {
                }
            } finally {
            }
        } finally {
            workDatabase.l();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r5) {
        /*
            r4 = this;
            androidx.work.impl.WorkDatabase r0 = r4.v0
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r4.v0     // Catch: java.lang.Throwable -> L42
            i8g r0 = r0.y()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            xlc r1 = defpackage.xlc.a(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L42
            ilc r0 = (defpackage.ilc) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            r3 = 0
            android.database.Cursor r0 = r0.o(r1, r3)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = 1
            goto L32
        L2f:
            r5 = move-exception
            goto L9f
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.n()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            defpackage.woa.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r5 = move-exception
            goto La6
        L44:
            if (r5 == 0) goto L58
            i8g r0 = r4.w0     // Catch: java.lang.Throwable -> L42
            m7g r1 = defpackage.m7g.a     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r4.b     // Catch: java.lang.Throwable -> L42
            r0.q(r1, r2)     // Catch: java.lang.Throwable -> L42
            i8g r0 = r4.w0     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.n(r2, r1)     // Catch: java.lang.Throwable -> L42
        L58:
            h8g r0 = r4.X     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L8b
            gm7 r0 = r4.Y     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L8b
            cy5 r0 = r4.u0     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L42
            y9b r0 = (defpackage.y9b) r0     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.w0     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r0 = r0.Y     // Catch: java.lang.Throwable -> L88
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L8b
            cy5 r0 = r4.u0     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L42
            y9b r0 = (defpackage.y9b) r0     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.w0     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.Y     // Catch: java.lang.Throwable -> L85
            r3.remove(r1)     // Catch: java.lang.Throwable -> L85
            r0.i()     // Catch: java.lang.Throwable -> L85
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L85
            goto L8b
        L85:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L85
            throw r5     // Catch: java.lang.Throwable -> L42
        L88:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            throw r5     // Catch: java.lang.Throwable -> L42
        L8b:
            androidx.work.impl.WorkDatabase r0 = r4.v0     // Catch: java.lang.Throwable -> L42
            r0.r()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r4.v0
            r0.l()
            dcd r4 = r4.A0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.j(r5)
            return
        L9f:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.n()     // Catch: java.lang.Throwable -> L42
            throw r5     // Catch: java.lang.Throwable -> L42
        La6:
            androidx.work.impl.WorkDatabase r4 = r4.v0
            r4.l()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8g.e(boolean):void");
    }

    public final void f() {
        i8g i8gVar = this.w0;
        String str = this.b;
        m7g m7gVarJ = i8gVar.j(str);
        m7g m7gVar = m7g.b;
        String str2 = D0;
        if (m7gVarJ == m7gVar) {
            a14.u().n(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        a14.u().n(str2, "Status for " + str + " is " + m7gVarJ + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.b;
        WorkDatabase workDatabase = this.v0;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                i8g i8gVar = this.w0;
                if (zIsEmpty) {
                    i8gVar.p(str, ((cm7) this.s0).a);
                    workDatabase.r();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (i8gVar.j(str2) != m7g.Y) {
                        i8gVar.q(m7g.o, str2);
                    }
                    linkedList.addAll(this.x0.n(str2));
                }
            }
        } finally {
            workDatabase.l();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.C0) {
            return false;
        }
        a14.u().n(D0, "Work interrupted for " + this.z0);
        if (this.w0.j(this.b) == null) {
            e(false);
        } else {
            e(!r0.a());
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8g.run():void");
    }
}
