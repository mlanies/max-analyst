package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class kx7 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MainScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx7(MainScreen mainScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = mainScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        kx7 kx7Var = (kx7) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kx7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kx7 kx7Var = new kx7(this.Y, continuation);
        kx7Var.X = ((Boolean) obj).booleanValue();
        return kx7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean z = this.X;
        huc hucVar = MainScreen.Z;
        u6a u6aVarO0 = this.Y.o0();
        int i = wca.c;
        u6aVarO0.getClass();
        int i2 = 0;
        while (true) {
            if (!(i2 < u6aVarO0.getChildCount())) {
                break;
            }
            int i3 = i2 + 1;
            View childAt = u6aVarO0.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            Object objV = tpa.v(childAt, vxb.tag_tab_item);
            t6a t6aVar = objV instanceof t6a ? (t6a) objV : null;
            if (t6aVar != null && t6aVar.c == i) {
                if ((childAt.getVisibility() == 0) == z) {
                    break;
                }
                childAt.setVisibility(z ? 0 : 8);
                float weightSum = u6aVarO0.getWeightSum();
                float f = 1;
                u6aVarO0.setWeightSum(z ? weightSum + f : weightSum - f);
            }
            i2 = i3;
        }
        return e5f.a;
    }
}
