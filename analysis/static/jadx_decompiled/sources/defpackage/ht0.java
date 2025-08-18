package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ht0 {
    public final s2b a;
    public final te b;
    public final fm5 c;
    public final gg d;
    public final int e;
    public final ConcurrentHashMap f;
    public volatile int g;
    public volatile boolean h;
    public final fm5 i;
    public int j;
    public Map k;
    public Set l;

    public ht0(s2b s2bVar, te teVar, fm5 fm5Var, gg ggVar, int i) {
        this.a = s2bVar;
        this.b = teVar;
        this.c = fm5Var;
        this.d = ggVar;
        int iD = (d(ggVar) * i) / 1000;
        iD = iD < 1 ? 1 : iD;
        this.e = iD;
        this.f = new ConcurrentHashMap();
        this.i = new fm5(ggVar.x(), 5);
        this.j = -1;
        this.k = oz4.a;
        this.l = wz4.a;
        a(d(ggVar));
        this.g = (int) (iD * 0.5f);
    }

    public static int d(gg ggVar) {
        return (int) ote.c(TimeUnit.SECONDS.toMillis(1L) / (ggVar.G() / ggVar.x()), 1L);
    }

    public final void a(int i) {
        gg ggVar = this.d;
        int iG = ggVar.G();
        int iG0 = ggVar.g0();
        if (iG0 < 1) {
            iG0 = 1;
        }
        int i2 = iG * iG0;
        int iX = ggVar.x();
        int iD = d(ggVar);
        if (i > iD) {
            i = iD;
        }
        fm5 fm5Var = this.c;
        fm5Var.getClass();
        int i3 = i >= 1 ? i : 1;
        int i4 = fm5Var.b;
        if (i3 > i4) {
            i3 = i4;
        }
        float fB = ote.b((i2 / 1000.0f) * i3, 0.0f);
        float f = iX;
        if (fB > f) {
            fB = f;
        }
        float f2 = f / fB;
        int i5 = 0;
        j37 j37VarY = ote.Y(0, iX);
        int iZ = mz7.Z(z53.S(j37VarY, 10));
        if (iZ < 16) {
            iZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
        Iterator it = j37VarY.iterator();
        while (true) {
            i37 i37Var = (i37) it;
            if (!i37Var.c) {
                this.k = linkedHashMap;
                this.l = x53.H0(linkedHashMap.values());
                return;
            } else {
                Object next = i37Var.next();
                int iIntValue = ((Number) next).intValue();
                if (((int) (iIntValue % f2)) == 0) {
                    i5 = iIntValue;
                }
                linkedHashMap.put(next, Integer.valueOf(i5));
            }
        }
    }

    public final xf b(int i) {
        xf xfVar;
        fm5 fm5Var = this.i;
        Iterator it = new j37(0, fm5Var.b, 1).iterator();
        do {
            xfVar = null;
            if (!((i37) it).c) {
                break;
            }
            int iA = fm5Var.a(i - ((i37) it).a());
            gt0 gt0Var = (gt0) this.f.get(Integer.valueOf(iA));
            if (gt0Var != null) {
                if (gt0Var.b || !gt0Var.a.m0()) {
                    gt0Var = null;
                }
                if (gt0Var != null) {
                    xfVar = new xf(iA, (v84) gt0Var.a);
                }
            }
        } while (xfVar == null);
        return xfVar;
    }

    public final y26 c(int i) {
        xf xfVarB = b(i);
        if (xfVarB == null) {
            return new y26(3, null);
        }
        o43 o43VarClone = xfVarB.b.clone();
        this.j = xfVarB.a;
        return new y26(2, o43VarClone);
    }

    public final void e(int i, int i2) {
        if (this.h) {
            return;
        }
        this.h = true;
        ExecutorService executorService = jg.a;
        jg.a.execute(new ft0(this, i, i2, 0));
    }

    public final void f(int i, o43 o43Var) {
        o43 o43Var2;
        o43 o43VarN;
        xf xfVarB = b(i);
        te teVar = this.b;
        if (xfVarB != null && (o43Var2 = xfVarB.b) != null && (o43VarN = o43Var2.n()) != null) {
            try {
                int i2 = xfVarB.a;
                if (i2 < i) {
                    Bitmap bitmap = (Bitmap) o43VarN.e0();
                    if (o43Var.m0() && !o43Var.e0().equals(bitmap)) {
                        Canvas canvas = new Canvas((Bitmap) o43Var.e0());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                    Iterator it = new j37(i2 + 1, i, 1).iterator();
                    while (((i37) it).c) {
                        teVar.d((Bitmap) o43Var.e0(), ((i37) it).a());
                    }
                    v3c.i(o43VarN, null);
                    return;
                }
                v3c.i(o43VarN, null);
            } finally {
            }
        }
        if (o43Var.m0()) {
            new Canvas((Bitmap) o43Var.e0()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Iterator it2 = new j37(0, i, 1).iterator();
        while (((i37) it2).c) {
            teVar.d((Bitmap) o43Var.e0(), ((i37) it2).a());
        }
    }
}
