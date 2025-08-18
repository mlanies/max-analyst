package defpackage;

/* loaded from: classes.dex */
public final class ocg {
    public static final khe c = new khe(new bse(27));
    public final String a = ocg.class.getName();
    public final Throwable b;

    public ocg() {
        if (ncg.a.get() != null) {
            throw new ClassCastException();
        }
        try {
            System.loadLibrary("gleff");
            th = null;
        } catch (Throwable th) {
            th = th;
            hm9.p(this.a, "failed to load gl-effects library with system loader", th);
        }
        this.b = th;
    }
}
