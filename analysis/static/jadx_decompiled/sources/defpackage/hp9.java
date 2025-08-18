package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class hp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hp9 hp9Var = (hp9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hp9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hp9 hp9Var = new hp9(continuation, this.Y);
        hp9Var.X = obj;
        return hp9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        neuroAvatarsScreen.getClass();
        int i = 0;
        ((qp9) neuroAvatarsScreen.x0.T0(neuroAvatarsScreen, NeuroAvatarsScreen.M0[8])).setVisibility(list.isEmpty() ? 0 : 8);
        neuroAvatarsScreen.q0().setVisibility(list.isEmpty() ^ true ? 0 : 8);
        wja wjaVarQ0 = neuroAvatarsScreen.q0();
        neuroAvatarsScreen.K0.getClass();
        wjaVarQ0.k();
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                y53.R();
                throw null;
            }
            vja vjaVar = new vja(wjaVarQ0.getContext());
            vjaVar.setTabItem((y5a) obj2);
            eje ejeVarI = wjaVarQ0.i();
            ejeVarI.e = vjaVar;
            gje gjeVar = ejeVarI.g;
            if (gjeVar != null) {
                gjeVar.e();
            }
            ArrayList arrayList = wjaVarQ0.b;
            wjaVarQ0.b(ejeVarI, arrayList.size(), arrayList.isEmpty());
            i = i2;
        }
        return e5f.a;
    }
}
