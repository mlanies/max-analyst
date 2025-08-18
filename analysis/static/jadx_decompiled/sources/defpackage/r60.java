package defpackage;

import com.my.tracker.obfuscated.t;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class r60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r60(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = null;
        long j = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                qz7 qz7Var = (qz7) obj;
                qz7Var.getClass();
                int i = oaf.a;
                i74 i74Var = ((o75) qz7Var.c).a.D0;
                fd fdVarF = i74Var.F();
                i74Var.I(fdVarF, 1010, new yv3(fdVarF, j));
                break;
            case 1:
                ph4 ph4Var = (ph4) obj;
                ph4Var.getClass();
                int i2 = maf.a;
                h74 h74Var = ((n75) ph4Var.b).a.C0;
                ed edVarP = h74Var.P();
                h74Var.Q(edVarP, 1010, new v64(edVarP, j));
                break;
            case 2:
                ((AudioSampleEnergyCalculator) obj).lambda$onSample$0(j);
                break;
            case 3:
                p82 p82Var = (p82) obj;
                l92 l92Var = (l92) p82Var.d.remove(Long.valueOf(j));
                if (l92Var != null) {
                    ConcurrentHashMap concurrentHashMap = p82Var.c;
                    k92 k92Var = l92Var.c;
                    concurrentHashMap.remove(Long.valueOf(k92Var.l));
                    p82Var.b.remove(Long.valueOf(k92Var.l));
                    p82Var.e.remove(Long.valueOf(k92Var.a));
                }
                e52 e52Var = (e52) p82Var.f.remove(Long.valueOf(j));
                if (e52Var != null) {
                    ConcurrentHashMap concurrentHashMap2 = p82Var.g;
                    k92 k92Var2 = e52Var.b;
                    concurrentHashMap2.remove(Long.valueOf(k92Var2.a));
                    je7 je7Var = p82Var.C;
                    if (je7Var.getValue() != null) {
                        zb2 zb2Var = (zb2) ((ta2) je7Var.getValue());
                        zb2Var.getClass();
                        j47.T(zb2Var.Z, null, null, new mb2(zb2Var, k92Var2.a, null), 3);
                    }
                }
                p82Var.h.remove(Long.valueOf(j));
                break;
            case 4:
                ((FeedbackListenerManagerImpl) obj).tryToRemoveOld(j);
                break;
            case 5:
                ((rk5) obj).k.F(j);
                break;
            case 6:
                mk6 mk6Var = ((MessagesListWidget) obj).x0;
                jk6 jk6Var = mk6Var.d;
                if (jk6Var != null && jk6Var.a == j) {
                    list = jk6Var.b;
                }
                mk6Var.a(new jk6(j, list));
                break;
            case 7:
                ((ard) ((g03) obj).c).o.F(j);
                break;
            default:
                ((t) obj).a(j);
                break;
        }
    }
}
