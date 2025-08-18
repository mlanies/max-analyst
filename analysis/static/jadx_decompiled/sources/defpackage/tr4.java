package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public interface tr4 {
    public static final pr4 a = new pr4();

    fr4 a(lr4 lr4Var, qy5 qy5Var);

    default rr4 b(lr4 lr4Var, qy5 qy5Var) {
        return rr4.q;
    }

    void c(Looper looper, j4b j4bVar);

    int d(qy5 qy5Var);

    default void prepare() {
    }

    default void release() {
    }
}
