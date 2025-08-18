package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k9b {
    public static final k9b f = new k9b();
    public oq1 b;
    public ay1 d;
    public final Object a = new Object();
    public final x3c c = new x3c();
    public final HashMap e = new HashMap();

    public static final aw1 a(k9b k9bVar, px1 px1Var) {
        k9bVar.getClass();
        Iterator it = px1Var.a.iterator();
        while (it.hasNext()) {
            pa0 pa0Var = sw1.a;
            if (!tpa.f(pa0Var, pa0Var)) {
                synchronized (y85.a) {
                }
            }
        }
        return bw1.a;
    }

    public static final void b(k9b k9bVar, int i) {
        ay1 ay1Var = k9bVar.d;
        if (ay1Var == null) {
            return;
        }
        yg2 yg2Var = ay1Var.f;
        if (yg2Var == null) {
            throw new IllegalStateException("CameraX not initialized yet.");
        }
        l0f l0fVar = (l0f) yg2Var.c;
        if (i != l0fVar.b) {
            Iterator it = ((ArrayList) l0fVar.o).iterator();
            while (it.hasNext()) {
                ux1 ux1Var = (ux1) it.next();
                int i2 = l0fVar.b;
                synchronized (ux1Var.b) {
                    boolean z = true;
                    ux1Var.c = i == 2 ? 2 : 1;
                    boolean z2 = i2 != 2 && i == 2;
                    if (i2 != 2 || i == 2) {
                        z = false;
                    }
                    if (z2 || z) {
                        ux1Var.b();
                    }
                }
            }
        }
        if (l0fVar.b == 2 && i != 2) {
            ((ArrayList) l0fVar.Y).clear();
        }
        l0fVar.b = i;
    }

    public final hg7 c(eh7 eh7Var, px1 px1Var, adb adbVar) {
        int i;
        Trace.beginSection(c37.F("CX:bindToLifecycle-UseCaseGroup"));
        try {
            ay1 ay1Var = this.d;
            if (ay1Var == null) {
                i = 0;
            } else {
                yg2 yg2Var = ay1Var.f;
                if (yg2Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i = ((l0f) yg2Var.c).b;
            }
            if (i == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            b(this, 1);
            uof uofVar = (uof) adbVar.a;
            List list = (List) adbVar.c;
            l9f[] l9fVarArr = (l9f[]) ((List) adbVar.b).toArray(new l9f[0]);
            return d(eh7Var, px1Var, uofVar, list, (l9f[]) Arrays.copyOf(l9fVarArr, l9fVarArr.length));
        } finally {
            Trace.endSection();
        }
    }

    public final hg7 d(eh7 eh7Var, px1 px1Var, uof uofVar, List list, l9f... l9fVarArr) {
        hg7 hg7VarD;
        Collection<hg7> collectionUnmodifiableCollection;
        boolean zContains;
        Trace.beginSection(c37.F("CX:bindToLifecycle-internal"));
        try {
            kq0.e();
            ax1 ax1VarC = px1Var.c(this.d.a.w());
            ax1VarC.o(true);
            fjc fjcVarE = e(px1Var);
            x3c x3cVar = this.c;
            x90 x90VarT = xx1.t(fjcVarE, null);
            synchronized (x3cVar.b) {
                hg7VarD = (hg7) ((HashMap) x3cVar.c).get(new wa0(eh7Var, x90VarT));
            }
            x3c x3cVar2 = this.c;
            synchronized (x3cVar2.b) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(((HashMap) x3cVar2.c).values());
            }
            Iterator it = ys.d0(l9fVarArr).iterator();
            while (it.hasNext()) {
                l9f l9fVar = (l9f) it.next();
                for (hg7 hg7Var : collectionUnmodifiableCollection) {
                    synchronized (hg7Var.a) {
                        zContains = ((ArrayList) hg7Var.c.w()).contains(l9fVar);
                    }
                    if (zContains && !hg7Var.equals(hg7VarD)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{l9fVar}, 1)));
                    }
                }
            }
            if (hg7VarD == null) {
                x3c x3cVar3 = this.c;
                ay1 ay1Var = this.d;
                yg2 yg2Var = ay1Var.f;
                if (yg2Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                l0f l0fVar = (l0f) yg2Var.c;
                y7g y7gVar = ay1Var.g;
                if (y7gVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                ev1 ev1Var = ay1Var.h;
                if (ev1Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                hg7VarD = x3cVar3.d(eh7Var, new xx1(ax1VarC, null, fjcVarE, null, l0fVar, y7gVar, ev1Var));
            }
            hg7 hg7Var2 = hg7VarD;
            if (l9fVarArr.length != 0) {
                x3c x3cVar4 = this.c;
                List listM = y53.M(Arrays.copyOf(l9fVarArr, l9fVarArr.length));
                yg2 yg2Var2 = this.d.f;
                if (yg2Var2 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                x3cVar4.b(hg7Var2, uofVar, list, listM, (l0f) yg2Var2.c);
            }
            return hg7Var2;
        } finally {
            Trace.endSection();
        }
    }

    public final fjc e(px1 px1Var) {
        Object fjcVar;
        Trace.beginSection(c37.F("CX:getCameraInfo"));
        try {
            yw1 yw1VarP = px1Var.c(this.d.a.w()).p();
            aw1 aw1VarA = a(this, px1Var);
            x90 x90Var = new x90(yw1VarP.d(), aw1VarA.a);
            synchronized (this.a) {
                fjcVar = this.e.get(x90Var);
                if (fjcVar == null) {
                    fjcVar = new fjc(yw1VarP, aw1VarA);
                    this.e.put(x90Var, fjcVar);
                }
            }
            return (fjc) fjcVar;
        } finally {
            Trace.endSection();
        }
    }

    public final void f() {
        Trace.beginSection(c37.F("CX:unbindAll"));
        try {
            kq0.e();
            b(this, 0);
            this.c.o();
        } finally {
            Trace.endSection();
        }
    }
}
