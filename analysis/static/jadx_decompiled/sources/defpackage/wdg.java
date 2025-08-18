package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class wdg implements Runnable {
    public static final /* synthetic */ wdg b = new wdg(0);
    public final /* synthetic */ int a;

    public /* synthetic */ wdg(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                ArrayList arrayList = ml4.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    ml4.j = null;
                    return;
                }
                ArrayList arrayList2 = ml4.j;
                ml4.j = null;
                if (ml4.k == null) {
                    ml4.k = new ml4(Math.max(1, tu0.l.d));
                }
                ((ScheduledExecutorService) ((khe) tu0.l.f.b).getValue()).execute(new ge(arrayList2, 3));
                return;
            case 3:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (vw4.p != null) {
                        vw4.a().d();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
            case 5:
            case 6:
                return;
            default:
                ((ax7) o19.a.getAccessor().c(ax7.class)).a(Collections.singletonList(new dta(0)));
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
