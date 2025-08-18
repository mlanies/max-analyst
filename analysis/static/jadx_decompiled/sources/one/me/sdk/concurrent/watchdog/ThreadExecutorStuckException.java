package one.me.sdk.concurrent.watchdog;

import defpackage.c08;
import defpackage.ft4;
import defpackage.jh2;
import defpackage.kt4;
import defpackage.urf;
import defpackage.wg0;
import defpackage.x53;
import defpackage.y53;
import defpackage.z7;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/concurrent/watchdog/ThreadExecutorStuckException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tamtam-concurrent"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ThreadExecutorStuckException extends Exception {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ThreadExecutorStuckException(Iterable iterable) {
        int size;
        Thread thread;
        StackTraceElement[] stackTrace;
        int i = ft4.o;
        long jS = z7.S(System.nanoTime(), kt4.NANOSECONDS);
        List listX0 = x53.x0(iterable, new c08(jS, 2));
        Object next = null;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                i2++;
                if (i2 < 0) {
                    y53.Q();
                    throw null;
                }
            }
            size = i2;
        }
        super(x53.n0(listX0, null, wg0.g(size, "Tasks in queue: ", "\n"), null, new jh2(jS, 7), 29));
        int i3 = ft4.o;
        long jS2 = z7.S(System.nanoTime(), kt4.NANOSECONDS);
        Iterator it2 = iterable.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                ft4 ft4Var = new ft4(((urf) next).b(jS2));
                do {
                    Object next2 = it2.next();
                    ft4 ft4Var2 = new ft4(((urf) next2).b(jS2));
                    if (ft4Var.compareTo(ft4Var2) < 0) {
                        next = next2;
                        ft4Var = ft4Var2;
                    }
                } while (it2.hasNext());
            }
        }
        urf urfVar = (urf) next;
        if (urfVar == null || (thread = urfVar.d) == null || (stackTrace = thread.getStackTrace()) == null) {
            return;
        }
        setStackTrace(stackTrace);
    }
}
