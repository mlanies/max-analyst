package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class p9d {
    public static q9d a(byte[] bArr) throws ProtoException {
        try {
            Tasks.SyncChatHistory syncChatHistory = (Tasks.SyncChatHistory) qw8.mergeFrom(new Tasks.SyncChatHistory(), bArr);
            q9d q9dVar = new q9d(syncChatHistory.taskId, syncChatHistory.chatId, syncChatHistory.count, xxc.l(mg4.o, Integer.valueOf(syncChatHistory.itemTypeId)));
            hm9.n(q9dVar.Y, "parseFrom");
            return q9dVar;
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
