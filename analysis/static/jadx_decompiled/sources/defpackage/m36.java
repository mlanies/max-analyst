package defpackage;

/* loaded from: classes.dex */
public final class m36 extends RuntimeException {
    public final int a;
    public final Throwable b;

    public m36(Throwable th, int i) {
        super(th);
        this.a = i;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
