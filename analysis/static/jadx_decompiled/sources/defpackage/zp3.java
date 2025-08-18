package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zp3 extends ffe implements e66 {
    public final /* synthetic */ int X = 1;
    public /* synthetic */ List Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;

    public /* synthetic */ zp3(int i, Continuation continuation) {
        super(i, continuation);
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.X) {
            case 0:
                zp3 zp3Var = new zp3((cq3) this.s0, (Continuation) obj4);
                zp3Var.Z = (uj3) obj;
                zp3Var.Y = (List) obj3;
                return zp3Var.o(e5f.a);
            default:
                zp3 zp3Var2 = new zp3(4, (Continuation) obj4);
                zp3Var2.Y = (List) obj;
                zp3Var2.Z = (List) obj2;
                zp3Var2.s0 = (List) obj3;
                return zp3Var2.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                uj3 uj3Var = (uj3) this.Z;
                List list = this.Y;
                kpa kpaVarD = ((cq3) this.s0).D(uj3Var);
                return new mab((tab) kpaVarD.a, (List) kpaVarD.b, list);
            default:
                od2.a0(obj);
                List list2 = this.Y;
                List list3 = (List) this.Z;
                List list4 = (List) this.s0;
                s6e s6eVar = new s6e();
                s6eVar.a = list2;
                s6eVar.b = list3;
                s6eVar.c = list4;
                return s6eVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp3(cq3 cq3Var, Continuation continuation) {
        super(4, continuation);
        this.s0 = cq3Var;
    }
}
