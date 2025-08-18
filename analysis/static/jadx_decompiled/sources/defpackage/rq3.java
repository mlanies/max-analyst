package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class rq3 {
    public static sq3 a(byte[] bArr) throws ProtoException {
        Tasks.ContactUpdate contactUpdate;
        long j;
        long j2;
        String str;
        int i;
        int i2 = 4;
        try {
            contactUpdate = (Tasks.ContactUpdate) qw8.mergeFrom(new Tasks.ContactUpdate(), bArr);
            j = contactUpdate.requestId;
            j2 = contactUpdate.contactId;
            str = contactUpdate.action;
            str.getClass();
            switch (str) {
                case "REMOVE":
                    i = 3;
                    return new sq3(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "UPDATE":
                    i2 = 5;
                case "ADD":
                    i = i2;
                    return new sq3(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "BLOCK":
                    i = 1;
                    return new sq3(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "UNBLOCK":
                    i = 2;
                    return new sq3(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                default:
                    throw new IllegalArgumentException(zr6.i("No such value ", str, " for ContactUpdateAction"));
            }
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
