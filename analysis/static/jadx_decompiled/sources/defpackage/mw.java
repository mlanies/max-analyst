package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mw extends ffe implements c66 {
    public /* synthetic */ List X;
    public /* synthetic */ long Y;
    public final /* synthetic */ bx Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(bx bxVar, Continuation continuation) {
        super(3, continuation);
        this.Z = bxVar;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj2).longValue();
        mw mwVar = new mw(this.Z, (Continuation) obj3);
        mwVar.X = (List) obj;
        mwVar.Y = jLongValue;
        return mwVar.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = this.X;
        long j = this.Y;
        bc7[] bc7VarArr = bx.F;
        bx bxVar = this.Z;
        List listL = bxVar.l(j);
        yx4 yx4Var = bxVar.c;
        if (yx4Var != null) {
            StringBuilder sbJ = wg0.j("getHistoryItems return ", listL.size(), " out of total ", list.size(), " around ");
            sbJ.append(j);
            yx4Var.b(sbJ.toString());
        }
        return listL;
    }
}
