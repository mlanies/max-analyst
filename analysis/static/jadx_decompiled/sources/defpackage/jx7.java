package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class jx7 extends ffe implements a66 {
    public final /* synthetic */ MainScreen X;
    public final /* synthetic */ ix7 Y;
    public final /* synthetic */ qp4 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx7(MainScreen mainScreen, ix7 ix7Var, qp4 qp4Var, Continuation continuation) {
        super(2, continuation);
        this.X = mainScreen;
        this.Y = ix7Var;
        this.Z = qp4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jx7 jx7Var = (jx7) n((fka) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jx7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jx7(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        qp4 qp4Var;
        od2.a0(obj);
        Iterator it = this.X.c.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            qp4Var = this.Z;
            if (!zHasNext) {
                break;
            }
            ViewGroup viewGroup = (ViewGroup) ((Map.Entry) it.next()).getValue();
            if (!viewGroup.isAttachedToWindow()) {
                qp4.d(qp4Var, viewGroup);
            }
        }
        ix7 ix7Var = this.Y;
        if (!ix7Var.isAttachedToWindow()) {
            qp4.d(qp4Var, ix7Var);
        }
        return e5f.a;
    }
}
