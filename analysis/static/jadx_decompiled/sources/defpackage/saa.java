package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class saa extends ffe implements a66 {
    public raa X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ taa s0;
    public final /* synthetic */ String t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saa(taa taaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.s0 = taaVar;
        this.t0 = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((saa) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        saa saaVar = new saa(this.s0, this.t0, continuation);
        saaVar.Z = obj;
        return saaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        raa raaVar;
        iab iabVar;
        Object next;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        String str = this.t0;
        taa taaVar = this.s0;
        if (i == 0) {
            od2.a0(obj);
            iab iabVar2 = (iab) this.Z;
            raaVar = new raa(str, iabVar2);
            int i2 = taa.f;
            so4 so4VarA = taaVar.a();
            so4VarA.getClass();
            so4VarA.e.add(raaVar);
            long j = taa.e;
            this.Z = iabVar2;
            this.X = raaVar;
            this.Y = 1;
            if (j47.y(j, this) == tx3Var) {
                return tx3Var;
            }
            iabVar = iabVar2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            raaVar = this.X;
            iabVar = (iab) this.Z;
            od2.a0(obj);
        }
        int i3 = taa.f;
        Iterator it = taaVar.a().l.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tpa.f(((dn4) next).a.a, str)) {
                break;
            }
        }
        if (next == null) {
            fab fabVar = (fab) iabVar;
            fabVar.getClass();
            fabVar.i(new IllegalStateException("download not started after ".concat(ft4.j(taa.e))));
        }
        yf3 yf3Var = new yf3(taaVar, 26, raaVar);
        this.Z = null;
        this.X = null;
        this.Y = 2;
        if (j47.j(iabVar, yf3Var, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
