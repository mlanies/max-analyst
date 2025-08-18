package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public abstract class ue9 {
    public static ve9 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgEdit msgEdit = (Tasks.MsgEdit) qw8.mergeFrom(new Tasks.MsgEdit(), bArr);
            Protos.Attaches attaches = msgEdit.oldAttaches;
            List list = attaches != null ? (List) b.e(attaches).a : null;
            Protos.MessageElements messageElements = msgEdit.oldElements;
            ArrayList arrayListA = messageElements != null ? ou8.a(messageElements.elements) : null;
            long j = msgEdit.requestId;
            long j2 = msgEdit.chatId;
            long j3 = msgEdit.messageId;
            long j4 = msgEdit.chatServerId;
            long j5 = msgEdit.messageServerId;
            String str = msgEdit.text;
            String str2 = msgEdit.oldText;
            int i = msgEdit.oldStatus;
            vx8[] vx8VarArrValues = vx8.values();
            int length = vx8VarArrValues.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = length;
                vx8 vx8Var = vx8VarArrValues[i2];
                vx8[] vx8VarArr = vx8VarArrValues;
                if (vx8Var.a == i) {
                    return new ve9(j, j2, j3, j4, j5, str, str2, vx8Var, list, arrayListA, msgEdit.editAttaches);
                }
                i2++;
                length = i3;
                vx8VarArrValues = vx8VarArr;
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
