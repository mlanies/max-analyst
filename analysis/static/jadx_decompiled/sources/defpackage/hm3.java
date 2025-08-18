package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hm3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;
    public final /* synthetic */ xu4 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm3(jm3 jm3Var, xu4 xu4Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3Var;
        this.Z = xu4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hm3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hm3(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            jm3 jm3Var = this.Y;
            hq3 hq3Var = (hq3) jm3Var.v.getValue();
            xu4 xu4Var = this.Z;
            String str = xu4Var.c;
            String string = str != null ? w9e.b1(str).toString() : null;
            String str2 = xu4Var.f;
            String string2 = str2 != null ? w9e.b1(str2).toString() : null;
            this.X = 1;
            hq3Var.getClass();
            String name = hq3.class.getName();
            StringBuilder sb = new StringBuilder("rename, id = ");
            long j = jm3Var.n;
            ms2.j(j, " => ", string, sb);
            sb.append(" ");
            sb.append(string2);
            hm9.n(name, sb.toString());
            je7 je7Var = hq3Var.a;
            uj3 uj3VarI = ((el3) je7Var.getValue()).i(j, false);
            if (uj3VarI != null) {
                jl3 jl3Var = (jl3) x53.i0(uj3VarI.i());
                ((el3) je7Var.getValue()).c(j, new bl3(string, string2, 1));
                je7 je7Var2 = hq3Var.d;
                ((av0) je7Var2.getValue()).c(new ps3(j));
                pk pkVar = (pk) hq3Var.c.getValue();
                k4a k4aVar = (k4a) pkVar;
                k4a.w(k4aVar, new sq3(5, ((p7b) k4aVar.y()).a.o(), j, jl3Var != null ? jl3Var.a : null, jl3Var != null ? jl3Var.b : null, string, string2));
                ((ike) hq3Var.b.getValue()).f(Collections.singletonList(new Long(j)));
                ((av0) je7Var2.getValue()).c(new ps3(j));
            }
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
