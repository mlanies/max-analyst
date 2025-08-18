package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mb5 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ AppCompatTextView Y;
    public /* synthetic */ fka Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                mb5 mb5Var = new mb5(this.Y, (Continuation) obj3);
                mb5Var.Z = (fka) obj2;
                e5f e5fVar = e5f.a;
                mb5Var.o(e5fVar);
                return e5fVar;
            case 1:
                mb5 mb5Var2 = new mb5(3, (Continuation) obj3, 1);
                mb5Var2.Y = (AppCompatTextView) obj;
                mb5Var2.Z = (fka) obj2;
                e5f e5fVar2 = e5f.a;
                mb5Var2.o(e5fVar2);
                return e5fVar2;
            case 2:
                mb5 mb5Var3 = new mb5(3, (Continuation) obj3, 2);
                mb5Var3.Y = (AppCompatTextView) obj;
                mb5Var3.Z = (fka) obj2;
                e5f e5fVar3 = e5f.a;
                mb5Var3.o(e5fVar3);
                return e5fVar3;
            case 3:
                mb5 mb5Var4 = new mb5(3, (Continuation) obj3, 3);
                mb5Var4.Y = (AppCompatTextView) obj;
                mb5Var4.Z = (fka) obj2;
                e5f e5fVar4 = e5f.a;
                mb5Var4.o(e5fVar4);
                return e5fVar4;
            case 4:
                mb5 mb5Var5 = new mb5(3, (Continuation) obj3, 4);
                mb5Var5.Y = (AppCompatTextView) obj;
                mb5Var5.Z = (fka) obj2;
                e5f e5fVar5 = e5f.a;
                mb5Var5.o(e5fVar5);
                return e5fVar5;
            default:
                mb5 mb5Var6 = new mb5(3, (Continuation) obj3, 5);
                mb5Var6.Y = (AppCompatTextView) obj;
                mb5Var6.Z = (fka) obj2;
                e5f e5fVar6 = e5f.a;
                mb5Var6.o(e5fVar6);
                return e5fVar6;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().e);
                break;
            case 1:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().b);
                break;
            case 2:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().e);
                break;
            case 3:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().g);
                break;
            case 4:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().h);
                break;
            default:
                od2.a0(obj);
                this.Y.setTextColor(this.Z.getText().j);
                break;
        }
        return e5f.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb5(AppCompatTextView appCompatTextView, Continuation continuation) {
        super(3, continuation);
        this.X = 0;
        this.Y = appCompatTextView;
    }
}
