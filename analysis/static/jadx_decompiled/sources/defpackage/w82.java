package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class w82 implements l3a {
    public Object X;
    public int a;
    public long b;
    public long c;
    public Object o;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wh3 b(defpackage.kdg r4, com.google.android.gms.common.internal.a r5, int r6) {
        /*
            vig r5 = r5.F0
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            wh3 r5 = r5.o
        L9:
            if (r5 == 0) goto L36
            boolean r1 = r5.b
            if (r1 == 0) goto L36
            int[] r1 = r5.o
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.Y
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L36
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L36
            r3 = r1[r2]
            if (r3 != r6) goto L33
        L2b:
            int r4 = r4.n
            int r6 = r5.X
            if (r4 >= r6) goto L32
            return r5
        L32:
            return r0
        L33:
            int r2 = r2 + 1
            goto L24
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w82.b(kdg, com.google.android.gms.common.internal.a, int):wh3");
    }

    public x82 a() {
        if (((List) this.X) == null) {
            this.X = Collections.emptyList();
        }
        return new x82((d92) this.o, this.a, this.b, this.c, (List) this.X);
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int iElapsedRealtime;
        if (((ie6) this.o).a()) {
            xmc xmcVar = (xmc) wmc.h().a;
            if (xmcVar == null || xmcVar.b) {
                kdg kdgVar = (kdg) ((ie6) this.o).u0.get((zk) this.X);
                if (kdgVar != null) {
                    ok okVar = kdgVar.d;
                    if (okVar instanceof a) {
                        a aVar = (a) okVar;
                        long j2 = 0;
                        boolean z = this.b > 0;
                        int i7 = aVar.A0;
                        if (xmcVar != null) {
                            z &= xmcVar.c;
                            int i8 = xmcVar.o;
                            int i9 = xmcVar.X;
                            i = xmcVar.a;
                            if (aVar.F0 != null && !aVar.c()) {
                                wh3 wh3VarB = b(kdgVar, aVar, this.a);
                                if (wh3VarB == null) {
                                    return;
                                }
                                boolean z2 = wh3VarB.c && this.b > 0;
                                i9 = wh3VarB.X;
                                z = z2;
                            }
                            i3 = i8;
                            i2 = i9;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        ie6 ie6Var = (ie6) this.o;
                        if (task.h()) {
                            i5 = 0;
                            i6 = 0;
                        } else {
                            if (((ukg) task).d) {
                                i5 = 100;
                            } else {
                                Exception excE = task.e();
                                if (excE instanceof ApiException) {
                                    Status status = ((ApiException) excE).a;
                                    i4 = status.a;
                                    ph3 ph3Var = status.o;
                                    if (ph3Var != null) {
                                        i6 = ph3Var.b;
                                        i5 = i4;
                                    }
                                } else {
                                    i4 = HttpStatus.SC_SWITCHING_PROTOCOLS;
                                }
                                i5 = i4;
                            }
                            i6 = -1;
                        }
                        if (z) {
                            long j3 = this.b;
                            long j4 = this.c;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j = j3;
                            j2 = jCurrentTimeMillis;
                        } else {
                            j = 0;
                            iElapsedRealtime = -1;
                        }
                        ie6Var.getClass();
                        tdg tdgVar = new tdg(new y99(this.a, i5, i6, j, j2, null, null, i7, iElapsedRealtime), i, i3, i2);
                        fc9 fc9Var = ie6Var.x0;
                        fc9Var.sendMessage(fc9Var.obtainMessage(18, tdgVar));
                    }
                }
            }
        }
    }
}
