package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class v89 {
    public final je7 a;

    public v89(je7 je7Var) {
        this.a = je7Var;
    }

    public static List a(byte[] bArr) {
        try {
            Protos.MessageElements messageElements = new Protos.MessageElements();
            qw8.mergeFrom(messageElements, bArr);
            return ou8.a(messageElements.elements);
        } catch (InvalidProtocolBufferNanoException e) {
            hm9.p("MessagesTypeConverters", "InvalidProtocolBufferNanoException", e);
            return nz4.a;
        }
    }

    public static vx8 b(int i) {
        for (vx8 vx8Var : vx8.values()) {
            if (vx8Var.a == i) {
                return vx8Var;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static byte[] d(ix8 ix8Var) {
        if (ix8Var == null) {
            return null;
        }
        byte[] bArr = b.a;
        Protos.MessageReactions messageReactions = new Protos.MessageReactions();
        List list = ix8Var.a;
        int size = list.size();
        Protos.MessageReactionWithCount[] messageReactionWithCountArr = new Protos.MessageReactionWithCount[size];
        for (int i = 0; i < size; i++) {
            hx8 hx8Var = (hx8) list.get(i);
            Protos.MessageReactionWithCount messageReactionWithCount = new Protos.MessageReactionWithCount();
            Protos.ReactionData reactionData = new Protos.ReactionData();
            reactionData.reaction = hx8Var.a.b.a.toString();
            reactionData.type = hx8Var.a.a.a;
            messageReactionWithCount.count = hx8Var.b;
            messageReactionWithCount.reaction = reactionData;
            messageReactionWithCountArr[i] = messageReactionWithCount;
        }
        messageReactions.reactions = messageReactionWithCountArr;
        messageReactions.totalCount = ix8Var.b;
        c6c c6cVar = ix8Var.c;
        if (c6cVar != null) {
            Protos.ReactionData reactionData2 = new Protos.ReactionData();
            reactionData2.reaction = c6cVar.b.a.toString();
            reactionData2.type = c6cVar.a.a;
            messageReactions.yourReaction = reactionData2;
        }
        return qw8.toByteArray(messageReactions);
    }

    public final ix8 c(byte[] bArr) {
        jx8 jx8Var = (jx8) this.a.getValue();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return jx8Var.a(bArr);
        } catch (ProtoException e) {
            throw new RuntimeException(e);
        }
    }
}
