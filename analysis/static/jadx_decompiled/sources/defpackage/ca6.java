package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ca6 implements Runnable {
    public static final ThreadLocal X = new ThreadLocal();
    public static final fs4 Y = new fs4(26);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList o;

    public static dec c(RecyclerView recyclerView, int i, long j) {
        int iD = recyclerView.t0.D();
        for (int i2 = 0; i2 < iD; i2++) {
            dec decVarU = RecyclerView.U(recyclerView.t0.C(i2));
            if (decVarU.c == i && !decVarU.n()) {
                return null;
            }
        }
        vdc vdcVar = recyclerView.c;
        try {
            recyclerView.e0();
            dec decVarJ = vdcVar.j(i, j);
            if (decVarJ != null) {
                if (!decVarJ.m() || decVarJ.n()) {
                    vdcVar.a(decVarJ, false);
                } else {
                    vdcVar.g(decVarJ.a);
                }
            }
            recyclerView.f0(false);
            return decVarJ;
        } catch (Throwable th) {
            recyclerView.f0(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.G0) {
            if (RecyclerView.L1 && !this.a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b23 b23Var = recyclerView.r1;
        b23Var.a = i;
        b23Var.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r16) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca6.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.a;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }
}
