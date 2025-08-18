package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h25 implements Runnable {
    public static final String c = a14.O("EnqueueRunnable");
    public final g7g a;
    public final imc b;

    public h25(g7g g7gVar, imc imcVar) {
        this.a = g7gVar;
        this.b = imcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c0  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(defpackage.g7g r25) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h25.a(g7g):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        imc imcVar = this.b;
        g7g g7gVar = this.a;
        try {
            g7gVar.getClass();
            s7g s7gVar = g7gVar.l;
            HashSet hashSet = new HashSet();
            hashSet.addAll(g7gVar.p);
            HashSet hashSetN = g7g.N(g7gVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(g7gVar.p);
                    z = false;
                    break;
                } else if (hashSetN.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + g7gVar + ")");
            }
            WorkDatabase workDatabase = s7gVar.c;
            workDatabase.c();
            try {
                boolean zA = a(g7gVar);
                workDatabase.r();
                if (zA) {
                    woa.a(s7gVar.a, RescheduleReceiver.class, true);
                    nuc.a(s7gVar.b, s7gVar.c, s7gVar.e);
                }
                imcVar.V(pma.Q);
            } finally {
                workDatabase.l();
            }
        } catch (Throwable th) {
            imcVar.V(new mma(th));
        }
    }
}
