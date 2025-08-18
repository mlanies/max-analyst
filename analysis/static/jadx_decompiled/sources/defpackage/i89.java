package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class i89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;
    public final /* synthetic */ MessageModel Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i89(l89 l89Var, MessageModel messageModel, Continuation continuation) {
        super(2, continuation);
        this.Y = l89Var;
        this.Z = messageModel;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((i89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new i89(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y.i;
            MessageModel messageModel = this.Z;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "On unreadScrollButton clicked, current messageModel=".concat(messageModel.m()), null);
            }
            e52 e52Var = (e52) this.Y.d.getValue();
            if (e52Var == null) {
                return e5fVar;
            }
            long jN = e52Var.n();
            es8 es8Var = e52Var.c;
            long c = es8Var != null ? es8Var.getC() : 0L;
            if (jN >= c || this.Z.c >= jN) {
                String str2 = this.Y.i;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    us7 us7Var = us7.X;
                    StringBuilder sbK = au1.k(jN, "onUnreadScrollButtonClicked: selfReadMark=", " >= lastMessageTime=");
                    sbK.append(c);
                    ir6Var2.d(us7Var, str2, sbK.toString(), null);
                }
                l89 l89Var = this.Y;
                this.X = 1;
                l89.d(l89Var, c, 0L, true, 0, 10);
                if (e5fVar == tx3Var) {
                    return tx3Var;
                }
            } else {
                l29 l29Var = (l29) this.Y.e.getValue();
                List list = l29Var.a;
                int iF = l29Var.f(jN);
                if (iF < 0) {
                    iF = Math.abs(iF) - 1;
                }
                MessageModel messageModel2 = (MessageModel) x53.j0(iF, list);
                if (messageModel2 == null) {
                    String str3 = this.Y.i;
                    ir6 ir6Var3 = hm9.m;
                    if (ir6Var3 != null && ir6Var3.c()) {
                        ir6Var3.d(us7.X, str3, "onUnreadScrollButtonClicked: message with ts=selfReadMark is not loaded, load around it", null);
                    }
                    this.Y.l.updateAndGet(new v79(jN, 2));
                    this.Y.g.invoke(new Long(jN));
                } else if (messageModel2.c == this.Z.c) {
                    String str4 = this.Y.i;
                    ir6 ir6Var4 = hm9.m;
                    if (ir6Var4 != null && ir6Var4.c()) {
                        ir6Var4.d(us7.X, str4, x9e.c0("onUnreadScrollButtonClicked: message with ts=selfReadMark is loaded and is last on screen, \n                            |scroll to lastMessageTime=" + c), null);
                    }
                    l89 l89Var2 = this.Y;
                    this.X = 2;
                    l89.d(l89Var2, c, 0L, false, 0, 14);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else {
                    String str5 = this.Y.i;
                    ir6 ir6Var5 = hm9.m;
                    if (ir6Var5 != null && ir6Var5.c()) {
                        ir6Var5.d(us7.X, str5, "onUnreadScrollButtonClicked: message with ts=selfReadMark is loaded, scroll to it", null);
                    }
                    this.Y.l.updateAndGet(new oe2(8));
                    wwc.j(this.Y.o, messageModel2.c, false, 6);
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
