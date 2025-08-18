package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vw5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ yw5 Z;
    public final /* synthetic */ je7 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw5(yw5 yw5Var, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = yw5Var;
        this.s0 = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vw5) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vw5 vw5Var = new vw5(this.Z, this.s0, continuation);
        vw5Var.Y = obj;
        return vw5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        xs xsVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        yw5 yw5Var = this.Z;
        if (i != 0) {
            if (i == 1) {
                od2.a0(obj);
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xsVar = (xs) this.Y;
            od2.a0(obj);
            yw5Var.x0.setValue(xsVar);
            return e5fVar;
        }
        od2.a0(obj);
        List<at5> list = (List) this.Y;
        if (list.size() == 1 && tpa.f(((at5) x53.g0(list)).a, "all.chat.folder")) {
            q0e q0eVar = yw5Var.s0;
            nz4 nz4Var = nz4.a;
            this.X = 1;
            q0eVar.m(null, nz4Var);
            return e5fVar == tx3Var ? tx3Var : e5fVar;
        }
        xs xsVar2 = new xs((Collection) yw5Var.x0.getValue());
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (at5 at5Var : list) {
            boolean zF = tpa.f(at5Var.a, "all.chat.folder");
            String str = at5Var.a;
            if (!zF) {
                if (at5Var.v0.contains(new Long(yw5Var.b))) {
                    xsVar2.add(str);
                }
            }
            arrayList.add(new w9f(at5Var, tpa.f(str, "all.chat.folder") ? v9f.a : v9f.b, new iqe(((hda) this.s0.getValue()).a(at5Var.b, at5Var.y0, 2, false, 0, true))));
        }
        if (((Set) yw5Var.w0.get()) == null) {
            yw5Var.w0.updateAndGet(new oz0(list, 1, yw5Var));
        }
        this.Y = xsVar2;
        this.X = 2;
        yw5Var.s0.m(null, arrayList);
        if (e5fVar == tx3Var) {
            return tx3Var;
        }
        xsVar = xsVar2;
        yw5Var.x0.setValue(xsVar);
        return e5fVar;
    }
}
