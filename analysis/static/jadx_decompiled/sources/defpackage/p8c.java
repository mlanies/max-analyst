package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface p8c {
    v3d c();

    void cancel(CancellationException cancellationException);

    Object f();

    Object h(Continuation continuation);

    tt0 iterator();
}
