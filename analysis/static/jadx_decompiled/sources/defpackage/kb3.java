package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kb3 implements Continuation {
    public static final kb3 b = new kb3(0);
    public static final kb3 c = new kb3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ kb3(int i) {
        this.a = i;
    }

    private final void a(Object obj) {
    }

    @Override // kotlin.coroutines.Continuation
    public final lx3 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete".toString());
            default:
                return hz4.a;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete".toString());
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
