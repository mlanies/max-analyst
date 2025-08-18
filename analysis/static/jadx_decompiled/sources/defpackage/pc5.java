package defpackage;

import androidx.work.WorkRequest;
import ru.ok.tamtam.rx.TamTamObservables$TamObservableException;

/* loaded from: classes2.dex */
public final /* synthetic */ class pc5 implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ pc5(long j) {
        this.a = 2;
        this.b = WorkRequest.MIN_BACKOFF_MILLIS;
        this.c = j;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public final Object mo131apply(Object obj) {
        switch (this.a) {
            case 0:
                return new qa3(((wc5) obj).a(), 2, new pc5(this.b, this.c, 1));
            case 1:
                return new sa3(1, new dl3(1, this.b, this.c, (fd5) obj));
            case 2:
                Throwable th = (Throwable) obj;
                long j = this.b;
                return (j <= 0 || System.currentTimeMillis() - this.c <= j) ? iqd.f(th) : iqd.f(new TamTamObservables$TamObservableException("timeout reached", th));
            default:
                Throwable th2 = (Throwable) obj;
                long j2 = this.b;
                return (j2 <= 0 || System.currentTimeMillis() - this.c <= j2) ? qy9.g(th2) : qy9.g(new TamTamObservables$TamObservableException("timeout reached", th2));
        }
    }

    public /* synthetic */ pc5(long j, long j2, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }
}
