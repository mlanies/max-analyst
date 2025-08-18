package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qvf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ btf Z;
    public final /* synthetic */ vvf s0;
    public final /* synthetic */ evf t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvf(btf btfVar, evf evfVar, vvf vvfVar, Continuation continuation) {
        super(2, continuation);
        this.Z = btfVar;
        this.s0 = vvfVar;
        this.t0 = evfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qvf) n((nn0) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vvf vvfVar = this.s0;
        qvf qvfVar = new qvf(this.Z, this.t0, vvfVar, continuation);
        qvfVar.Y = obj;
        return qvfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String strB;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        evf evfVar = this.t0;
        vvf vvfVar = this.s0;
        if (i == 0) {
            od2.a0(obj);
            nn0 nn0Var = (nn0) this.Y;
            boolean z = nn0Var.a;
            btf btfVar = this.Z;
            if (z) {
                String str = btfVar.b;
                List list = vvf.i;
                String strA = ((ti4) vvfVar.d.getValue()).a();
                dvf dvfVar = new dvf(str, list, nn0Var.b, nn0Var.c, nn0Var.d, strA);
                ja7 ja7Var = vvfVar.a;
                ja7Var.getClass();
                strB = ja7Var.b(dvf.Companion.serializer(), dvfVar);
            } else {
                ewf ewfVar = new ewf(btfVar.b);
                ja7 ja7Var2 = vvfVar.a;
                ja7Var2.getClass();
                strB = ja7Var2.b(ewf.Companion.serializer(), ewfVar);
            }
            zt0 zt0Var = vvfVar.g;
            x97 x97Var = new x97(evfVar.a, strB);
            this.X = 1;
            if (zt0Var.o(x97Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        vvf.e(vvfVar, evfVar.a);
        return e5f.a;
    }
}
