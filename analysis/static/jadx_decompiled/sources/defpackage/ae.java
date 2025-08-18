package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class ae implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ ae(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return be.a;
            case 1:
                return Collections.emptyList();
            default:
                return Thread.currentThread();
        }
    }
}
