package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import one.me.calls.impl.service.CallServiceImpl;

/* loaded from: classes.dex */
public final class hl1 {
    public static final String a(int i) {
        hl1 hl1Var = CallServiceImpl.s0;
        if (i == -1) {
            return "manifest";
        }
        ArrayList arrayList = new ArrayList();
        Object it = CallServiceImpl.u0.iterator();
        while (((jy7) it).hasNext()) {
            int iIntValue = ((Number) ((hy7) it).next()).intValue();
            if (iIntValue != -1 && (i & iIntValue) != 0) {
                arrayList.add(iIntValue != -1 ? iIntValue != 2 ? iIntValue != 32 ? iIntValue != 64 ? iIntValue != 128 ? wg0.g(iIntValue, "unknown(", ")") : "microphone" : "camera" : "mediaProjection" : "mediaPlayback" : "manifest");
            }
        }
        return x53.n0(arrayList, "|", null, null, null, 62);
    }

    public static void b(Context context, Intent intent) {
        try {
            context.startService(intent);
        } catch (Throwable th) {
            hm9.p("CallServiceTag", "cant start service... handle exception: " + th.getMessage(), th);
            c().post(new c(context, 16, intent));
        }
    }

    public static Handler c() {
        if (CallServiceImpl.t0 == null) {
            CallServiceImpl.t0 = new Handler(Looper.getMainLooper());
        }
        Handler handler = CallServiceImpl.t0;
        if (handler != null) {
            return handler;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static void d(Context context) {
        Intent intent = new Intent(context, (Class<?>) CallServiceImpl.class);
        gl1 gl1Var = gl1.a;
        b(context, intent.putExtra("ACTION", 3));
    }
}
