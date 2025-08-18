package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pfe extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cge Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfe(cge cgeVar, Continuation continuation) {
        super(2, continuation);
        this.Z = cgeVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pfe) n((v6f) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pfe pfeVar = new pfe(this.Z, continuation);
        pfeVar.Y = obj;
        return pfeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objW;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            v6f v6fVar = (v6f) this.Y;
            if (v6fVar.a()) {
                String str = this.Z.b;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, "No need for uploading due it already finished", null);
                }
                return new qn5(3, v6fVar);
            }
            String str2 = this.Z.b;
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, str2, "Requested upload to server", null);
            }
            cge cgeVar = this.Z;
            this.X = 1;
            cgeVar.getClass();
            objW = od2.w(new zn5(od2.D(new zn5(new yfe(new zn5(new yfe(new yfe(new qn5(3, v6fVar), cgeVar, 0), cgeVar, 1), new v59(2, cgeVar, cge.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 13), 5), cgeVar, 2), new v59(2, cgeVar, cge.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), 5), new shb(2, cgeVar, cge.class, "uploadFile", "uploadFile(Lone/me/sdk/transfer/domain/Upload;)Lkotlinx/coroutines/flow/Flow;", 4, 21)), new bge(cgeVar, null), 5), new ai0(28));
            if (objW == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            objW = obj;
        }
        return (mn5) objW;
    }
}
