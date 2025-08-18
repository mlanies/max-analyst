package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ca7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ c8d s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca7(String str, String str2, c8d c8dVar, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = str2;
        this.s0 = c8dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ca7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ca7(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object next;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            StringBuilder sb = new StringBuilder("Process js event: ");
            String str = this.Y;
            sb.append(str);
            sb.append(", data = ");
            String str2 = this.Z;
            sb.append(str2);
            hm9.G("JsBridge", sb.toString(), null);
            Iterator it = ((List) this.s0.c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ia7) next).c().contains(str)) {
                    break;
                }
            }
            ia7 ia7Var = (ia7) next;
            if (ia7Var != null) {
                this.X = 1;
                if (ia7Var.a(str, str2, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                hm9.p("JsBridge", "Unhandled method " + str + " in JsBridge", null);
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
