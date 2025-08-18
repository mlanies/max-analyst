package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class vhc implements uhc {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    @Override // defpackage.uhc
    public final synchronized void a(wv6 wv6Var, String str, boolean z) {
        if (ta5.a.i(2)) {
            Long l = (Long) this.b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            ta5.g("time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(jUptimeMillis), str, Long.valueOf(yxc.c(jUptimeMillis, l)));
        }
    }

    @Override // defpackage.uhc
    public final synchronized void b(wv6 wv6Var, Object obj, String str, boolean z) {
        if (ta5.a.i(2)) {
            Long lValueOf = Long.valueOf(SystemClock.uptimeMillis());
            Boolean boolValueOf = Boolean.valueOf(z);
            if (ta5.a.i(2)) {
                ft7 ft7Var = ta5.a;
                String.format(null, "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", lValueOf, str, obj, boolValueOf);
                ft7Var.b("RequestLoggingListener");
            }
            this.b.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    @Override // defpackage.uhc
    public final synchronized void c(wv6 wv6Var, String str, Throwable th, boolean z) {
        if (ta5.a.i(5)) {
            Long l = (Long) this.b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            ta5.m("RequestLoggingListener", "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", Long.valueOf(jUptimeMillis), str, Long.valueOf(yxc.c(jUptimeMillis, l)), th.toString());
        }
    }

    @Override // defpackage.uhc
    public final synchronized void d(String str, String str2) {
        if (ta5.a.i(2)) {
            Pair pairCreate = Pair.create(str, str2);
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.a.put(pairCreate, Long.valueOf(jUptimeMillis));
            ta5.g("time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(jUptimeMillis), str, str2);
        }
    }

    @Override // defpackage.uhc
    public final synchronized void e(String str, String str2) {
        if (ta5.a.i(2)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            ta5.h("RequestLoggingListener", "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(yxc.c(jUptimeMillis, l)), null);
        }
    }

    @Override // defpackage.uhc
    public final synchronized void f(String str, String str2, boolean z) {
        if (ta5.a.i(2)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            ta5.h("RequestLoggingListener", "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(yxc.c(jUptimeMillis, l)), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.uhc
    public final synchronized void g(String str) {
        if (ta5.a.i(2)) {
            Long l = (Long) this.a.get(Pair.create(str, "NetworkFetchProducer"));
            ta5.h("RequestLoggingListener", "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", Long.valueOf(SystemClock.uptimeMillis()), str, "NetworkFetchProducer", "intermediate_result", Long.valueOf(yxc.c(SystemClock.uptimeMillis(), l)));
        }
    }

    @Override // defpackage.uhc
    public final boolean h(String str) {
        return ta5.a.i(2);
    }

    @Override // defpackage.uhc
    public final synchronized void i(String str, String str2, Map map) {
        if (ta5.a.i(2)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            ta5.h("RequestLoggingListener", "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(yxc.c(jUptimeMillis, l)), map);
        }
    }

    @Override // defpackage.uhc
    public final synchronized void j(String str, String str2, Throwable th, Map map) {
        if (ta5.a.i(5)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            Object[] objArr = {Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(yxc.c(jUptimeMillis, l)), map, th.toString()};
            if (ta5.a.i(5)) {
                ta5.a.w("RequestLoggingListener", String.format(null, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", objArr), th);
            }
        }
    }

    @Override // defpackage.uhc
    public final synchronized void k(String str) {
        if (ta5.a.i(2)) {
            Long l = (Long) this.b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            ta5.g("time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(jUptimeMillis), str, Long.valueOf(yxc.c(jUptimeMillis, l)));
        }
    }
}
