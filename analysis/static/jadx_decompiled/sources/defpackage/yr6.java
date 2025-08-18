package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class yr6 {
    public static final Pattern i = Pattern.compile(".*typ (host|prflx|srflx|relay+).*");
    public static final Pattern j = Pattern.compile(".*transport=(tcp|udp).*");
    public static final Pattern k = Pattern.compile(".*(?:tcp|udp) \\d+ (\\S+).*");
    public final d4c a;
    public final a4c b;
    public final int c;
    public long e;
    public long f;
    public String h;
    public boolean g = false;
    public final HashMap d = new HashMap();

    public yr6(d4c d4cVar, a4c a4cVar, int i2) {
        this.a = d4cVar;
        this.b = a4cVar;
        this.c = i2;
        for (fcg fcgVar : fcg.values()) {
            this.d.put(fcgVar, 0);
        }
    }

    public final void a(boolean z) {
        if (this.f == 0 || this.g) {
            return;
        }
        this.g = true;
        HashMap map = new HashMap();
        String str = this.h;
        if (str == null) {
            this.h = null;
            int i2 = this.c;
            if (i2 == 0) {
                this.h = "direct";
            } else if (i2 == 1) {
                this.h = "server_send";
            } else if (i2 == 2) {
                this.h = "server_recv";
            }
            str = this.h;
        }
        if (str == null) {
            this.b.log("CandidateLog", "unknown topology, not logging connect");
        }
        StringBuilder sbO = rh4.o(str, ":");
        sbO.append(z ? SystemClock.elapsedRealtime() - this.f : -1L);
        map.put("param", sbO.toString());
        this.a.log(d4c.COLLECTOR_VIDEO, "callCandidatesApply", map);
    }
}
