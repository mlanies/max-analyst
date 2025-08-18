package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final /* synthetic */ class ona implements b66, qj3, grd {
    public final /* synthetic */ sna a;
    public final /* synthetic */ long b;

    public /* synthetic */ ona(sna snaVar, long j) {
        this.a = snaVar;
        this.b = j;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        sna snaVar = this.a;
        snaVar.getClass();
        hm9.p("sna", "handleMediaTypingError", (Throwable) obj);
        long j = this.b;
        LinkedBlockingDeque linkedBlockingDeque = sna.c(j).a;
        if (!linkedBlockingDeque.isEmpty()) {
            try {
                linkedBlockingDeque.pop();
            } catch (NoSuchElementException unused) {
            }
        }
        if (linkedBlockingDeque.isEmpty()) {
            return;
        }
        snaVar.e(j);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        q1a q1aVar;
        sna snaVar = this.a;
        snaVar.getClass();
        long j = this.b;
        if (j == 0) {
            q1aVar = iqd.g(0L);
        } else {
            hm9.m("sna", "sendMediaTyping %d", Long.valueOf(j));
            q1aVar = new q1a(1, new ona(snaVar, j));
        }
        return q1aVar.n();
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        pna pnaVar;
        sna snaVar = this.a;
        snaVar.getClass();
        ConcurrentHashMap concurrentHashMap = sna.b;
        long j = this.b;
        qna qnaVar = (qna) concurrentHashMap.get(Long.valueOf(j));
        if (qnaVar == null || (pnaVar = (pna) qnaVar.a.peek()) == null) {
            nqdVar.onError(new Throwable("No media typing to send"));
        } else {
            snaVar.d(j, pnaVar.a);
            nqdVar.a(Long.valueOf(pnaVar.b));
        }
    }
}
