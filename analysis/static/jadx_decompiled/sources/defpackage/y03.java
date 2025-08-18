package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;

/* loaded from: classes2.dex */
public final class y03 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y03(int i, Continuation continuation) {
        super(3, continuation);
        this.X = 5;
        this.Y = i;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                y03 y03Var = new y03(3, (Continuation) obj3, 0);
                y03Var.Z = (on5) obj;
                y03Var.s0 = (gq9) obj2;
                return y03Var.o(e5f.a);
            case 1:
                y03 y03Var2 = new y03(3, (Continuation) obj3, 1);
                y03Var2.Z = (on5) obj;
                y03Var2.s0 = (h8f) obj2;
                return y03Var2.o(e5f.a);
            case 2:
                y03 y03Var3 = new y03((yj5) this.s0, (Continuation) obj3);
                y03Var3.Z = (Throwable) obj2;
                return y03Var3.o(e5f.a);
            case 3:
                y03 y03Var4 = new y03(3, (Continuation) obj3, 3);
                y03Var4.Z = (on5) obj;
                y03Var4.s0 = (Throwable) obj2;
                return y03Var4.o(e5f.a);
            case 4:
                y03 y03Var5 = new y03(3, (Continuation) obj3, 4);
                y03Var5.Z = (on5) obj;
                y03Var5.s0 = obj2;
                return y03Var5.o(e5f.a);
            case 5:
                y03 y03Var6 = new y03(this.Y, (Continuation) obj3);
                y03Var6.Z = (cmd) obj;
                y03Var6.s0 = (fka) obj2;
                e5f e5fVar = e5f.a;
                y03Var6.o(e5fVar);
                return e5fVar;
            case 6:
                y03 y03Var7 = new y03(3, (Continuation) obj3, 6);
                y03Var7.Z = (on5) obj;
                y03Var7.s0 = (Conversation) obj2;
                return y03Var7.o(e5f.a);
            default:
                return new y03((cge) this.Z, (d7f) this.s0, (Continuation) obj3).o(e5f.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x02ef -> B:106:0x0246). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y03.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y03(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y03(yj5 yj5Var, Continuation continuation) {
        super(3, continuation);
        this.X = 2;
        this.s0 = yj5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y03(cge cgeVar, d7f d7fVar, Continuation continuation) {
        super(3, continuation);
        this.X = 7;
        this.Z = cgeVar;
        this.s0 = d7fVar;
    }
}
