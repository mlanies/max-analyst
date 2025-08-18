package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pp8 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xp8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp8(xp8 xp8Var, Continuation continuation) {
        super(2, continuation);
        this.Z = xp8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pp8) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pp8 pp8Var = new pp8(this.Z, continuation);
        pp8Var.Y = obj;
        return pp8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        xp8 xp8Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            List list = (List) this.Y;
            gi9 gi9Var = new gi9(list.size());
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                xp8Var = this.Z;
                if (!zHasNext) {
                    break;
                }
                uj3 uj3Var = (uj3) it.next();
                pxa pxaVarA = !gi9Var.a(uj3Var.n()) ? null : ((tya) xp8Var.e.getValue()).a(uj3Var, false);
                if (pxaVarA != null) {
                    arrayList.add(pxaVarA);
                }
            }
            ((oq3) xp8Var.c.getValue()).c(arrayList, new g27(15));
            kld kldVar = xp8Var.l;
            this.X = 1;
            if (kldVar.a(arrayList, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
