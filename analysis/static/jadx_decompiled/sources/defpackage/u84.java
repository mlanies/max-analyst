package defpackage;

/* loaded from: classes.dex */
public abstract class u84 extends ei0 {
    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        ta5.m("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
