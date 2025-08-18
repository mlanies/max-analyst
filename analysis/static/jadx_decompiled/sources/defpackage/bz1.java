package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bz1 extends lb3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(bz1.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public bz1(Continuation continuation, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
