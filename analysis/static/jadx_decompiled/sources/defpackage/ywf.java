package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ywf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gxf Z;
    public final /* synthetic */ dxf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywf(dxf dxfVar, gxf gxfVar, Continuation continuation) {
        super(2, continuation);
        this.Z = gxfVar;
        this.s0 = dxfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ywf) n((mwf) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ywf ywfVar = new ywf(this.s0, this.Z, continuation);
        ywfVar.Y = obj;
        return ywfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String str;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        dxf dxfVar = this.s0;
        if (i == 0) {
            od2.a0(obj);
            mwf mwfVar = (mwf) this.Y;
            xxc xxcVar = twf.a;
            jxf jxfVar = new jxf(this.Z.a, mwfVar.a);
            zt0 zt0Var = dxfVar.f;
            ja7 ja7Var = dxfVar.a;
            ja7Var.getClass();
            x97 x97Var = new x97("WebAppDownloadFile", ja7Var.b(jxf.Companion.serializer(), jxfVar));
            this.Y = "WebAppDownloadFile";
            this.X = 1;
            if (zt0Var.o(x97Var, this) == tx3Var) {
                return tx3Var;
            }
            str = "WebAppDownloadFile";
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) this.Y;
            od2.a0(obj);
            str = str2;
        }
        wsf wsfVar = dxfVar.g;
        if (wsfVar != null) {
            iwf.a((iwf) dxfVar.b.getValue(), str, wsfVar.a, wsfVar.b, true, 0, null, null, 240);
        }
        return e5f.a;
    }
}
