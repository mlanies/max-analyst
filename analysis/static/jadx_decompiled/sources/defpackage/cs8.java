package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes.dex */
public final class cs8 extends pc3 {
    public static final tb8 r;
    public final ej0[] k;
    public final mue[] l;
    public final ArrayList m;
    public final oq9 n;
    public int o;
    public long[][] p;
    public MergingMediaSource$IllegalMergeException q;

    static {
        za8 za8Var = new za8();
        s74 s74Var = new s74();
        Collections.emptyList();
        ffc ffcVar = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        fm9.k(((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null);
        r = new tb8("MergingMediaSource", za8Var.c(), null, fb8Var.a(), gd8.J, lb8Var);
    }

    public cs8(ej0... ej0VarArr) {
        oq9 oq9Var = new oq9(9);
        this.k = ej0VarArr;
        this.n = oq9Var;
        this.m = new ArrayList(Arrays.asList(ej0VarArr));
        this.o = -1;
        this.l = new mue[ej0VarArr.length];
        this.p = new long[0][];
        new HashMap();
        wmd.i(8, "expectedKeys");
        new mg9().c().g();
    }

    @Override // defpackage.ej0
    public final boolean a(tb8 tb8Var) {
        ej0[] ej0VarArr = this.k;
        return ej0VarArr.length > 0 && ej0VarArr[0].a(tb8Var);
    }

    @Override // defpackage.ej0
    public final zd8 c(yj8 yj8Var, n64 n64Var, long j) {
        ej0[] ej0VarArr = this.k;
        int length = ej0VarArr.length;
        zd8[] zd8VarArr = new zd8[length];
        mue[] mueVarArr = this.l;
        int iB = mueVarArr[0].b(yj8Var.a);
        for (int i = 0; i < length; i++) {
            zd8VarArr[i] = ej0VarArr[i].c(yj8Var.a(mueVarArr[i].m(iB)), n64Var, j - this.p[iB][i]);
        }
        return new as8(this.n, this.p[iB], zd8VarArr);
    }

    @Override // defpackage.ej0
    public final tb8 i() {
        ej0[] ej0VarArr = this.k;
        return ej0VarArr.length > 0 ? ej0VarArr[0].i() : r;
    }

    @Override // defpackage.pc3, defpackage.ej0
    public final void k() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.q;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.k();
    }

    @Override // defpackage.ej0
    public final void m(z0f z0fVar) {
        this.j = z0fVar;
        this.i = oaf.o(null);
        int i = 0;
        while (true) {
            ej0[] ej0VarArr = this.k;
            if (i >= ej0VarArr.length) {
                return;
            }
            y(Integer.valueOf(i), ej0VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.ej0
    public final void o(zd8 zd8Var) {
        as8 as8Var = (as8) zd8Var;
        int i = 0;
        while (true) {
            ej0[] ej0VarArr = this.k;
            if (i >= ej0VarArr.length) {
                return;
            }
            ej0 ej0Var = ej0VarArr[i];
            zd8 zd8Var2 = as8Var.a[i];
            if (zd8Var2 instanceof ute) {
                zd8Var2 = ((ute) zd8Var2).a;
            }
            ej0Var.o(zd8Var2);
            i++;
        }
    }

    @Override // defpackage.pc3, defpackage.ej0
    public final void q() {
        super.q();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.ej0
    public final void t(tb8 tb8Var) {
        this.k[0].t(tb8Var);
    }

    @Override // defpackage.pc3
    public final yj8 u(Object obj, yj8 yj8Var) {
        if (((Integer) obj).intValue() == 0) {
            return yj8Var;
        }
        return null;
    }

    @Override // defpackage.pc3
    public final void x(Object obj, ej0 ej0Var, mue mueVar) {
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            this.o = mueVar.i();
        } else if (mueVar.i() != this.o) {
            this.q = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.p.length;
        mue[] mueVarArr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, mueVarArr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(ej0Var);
        mueVarArr[num.intValue()] = mueVar;
        if (arrayList.isEmpty()) {
            n(mueVarArr[0]);
        }
    }
}
