package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class z95 {
    public static aa5 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ExternalVideoSend externalVideoSend = (Tasks.ExternalVideoSend) qw8.mergeFrom(new Tasks.ExternalVideoSend(), bArr);
            return new aa5(externalVideoSend.requestId, externalVideoSend.messageId, externalVideoSend.externalUrl, externalVideoSend.chatId, externalVideoSend.attachLocalId, externalVideoSend.stickerId);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
