package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fs3 extends ffe implements a66 {
    public final /* synthetic */ js3 X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs3(js3 js3Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = js3Var;
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fs3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fs3(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        rd6 rd6Var;
        od2.a0(obj);
        td tdVar = this.X.c;
        List<vpb> list = (List) ((yx7) ((je7) tdVar.o).getValue()).e(this.Y).e();
        ArrayList arrayList = new ArrayList();
        for (vpb vpbVar : list) {
            kq3 kq3Var = vpbVar.c;
            if (kq3Var == null) {
                rd6Var = null;
            } else {
                lr1 lr1Var = new lr1((ida) hr3.a.getAccessor().c(ida.class), vpbVar, (Context) tdVar.c, 4);
                wm3 wm3Var = kq3Var.a;
                String strA = wm3Var.a();
                w6b w6bVarA = (strA == null || strA.length() == 0) ^ true ? (w6b) lr1Var.invoke(wm3Var.a()) : w6b.a();
                String strC = bre.c(wm3Var.w0);
                b0d b0dVarR = jyc.a.r();
                List list2 = vpbVar.b;
                w6b w6bVarA2 = true ^ b0dVarR.d(strC, list2).isEmpty() ? (w6b) lr1Var.invoke(strC) : w6b.a();
                int i = iz7.l(kq3Var.o).a;
                if (i == 10 || i != 20) {
                }
                String strA2 = wm3Var.a();
                if (strA2 == null) {
                    strA2 = "";
                }
                rd6Var = new rd6(wm3Var.a, strA2, w6bVarA, w6bVarA2, j47.N(wm3Var.d(kk0.c)), wm3Var, (wz) list2, tdVar.b);
            }
            if (rd6Var != null) {
                arrayList.add(rd6Var);
            }
        }
        return arrayList;
    }
}
