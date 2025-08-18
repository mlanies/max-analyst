package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class szf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ byte[] s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ String u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szf(zzf zzfVar, String str, byte[] bArr, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.Y = zzfVar;
        this.Z = str;
        this.s0 = bArr;
        this.t0 = str2;
        this.u0 = str3;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((szf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new szf(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String str;
        String str2;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            c8d c8dVar = this.Y.D0;
            this.X = 1;
            c8dVar.getClass();
            ja7 ja7Var = ja7.d;
            ja7Var.getClass();
            f1g f1gVar = (f1g) ja7Var.a(f1g.Companion.serializer(), this.Z);
            byte[] bArr = this.s0;
            Object objO = ((zt0) c8dVar.o).o(new y97(f1gVar, (bArr == null || (str = this.t0) == null || (str2 = this.u0) == null) ? null : new c1g(str, str2, bArr)), this);
            if (objO != tx3Var) {
                objO = e5fVar;
            }
            if (objO == tx3Var) {
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
