package defpackage;

import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

/* loaded from: classes2.dex */
public final /* synthetic */ class l01 implements EventQueueCollector.IdleStateProvider, qj3, km7, jm7, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ l01() {
        this.a = 10;
        this.b = true;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                u82 u82Var = (u82) obj;
                u82Var.d0 = new oq0(u82Var.d0.a, this.b);
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            default:
                j10 j10Var = (j10) obj;
                boolean zO = s5c.O(j10Var);
                if (j10Var.d != null || zO) {
                    boolean z = this.b;
                    if (!zO) {
                        h20 h20VarA = j10Var.c().a();
                        h20VarA.n = z;
                        j10Var.d = new k20(h20VarA);
                        break;
                    } else {
                        h20 h20VarA2 = j10Var.b().d.d.a();
                        h20VarA2.n = z;
                        k20 k20Var = new k20(h20VarA2);
                        j10 j10VarJ = j10Var.b().d.j();
                        j10VarJ.d = k20Var;
                        l20 l20VarA = j10VarJ.a();
                        r10 r10VarA = j10Var.b().a();
                        r10VarA.e = l20VarA;
                        j10Var.r = new s10(r10VarA);
                        break;
                    }
                }
            case 5:
                j10 j10Var2 = (j10) obj;
                if (!this.b) {
                    j10Var2.i = d20.a;
                    break;
                } else {
                    j10Var2.i = d20.o;
                    break;
                }
            case 7:
                ((x4b) obj).Y(this.b);
                break;
            case 8:
                ((x4b) obj).q0(this.b);
                break;
            case 9:
                ((x4b) obj).w(this.b);
                break;
            case 10:
                j10 j10Var3 = (j10) obj;
                boolean z2 = this.b;
                j10Var3.y = z2;
                if (j10Var3.r != null && j10Var3.b().d != null) {
                    j10 j10VarJ2 = j10Var3.b().d.j();
                    j10VarJ2.y = z2;
                    l20 l20VarA2 = j10VarJ2.a();
                    r10 r10VarA2 = j10Var3.b().a();
                    r10VarA2.e = l20VarA2;
                    j10Var3.r = new s10(r10VarA2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case 2:
                ((n3b) obj).O(this.b);
                break;
            case 3:
                ((n3b) obj).j(this.b);
                break;
            case 4:
                ((m3b) obj).j(this.b);
                break;
            default:
                ((n3b) obj).O(this.b);
                break;
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector.IdleStateProvider
    public boolean isIdle() {
        return CallAnalyticsSender.setIdle$lambda$0(this.b);
    }

    public /* synthetic */ l01(boolean z, int i) {
        this.a = i;
        this.b = z;
    }
}
