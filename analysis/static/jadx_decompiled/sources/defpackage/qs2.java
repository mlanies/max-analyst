package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class qs2 {
    public static rs2 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatUpdate chatUpdate = (Tasks.ChatUpdate) qw8.mergeFrom(new Tasks.ChatUpdate(), bArr);
            Tasks.Rect rect = chatUpdate.crop;
            return new rs2(chatUpdate.requestId, chatUpdate.chatId, chatUpdate.chatServerId, 0, null, false, chatUpdate.descriptionIsNull ? null : chatUpdate.description, null, chatUpdate.themeIsNull ? null : chatUpdate.theme, chatUpdate.photoTokenIsNull ? null : chatUpdate.photoToken, rect != null ? new a20(rect.left, rect.top, rect.right, rect.bottom, 2) : null, chatUpdate.pinMessageIdIsNull ? null : Long.valueOf(chatUpdate.pinMessageId), chatUpdate.notifyPin, 0L);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
