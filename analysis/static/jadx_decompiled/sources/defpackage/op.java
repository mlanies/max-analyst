package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class op implements cd {
    public static final op a = new op();

    public static void a(String str, long j, kpa[] kpaVarArr) {
        try {
            eze ezeVar = eze.a;
            eze.a(str, TimeUnit.MILLISECONDS.toNanos(j), TimeUnit.NANOSECONDS, (kpa[]) Arrays.copyOf(kpaVarArr, kpaVarArr.length));
        } catch (Throwable unused) {
        }
    }
}
