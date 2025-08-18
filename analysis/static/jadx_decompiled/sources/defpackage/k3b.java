package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k3b {
    public static final k3b b;
    public static final String c;
    public final tm5 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        fm9.k(!false);
        b = new k3b(new tm5(sparseBooleanArray));
        int i = oaf.a;
        c = Integer.toString(0, 36);
    }

    public k3b(tm5 tm5Var) {
        this.a = tm5Var;
    }

    public static k3b c(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int iIntValue = integerArrayList.get(i).intValue();
            fm9.k(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        fm9.k(!false);
        return new k3b(new tm5(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final boolean b(int... iArr) {
        return this.a.a(iArr);
    }

    public final int d(int i) {
        return this.a.b(i);
    }

    public final int e() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k3b) {
            return this.a.equals(((k3b) obj).a);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            tm5 tm5Var = this.a;
            if (i >= tm5Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(tm5Var.b(i)));
            i++;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
