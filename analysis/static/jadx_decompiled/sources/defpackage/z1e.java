package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract class z1e {
    public static ms7 a(byte[] bArr) {
        try {
            Protos.LogEvent logEvent = (Protos.LogEvent) qw8.mergeFrom(new Protos.LogEvent(), bArr);
            long j = logEvent.time;
            String str = logEvent.type;
            String str2 = logEvent.event;
            byte[] bArr2 = logEvent.params;
            Map map = null;
            Object objF = null;
            if (bArr2 != null) {
                if (bArr2.length != 0) {
                    try {
                        objF = lz7.F(vw8.a(bArr2).A0());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                map = (Map) objF;
            }
            return new ms7(j, logEvent.userId, logEvent.sessionId, str, str2, map);
        } catch (InvalidProtocolBufferNanoException e2) {
            throw new RuntimeException(e2);
        }
    }
}
