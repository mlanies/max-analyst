package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class o23 implements y3b, b66 {
    public static final fs4 Y = new fs4(17);
    public Object X;
    public final Object a;
    public final Object b;
    public Object c;
    public Object o;

    public o23(m56 m56Var, lf0 lf0Var, a66 a66Var, ztc ztcVar, m56 m56Var2) {
        this.a = m56Var;
        this.b = lf0Var;
        this.c = a66Var;
        this.o = ztcVar;
        this.X = m56Var2;
    }

    public static o23 f(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        o23 o23Var = new o23(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) o23Var.o)) {
            try {
                ((ArrayDeque) o23Var.o).clear();
                String string = ((SharedPreferences) o23Var.a).getString((String) o23Var.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) o23Var.c)) {
                    String[] strArrSplit = string.split((String) o23Var.c, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) o23Var.o).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return o23Var;
    }

    public static void g(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    public static int h(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    @Override // defpackage.y3b
    public void a() {
        ((y3b) this.c).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // defpackage.b66
    /* renamed from: apply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo131apply(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o23.mo131apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.y3b
    public void b() {
        ((y3b) this.c).b();
    }

    @Override // defpackage.y3b
    public void c(d3b d3bVar) {
        ((y3b) this.c).c(d3bVar);
    }

    @Override // defpackage.y3b
    public c64 d(Long l, boolean z) {
        return ((y3b) this.c).d(l, z);
    }

    public void e(ax1 ax1Var, ax1 ax1Var2, iee ieeVar, iee ieeVar2, Map.Entry entry) {
        iee ieeVar3 = (iee) entry.getValue();
        yb0 yb0Var = new yb0(ieeVar.g.a, ((da0) entry.getKey()).a.d, ieeVar.c ? ax1Var : null, ((da0) entry.getKey()).a.f, ((da0) entry.getKey()).a.g);
        yb0 yb0Var2 = new yb0(ieeVar2.g.a, ((da0) entry.getKey()).b.d, ieeVar2.c ? ax1Var2 : null, ((da0) entry.getKey()).b.f, ((da0) entry.getKey()).b.g);
        int i = ((da0) entry.getKey()).a.c;
        ieeVar3.getClass();
        kq0.e();
        ieeVar3.b();
        c54.p("Consumer can only be linked once.", !ieeVar3.j);
        ieeVar3.j = true;
        hee heeVar = ieeVar3.l;
        kq0.a(kq0.K(heeVar.c(), new gee(ieeVar3, heeVar, i, yb0Var, yb0Var2), ju0.D()), new y7g(this, ieeVar3, false, 15), ju0.D());
    }

    public boolean i(float[] fArr) {
        npa[] npaVarArr = (npa[]) this.o;
        if (npaVarArr != null && npaVarArr.length > 0) {
            for (npa npaVar : npaVarArr) {
                npaVar.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public o23(Context context, a4c a4cVar, wte wteVar) {
        this.a = context;
        this.b = a4cVar;
        this.c = wteVar;
        this.X = new an(4, this);
    }

    public o23(je7 je7Var, je7 je7Var2, je7 je7Var3, Context context) {
        this.a = context;
        this.b = o23.class.getName();
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
    }

    public o23(Context context, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = context;
        this.b = new khe(new dr(je7Var2, je7Var3, 6));
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
    }

    public o23(kke kkeVar, t50 t50Var, ch9 ch9Var, sx3 sx3Var, nif nifVar, je7 je7Var, je7 je7Var2, je7 je7Var3, boolean z) {
        mn5 mn5Var;
        mn5 mn5Var2;
        e60 e60Var = new e60(kkeVar, t50Var, ch9Var, sx3Var);
        this.a = e60Var;
        mif mifVar = z ? new mif(sx3Var, je7Var, je7Var2, je7Var3, kkeVar, nifVar) : null;
        this.b = mifVar;
        this.c = e60Var;
        mn5 mn5Var3 = lz4.a;
        this.o = od2.X(new zn5(new ap8(new zn5(od2.N(e60Var.Y, (mifVar == null || (mn5Var2 = mifVar.Y) == null) ? mn5Var3 : mn5Var2), new r3b(this, null)), this, 6), new t3b(this, null), 5), sx3Var, wld.a, za9.a);
        if (mifVar != null && (mn5Var = mifVar.Z) != null) {
            mn5Var3 = mn5Var;
        }
        this.X = od2.X(od2.N(e60Var.Z, mn5Var3), sx3Var, wld.b, Float.valueOf(0.0f));
    }

    public o23(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.o = new ArrayDeque();
        this.a = sharedPreferences;
        this.b = "topic_operation_queue";
        this.c = ",";
        this.X = scheduledThreadPoolExecutor;
    }

    public o23(int[] iArr, int i, npa[] npaVarArr) {
        f63 f63Var;
        this.X = new float[3];
        this.o = npaVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int iH = h(Color.blue(i4), 8, 5) | (h(Color.red(i4), 8, 5) << 10) | (h(Color.green(i4), 8, 5) << 5);
            iArr[i3] = iH;
            iArr2[iH] = iArr2[iH] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                int iRgb = Color.rgb(h((i6 >> 10) & 31, 5, 8), h((i6 >> 5) & 31, 5, 8), h(i6 & 31, 5, 8));
                float[] fArr = (float[]) this.X;
                ThreadLocal threadLocal = s63.a;
                s63.a(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), fArr);
                if (i(fArr)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= i) {
            this.c = new ArrayList();
            while (i2 < i5) {
                int i9 = iArr3[i2];
                ((ArrayList) this.c).add(new opa(Color.rgb(h((i9 >> 10) & 31, 5, 8), h((i9 >> 5) & 31, 5, 8), h(i9 & 31, 5, 8)), iArr2[i9]));
                i2++;
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, Y);
        priorityQueue.offer(new f63(this, 0, ((int[]) this.a).length - 1));
        while (priorityQueue.size() < i && (f63Var = (f63) priorityQueue.poll()) != null) {
            int i10 = f63Var.b;
            int iMin = f63Var.a;
            if ((i10 + 1) - iMin <= 1) {
                break;
            }
            if ((i10 + 1) - iMin > 1) {
                int i11 = f63Var.e - f63Var.d;
                int i12 = f63Var.g - f63Var.f;
                int i13 = f63Var.i - f63Var.h;
                int i14 = (i11 < i12 || i11 < i13) ? (i12 < i11 || i12 < i13) ? -1 : -2 : -3;
                o23 o23Var = f63Var.j;
                int[] iArr4 = (int[]) o23Var.a;
                g(i14, iMin, i10, iArr4);
                Arrays.sort(iArr4, iMin, f63Var.b + 1);
                g(i14, iMin, f63Var.b, iArr4);
                int i15 = f63Var.c / 2;
                int i16 = i2;
                int i17 = iMin;
                while (true) {
                    int i18 = f63Var.b;
                    if (i17 <= i18) {
                        i16 += ((int[]) o23Var.b)[iArr4[i17]];
                        if (i16 >= i15) {
                            iMin = Math.min(i18 - 1, i17);
                            break;
                        }
                        i17++;
                    }
                }
                f63 f63Var2 = new f63(o23Var, iMin + 1, f63Var.b);
                f63Var.b = iMin;
                f63Var.a();
                priorityQueue.offer(f63Var2);
                priorityQueue.offer(f63Var);
                i2 = 0;
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            f63 f63Var3 = (f63) it.next();
            o23 o23Var2 = f63Var3.j;
            int[] iArr5 = (int[]) o23Var2.a;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = f63Var3.a; i23 <= f63Var3.b; i23++) {
                int i24 = iArr5[i23];
                int i25 = ((int[]) o23Var2.b)[i24];
                i20 += i25;
                i19 = (((i24 >> 10) & 31) * i25) + i19;
                i21 = (((i24 >> 5) & 31) * i25) + i21;
                i22 += i25 * (i24 & 31);
            }
            float f = i20;
            opa opaVar = new opa(Color.rgb(h(Math.round(i19 / f), 5, 8), h(Math.round(i21 / f), 5, 8), h(Math.round(i22 / f), 5, 8)), i20);
            if (!i(opaVar.b())) {
                arrayList.add(opaVar);
            }
        }
        this.c = arrayList;
    }

    public o23(ax1 ax1Var, ax1 ax1Var2, lee leeVar) {
        this.b = ax1Var;
        this.c = ax1Var2;
        this.a = leeVar;
    }
}
