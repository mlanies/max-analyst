package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class oe9 {
    public static pe9 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgDelete msgDelete = (Tasks.MsgDelete) qw8.mergeFrom(new Tasks.MsgDelete(), bArr);
            return new pe9(msgDelete.requestId, msgDelete.chatId, msgDelete.chatServerId, ys.l0(msgDelete.messagesId), ys.l0(msgDelete.messagesServerId), !oag.t(msgDelete.complaint) ? da3.a(msgDelete.complaint) : null, msgDelete.forMe, xxc.l(mg4.o, Integer.valueOf(msgDelete.itemTypeId)), msgDelete.notDeleteMessageFromDb);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
