package defpackage;

import android.database.Cursor;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class g49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ MessageModel Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g49(n59 n59Var, MessageModel messageModel, Continuation continuation) {
        super(2, continuation);
        this.Y = n59Var;
        this.Z = messageModel;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((g49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new g49(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var;
        Number num;
        tx3 tx3Var2 = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var = (e52) this.Y.o1.a.getValue();
            if (e52Var == null) {
                return e5fVar;
            }
            pz7 pz7Var = this.Y.X;
            MessageModel messageModel = this.Z;
            this.X = 1;
            pz7Var.getClass();
            long jN = e52Var.n();
            if (messageModel.c > jN) {
                String str = (String) pz7Var.b;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, "Marking as read message=".concat(messageModel.m()), null);
                }
                long j = messageModel.c;
                k92 k92Var = e52Var.b;
                int i2 = k92Var.m;
                long j2 = k92Var.a;
                p7c p7cVar = (p7c) ((je7) pz7Var.c).getValue();
                Long l = new Long(messageModel.b);
                if (l.longValue() == 0) {
                    l = null;
                }
                p7c.e(p7cVar, j2, j, l != null ? l.longValue() : -1L, false, false, false, 64);
                mg4 mg4Var = mg4.REGULAR;
                d92 d92Var = (d92) hm9.u(j, e52Var.b.n.d(mg4Var)).b;
                es8 es8Var = e52Var.c;
                if (tpa.f(d92Var, es8Var != null ? (d92) hm9.u(es8Var.getC(), e52Var.b.n.d(mg4Var)).b : null)) {
                    if (es8Var != null) {
                        tx3Var = tx3Var2;
                        if (messageModel.a != es8Var.a.b) {
                        }
                        num = new Long(jA);
                    } else {
                        tx3Var = tx3Var2;
                    }
                    jA = ((au8) ((je7) pz7Var.e).getValue()).a(pz7Var.a, j);
                    num = new Long(jA);
                } else {
                    tx3Var = tx3Var2;
                    au8 au8Var = (au8) ((je7) pz7Var.e).getValue();
                    long j3 = pz7Var.a;
                    long jN2 = e52Var.n() + 1;
                    au8Var.getClass();
                    hm9.m("au8", "countMessagesFromTo chatId = %d, timeFrom = %d, timeTo = %d", Long.valueOf(j3), Long.valueOf(jN2), Long.valueOf(j));
                    t19 t19VarD = ((k24) au8Var.a).c.d();
                    t19VarD.getClass();
                    xlc xlcVarA = xlc.a(5, "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = ? AND status <> ?");
                    xlcVarA.j(1, j3);
                    xlcVarA.j(2, jN2);
                    xlcVarA.j(3, j);
                    ey8.m(xlcVarA, 4, 0, t19VarD);
                    xlcVarA.j(5, 10);
                    ilc ilcVar = t19VarD.a;
                    ilcVar.b();
                    Cursor cursorO = ilcVar.o(xlcVarA, null);
                    try {
                        long j4 = cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
                        cursorO.close();
                        xlcVarA.n();
                        int i3 = i2 - ((int) j4);
                        num = new Integer(i3 >= 0 ? i3 : 0);
                    } catch (Throwable th) {
                        cursorO.close();
                        xlcVarA.n();
                        throw th;
                    }
                }
                ((jz2) ((iy2) ((je7) pz7Var.d).getValue())).l().n0(num.intValue(), pz7Var.a);
                if (es8Var == null || messageModel.a != es8Var.a.b || i2 == 0) {
                    ((cea) ((je7) pz7Var.f).getValue()).f(j2);
                } else {
                    ((cea) ((je7) pz7Var.f).getValue()).a(j2);
                }
            } else {
                tx3Var = tx3Var2;
                String str2 = (String) pz7Var.b;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, str2, "Message message=" + messageModel.m() + " is already read, curReadMark:" + jN, null);
                }
            }
            if (e5fVar == tx3Var) {
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
