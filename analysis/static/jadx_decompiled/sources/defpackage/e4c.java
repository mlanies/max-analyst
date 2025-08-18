package defpackage;

import java.math.BigInteger;
import org.webrtc.RTCStats;

/* loaded from: classes2.dex */
public abstract class e4c {
    public static final /* synthetic */ bc7[] a = {new hob(e4c.class, "mimeType", "getMimeType(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), z7b.g(nec.a, e4c.class, "decoderImplementation", "getDecoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), new hob(e4c.class, "encoderImplementation", "getEncoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), new hob(e4c.class, "sdpFmtpLine", "getSdpFmtpLine(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), new hob(e4c.class, "payloadType", "getPayloadType(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", 1), new hob(e4c.class, "channels", "getChannels(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", 1)};
    public static final m82 b = new m82("mimeType", 6);
    public static final m82 c = new m82("decoderImplementation", 6);
    public static final m82 d = new m82("encoderImplementation", 6);
    public static final m82 e = new m82("sdpFmtpLine", 6);
    public static final m82 f = new m82();

    public static final BigInteger a(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            return null;
        }
        if (number instanceof BigInteger) {
            return (BigInteger) number;
        }
        if (!(number instanceof Long) && (number instanceof Integer)) {
            return BigInteger.valueOf(number.intValue());
        }
        return BigInteger.valueOf(number.longValue());
    }

    public static final Double b(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    public static final Long c(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String d(org.webrtc.RTCStats r3) {
        /*
            java.util.Map r0 = r3.getMembers()
            java.lang.String r1 = "address"
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.toString()
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 != 0) goto L16
            return r1
        L16:
            java.util.Map r3 = r3.getMembers()
            java.lang.String r2 = "port"
            java.lang.Object r3 = r3.get(r2)
            if (r3 == 0) goto L35
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L29
            java.lang.Number r3 = (java.lang.Number) r3
            goto L2a
        L29:
            r3 = r1
        L2a:
            if (r3 == 0) goto L35
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L36
        L35:
            r3 = r1
        L36:
            if (r3 == 0) goto L51
            int r3 = r3.intValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4c.d(org.webrtc.RTCStats):java.lang.String");
    }

    public static final String e(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("kind");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static final BigInteger f(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("packetsLost");
        if (obj != null) {
            return a(obj);
        }
        return null;
    }

    public static final Long g(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("ssrc");
        if (obj != null) {
            return c(obj);
        }
        return null;
    }

    public static final String h(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("trackIdentifier");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static final String i(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("transportId");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
