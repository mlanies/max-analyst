package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zd9 {
    public final long a;
    public final long b;
    public final qy5 c;
    public final qy5 d;

    public zd9(long j, long j2, qy5 qy5Var, qy5 qy5Var2) {
        this.a = j;
        this.b = j2;
        this.c = qy5Var;
        this.d = qy5Var2;
    }

    public static zd9 a(Context context, long j, String str) {
        long j2;
        qy5 qy5Var;
        qy5 qy5Var2;
        String str2;
        wd9 wd9Var = new wd9(16, mbe.a0);
        yd9 yd9Var = new yd9();
        j94 j94Var = new j94(context);
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri = Uri.parse(str);
        fm9.m(uri, "The uri must be set.");
        try {
            long jG = j94Var.G(new a34(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null));
            fm9.k(jG != 0);
            String str3 = "The uri must be set.";
            sa4 sa4Var = new sa4(j94Var, 0L, jG);
            fm9.j("The MP4 file is invalid", wd9Var.n(sa4Var));
            wd9Var.S(yd9Var);
            lh4 lh4Var = new lh4();
            sa4 sa4Var2 = sa4Var;
            while (!yd9Var.c) {
                int iG = wd9Var.g(sa4Var2, lh4Var);
                if (iG == 1) {
                    j94Var.close();
                    Map mapEmptyMap2 = Collections.emptyMap();
                    Uri uri2 = Uri.parse(str);
                    long j3 = lh4Var.a;
                    str2 = str3;
                    fm9.m(uri2, str2);
                    long jG2 = j94Var.G(new a34(uri2, 0L, 1, null, mapEmptyMap2, j3, -1L, null, 0, null));
                    if (jG2 != -1) {
                        jG2 += lh4Var.a;
                    }
                    sa4Var2 = new sa4(j94Var, lh4Var.a, jG2);
                } else {
                    str2 = str3;
                    if (iG == -1 && !yd9Var.c) {
                        throw new IllegalStateException("The MP4 file is invalid");
                    }
                }
                str3 = str2;
            }
            long j4 = wd9Var.J0;
            int i = yd9Var.a;
            HashMap map = (HashMap) yd9Var.o;
            if (i != -1) {
                xd9 xd9Var = (xd9) map.get(2);
                xd9Var.getClass();
                qy5 qy5Var3 = xd9Var.a;
                qy5Var3.getClass();
                fm9.k(j4 != -9223372036854775807L);
                long j5 = wd9Var.i(yd9Var.a, j4).a.a;
                if (j != -9223372036854775807L) {
                    t1d t1dVarI = wd9Var.i(yd9Var.a, j);
                    long j6 = t1dVarI.a.a;
                    if (j == j6) {
                        qy5Var = qy5Var3;
                        j2 = j6;
                    } else {
                        j6 = t1dVarI.b.a;
                        if (j <= j6) {
                            qy5Var = qy5Var3;
                            j2 = j6;
                        } else {
                            j2 = Long.MIN_VALUE;
                            qy5Var = qy5Var3;
                        }
                    }
                } else {
                    qy5Var = qy5Var3;
                    j2 = -9223372036854775807L;
                }
            } else {
                j2 = -9223372036854775807L;
                qy5Var = null;
            }
            if (yd9Var.b != -1) {
                xd9 xd9Var2 = (xd9) map.get(1);
                xd9Var2.getClass();
                qy5 qy5Var4 = xd9Var2.a;
                qy5Var4.getClass();
                qy5Var2 = qy5Var4;
            } else {
                qy5Var2 = null;
            }
            zd9 zd9Var = new zd9(j4, j2, qy5Var, qy5Var2);
            mr0.i(j94Var);
            return zd9Var;
        } catch (Throwable th) {
            mr0.i(j94Var);
            throw th;
        }
    }
}
