package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class ubg extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lec b;
    public final /* synthetic */ lec c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubg(lec lecVar, lec lecVar2, int i) {
        super(1);
        this.a = i;
        this.b = lecVar;
        this.c = lecVar2;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                fxd fxdVar = (fxd) obj;
                lec lecVar = this.b;
                long j = lecVar.a;
                BigInteger bigInteger = fxdVar.h;
                lecVar.a = j + (bigInteger != null ? bigInteger.longValue() : 0L);
                lec lecVar2 = this.c;
                long j2 = lecVar2.a;
                BigInteger bigInteger2 = fxdVar.i;
                lecVar2.a = j2 + (bigInteger2 != null ? bigInteger2.longValue() : 0L);
                break;
            default:
                gxd gxdVar = (gxd) obj;
                lec lecVar3 = this.b;
                long j3 = lecVar3.a;
                BigInteger bigInteger3 = gxdVar.h;
                lecVar3.a = j3 + (bigInteger3 != null ? bigInteger3.longValue() : 0L);
                lec lecVar4 = this.c;
                long j4 = lecVar4.a;
                BigInteger bigInteger4 = gxdVar.i;
                lecVar4.a = j4 + (bigInteger4 != null ? bigInteger4.longValue() : 0L);
                break;
        }
        return e5f.a;
    }
}
