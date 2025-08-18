package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class d4c {
    public static String COLLECTOR_VIDEO = "ok.mobile.apps.video";
    public static String COLLECTOR_WEBRTC = "webrtc.aggregation";
    public String conversationId = "";

    @Deprecated
    public final void log(e0e e0eVar, String str, String str2) {
        log(e0eVar.a, time(), str, str2);
    }

    public abstract void log(String str, long j, String str2, String str3);

    public abstract void log(String str, String str2, Map map);

    public abstract void logSimple(e0e e0eVar, String str, String str2);

    public abstract long time();
}
