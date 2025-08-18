package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class ms7 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final Map e;
    public final long f;

    public ms7(long j, long j2, long j3, String str, String str2, Map map) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = map;
        this.f = j3;
    }

    public final String toString() {
        return "LogEntry{time=" + this.a + ", userId=" + this.b + ", sessionId=" + this.f + ", type='" + this.c + "', event='" + this.d + "', params=" + this.e + '}';
    }
}
