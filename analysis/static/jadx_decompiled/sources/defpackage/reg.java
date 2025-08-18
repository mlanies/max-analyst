package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class reg extends de6 implements noe {
    public static final qz7 v0 = new qz7("ClientTelemetry.API", new ddg(2), new pq9());
    public static final qz7 w0 = new qz7("LocationServices.API", new ddg(4), new pq9());
    public static final qz7 x0 = new qz7("SmsRetriever.API", new ddg(3), new pq9());
    public static int y0 = 1;

    public ukg d(moe moeVar) {
        er0 er0Var = new er0();
        er0Var.b = 0;
        er0Var.e = new pe5[]{dy7.k};
        er0Var.c = false;
        er0Var.d = new ece(moeVar);
        return c(2, er0Var.a());
    }

    public synchronized int e() {
        try {
            if (y0 == 1) {
                Context context = this.a;
                ee6 ee6Var = ee6.d;
                int iB = ee6Var.b(context, 12451000);
                if (iB == 0) {
                    y0 = 4;
                } else if (ee6Var.a(iB, context, null) != null || lu4.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    y0 = 2;
                } else {
                    y0 = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return y0;
    }
}
