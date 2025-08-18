package defpackage;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class dp1 {
    public final String a;
    public final k56 b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final String e;
    public int f;
    public long g;
    public long h;
    public long i;

    public dp1(String str, ie ieVar) {
        this.a = str;
        this.b = ieVar;
        this.e = "CallOpenGL_stat_".concat(str);
    }

    public final void a(a4c a4cVar) {
        AtomicInteger atomicInteger;
        String str;
        long j;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime - this.g;
        if (j2 > 0) {
            boolean zBooleanValue = ((Boolean) this.b.invoke()).booleanValue();
            AtomicInteger atomicInteger2 = this.c;
            if (zBooleanValue && atomicInteger2.get() == 0) {
                return;
            }
            float nanos = (TimeUnit.SECONDS.toNanos(1L) * this.f) / j2;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long millis = timeUnit.toMillis(j2);
            int i = atomicInteger2.get();
            AtomicInteger atomicInteger3 = this.d;
            int i2 = atomicInteger3.get();
            int i3 = this.f;
            String str2 = decimalFormat.format(nanos);
            long j3 = this.h;
            int i4 = this.f;
            String str3 = "-";
            if (i4 <= 0) {
                atomicInteger = atomicInteger2;
                str = "-";
            } else {
                atomicInteger = atomicInteger2;
                str = timeUnit.toMicros(j3 / i4) + " us";
            }
            long j4 = this.i;
            int i5 = this.f;
            if (i5 <= 0) {
                j = jNanoTime;
            } else {
                j = jNanoTime;
                str3 = timeUnit.toMicros(j4 / i5) + " us";
            }
            a4cVar.log(this.e, this.a + " -> Duration: " + millis + " ms. received: " + i + ", dropped: " + i2 + ", rendered: " + i3 + ", fps: " + str2 + ",avg render time: " + str + ", avg swapBuffer time: " + str3 + ".");
            this.g = j;
            this.f = 0;
            this.h = 0L;
            this.i = 0L;
            atomicInteger.set(0);
            atomicInteger3.set(0);
        }
    }
}
