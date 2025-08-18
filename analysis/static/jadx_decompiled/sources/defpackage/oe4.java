package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class oe4 extends j0f {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final String z0;
    public final boolean i0;
    public final boolean j0;
    public final boolean k0;
    public final boolean l0;
    public final boolean m0;
    public final boolean n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final SparseArray x0;
    public final SparseBooleanArray y0;

    static {
        new oe4(new me4());
        int i = oaf.a;
        z0 = Integer.toString(1000, 36);
        A0 = Integer.toString(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 36);
        B0 = Integer.toString(1002, 36);
        C0 = Integer.toString(1003, 36);
        D0 = Integer.toString(1004, 36);
        E0 = Integer.toString(1005, 36);
        F0 = Integer.toString(1006, 36);
        G0 = Integer.toString(1007, 36);
        H0 = Integer.toString(1008, 36);
        I0 = Integer.toString(1009, 36);
        J0 = Integer.toString(1010, 36);
        K0 = Integer.toString(1011, 36);
        L0 = Integer.toString(1012, 36);
        M0 = Integer.toString(1013, 36);
        N0 = Integer.toString(1014, 36);
        O0 = Integer.toString(1015, 36);
        P0 = Integer.toString(1016, 36);
        Q0 = Integer.toString(1017, 36);
        R0 = Integer.toString(1018, 36);
    }

    public oe4(me4 me4Var) {
        super(me4Var);
        this.i0 = me4Var.C;
        this.j0 = me4Var.D;
        this.k0 = me4Var.E;
        this.l0 = me4Var.F;
        this.m0 = me4Var.G;
        this.n0 = me4Var.H;
        this.o0 = me4Var.I;
        this.p0 = me4Var.J;
        this.q0 = me4Var.K;
        this.r0 = me4Var.L;
        this.s0 = me4Var.M;
        this.t0 = me4Var.N;
        this.u0 = me4Var.O;
        this.v0 = me4Var.P;
        this.w0 = me4Var.Q;
        this.x0 = me4Var.R;
        this.y0 = me4Var.S;
    }

    @Override // defpackage.j0f
    public final h0f a() {
        return new me4(this);
    }

    @Override // defpackage.j0f
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putBoolean(z0, this.i0);
        bundleC.putBoolean(A0, this.j0);
        bundleC.putBoolean(B0, this.k0);
        bundleC.putBoolean(N0, this.l0);
        bundleC.putBoolean(C0, this.m0);
        bundleC.putBoolean(D0, this.n0);
        bundleC.putBoolean(E0, this.o0);
        bundleC.putBoolean(F0, this.p0);
        bundleC.putBoolean(O0, this.q0);
        bundleC.putBoolean(R0, this.r0);
        bundleC.putBoolean(P0, this.s0);
        bundleC.putBoolean(G0, this.t0);
        bundleC.putBoolean(H0, this.u0);
        bundleC.putBoolean(I0, this.v0);
        bundleC.putBoolean(Q0, this.w0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.x0;
            if (i >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.y0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    iArr[i2] = sparseBooleanArray.keyAt(i2);
                }
                bundleC.putIntArray(M0, iArr);
                return bundleC;
            }
            int iKeyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                au1.r(entry.getValue());
                arrayList2.add((tze) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleC.putIntArray(J0, s5c.c0(arrayList));
            bundleC.putParcelableArrayList(K0, nu0.R(arrayList2, new ta4(2)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                au1.r(sparseArray.valueAt(0));
                throw null;
            }
            bundleC.putSparseParcelableArray(L0, sparseArray3);
            i++;
        }
    }

    @Override // defpackage.j0f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oe4.class != obj.getClass()) {
            return false;
        }
        oe4 oe4Var = (oe4) obj;
        if (super.equals(oe4Var) && this.i0 == oe4Var.i0 && this.j0 == oe4Var.j0 && this.k0 == oe4Var.k0 && this.l0 == oe4Var.l0 && this.m0 == oe4Var.m0 && this.n0 == oe4Var.n0 && this.o0 == oe4Var.o0 && this.p0 == oe4Var.p0 && this.q0 == oe4Var.q0 && this.r0 == oe4Var.r0 && this.s0 == oe4Var.s0 && this.t0 == oe4Var.t0 && this.u0 == oe4Var.u0 && this.v0 == oe4Var.v0 && this.w0 == oe4Var.w0) {
            SparseBooleanArray sparseBooleanArray = this.y0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = oe4Var.y0;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.x0;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = oe4Var.x0;
                        if (sparseArray2.size() == size2) {
                            for (int i2 = 0; i2 < size2; i2++) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (iIndexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            tze tzeVar = (tze) entry.getKey();
                                            if (!map2.containsKey(tzeVar) || !oaf.a(entry.getValue(), map2.get(tzeVar))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    } else {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.j0f
    public final int hashCode() {
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.i0 ? 1 : 0)) * 31) + (this.j0 ? 1 : 0)) * 31) + (this.k0 ? 1 : 0)) * 31) + (this.l0 ? 1 : 0)) * 31) + (this.m0 ? 1 : 0)) * 31) + (this.n0 ? 1 : 0)) * 31) + (this.o0 ? 1 : 0)) * 31) + (this.p0 ? 1 : 0)) * 31) + (this.q0 ? 1 : 0)) * 31) + (this.r0 ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.u0 ? 1 : 0)) * 31) + (this.v0 ? 1 : 0)) * 31) + (this.w0 ? 1 : 0);
    }
}
