package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wu7 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ List Y;
    public /* synthetic */ List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu7(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                wu7 wu7Var = new wu7(3, continuation, 0);
                wu7Var.Y = list;
                wu7Var.Z = list2;
                return wu7Var.o(e5f.a);
            case 1:
                wu7 wu7Var2 = new wu7(3, continuation, 1);
                wu7Var2.Y = list;
                wu7Var2.Z = list2;
                return wu7Var2.o(e5f.a);
            case 2:
                wu7 wu7Var3 = new wu7(3, continuation, 2);
                wu7Var3.Y = list;
                wu7Var3.Z = list2;
                return wu7Var3.o(e5f.a);
            default:
                wu7 wu7Var4 = new wu7(3, continuation, 3);
                wu7Var4.Y = list;
                wu7Var4.Z = list2;
                return wu7Var4.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                List list = this.Y;
                list.addAll(this.Z);
                return list;
            case 1:
                od2.a0(obj);
                List list2 = this.Y;
                list2.addAll(this.Z);
                return list2;
            case 2:
                od2.a0(obj);
                List list3 = this.Y;
                return list3.isEmpty() ? this.Z : list3;
            default:
                od2.a0(obj);
                return x53.t0(this.Y, this.Z);
        }
    }
}
