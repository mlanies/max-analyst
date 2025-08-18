package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y53 extends j1e {
    public static int L(List list) {
        return list.size() - 1;
    }

    public static List M(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : nz4.a;
    }

    public static ArrayList N(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new gs(objArr, true));
    }

    public static final List O(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : nz4.a;
    }

    public static final void P(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(wg0.h("fromIndex (", i2, ") is greater than toIndex (", i3, ")."));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(wg0.g(i2, "fromIndex (", ") is less than zero."));
        }
        if (i3 > i) {
            throw new IndexOutOfBoundsException(wg0.h("toIndex (", i3, ") is greater than size (", i, ")."));
        }
    }

    public static void Q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void R() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
