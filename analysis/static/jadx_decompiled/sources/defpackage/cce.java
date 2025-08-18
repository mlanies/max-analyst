package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cce extends ffe implements a66 {
    public int X;
    public final /* synthetic */ qi8 Y;
    public final /* synthetic */ Set Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce(qi8 qi8Var, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.Y = qi8Var;
        this.Z = linkedHashSet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cce(this.Y, (LinkedHashSet) this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        qi8 qi8Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            pk pkVar = (pk) qi8Var.a;
            tq2 tq2Var = new tq2(x53.E0(this.Z));
            this.X = 1;
            obj = ((k4a) pkVar).J(tq2Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        List listC = ((ym3) obj).c();
        ArrayList arrayList = new ArrayList(z53.S(listC, 10));
        Iterator it = ((ArrayList) listC).iterator();
        while (it.hasNext()) {
            wm3 wm3Var = (wm3) it.next();
            qi8Var.getClass();
            String strC = bre.c(wm3Var.w0);
            ArrayList arrayList2 = new ArrayList();
            qi8.n(arrayList2, wm3Var.X);
            arrayList.add(((bdb) qi8Var.b).b(wm3Var.a, arrayList2, strC, wm3Var.a(), wm3Var.d(kk0.c), null, ((y4d) ((je7) qi8Var.X).getValue()).a(wm3Var.a)));
        }
        return arrayList;
    }
}
