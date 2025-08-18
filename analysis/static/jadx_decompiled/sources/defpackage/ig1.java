package defpackage;

/* loaded from: classes.dex */
public interface ig1 {
    default boolean a() {
        return s().a;
    }

    boolean b();

    boolean e();

    boolean f();

    boolean g();

    gg1 getId();

    boolean h();

    boolean i();

    boolean isConnected();

    default boolean isScreenCaptureEnabled() {
        return p().a;
    }

    boolean k();

    default boolean l() {
        return a() || isScreenCaptureEnabled();
    }

    default boolean m() {
        return i() || e();
    }

    boolean n();

    boolean o();

    llf p();

    int r();

    llf s();

    boolean t();
}
