package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class lx7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MainScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx7(MainScreen mainScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = mainScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lx7 lx7Var = (lx7) n((hy3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lx7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lx7 lx7Var = new lx7(this.Y, continuation);
        lx7Var.X = obj;
        return lx7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        hy3 hy3Var = (hy3) this.X;
        huc hucVar = MainScreen.Z;
        u6a u6aVarO0 = this.Y.o0();
        int i = wca.e;
        int i2 = hy3Var.a;
        u6aVarO0.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < u6aVarO0.getChildCount())) {
                return e5f.a;
            }
            int i4 = i3 + 1;
            View childAt = u6aVarO0.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            Object objV = tpa.v(childAt, vxb.tag_tab_item);
            t6a t6aVar = objV instanceof t6a ? (t6a) objV : null;
            if (t6aVar != null && t6aVar.c == i) {
                ((wq0) childAt).setCounter(i2);
            }
            i3 = i4;
        }
    }
}
