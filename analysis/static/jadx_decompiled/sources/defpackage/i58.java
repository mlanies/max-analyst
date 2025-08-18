package defpackage;

import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class i58 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ bua Y;
    public /* synthetic */ bua Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i58(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bua buaVar = (bua) obj;
        bua buaVar2 = (bua) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                i58 i58Var = new i58(3, continuation, 0);
                i58Var.Y = buaVar;
                i58Var.Z = buaVar2;
                return i58Var.o(e5f.a);
            case 1:
                i58 i58Var2 = new i58(3, continuation, 1);
                i58Var2.Y = buaVar;
                i58Var2.Z = buaVar2;
                return i58Var2.o(e5f.a);
            default:
                i58 i58Var3 = new i58(3, continuation, 2);
                i58Var3.Y = buaVar;
                i58Var3.Z = buaVar2;
                return i58Var3.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                bua buaVar = this.Y;
                bua buaVar2 = this.Z;
                int iOrdinal = buaVar.ordinal();
                v8b v8bVar = v8b.a;
                if (iOrdinal == 0) {
                    return v8bVar;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                int iOrdinal2 = buaVar2.ordinal();
                if (iOrdinal2 == 0) {
                    return v8bVar;
                }
                if (iOrdinal2 == 1) {
                    return v8b.b;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                od2.a0(obj);
                return Boolean.valueOf(Build.VERSION.SDK_INT >= 34 && this.Y == bua.b && this.Z == bua.a);
            default:
                od2.a0(obj);
                bua buaVar3 = this.Y;
                bua buaVar4 = this.Z;
                bua buaVar5 = bua.a;
                return Boolean.valueOf(buaVar3 == buaVar5 || buaVar4 == buaVar5);
        }
    }
}
