package defpackage;

/* loaded from: classes.dex */
public final class mma extends tpa {
    public final Throwable c;

    public mma(Throwable th) {
        this.c = th;
    }

    public final String toString() {
        return "FAILURE (" + this.c.getMessage() + ")";
    }
}
