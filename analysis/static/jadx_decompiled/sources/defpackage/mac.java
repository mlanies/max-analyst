package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mac extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cbc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mac(cbc cbcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = cbcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mac macVar = (mac) n((uac) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        macVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mac macVar = new mac(this.Y, continuation);
        macVar.X = obj;
        return macVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        q0e q0eVar;
        Object value2;
        q0e q0eVar2;
        Object value3;
        od2.a0(obj);
        uac uacVar = (uac) this.X;
        cbc cbcVar = this.Y;
        jac jacVar = cbcVar.c;
        boolean z = (uacVar instanceof sac) || (uacVar instanceof rac);
        q0e q0eVar3 = jacVar.o;
        do {
            value = q0eVar3.getValue();
            ((Boolean) value).getClass();
        } while (!q0eVar3.c(value, Boolean.valueOf(z)));
        boolean zX = cbcVar.x();
        do {
            q0eVar = jacVar.Y;
            value2 = q0eVar.getValue();
            ((Boolean) value2).getClass();
        } while (!q0eVar.c(value2, Boolean.valueOf(zX)));
        if (cbcVar.b == bac.a) {
            boolean z2 = !(uacVar instanceof tac);
            do {
                q0eVar2 = jacVar.s0;
                value3 = q0eVar2.getValue();
                ((Boolean) value3).getClass();
            } while (!q0eVar2.c(value3, Boolean.valueOf(z2)));
        }
        return e5f.a;
    }
}
