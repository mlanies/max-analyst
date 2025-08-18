package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class eze {
    public static final eze a = new eze();
    public static volatile dze b = pq9.w0;

    public static void a(String str, long j, TimeUnit timeUnit, kpa... kpaVarArr) {
        String str2;
        switch (p4f.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                str2 = "ns";
                break;
            case 2:
                str2 = "us";
                break;
            case 3:
                str2 = "ms";
                break;
            case 4:
                str2 = "s";
                break;
            case 5:
                str2 = "min";
                break;
            case 6:
                str2 = "h";
                break;
            case 7:
                str2 = "d";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str3 = str2;
        Map mapA0 = mz7.a0((kpa[]) Arrays.copyOf(kpaVarArr, kpaVarArr.length));
        dze dzeVar = b;
        if (tpa.f(dzeVar, pq9.w0) || tpa.f(dzeVar, oq9.Z)) {
            return;
        }
        hze.a(new ule(6, new ata((SystemClock.elapsedRealtimeNanos() + x6b.a) - x6b.b, str, j, str3, mapA0)));
    }
}
