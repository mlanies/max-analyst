package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uo9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vo9 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo9(vo9 vo9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = vo9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((uo9) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uo9 uo9Var = new uo9(this.Z, continuation);
        uo9Var.Y = obj;
        return uo9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [on5] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, on5] */
    /* JADX WARN: Type inference failed for: r1v7, types: [on5] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        ?? r1;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
        } catch (Throwable th) {
            njcVar = new njc(th);
            r1 = i;
        }
        if (i == 0) {
            od2.a0(obj);
            ?? r12 = (on5) this.Y;
            vo9 vo9Var = this.Z;
            e8b e8bVar = vo9Var.a;
            if (e8bVar != null) {
                this.X = 3;
                if (r12.a(e8bVar, this) == tx3Var) {
                    return tx3Var;
                }
                return e5f.a;
            }
            e5a e5aVar = (e5a) vo9Var.b.getValue();
            this.Y = r12;
            this.X = 1;
            obj = ((ome) e5aVar.a.getValue()).e(c8b.o, this);
            i = r12;
            if (obj == tx3Var) {
                return tx3Var;
            }
            njcVar = fp3.z(((d8b) obj).c);
            r1 = i;
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            ?? r13 = (on5) this.Y;
            od2.a0(obj);
            i = r13;
            njcVar = fp3.z(((d8b) obj).c);
            r1 = i;
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        this.Y = null;
        this.X = 2;
        if (r1.a((e8b) njcVar, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
