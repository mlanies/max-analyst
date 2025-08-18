package defpackage;

/* loaded from: classes.dex */
public interface pn7 {
    boolean a();

    default boolean b(long j) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    void c(j4b j4bVar);

    void d(j4b j4bVar);

    default boolean e(long j, boolean z) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    long f();

    void g(j4b j4bVar);

    void h(j4b j4bVar, vj0[] vj0VarArr, n85[] n85VarArr);

    default boolean i(on7 on7Var) {
        return b(on7Var.b);
    }

    n64 j();

    default boolean k(on7 on7Var) {
        return e(on7Var.b, on7Var.d);
    }
}
