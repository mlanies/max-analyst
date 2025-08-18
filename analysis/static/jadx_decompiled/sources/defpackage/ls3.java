package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ls3 extends ffe implements a66 {
    public final /* synthetic */ ns3 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls3(ns3 ns3Var, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.X = ns3Var;
        this.Y = str;
        this.Z = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ls3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ls3(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ns3 ns3Var = this.X;
        List listF = ns3Var.c.f(this.Y, this.Z, nz4.a, ns3Var.e);
        ns3Var.getClass();
        return listF;
    }
}
