package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rze {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final qy5[] d;
    public int e;

    static {
        int i = oaf.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public rze(String str, qy5... qy5VarArr) {
        fm9.f(qy5VarArr.length > 0);
        this.b = str;
        this.d = qy5VarArr;
        this.a = qy5VarArr.length;
        int iG = ia9.g(qy5VarArr[0].n);
        this.c = iG == -1 ? ia9.g(qy5VarArr[0].m) : iG;
        String str2 = qy5VarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = qy5VarArr[0].f | 16384;
        for (int i2 = 1; i2 < qy5VarArr.length; i2++) {
            String str3 = qy5VarArr[i2].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                e("languages", i2, qy5VarArr[0].d, qy5VarArr[i2].d);
                return;
            } else {
                if (i != (qy5VarArr[i2].f | 16384)) {
                    e("role flags", i2, Integer.toBinaryString(qy5VarArr[0].f), Integer.toBinaryString(qy5VarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static rze b(Bundle bundle) {
        ffc ffcVarI;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            ls5 ls5Var = zw6.b;
            ffcVarI = ffc.X;
        } else {
            ffcVarI = nu0.i(new hme(14), parcelableArrayList);
        }
        return new rze(bundle.getString(g, ""), (qy5[]) ffcVarI.toArray(new qy5[0]));
    }

    public static void e(String str, int i, String str2, String str3) {
        StringBuilder sbK = k7d.k("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbK.append(str3);
        sbK.append("' (track ");
        sbK.append(i);
        sbK.append(")");
        z04.v("", new IllegalStateException(sbK.toString()));
    }

    public final rze a(String str) {
        return new rze(str, this.d);
    }

    public final qy5 c() {
        return this.d[0];
    }

    public final int d(qy5 qy5Var) {
        int i = 0;
        while (true) {
            qy5[] qy5VarArr = this.d;
            if (i >= qy5VarArr.length) {
                return -1;
            }
            if (qy5Var == qy5VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rze.class != obj.getClass()) {
            return false;
        }
        rze rzeVar = (rze) obj;
        return this.b.equals(rzeVar.b) && Arrays.equals(this.d, rzeVar.d);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        qy5[] qy5VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(qy5VarArr.length);
        for (qy5 qy5Var : qy5VarArr) {
            arrayList.add(qy5Var.d(true));
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + rh4.d(527, 31, this.b);
        }
        return this.e;
    }
}
