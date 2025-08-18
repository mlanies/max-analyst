package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class zw extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bx Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(bx bxVar, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zw) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zw(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bx bxVar = this.Y;
            if (bxVar.e.a()) {
                ((v5d) bxVar.e.getValue()).c();
            }
            je7 je7Var = bxVar.f;
            if (je7Var.a()) {
                ((v5d) je7Var.getValue()).c();
            }
            List list = ((l29) bxVar.A.getValue()).a;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((MessageModel) it.next()).a));
            }
            xu8 xu8Var = new xu8(arrayList);
            this.X = 1;
            if (bxVar.n(xu8Var, this) == tx3Var) {
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
