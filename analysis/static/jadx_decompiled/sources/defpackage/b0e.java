package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b0e implements m1e {
    public final vk8 a;
    public final a4c b;
    public final boolean c;
    public jw4 d;
    public double e;
    public final aw7 f = new aw7();
    public BigInteger g;
    public BigInteger h;
    public final sy4 i;
    public final CopyOnWriteArrayList j;

    public b0e(vk8 vk8Var, a4c a4cVar, boolean z) {
        this.a = vk8Var;
        this.b = a4cVar;
        this.c = z;
        BigInteger bigInteger = BigInteger.ZERO;
        this.g = bigInteger;
        this.h = bigInteger;
        this.i = new sy4(29);
        this.j = new CopyOnWriteArrayList();
        vk8Var.c(this, 5L, TimeUnit.SECONDS);
    }

    @Override // defpackage.m1e
    public final void a(c4c c4cVar) {
        BigInteger bigInteger;
        String str;
        Double dD0;
        double d = 0.0d;
        if (this.i.Q(c4cVar.c)) {
            this.d = null;
            this.e = 0.0d;
            BigInteger bigInteger2 = BigInteger.ZERO;
            this.g = bigInteger2;
            this.h = bigInteger2;
            aw7 aw7Var = this.f;
            aw7Var.a = 0L;
            aw7Var.b = 0L;
        }
        cz1 cz1VarC = c4cVar.c();
        if (cz1VarC != null && (str = cz1VarC.h) != null && (dD0 = cae.d0(str)) != null) {
            double dDoubleValue = dD0.doubleValue();
            jw4 jw4Var = this.d;
            if (jw4Var != null) {
                jw4Var.a(dDoubleValue);
            } else {
                this.d = new jw4(dDoubleValue);
            }
        }
        List<jxd> list = c4cVar.c;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        for (jxd jxdVar : list) {
            if (jxdVar.b == 2 && jxdVar.a == 2) {
                arrayList.add((ixd) jxdVar);
            }
        }
        ixd ixdVar = (ixd) x53.i0(arrayList);
        if (ixdVar != null) {
            BigInteger bigInteger3 = ixdVar.h;
            a4c a4cVar = this.b;
            if (bigInteger3 == null || (bigInteger = ixdVar.i) == null) {
                this.e = 0.0d;
                a4cVar.log("MediaAdaptation", "No packets were sent yet. Reset lost to 0");
            } else {
                if (this.c) {
                    long jLongValue = bigInteger.longValue();
                    long jLongValue2 = bigInteger3.longValue();
                    aw7 aw7Var2 = this.f;
                    this.e = aw7Var2.a(jLongValue, jLongValue2);
                    long j = aw7Var2.d;
                    long j2 = aw7Var2.c;
                    StringBuilder sb = new StringBuilder("Sent stats: sent=");
                    sb.append(j);
                    sb.append(" (total=");
                    sb.append(bigInteger3);
                    au1.q(j2, "), lost=", " (total=", sb);
                    sb.append(bigInteger);
                    sb.append(")");
                    a4cVar.log("MediaAdaptation", sb.toString());
                    a4cVar.log("MediaAdaptation", "Lost packets fraction updated to " + this.e);
                } else {
                    if (bigInteger3.compareTo(this.g) < 0) {
                        this.g = bigInteger3;
                    }
                    if (bigInteger.compareTo(this.h) < 0) {
                        this.h = bigInteger;
                    }
                    BigInteger bigIntegerSubtract = bigInteger.subtract(this.h);
                    BigInteger bigIntegerSubtract2 = bigInteger3.subtract(this.g);
                    a4cVar.log("MediaAdaptation", "Sent stats: sent=" + bigIntegerSubtract2 + " (total=" + bigInteger3 + "), lost=" + bigIntegerSubtract + " (total=" + bigInteger + ")");
                    BigInteger bigInteger4 = BigInteger.ZERO;
                    double dDoubleValue2 = (bigIntegerSubtract2.compareTo(bigInteger4) <= 0 || bigIntegerSubtract.compareTo(bigInteger4) <= 0) ? 0.0d : bigIntegerSubtract.doubleValue() / bigIntegerSubtract2.doubleValue();
                    this.e = dDoubleValue2;
                    a4cVar.log("MediaAdaptation", "Lost packets fraction updated to " + dDoubleValue2);
                    this.g = bigInteger3;
                    this.h = bigInteger;
                }
                d = 0.0d;
            }
        }
        if (this.j.isEmpty()) {
            this.b.log("MediaAdaptation", "Ignore network state update because there are no listeners");
            return;
        }
        jw4 jw4Var2 = this.d;
        if (jw4Var2 != null) {
            d = jw4Var2.b;
        }
        s38 s38Var = new s38(d, this.e);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            u38 u38Var = (u38) it.next();
            r38 r38Var = u38Var.i;
            p38 p38Var = r38Var.a;
            double d2 = p38Var.a;
            double d3 = s38Var.a;
            vte vteVar = u38Var.c;
            a4c a4cVar2 = u38Var.d;
            double d4 = s38Var.b;
            if ((d3 > d2 || d4 < p38Var.b) && ((d3 <= d2 || d4 < p38Var.c) && d3 < p38Var.d)) {
                q38 q38Var = r38Var.b;
                if ((d3 >= q38Var.a || d4 > q38Var.b) && (d3 >= q38Var.c || d4 > q38Var.d)) {
                    a4cVar2.log("MediaAdaptation", "Ignore inbound state update " + s38Var);
                } else {
                    a4cVar2.log("MediaAdaptation", "Good network detected. Current condition is " + zr6.s(u38Var.k) + ", state is " + s38Var);
                    ((wte) vteVar).getClass();
                    if (SystemClock.elapsedRealtime() - u38Var.f > r38Var.b.e && u38Var.k != 1) {
                        u38Var.c(1, s38Var);
                    }
                }
            } else {
                a4cVar2.log("MediaAdaptation", "Bad network detected. Current condition is " + zr6.s(u38Var.k) + ", state is " + s38Var);
                p38 p38Var2 = r38Var.a;
                int i = 3;
                if (d3 < p38Var2.d) {
                    int i2 = u38Var.k;
                    i = (i2 != 3 || d3 < p38Var2.e) ? 2 : i2;
                }
                ((wte) vteVar).getClass();
                u38Var.f = SystemClock.elapsedRealtime();
                if (u38Var.k != i) {
                    u38Var.c(i, s38Var);
                }
            }
        }
    }
}
