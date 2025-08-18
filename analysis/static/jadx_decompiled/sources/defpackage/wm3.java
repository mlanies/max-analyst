package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public class wm3 implements Serializable {
    public final List X;
    public final long Y;
    public final long Z;
    public final long a;
    public final long b;
    public final String c;
    public final String o;
    public final pq3 s0;
    public final int t0;
    public final List u0;
    public final String v0;
    public final String w0;
    public final String x0;
    public final jc7 y0;
    public final int[] z0;

    public wm3(long j, long j2, String str, String str2, List list, long j3, long j4, pq3 pq3Var, int i, List list2, String str3, String str4, String str5, jc7 jc7Var, int[] iArr) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.o = str2;
        ArrayList arrayList = new ArrayList(list);
        arrayList.sort(Comparator.comparing(new gl3(1)));
        this.X = Collections.unmodifiableList(arrayList);
        this.Y = j3;
        this.Z = j4;
        this.s0 = pq3Var;
        this.t0 = i == 0 ? 1 : i;
        this.u0 = list2;
        this.v0 = str3;
        this.w0 = str4;
        this.x0 = str5;
        this.y0 = jc7Var;
        this.z0 = iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d A[PHI: r32
      0x012d: PHI (r32v6 int) = (r32v2 int), (r32v3 int), (r32v4 int), (r32v7 int) binds: [B:93:0x0151, B:89:0x0144, B:85:0x0137, B:82:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wm3 e(defpackage.gy8 r33) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm3.e(gy8):wm3");
    }

    public final String a() {
        List list = this.X;
        if (list.isEmpty()) {
            return null;
        }
        return ((op3) list.get(0)).a();
    }

    public final String b() {
        List list = this.X;
        if (list.isEmpty()) {
            return null;
        }
        return ((op3) list.get(0)).a;
    }

    public final String c() {
        List list = this.X;
        if (list.isEmpty()) {
            return null;
        }
        return ((op3) list.get(0)).c;
    }

    public final String d(kk0 kk0Var) {
        String str = this.c;
        if (oag.t(str)) {
            return null;
        }
        return ju0.t(str, kk0Var, jk0.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.s0);
        sb.append(", options=");
        return au1.i(sb, this.u0, "}");
    }
}
