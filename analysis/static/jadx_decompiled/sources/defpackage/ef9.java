package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Iterator;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class ef9 {
    public static ff9 a(byte[] bArr) throws ProtoException {
        Object next;
        try {
            Tasks.MsgReact msgReact = (Tasks.MsgReact) qw8.mergeFrom(new Tasks.MsgReact(), bArr);
            long j = msgReact.requestId;
            long j2 = msgReact.chatId;
            long j3 = msgReact.messageId;
            long j4 = msgReact.chatServerId;
            long j5 = msgReact.messageServerId;
            yb9 yb9Var = gx8.b;
            int i = msgReact.reactionType;
            yb9Var.getClass();
            Iterator it = gx8.X.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    next = null;
                    break;
                }
                next = u1Var.next();
                Iterator it2 = it;
                if (((gx8) next).a == i) {
                    break;
                }
                it = it2;
            }
            gx8 gx8Var = (gx8) next;
            if (gx8Var != null) {
                return new ff9(j, j2, j3, j4, j5, new bx8(gx8Var, msgReact.reaction));
            }
            throw new IllegalArgumentException(zr6.h(i, "Unknown reactionType = "));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
