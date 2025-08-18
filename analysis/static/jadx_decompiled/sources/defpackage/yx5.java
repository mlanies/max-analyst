package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yx5 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ TextView Z;
    public final /* synthetic */ TextView s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx5(TextView textView, TextView textView2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = textView;
        this.s0 = textView2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                yx5 yx5Var = new yx5(this.Z, this.s0, (Continuation) obj3, 0);
                yx5Var.Y = (fka) obj2;
                e5f e5fVar = e5f.a;
                yx5Var.o(e5fVar);
                return e5fVar;
            case 1:
                yx5 yx5Var2 = new yx5(this.Z, this.s0, (Continuation) obj3, 1);
                yx5Var2.Y = (fka) obj2;
                e5f e5fVar2 = e5f.a;
                yx5Var2.o(e5fVar2);
                return e5fVar2;
            default:
                yx5 yx5Var3 = new yx5(this.Z, this.s0, (Continuation) obj3, 2);
                yx5Var3.Y = (fka) obj2;
                e5f e5fVar3 = e5f.a;
                yx5Var3.o(e5fVar3);
                return e5fVar3;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                fka fkaVar = this.Y;
                this.Z.setTextColor(fkaVar.getText().e);
                this.s0.setTextColor(fkaVar.getText().e);
                break;
            case 1:
                od2.a0(obj);
                fka fkaVar2 = this.Y;
                this.Z.setTextColor(fkaVar2.getText().e);
                this.s0.setTextColor(fkaVar2.getText().g);
                break;
            default:
                od2.a0(obj);
                fka fkaVar3 = this.Y;
                this.Z.setTextColor(fkaVar3.getText().e);
                this.s0.setTextColor(fkaVar3.getText().i);
                break;
        }
        return e5f.a;
    }
}
