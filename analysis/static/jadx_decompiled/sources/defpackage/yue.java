package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final /* synthetic */ class yue implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tve b;
    public final /* synthetic */ sv0 c;

    public /* synthetic */ yue(tve tveVar, sv0 sv0Var, int i) {
        this.a = i;
        this.b = tveVar;
        this.c = sv0Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                tve tveVar = this.b;
                ByteBuffer byteBufferE = tveVar.i.e();
                sv0 sv0Var = this.c;
                return tveVar.a.unwrap(byteBufferE, (ByteBuffer[]) sv0Var.e, sv0Var.b, sv0Var.c);
            default:
                tve tveVar2 = this.b;
                ByteBuffer byteBufferE2 = tveVar2.j.e();
                sv0 sv0Var2 = this.c;
                return tveVar2.a.wrap((ByteBuffer[]) sv0Var2.e, sv0Var2.b, sv0Var2.c, byteBufferE2);
        }
    }
}
