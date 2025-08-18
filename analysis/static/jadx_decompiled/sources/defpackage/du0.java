package defpackage;

import bolts.Task;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class du0 {
    public final lg5 a;
    public final y7g b;
    public final sh0 c;
    public final Executor d;
    public final Executor e;
    public final pq9 f;
    public final rxd g;

    public du0(lg5 lg5Var, y7g y7gVar, sh0 sh0Var, Executor executor, Executor executor2, pq9 pq9Var) {
        this.a = lg5Var;
        this.b = y7gVar;
        this.c = sh0Var;
        this.d = executor;
        this.e = executor2;
        this.f = pq9Var;
        rxd rxdVar = new rxd(0);
        rxdVar.b = new HashMap();
        this.g = rxdVar;
    }

    public final void a() {
        this.g.U();
        try {
            Task.call(new l5(1, this), this.e);
        } catch (Exception e) {
            ta5.l(e, "Failed to schedule disk-cache clear", new Object[0]);
            Task.forError(e);
        }
    }

    public final Task b(tpd tpdVar, AtomicBoolean atomicBoolean) {
        f46.I();
        g05 g05VarW = this.g.W(tpdVar);
        if (g05VarW == null) {
            return c(tpdVar, atomicBoolean);
        }
        ta5.d(du0.class, tpdVar.a, "Found image for %s in staging area");
        this.f.getClass();
        return Task.forResult(g05VarW);
    }

    public final Task c(tpd tpdVar, AtomicBoolean atomicBoolean) {
        try {
            return Task.call(new cu0(atomicBoolean, this, tpdVar, 0), this.d);
        } catch (Exception e) {
            ta5.l(e, "Failed to schedule disk-cache read for %s", tpdVar.a);
            return Task.forError(e);
        }
    }

    public final void d(ww0 ww0Var, g05 g05Var) {
        f46.I();
        Executor executor = this.e;
        if (!g05.m0(g05Var)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        rxd rxdVar = this.g;
        rxdVar.c0(ww0Var, g05Var);
        g05 g05VarA = g05.a(g05Var);
        try {
            executor.execute(new f5(this, ww0Var, g05VarA, 5));
        } catch (Exception e) {
            ta5.l(e, "Failed to schedule disk-cache write for %s", ww0Var.c());
            rxdVar.d0(ww0Var, g05Var);
            g05.d(g05VarA);
        }
    }

    public final qq8 e(tpd tpdVar) throws IOException {
        String str = tpdVar.a;
        pq9 pq9Var = this.f;
        try {
            ta5.d(du0.class, str, "Disk cache read for %s");
            kg5 kg5VarC = ((el4) this.a).c(tpdVar);
            if (kg5VarC == null) {
                ta5.d(du0.class, str, "Disk cache miss for %s");
                pq9Var.getClass();
                return null;
            }
            ta5.d(du0.class, str, "Found entry in disk cache for %s");
            pq9Var.getClass();
            FileInputStream fileInputStream = new FileInputStream(kg5VarC.a);
            try {
                y7g y7gVar = this.b;
                int length = (int) kg5VarC.a.length();
                y7gVar.getClass();
                rq8 rq8Var = new rq8((pq8) y7gVar.b, length);
                try {
                    ((sh0) y7gVar.c).i(fileInputStream, rq8Var);
                    qq8 qq8VarN = rq8Var.n();
                    fileInputStream.close();
                    ta5.d(du0.class, str, "Successful read from disk cache for %s");
                    return qq8VarN;
                } finally {
                    rq8Var.close();
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            ta5.l(e, "Exception reading from cache for %s", str);
            pq9Var.getClass();
            throw e;
        }
    }

    public final void f(ww0 ww0Var, g05 g05Var) {
        ta5.d(du0.class, ww0Var.c(), "About to write to disk-cache for key %s");
        try {
            ((el4) this.a).e(ww0Var, new f9(g05Var, 4, this));
            this.f.getClass();
            ta5.d(du0.class, ww0Var.c(), "Successful disk-cache write for key %s");
        } catch (IOException e) {
            ta5.l(e, "Failed to write to disk-cache for key %s", ww0Var.c());
        }
    }
}
