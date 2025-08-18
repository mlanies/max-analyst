package defpackage;

/* loaded from: classes.dex */
public interface v1f {
    void a(w1f w1fVar);

    void b();

    void c(w1f w1fVar);

    default void d(w1f w1fVar) {
        a(w1fVar);
    }

    default void e(w1f w1fVar) {
        c(w1fVar);
    }

    void f();

    void g(w1f w1fVar);
}
