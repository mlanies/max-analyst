package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a3 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ View Y;
    public /* synthetic */ fka Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        View view = (View) obj;
        fka fkaVar = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                a3 a3Var = new a3(3, continuation, 0);
                a3Var.Y = view;
                a3Var.Z = fkaVar;
                e5f e5fVar = e5f.a;
                a3Var.o(e5fVar);
                return e5fVar;
            case 1:
                a3 a3Var2 = new a3(3, continuation, 1);
                a3Var2.Y = view;
                a3Var2.Z = fkaVar;
                e5f e5fVar2 = e5f.a;
                a3Var2.o(e5fVar2);
                return e5fVar2;
            default:
                a3 a3Var3 = new a3(3, continuation, 2);
                a3Var3.Y = view;
                a3Var3.Z = fkaVar;
                e5f e5fVar3 = e5f.a;
                a3Var3.o(e5fVar3);
                return e5fVar3;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.i().b.b);
                break;
            case 1:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.i().b.c);
                break;
            default:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().k);
                break;
        }
        return e5f.a;
    }
}
