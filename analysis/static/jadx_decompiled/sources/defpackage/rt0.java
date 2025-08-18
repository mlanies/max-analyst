package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* loaded from: classes.dex */
public final /* synthetic */ class rt0 implements c66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rt0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                OnUndeliveredElementKt.callUndeliveredElement((m56) this.b, this.c, (lx3) obj3);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = aj9.h;
                zi9 zi9Var = (zi9) this.c;
                Object obj4 = zi9Var.b;
                aj9 aj9Var = (aj9) this.b;
                atomicReferenceFieldUpdater.set(aj9Var, obj4);
                aj9Var.e(zi9Var.b);
                break;
        }
        return e5f.a;
    }
}
