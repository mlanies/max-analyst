package defpackage;

import com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class bs8 extends oc3 {
    public static final rb8 r;
    public final dj0[] k;
    public final lue[] l;
    public final ArrayList m;
    public final mq9 n;
    public int o;
    public long[][] p;
    public MergingMediaSource$IllegalMergeException q;

    static {
        za8 za8Var = new za8();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        Collections.emptyList();
        ffc ffcVar2 = ffc.X;
        r = new rb8("MergingMediaSource", new cb8(za8Var), null, new gb8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), fd8.S0);
    }

    public bs8(dj0... dj0VarArr) {
        mq9 mq9Var = new mq9(9);
        this.k = dj0VarArr;
        this.n = mq9Var;
        this.m = new ArrayList(Arrays.asList(dj0VarArr));
        this.o = -1;
        this.l = new lue[dj0VarArr.length];
        this.p = new long[0][];
        new HashMap();
        wmd.i(8, "expectedKeys");
        new mg9().c().g();
    }

    @Override // defpackage.dj0
    public final yd8 a(xj8 xj8Var, n64 n64Var, long j) {
        dj0[] dj0VarArr = this.k;
        int length = dj0VarArr.length;
        yd8[] yd8VarArr = new yd8[length];
        lue[] lueVarArr = this.l;
        int iB = lueVarArr[0].b(xj8Var.a);
        for (int i = 0; i < length; i++) {
            yd8VarArr[i] = dj0VarArr[i].a(xj8Var.b(lueVarArr[i].m(iB)), n64Var, j - this.p[iB][i]);
        }
        return new zr8(this.n, this.p[iB], yd8VarArr);
    }

    @Override // defpackage.dj0
    public final rb8 f() {
        dj0[] dj0VarArr = this.k;
        return dj0VarArr.length > 0 ? dj0VarArr[0].f() : r;
    }

    @Override // defpackage.oc3, defpackage.dj0
    public final void g() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.q;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.g();
    }

    @Override // defpackage.dj0
    public final void i(y0f y0fVar) {
        this.j = y0fVar;
        this.i = maf.m(null);
        int i = 0;
        while (true) {
            dj0[] dj0VarArr = this.k;
            if (i >= dj0VarArr.length) {
                return;
            }
            r(Integer.valueOf(i), dj0VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.dj0
    public final void k(yd8 yd8Var) {
        zr8 zr8Var = (zr8) yd8Var;
        int i = 0;
        while (true) {
            dj0[] dj0VarArr = this.k;
            if (i >= dj0VarArr.length) {
                return;
            }
            dj0 dj0Var = dj0VarArr[i];
            yd8 yd8Var2 = zr8Var.a[i];
            if (yd8Var2 instanceof xr8) {
                yd8Var2 = ((xr8) yd8Var2).a;
            }
            dj0Var.k(yd8Var2);
            i++;
        }
    }

    @Override // defpackage.oc3, defpackage.dj0
    public final void m() {
        super.m();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.oc3
    public final xj8 p(Object obj, xj8 xj8Var) {
        if (((Integer) obj).intValue() == 0) {
            return xj8Var;
        }
        return null;
    }

    @Override // defpackage.oc3
    public final void q(Integer num, dj0 dj0Var, lue lueVar) {
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            this.o = lueVar.i();
        } else if (lueVar.i() != this.o) {
            this.q = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.p.length;
        lue[] lueVarArr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, lueVarArr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(dj0Var);
        lueVarArr[num.intValue()] = lueVar;
        if (arrayList.isEmpty()) {
            j(lueVarArr[0]);
        }
    }
}
