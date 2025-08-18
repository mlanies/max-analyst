package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class rab {
    public static sab a(byte[] bArr) throws ProtoException {
        try {
            Tasks.Profile profile = (Tasks.Profile) qw8.mergeFrom(new Tasks.Profile(), bArr);
            Tasks.Rect rect = profile.crop;
            return new sab(profile.requestId, profile.firstName, profile.lastName, profile.photoToken, profile.photoId, rect != null ? new a20(rect.left, rect.top, rect.right, rect.bottom, 2) : null, profile.description, profile.link, profile.avatarType.equals("PRESET_AVATAR") ? 1 : 2);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
