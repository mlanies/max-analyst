package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public interface dff {
    boolean A1(int i, int i2);

    Range E1();

    default boolean Q0(int i, int i2) {
        return A1(i, i2) || (h1() && A1(i2, i));
    }

    int a1();

    Range b1();

    boolean h1();

    Range r1(int i);

    Range v1(int i);

    int w1();

    Range x1();
}
