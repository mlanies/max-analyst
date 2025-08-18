package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xi1 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                xi1 xi1Var = new xi1(3, (Continuation) obj3, 0);
                xi1Var.Z = (u9f) obj;
                xi1Var.Y = zBooleanValue;
                return xi1Var.o(e5f.a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                xi1 xi1Var2 = new xi1(3, (Continuation) obj3, 1);
                xi1Var2.Y = zBooleanValue2;
                xi1Var2.Z = (aj6) obj2;
                return xi1Var2.o(e5f.a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                xi1 xi1Var3 = new xi1(3, (Continuation) obj3, 2);
                xi1Var3.Z = (ej7) obj;
                xi1Var3.Y = zBooleanValue3;
                return xi1Var3.o(e5f.a);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                xi1 xi1Var4 = new xi1(3, (Continuation) obj3, 3);
                xi1Var4.Y = zBooleanValue4;
                xi1Var4.Z = (b86) obj2;
                return xi1Var4.o(e5f.a);
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                xi1 xi1Var5 = new xi1(3, (Continuation) obj3, 4);
                xi1Var5.Z = (List) obj;
                xi1Var5.Y = zBooleanValue5;
                return xi1Var5.o(e5f.a);
            case 5:
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                xi1 xi1Var6 = new xi1(3, (Continuation) obj3, 5);
                xi1Var6.Z = (Map) obj;
                xi1Var6.Y = zBooleanValue6;
                return xi1Var6.o(e5f.a);
            case 6:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                xi1 xi1Var7 = new xi1(3, (Continuation) obj3, 6);
                xi1Var7.Z = (Long) obj;
                xi1Var7.Y = zBooleanValue7;
                return xi1Var7.o(e5f.a);
            default:
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                xi1 xi1Var8 = new xi1(3, (Continuation) obj3, 7);
                xi1Var8.Z = (cpa) obj;
                xi1Var8.Y = zBooleanValue8;
                return xi1Var8.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                u9f u9fVar = (u9f) this.Z;
                if (this.Y) {
                    return Boolean.valueOf(wi1.$EnumSwitchMapping$0[u9fVar.ordinal()] == 1);
                }
                return Boolean.FALSE;
            case 1:
                od2.a0(obj);
                return this.Y ? (aj6) this.Z : xi6.c;
            case 2:
                od2.a0(obj);
                ej7 ej7Var = (ej7) this.Z;
                if (this.Y) {
                    return ej7Var;
                }
                return null;
            case 3:
                od2.a0(obj);
                return new kpa(Boolean.valueOf(this.Y), (b86) this.Z);
            case 4:
                od2.a0(obj);
                return this.Y ? (List) this.Z : nz4.a;
            case 5:
                od2.a0(obj);
                return this.Y ? ((Map) this.Z).values() : nz4.a;
            case 6:
                od2.a0(obj);
                Long l = (Long) this.Z;
                if (!this.Y || l == null) {
                    return null;
                }
                return l;
            default:
                od2.a0(obj);
                cpa cpaVar = (cpa) this.Z;
                boolean z = this.Y;
                int iOrdinal = cpaVar.ordinal();
                if (iOrdinal == 0) {
                    return c0g.a;
                }
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return new d0g(z);
                }
                if (iOrdinal == 3) {
                    return b0g.a;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
