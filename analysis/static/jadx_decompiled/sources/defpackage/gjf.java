package defpackage;

import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gjf extends ffe implements a66 {
    public LinkedList X;
    public e9d Y;
    public int Z;
    public final /* synthetic */ hjf s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ Long u0;
    public final /* synthetic */ fif v0;
    public final /* synthetic */ cz5 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjf(hjf hjfVar, long j, Long l, fif fifVar, cz5 cz5Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = hjfVar;
        this.t0 = j;
        this.u0 = l;
        this.v0 = fifVar;
        this.w0 = cz5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gjf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gjf(this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e9d e9dVar;
        LinkedList linkedList;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        long j = this.t0;
        hjf hjfVar = this.s0;
        if (i == 0) {
            od2.a0(obj);
            x19 x19Var = (x19) hjfVar.c.getValue();
            this.Z = 1;
            obj = x19Var.a(j, this.u0, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e9dVar = this.Y;
                linkedList = this.X;
                od2.a0(obj);
                linkedList.add(e9dVar);
                linkedList.addAll((List) obj);
                ((s8g) hjfVar.b.getValue()).a(new h9d(new h8d(j, linkedList, 2)));
                return e5f.a;
            }
            od2.a0(obj);
        }
        LinkedList linkedList2 = new LinkedList();
        fif fifVar = this.v0;
        l9d l9dVar = new l9d(j, fifVar);
        l9dVar.p = fifVar.Z;
        l9dVar.b = (bw8) obj;
        e9d e9dVarA = l9dVar.a();
        xb6 xb6Var = (xb6) hjfVar.d.getValue();
        this.X = linkedList2;
        this.Y = e9dVarA;
        this.Z = 2;
        Object objB = xb6Var.b(this.w0, this);
        if (objB == tx3Var) {
            return tx3Var;
        }
        e9dVar = e9dVarA;
        obj = objB;
        linkedList = linkedList2;
        linkedList.add(e9dVar);
        linkedList.addAll((List) obj);
        ((s8g) hjfVar.b.getValue()).a(new h9d(new h8d(j, linkedList, 2)));
        return e5f.a;
    }
}
