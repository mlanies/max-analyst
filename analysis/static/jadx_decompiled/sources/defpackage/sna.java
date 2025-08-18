package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class sna {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public final rm4 a;

    public sna(rm4 rm4Var) {
        this.a = rm4Var;
    }

    public static void a(long j) {
        ConcurrentHashMap concurrentHashMap = b;
        qna qnaVar = (qna) concurrentHashMap.get(Long.valueOf(j));
        if (qnaVar != null) {
            zl4 zl4Var = qnaVar.b;
            if (zl4Var != null && !zl4Var.h()) {
                zl4Var.g();
            }
            concurrentHashMap.remove(Long.valueOf(j));
        }
        c.remove(Long.valueOf(j));
    }

    public static void b(long j, long j2) {
        qna qnaVar;
        if (j == 0 || (qnaVar = (qna) b.get(Long.valueOf(j))) == null) {
            return;
        }
        Iterator it = qnaVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((pna) it.next()).b == j2) {
                it.remove();
                break;
            }
        }
        if (qnaVar.a.isEmpty()) {
            zl4 zl4Var = qnaVar.b;
            if (zl4Var != null && !zl4Var.h()) {
                zl4Var.g();
            }
            b.remove(Long.valueOf(j));
        }
    }

    public static qna c(long j) {
        ConcurrentHashMap concurrentHashMap = b;
        qna qnaVar = (qna) concurrentHashMap.get(Long.valueOf(j));
        if (qnaVar != null) {
            return qnaVar;
        }
        qna qnaVar2 = new qna();
        concurrentHashMap.put(Long.valueOf(j), qnaVar2);
        return qnaVar2;
    }

    public final void d(long j, b10 b10Var) {
        if (j != 0) {
            long jNanoTime = System.nanoTime();
            ConcurrentHashMap concurrentHashMap = c;
            rna rnaVar = (rna) concurrentHashMap.get(Long.valueOf(j));
            if (rnaVar != null) {
                if (b10Var != rnaVar.b) {
                    concurrentHashMap.remove(Long.valueOf(j));
                } else if (Math.abs(jNanoTime - rnaVar.a) < 5000000000L) {
                    return;
                }
            }
            concurrentHashMap.put(Long.valueOf(j), new rna(jNanoTime, b10Var));
            k4a k4aVar = (k4a) ((pk) this.a.get());
            k4a.v(k4aVar, new wp3(2, ((p7b) k4aVar.y()).a.o(), j, b10Var));
        }
    }

    public final synchronized void e(long j) {
        if (j == 0) {
            return;
        }
        try {
            qna qnaVarC = c(j);
            zl4 zl4Var = qnaVarC.b;
            if (zl4Var == null || zl4Var.h()) {
                qy9 qy9VarI = qy9.k(0L, 6L, TimeUnit.SECONDS, muc.a()).n(muc.b()).i(new ona(this, j), Integer.MAX_VALUE);
                sd7 sd7Var = new sd7(new jj9(24), new ona(this, j), ft.d);
                qy9VarI.a(sd7Var);
                qnaVarC.b = sd7Var;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f(long j, b10 b10Var, long j2) {
        if (j == 0) {
            return;
        }
        if (b10Var != b10.AUDIO && b10Var != b10.VIDEO && b10Var != b10.VIDEO_MSG && b10Var != b10.FILE) {
            qna qnaVar = (qna) b.get(Long.valueOf(j));
            if (qnaVar == null || qnaVar.a.isEmpty() || qnaVar.b == null || qnaVar.b.h()) {
                d(j, b10Var);
                return;
            }
            return;
        }
        LinkedBlockingDeque linkedBlockingDeque = c(j).a;
        Iterator it = linkedBlockingDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                linkedBlockingDeque.push(new pna(j2, b10Var));
                break;
            } else if (((pna) it.next()).b == j2) {
                break;
            }
        }
        e(j);
    }
}
