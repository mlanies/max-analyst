package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class m1d extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1d(c86 c86Var, e4d e4dVar, Continuation continuation) {
        super(3, continuation);
        this.X = 1;
        this.Z = c86Var;
        this.s0 = e4dVar;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                m1d m1dVar = new m1d((mib) this.s0, (Continuation) obj3, 0);
                m1dVar.Z = (TextView) obj;
                m1dVar.Y = (fka) obj2;
                e5f e5fVar = e5f.a;
                m1dVar.o(e5fVar);
                return e5fVar;
            case 1:
                m1d m1dVar2 = new m1d((c86) this.Z, (e4d) this.s0, (Continuation) obj3);
                m1dVar2.Y = (fka) obj2;
                e5f e5fVar2 = e5f.a;
                m1dVar2.o(e5fVar2);
                return e5fVar2;
            case 2:
                m1d m1dVar3 = new m1d((ltd) this.s0, (Continuation) obj3, 2);
                m1dVar3.Z = (e52) obj;
                m1dVar3.Y = (uj3) obj2;
                return m1dVar3.o(e5f.a);
            case 3:
                m1d m1dVar4 = new m1d((StartConversationScreen) this.s0, (Continuation) obj3, 3);
                m1dVar4.Z = (dn3) obj;
                m1dVar4.Y = (List) obj2;
                e5f e5fVar3 = e5f.a;
                m1dVar4.o(e5fVar3);
                return e5fVar3;
            default:
                m1d m1dVar5 = new m1d((wka) ((yka) this.s0), (Continuation) obj3, 4);
                m1dVar5.Z = (ImageView) obj;
                m1dVar5.Y = (fka) obj2;
                e5f e5fVar4 = e5f.a;
                m1dVar5.o(e5fVar4);
                return e5fVar4;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        CharSequence charSequenceM0;
        e5f e5fVar = e5f.a;
        Object obj2 = this.s0;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                ((TextView) this.Z).setTextColor(((Number) ((mib) obj2).b.invoke((fka) this.Y)).intValue());
                break;
            case 1:
                od2.a0(obj);
                fka fkaVar = (fka) this.Y;
                ((e4d) obj2).H0.setTextColor(((c86) this.Z).c ? fkaVar.getText().j : fkaVar.getText().h);
                break;
            case 2:
                od2.a0(obj);
                e52 e52Var = (e52) this.Z;
                uj3 uj3Var = (uj3) this.Y;
                qk5 qk5VarA0 = l6d.a0(new at(2, e52Var.j()), new w8c(8));
                ltd ltdVar = (ltd) obj2;
                ltdVar.getClass();
                List listI0 = l6d.i0(l6d.Z(qk5VarA0, new k5d(ltdVar, 3, e52Var)));
                if (e52Var.e0()) {
                    kl7 kl7VarL = j1e.l();
                    kl7VarL.add(uj3Var);
                    kl7VarL.addAll(listI0);
                    break;
                }
                break;
            case 3:
                od2.a0(obj);
                dn3 dn3Var = (dn3) this.Z;
                List list = (List) this.Y;
                bc7[] bc7VarArr = StartConversationScreen.I0;
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj2;
                CharSequence charSequenceM02 = startConversationScreen.m0();
                if (!(!(charSequenceM02 == null || charSequenceM02.length() == 0))) {
                    startConversationScreen.A0.E(dn3Var.a);
                    nz4 nz4Var = nz4.a;
                    startConversationScreen.B0.E(nz4Var);
                    startConversationScreen.C0.E(dn3Var.c);
                    a3g a3gVar = startConversationScreen.D0;
                    if (a3gVar.j() == 0 && ((charSequenceM0 = startConversationScreen.m0()) == null || charSequenceM0.length() == 0)) {
                        a3gVar.E(wmd.n());
                    }
                    dn3 dn3Var2 = dn3.d;
                    a3g a3gVar2 = startConversationScreen.z0;
                    if (dn3Var != dn3Var2) {
                        a3gVar2.E(list);
                        break;
                    } else {
                        a3gVar2.E(nz4Var);
                        break;
                    }
                }
                break;
            default:
                od2.a0(obj);
                ((ImageView) this.Z).setColorFilter(((fka) this.Y).c(((wka) ((yka) obj2)).d));
                break;
        }
        return e5fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1d(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.s0 = obj;
    }
}
