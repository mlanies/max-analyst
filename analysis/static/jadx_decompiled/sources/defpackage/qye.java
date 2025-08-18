package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class qye {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public final wye a;
    public final dp3 b;
    public final gaa c;
    public final djb d;
    public final glc e;
    public volatile boolean f;
    public final je7 g;
    public final AtomicInteger h;

    public qye(wye wyeVar) {
        Object objPutIfAbsent;
        dp3 dp3Var = new dp3();
        this.a = wyeVar;
        this.b = dp3Var;
        this.c = new gaa(18);
        djb djbVar = wyeVar.k;
        this.d = djbVar;
        this.e = new glc(wyeVar, djbVar);
        this.g = tu0.r(2, new ie(10, this));
        ConcurrentHashMap concurrentHashMap = i;
        String str = wyeVar.a;
        Object atomicInteger = concurrentHashMap.get(str);
        if (atomicInteger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger = new AtomicInteger()))) != null) {
            atomicInteger = objPutIfAbsent;
        }
        this.h = (AtomicInteger) atomicInteger;
    }

    public final void a(String str, Throwable th) {
        if (!this.f && ((Boolean) this.g.getValue()).booleanValue()) {
            djb djbVar = this.d;
            djbVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis >= djbVar.h().getLong("system.shutdown.until.ts", Long.MIN_VALUE) && jCurrentTimeMillis >= djbVar.h().getLong("system.CRASH_REPORT.shutdown.until.ts", Long.MIN_VALUE)) {
                int iIncrementAndGet = this.h.incrementAndGet();
                if (iIncrementAndGet <= 8) {
                    ((Executor) this.a.j.a).execute(new yg3(this, th, str));
                } else if (iIncrementAndGet - 8 == 1) {
                    ((Executor) this.a.j.a).execute(new ule(4, this));
                }
            }
        }
    }
}
