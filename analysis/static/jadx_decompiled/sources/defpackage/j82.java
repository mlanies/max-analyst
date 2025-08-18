package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class j82 implements qj3 {
    public final /* synthetic */ long X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ p82 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ de2 c;
    public final /* synthetic */ int o;
    public final /* synthetic */ long s0;

    public /* synthetic */ j82(p82 p82Var, Set set, de2 de2Var, int i, long j, int i2, long j2, long j3) {
        this.a = p82Var;
        this.b = set;
        this.c = de2Var;
        this.o = i;
        this.X = j;
        this.Y = i2;
        this.Z = j2;
        this.s0 = j3;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        u82 u82Var = (u82) obj;
        p82 p82Var = this.a;
        p82Var.getClass();
        Set set = this.b;
        w82 w82VarA = p82.H(u82Var, set).a();
        de2 de2Var = this.c;
        w82VarA.a = de2Var.X;
        boolean zIsEmpty = de2Var.c().isEmpty();
        int i = this.o;
        int i2 = this.Y;
        long j = this.s0;
        if (zIsEmpty) {
            long j2 = this.X;
            if (i > 0) {
                w82VarA.b = j2;
            }
            if (i2 > 0) {
                w82VarA.c = j2;
            }
        } else {
            w82VarA.X = hm9.s((List) w82VarA.X, de2Var.c(), this.Z, i, 0L, i2, 0L);
            rm4 rm4Var = p82Var.s;
            if (i > 0 && de2Var.c().size() < i) {
                hm9.n("p82", "onChatMediaNew firstMessageUpdate");
                cu8 cu8VarJ = ((au8) rm4Var.get()).j(j, ((fs8) de2Var.c().get(0)).a);
                if (cu8VarJ != null) {
                    w82VarA.b = cu8VarJ.b;
                } else {
                    hm9.k0("p82", null, "onChatMediaNew can't find message to update firstMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
            if (i2 > 0 && de2Var.c().size() < i2) {
                hm9.n("p82", "onChatMediaNew lastMessageUpdate");
                cu8 cu8VarJ2 = ((au8) rm4Var.get()).j(j, ((fs8) de2Var.c().get(de2Var.c().size() - 1)).a);
                if (cu8VarJ2 != null) {
                    w82VarA.c = cu8VarJ2.b;
                } else {
                    hm9.k0("p82", null, "onChatMediaNew can't find message to update lastMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
        }
        p82Var.J(j).setValue(new zc8(de2Var.Z, de2Var.Y, set, j));
        p82.a0(u82Var, set, w82VarA.a());
    }
}
