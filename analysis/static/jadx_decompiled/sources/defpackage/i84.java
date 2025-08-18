package defpackage;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class i84 implements hg0, z0f {
    public static final ffc n = zw6.p(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ffc o = zw6.p(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ffc p = zw6.p(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ffc q = zw6.p(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ffc r = zw6.p(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ffc s = zw6.p(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static i84 t;
    public final cx6 a;
    public final re6 b = new re6(4);
    public final she c;
    public final boolean d;
    public final btd e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;

    public i84(Context context, HashMap map, int i, she sheVar, boolean z) {
        this.a = cx6.b(map);
        this.e = new btd(i, 1);
        this.c = sheVar;
        this.d = z;
        if (context == null) {
            this.m = 0;
            this.k = b(0);
            return;
        }
        ho9 ho9VarH = ho9.h(context);
        int i2 = ho9VarH.i();
        this.m = i2;
        this.k = b(i2);
        g84 g84Var = new g84(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ho9VarH.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(g84Var));
        ((Handler) ho9VarH.b).post(new do9(ho9VarH, 1, g84Var));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i84.a(java.lang.String):int[]");
    }

    public final long b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        cx6 cx6Var = this.a;
        Long l = (Long) cx6Var.get(numValueOf);
        if (l == null) {
            l = (Long) cx6Var.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void c(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.l) {
            return;
        }
        this.l = j2;
        Iterator it = ((CopyOnWriteArrayList) this.b.b).iterator();
        while (it.hasNext()) {
            fg0 fg0Var = (fg0) it.next();
            if (!fg0Var.c) {
                fg0Var.a.post(new t60(i, 3, j, j2, fg0Var));
            }
        }
    }
}
