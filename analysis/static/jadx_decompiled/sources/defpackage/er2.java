package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class er2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                er2 er2Var = new er2(3, continuation, 0);
                er2Var.Y = th;
                e5f e5fVar = e5f.a;
                er2Var.o(e5fVar);
                return e5fVar;
            case 1:
                er2 er2Var2 = new er2(3, continuation, 1);
                er2Var2.Y = th;
                e5f e5fVar2 = e5f.a;
                er2Var2.o(e5fVar2);
                return e5fVar2;
            case 2:
                er2 er2Var3 = new er2(3, continuation, 2);
                er2Var3.Y = th;
                e5f e5fVar3 = e5f.a;
                er2Var3.o(e5fVar3);
                return e5fVar3;
            case 3:
                er2 er2Var4 = new er2(3, continuation, 3);
                er2Var4.Y = th;
                e5f e5fVar4 = e5f.a;
                er2Var4.o(e5fVar4);
                return e5fVar4;
            default:
                er2 er2Var5 = new er2(3, continuation, 4);
                er2Var5.Y = th;
                e5f e5fVar5 = e5f.a;
                er2Var5.o(e5fVar5);
                return e5fVar5;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e5f e5fVar = e5f.a;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                hm9.p("jr2", "catch error in chatUpdateFlow", this.Y);
                break;
            case 1:
                od2.a0(obj);
                hm9.p("ChatVM/MissedContactsController", "fail", this.Y);
                break;
            case 2:
                od2.a0(obj);
                hm9.p("MiniChatsUpdated", "fail", this.Y);
                break;
            case 3:
                od2.a0(obj);
                Throwable th = this.Y;
                if (!(th instanceof CancellationException)) {
                    ((cba) y8a.a.g()).c(th, false);
                    break;
                }
                break;
            default:
                od2.a0(obj);
                hm9.l0("ViewThemeUtils", "fail to change theme for spans", this.Y);
                break;
        }
        return e5fVar;
    }
}
