package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bf4 extends gz7 {
    public static final zma f = zma.a(new v00(18));
    public static final zma g = zma.a(new v00(20));
    public final ob6 d;
    public final AtomicReference e;

    public bf4(Context context, ob6 ob6Var) {
        int i = ne4.Z0;
        ne4 ne4Var = new ne4(new pe4(context));
        this.d = ob6Var;
        this.e = new AtomicReference(ne4Var);
    }

    public static int a(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static int c(oy5 oy5Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(oy5Var.c)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(oy5Var.c);
        if (strF2 == null || strF == null) {
            return (z && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        int i = maf.a;
        return strF2.split("-", 2)[0].equals(strF.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean d(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static void e(SparseArray sparseArray, d0f d0fVar, int i) {
        if (d0fVar == null) {
            return;
        }
        int iG = ha9.g(d0fVar.a.c[0].w0);
        Pair pair = (Pair) sparseArray.get(iG);
        if (pair == null || ((d0f) pair.first).b.isEmpty()) {
            sparseArray.put(iG, Pair.create(d0fVar, Integer.valueOf(i)));
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair g(int i, ez7 ez7Var, int[][][] iArr, ue4 ue4Var, Comparator comparator) {
        RandomAccess randomAccessN;
        boolean z;
        ez7 ez7Var2 = ez7Var;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < ez7Var2.a) {
            if (i == ez7Var2.b[i2]) {
                sze szeVar = ez7Var2.c[i2];
                for (int i3 = 0; i3 < szeVar.a; i3++) {
                    qze qzeVarA = szeVar.a(i3);
                    ffc ffcVarI = ue4Var.i(i2, qzeVarA, iArr[i2][i3]);
                    int i4 = qzeVarA.a;
                    boolean[] zArr = new boolean[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        we4 we4Var = (we4) ffcVarI.get(i5);
                        int iA = we4Var.a();
                        if (!zArr[i5] && iA != 0) {
                            if (iA == 1) {
                                randomAccessN = zw6.n(we4Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(we4Var);
                                for (int i6 = i5 + 1; i6 < i4; i6++) {
                                    we4 we4Var2 = (we4) ffcVarI.get(i6);
                                    if (we4Var2.a() == 2 && we4Var.b(we4Var2)) {
                                        arrayList2.add(we4Var2);
                                        z = true;
                                        zArr[i6] = true;
                                    } else {
                                        z = true;
                                    }
                                }
                                randomAccessN = arrayList2;
                            }
                            arrayList.add(randomAccessN);
                        }
                    }
                }
            }
            i2++;
            ez7Var2 = ez7Var;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((we4) list.get(i7)).c;
        }
        we4 we4Var3 = (we4) list.get(0);
        return Pair.create(new k85(0, we4Var3.b, iArr2), Integer.valueOf(we4Var3.a));
    }

    public final pe4 b() {
        ne4 ne4Var = (ne4) this.e.get();
        ne4Var.getClass();
        return new pe4(ne4Var);
    }

    public final void h(pe4 pe4Var) {
        f85 f85Var;
        ne4 ne4Var = new ne4(pe4Var);
        if (((ne4) this.e.getAndSet(ne4Var)).equals(ne4Var) || (f85Var = this.a) == null) {
            return;
        }
        f85Var.s0.c(10);
    }
}
