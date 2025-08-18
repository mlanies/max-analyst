package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class y09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        y09 y09Var = (y09) n((lce) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        y09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        y09 y09Var = new y09(continuation, this.Y);
        y09Var.X = obj;
        return y09Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        lce lceVar = (lce) this.X;
        MessageWriteWidget messageWriteWidget = this.Y;
        rt3 rt3Var = messageWriteWidget.B0;
        if (rt3Var != null) {
            rt3Var.dismiss();
        }
        if (lceVar != null) {
            rce rceVar = lceVar.b;
            if (!rceVar.Y.isEmpty()) {
                List list = rceVar.Y;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        y53.R();
                        throw null;
                    }
                    arrayList.add(new tt3(i, new iqe((String) obj2), (Integer) null, (Integer) null, 28));
                    i = i2;
                }
                rt3 rt3VarBuild = dy7.c(1).Y(lceVar.a).I(arrayList).s().build();
                rt3VarBuild.q(messageWriteWidget);
                messageWriteWidget.B0 = rt3VarBuild;
            }
        }
        return e5f.a;
    }
}
