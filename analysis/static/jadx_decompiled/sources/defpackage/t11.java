package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t11 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t11(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        switch (this.X) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                t11 t11Var = new t11(3, (Continuation) obj3, 0);
                t11Var.Y = zBooleanValue;
                t11Var.Z = zBooleanValue2;
                return t11Var.o(e5f.a);
            case 1:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                t11 t11Var2 = new t11(3, (Continuation) obj3, 1);
                t11Var2.Y = zBooleanValue3;
                t11Var2.Z = zBooleanValue4;
                return t11Var2.o(e5f.a);
            default:
                boolean zBooleanValue5 = bool.booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                t11 t11Var3 = new t11(3, (Continuation) obj3, 2);
                t11Var3.Y = zBooleanValue5;
                t11Var3.Z = zBooleanValue6;
                return t11Var3.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                return Boolean.valueOf(this.Y && !this.Z);
            case 1:
                od2.a0(obj);
                return Boolean.valueOf(this.Y && !this.Z);
            default:
                od2.a0(obj);
                return Boolean.valueOf(this.Y || this.Z);
        }
    }
}
