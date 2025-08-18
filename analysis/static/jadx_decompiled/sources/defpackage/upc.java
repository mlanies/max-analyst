package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class upc extends d0 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upc(lx3 lx3Var, AtomicReference atomicReference, int i) {
        super(lx3Var, false, true);
        this.a = i;
        this.b = atomicReference;
    }

    @Override // defpackage.d0
    public final void onCancelled(Throwable th, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                try {
                    if (((ra3) ((va3) this.b)).a(th)) {
                    }
                } catch (Throwable th2) {
                    j47.e(th, th2);
                }
                f46.S(getContext(), th);
                break;
            default:
                try {
                    if (((nqd) ((sqd) this.b)).d(th)) {
                    }
                } catch (Throwable th3) {
                    j47.e(th, th3);
                }
                f46.S(getContext(), th);
                break;
        }
    }

    @Override // defpackage.d0
    public final void onCompleted(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                try {
                    ((ra3) ((va3) this.b)).b();
                    break;
                } catch (Throwable th) {
                    f46.S(getContext(), th);
                }
            default:
                try {
                    ((nqd) ((sqd) this.b)).a(obj);
                    break;
                } catch (Throwable th2) {
                    f46.S(getContext(), th2);
                    return;
                }
        }
    }
}
